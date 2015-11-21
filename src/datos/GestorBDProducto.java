package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Producto;
import datos.excepcion.ExcepcionProductoNoEncontrado;

/**
 *
 * @author PIX
 */
public class GestorBDProducto extends GestorBaseDatos {

    public void agregarProducto(Producto nuevoProducto) {

        final String INSTRUCCION_INSERTAR
            = "INSERT INTO producto VALUES(\"%s\",\"%s\",%f)";
        
        String instruccionFinalInsertar = 
                String.format(
                        INSTRUCCION_INSERTAR,
                        nuevoProducto.obtenerID(),
                        nuevoProducto.obtenerNombre(),
                        nuevoProducto.obtenerCosto(),
                        nuevoProducto.obtenerPrecio(),
                        nuevoProducto.obtenerExistencia()
                );

        obtenerEjecutorInstrucciones().ejecutarModificacion(instruccionFinalInsertar);
    }

    public void eliminarProducto(String IDProductoAEliminar) {

        final String INSTRUCCION_ELIMINAR
            = "DELETE FROM producto WHERE id_insumo = \"%s\"";
        
        String instruccionFinalEliminar = 
                String.format(
                        INSTRUCCION_ELIMINAR,
                        IDProductoAEliminar
                );

        obtenerEjecutorInstrucciones().ejecutarModificacion(instruccionFinalEliminar);

    }

    public void editarInformacionProducto(Producto productoActualizado) {

        final String INSTRUCCION_MODIFICAR
            = "UPDATE producto SET nombre = \"%s\", cantidad_minima = %f, WHERE ID = \"%s\"";
        
        String instruccionFinalModificar
                = String.format(
                        INSTRUCCION_MODIFICAR,
                        productoActualizado.obtenerNombre(),
                        productoActualizado.obtenerCantidadMinima(),
                        productoActualizado.obtenerID()
                );

        obtenerEjecutorInstrucciones().ejecutarModificacion(instruccionFinalModificar);
    }

    public Producto obtenerProducto(String IDProducto) throws ExcepcionProductoNoEncontrado{

        final String INSTRUCCION_OBTENER_UNO
                = "SELECT * FROM producto WHERE ID = \"%s\"";
        
        String instruccionFinalObtener = 
                String.format(
                        INSTRUCCION_OBTENER_UNO,
                        IDProducto
                );

        ResultSet resultadoConsulta
                = obtenerEjecutorInstrucciones().ejecutarConsulta(instruccionFinalObtener);

        return extraerProductoDeResultado(resultadoConsulta);
    }

    private Producto extraerProductoDeResultado(ResultSet resultadoConsulta) 
            throws ExcepcionProductoNoEncontrado{
        
        try {

            if (resultadoConsulta.next()) {
                String id = resultadoConsulta.getString("id_insumo");
                String nombre = resultadoConsulta.getString("nombre");
                double cantidadMinima = resultadoConsulta.getDouble("costo");

                Producto producto = new Producto(id, nombre, cantidadMinima);
                return producto;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        throw new ExcepcionProductoNoEncontrado();
    }

}
