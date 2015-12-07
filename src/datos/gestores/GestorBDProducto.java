package datos.gestores;

import datos.generadores.GeneradorSentenciasProducto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Producto;
import datos.excepciones.ExcepcionProductoNoEncontrado;


public class GestorBDProducto extends GestorBaseDatos {
    
    public static String TABLA_PRODUCTO = "producto";
    private final GeneradorSentenciasProducto generadorSentencia;

    public GestorBDProducto() {
        generadorSentencia = new GeneradorSentenciasProducto(TABLA_PRODUCTO);
    }
    
    
    public void agregar(Producto nuevoProducto) {
        String sentenciaInsertarProducto;
        sentenciaInsertarProducto = generadorSentencia.generarSentenciaInsertarProducto(nuevoProducto);
        obtenerEjecutorInstrucciones().ejecutarModificacion(sentenciaInsertarProducto);
        
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
    
    
    public Producto obtenerLista(String idProducto) throws ExcepcionProductoNoEncontrado{
        
        String sentenciaObtenerProductos;
        sentenciaObtenerProductos = generadorSentencia.generarSentenciaObtenerProductos();
        ResultSet resultadoConsulta = obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerProductos);
        
        return extraerDeResultado(resultadoConsulta);
        
    }

    
    public Producto obtenerPorId(String idProducto) throws ExcepcionProductoNoEncontrado{
        
        String sentenciaObtenerProductoPorId;
        sentenciaObtenerProductoPorId = generadorSentencia.generarSentenciaObtenerProductoPorId(idProducto);
        ResultSet resultadoConsulta = obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerProductoPorId);

        return extraerDeResultado(resultadoConsulta);
        
    }
    
    
    private Producto extraerDeResultado(ResultSet resultadoConsulta) throws ExcepcionProductoNoEncontrado{
        
        try {

            if (resultadoConsulta.next()) {

                String id = resultadoConsulta.getString("id_producto");
                String nombre = resultadoConsulta.getString("nombre");
                double costo = resultadoConsulta.getDouble("costo");
                double precio = resultadoConsulta.getDouble("precio");
                int existencia = resultadoConsulta.getInt("existencia");

                Producto producto = new Producto(id, nombre, costo, precio, existencia);

                return producto;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        throw new ExcepcionProductoNoEncontrado();
    }

}
