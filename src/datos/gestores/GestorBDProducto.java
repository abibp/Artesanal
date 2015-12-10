package datos.gestores;

import datos.excepciones.ExcepcionInsumoNoEncontrado;
import datos.generadores.GeneradorSentenciasProducto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Producto;
import datos.excepciones.ExcepcionProductoNoEncontrado;
import datos.generadores.GeneradorSentenciasUsa;
import java.util.ArrayList;
import negocio.entidades.Ingrediente;
import negocio.entidades.Insumo;
import negocio.entidades.ProductoCompuesto;
import negocio.excepciones.ExcepcionElementoYaExistente;
import negocio.excepciones.ExcepcionListaVacia;

public class GestorBDProducto extends GestorBaseDatos {

    public static String TABLA_PRODUCTO = "producto";
    private final GeneradorSentenciasProducto generadorSentencia;
    private final GeneradorSentenciasUsa generadorSentenciaUsa;

    public GestorBDProducto() {
        generadorSentencia = new GeneradorSentenciasProducto(TABLA_PRODUCTO);
        generadorSentenciaUsa = new GeneradorSentenciasUsa("usa");
    }

    public void agregar(Producto nuevoProducto) throws ExcepcionListaVacia {
        
        String sentenciaInsertarProducto;
        sentenciaInsertarProducto = generadorSentencia.generarSentenciaInsertarProducto(nuevoProducto);
        obtenerEjecutorInstrucciones().ejecutarModificacion(sentenciaInsertarProducto);
        
        if((nuevoProducto instanceof ProductoCompuesto)){
            String[] sentenciasInsertarUso;
            sentenciasInsertarUso = generadorSentenciaUsa.generarSentenciaInsertarUso((ProductoCompuesto) nuevoProducto);
            for (int i = 0; i < sentenciasInsertarUso.length; i++) {
                obtenerEjecutorInstrucciones().ejecutarModificacion(sentenciasInsertarUso[i]);
            }
        }

    }
    
    public void eliminar(String idProducto) {

        String sentenciaEliminarProducto;
        sentenciaEliminarProducto = generadorSentencia.generarSentenciaEliminarProducto(idProducto);
        obtenerEjecutorInstrucciones().ejecutarModificacion(sentenciaEliminarProducto);

    }

    public void editarInformacion(String id, Producto productoActualizado) {

        String sentenciaEditarInformacionProducto;
        sentenciaEditarInformacionProducto = generadorSentencia.generarSentenciaActualizarProducto(productoActualizado);
        obtenerEjecutorInstrucciones().ejecutarModificacion(sentenciaEditarInformacionProducto);

    }

    public ArrayList<Producto> obtenerLista() throws ExcepcionProductoNoEncontrado, ExcepcionListaVacia, ExcepcionElementoYaExistente {

        ArrayList<Producto> listaProductos = new ArrayList<>();
        String sentenciaObtenerProductos;
        sentenciaObtenerProductos = generadorSentencia.generarSentenciaObtenerProductos();
        ResultSet resultadoConsulta = obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerProductos);

        try {
            while (resultadoConsulta.next()) {
                Producto actual = extraerDeResultado(resultadoConsulta);
                listaProductos.add(actual);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GestorBDProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaProductos;
    }

    public ArrayList<ProductoCompuesto> obtenerListaCompuestos() throws ExcepcionProductoNoEncontrado, ExcepcionListaVacia, ExcepcionElementoYaExistente, ExcepcionInsumoNoEncontrado {

        ArrayList<ProductoCompuesto> listaProductosCompuestos = new ArrayList<>();
        String sentenciaObtenerProductos;
        sentenciaObtenerProductos = generadorSentencia.generarSentenciaObtenerProductos();
        ResultSet resultadoConsulta = obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerProductos);

        try {
            while (resultadoConsulta.next()) {
                if(usaInsumos(resultadoConsulta)){
                    ProductoCompuesto actual = extraerCompuestoDeResultado(resultadoConsulta);
                    listaProductosCompuestos.add(actual);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(GestorBDProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaProductosCompuestos;
    }
    
    public Producto obtenerPorId(String idProducto) throws ExcepcionProductoNoEncontrado, ExcepcionListaVacia, ExcepcionElementoYaExistente {

        String sentenciaObtenerProductoPorId;
        sentenciaObtenerProductoPorId = generadorSentencia.generarSentenciaObtenerProductoPorId(idProducto);
        ResultSet resultadoConsulta = obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerProductoPorId);

        return extraerDeResultado(resultadoConsulta);

    }

    private Producto extraerDeResultado(ResultSet resultadoConsulta) throws ExcepcionProductoNoEncontrado, ExcepcionListaVacia, ExcepcionElementoYaExistente {

        try {

            String id = resultadoConsulta.getString("id_producto");
            String nombre = resultadoConsulta.getString("nombre");
            double costo = resultadoConsulta.getDouble("costo");
            double precio = resultadoConsulta.getDouble("precio");
            int existencia = resultadoConsulta.getInt("existencia");

            Producto producto = new ProductoCompuesto(id, nombre, costo, precio, existencia);

            return producto;

        } catch (SQLException ex) {
            Logger.getLogger(GestorBDProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

        throw new ExcepcionProductoNoEncontrado();
    }
    
    private ProductoCompuesto extraerCompuestoDeResultado(ResultSet resultadoConsulta) throws ExcepcionProductoNoEncontrado, ExcepcionListaVacia, ExcepcionElementoYaExistente, ExcepcionInsumoNoEncontrado {

        try {

            String id = resultadoConsulta.getString("id_producto");
            String nombre = resultadoConsulta.getString("nombre");
            double costo = resultadoConsulta.getDouble("costo");
            double precio = resultadoConsulta.getDouble("precio");
            int existencia = resultadoConsulta.getInt("existencia");
            
            ArrayList<Ingrediente> ingredientes = new ArrayList<>();
            
            GeneradorSentenciasUsa generador = new GeneradorSentenciasUsa("usa");
            String sentenciaObtenerInsumosUsados = generador.generarSentenciaObtenerUsaPorId(id);
            ResultSet resultado = obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerInsumosUsados);
            
            while(resultado.next()){
                
                String idInsumo = resultado.getString("fi_id_insumo");
                int cantidad = resultado.getInt("cantidad");
                
                GestorBDInsumo gestor = new GestorBDInsumo();
                
                Insumo insumo = gestor.obtenerPorId(idInsumo);
                
                ingredientes.add(new Ingrediente(insumo, cantidad));
            }
            for (Ingrediente ingrediente : ingredientes) {
                System.out.println(ingrediente.obtenerInsumo().obtenerNombre() + " - " + ingrediente.obtenerCantidad());
            }
            ProductoCompuesto producto = new ProductoCompuesto(id, nombre, costo, precio, existencia);
            producto.agregarReceta(ingredientes);

            return producto;

        } catch (SQLException ex) {
            Logger.getLogger(GestorBDProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

        throw new ExcepcionProductoNoEncontrado();
    }

    private boolean usaInsumos(ResultSet resultadoConsulta) throws ExcepcionListaVacia, ExcepcionProductoNoEncontrado, ExcepcionElementoYaExistente {
        
        try {
            
            String id = resultadoConsulta.getString("id_producto");     
            String sentenciaObtenerInsumosUsados = generadorSentenciaUsa.generarSentenciaObtenerUsaPorId(id);
            ResultSet resultado = obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerInsumosUsados);
            
            return resultado.first();
            
        } catch (SQLException ex) {
            
        }
        return false;
    }

}
