package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Producto;
import negocio.entidades.ProductoVenta;

/**
 *
 * @author PIX
 */
public class GestorBDProductoVenta extends GestorBDProducto{
 
    private final String TABLA_PRODUCTO_VENTA_ = "producto_venta";
   
    public void agregarProductoVenta(ProductoVenta nuevoProducto) {
        
        super.agregarProducto(nuevoProducto);
        
        String instruccionInsertarProducto = 
                "INSERT INTO " + TABLA_PRODUCTO_VENTA_ + 
                " VALUES(" + 
                nuevoProducto.obtenerIDProducto() + "," + 
                nuevoProducto.obtenerPrecioCompra() + "," + 
                nuevoProducto.obtenerPrecioVenta() + "," + 
                ")";

        super.obtenerGestorInstrucciones().ejecutar(instruccionInsertarProducto);
    }

    public void eliminarProductoVenta(int IDProductoAEliminar) {
        
        String instruccionEliminarProducto =
                "DELETE FROM " + TABLA_PRODUCTO_VENTA_ +
                "WHERE ID = " + IDProductoAEliminar;
        
        super.obtenerGestorInstrucciones().ejecutar(instruccionEliminarProducto);
        super.eliminarProducto(IDProductoAEliminar);
        
    }

    public void editarInformacionProductoVenta(int IDProducto, ProductoVenta productoActualizado) {
        
        double nuevoPrecioCompra = productoActualizado.obtenerPrecioCompra();
        double nuevoPrecioVenta = productoActualizado.obtenerPrecioVenta();
        double nuevaGanancia = productoActualizado.obtenerGanancia();
        
        String instruccionModificarProducto = 
                "UPDATE " + TABLA_PRODUCTO_VENTA_ + 
                "SET precio_compra = " + nuevoPrecioCompra + "," +
                "precio_venta = " + nuevoPrecioVenta + "," + 
                "ganacia = " + nuevaGanancia +
                "WHERE ID = " + IDProducto;
        
        super.obtenerGestorInstrucciones().ejecutar(instruccionModificarProducto);
        super.editarInformacionProducto(IDProducto, productoActualizado);
    }
    
    
    public ProductoVenta obtenerProductoVenta(int IDProducto){
        
        Producto producto = super.obtenerProducto(IDProducto);
        
        String instruccionObtenerProducto = 
                "SELECT * from " + TABLA_PRODUCTO_VENTA_ + 
                "WHERE ID = " + IDProducto;
         ResultSet resultado = super.obtenerGestorInstrucciones().ejecutar(instruccionObtenerProducto);
        
        try {
            while (resultado.next()) {
                double precioCompra = resultado.getDouble("precio_compra");
                double precioVenta = resultado.getDouble("precio_venta");
                double ganacia = resultado.getDouble("ganacia");
                
                 ProductoVenta productoVenta = new ProductoVenta(
                         producto.obtenerIDProducto(), 
                         producto.obtenerNombre(), 
                         producto.obtenerCantidadMinima(),
                         precioCompra,
                         precioVenta,
                         ganacia
                 );
                 return productoVenta;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
