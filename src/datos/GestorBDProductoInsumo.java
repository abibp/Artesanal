package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Producto;
import negocio.entidades.ProductoInsumo;
import negocio.entidades.ProductoVenta;

/**
 *
 * @author PIX
 */
public class GestorBDProductoInsumo extends GestorBDProducto {

    private final String TABLA_PRODUCTO_INSUMO_ = "producto_insumo";

    public void agregarProductoVenta(ProductoVenta nuevoProducto) {
        
        super.agregarProducto(nuevoProducto);
        
        String instruccionInsertarProducto = 
                "INSERT INTO " + TABLA_PRODUCTO_INSUMO_ + 
                " VALUES(" + 
                nuevoProducto.obtenerIDProducto() + "," + 
                nuevoProducto.obtenerPrecioCompra() + "," + 
                ")";

        super.obtenerGestorInstrucciones().ejecutar(instruccionInsertarProducto);
    }

    public void eliminarProductoVenta(int IDProductoAEliminar) {
        
        String instruccionEliminarProducto =
                "DELETE FROM " + TABLA_PRODUCTO_INSUMO_ +
                "WHERE ID = " + IDProductoAEliminar;
        
        super.obtenerGestorInstrucciones().ejecutar(instruccionEliminarProducto);
        super.eliminarProducto(IDProductoAEliminar);
        
    }

    public void editarInformacionProductoVenta(int IDProducto, ProductoVenta productoActualizado) {
        
        double nuevoPrecioCompra = productoActualizado.obtenerPrecioCompra();
        
        String instruccionModificarProducto = 
                "UPDATE " + TABLA_PRODUCTO_INSUMO_ + 
                "SET precio_compra = " + nuevoPrecioCompra +
                "WHERE ID = " + IDProducto;
        
        super.obtenerGestorInstrucciones().ejecutar(instruccionModificarProducto);
        super.editarInformacionProducto(IDProducto, productoActualizado);
    }
    
    
    public ProductoInsumo obtenerProductoVenta(int IDProducto){
        
        Producto producto = super.obtenerProducto(IDProducto);
        
        String instruccionObtenerProducto = 
                "SELECT * from " + TABLA_PRODUCTO_INSUMO_ + 
                "WHERE ID = " + IDProducto;
        ResultSet resultado = super.obtenerGestorInstrucciones().ejecutar(instruccionObtenerProducto);
        
        try {
            while (resultado.next()) {
                double precioCompra = resultado.getDouble("precio_compra");
                
                 ProductoInsumo productoInsumo = new ProductoInsumo(
                         producto.obtenerIDProducto(), 
                         producto.obtenerNombre(), 
                         producto.obtenerCantidadMinima(),
                         precioCompra
                 );
                 return productoInsumo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
