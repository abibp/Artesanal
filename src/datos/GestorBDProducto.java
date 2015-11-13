package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Producto;

/**
 *
 * @author PIX
 */
public class GestorBDProducto extends GestorBaseDatos {

    private final String TABLA_PRODUCTO_ = "producto";

    public void agregarProducto(Producto nuevoProducto) {

        String instruccionInsertarProducto = 
                "INSERT INTO " + TABLA_PRODUCTO_ + 
                " VALUES(" + 
                nuevoProducto.obtenerIDProducto() + "," + 
                nuevoProducto.obtenerNombre() + "," + 
                nuevoProducto.obtenerCantidadMinima() + "," + 
                ")";

        super.obtenerGestorInstrucciones().ejecutar(instruccionInsertarProducto);
    }

    public void eliminarProducto(int IDProductoAEliminar) {
        
        String instruccionEliminarProducto =
                "DELETE FROM " + TABLA_PRODUCTO_ +
                "WHERE ID = " + IDProductoAEliminar;
        
        super.obtenerGestorInstrucciones().ejecutar(instruccionEliminarProducto);
        
    }

    public void editarInformacionProducto(int IDProducto, Producto productoActualizado) {
        
        String idProductoSeleccionado = productoActualizado.obtenerIDProducto();
        String nuevoNombre = productoActualizado.obtenerNombre();
        double nuevaCantidadMinima = productoActualizado.obtenerCantidadMinima();
        
        String instruccionModificarProducto = 
                "UPDATE " + TABLA_PRODUCTO_ + 
                "SET nombre = " + nuevoNombre + "," +
                "cantidad_minima = " + nuevaCantidadMinima +
                "WHERE ID = " + idProductoSeleccionado;
        
        super.obtenerGestorInstrucciones().ejecutar(instruccionModificarProducto);
    }
    
    public Producto obtenerProducto(int IDProducto){
        
        String instruccionObtenerProducto = 
                "SELECT * FROM " + TABLA_PRODUCTO_ +
                "WHERE ID = " + IDProducto;
        
        ResultSet resultado = super.obtenerGestorInstrucciones().ejecutar(instruccionObtenerProducto);
        
        try {
            while (resultado.next()) {
                String id = resultado.getString("ID");
                String nombre = resultado.getString("nombre");
                double cantidadMinima = resultado.getDouble("cantidad_minima");
                
                 Producto producto = new Producto(id, nombre, cantidadMinima);
                 return producto;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
