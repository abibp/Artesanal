package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Producto;
import negocio.entidades.ProductoVenta;
import negocio.excepcion.ExcepcionProductoNoEncontrado;

/**
 *
 * @author PIX
 */
public class GestorBDProductoVenta extends GestorBDProducto{
   
    public void agregarProductoVenta(ProductoVenta nuevoProducto) {
        
        agregarProducto(nuevoProducto);
        
        final String INSTRUCCION_INSERTAR
                = "INSERT INTO producto_venta VALUES(\"%s\",%f,%f,%f)";
        
        String instruccionFinalInsertar = 
                String.format(
                        INSTRUCCION_INSERTAR,
                        nuevoProducto.obtenerID(),
                        nuevoProducto.obtenerPrecioCompra(),
                        nuevoProducto.obtenerPrecioVenta(),
                        nuevoProducto.obtenerGanancia()
                );

        obtenerGestorInstrucciones().ejecutarModificacion(instruccionFinalInsertar);
        
    }

    public void eliminarProductoVenta(String IDProductoAEliminar) {
        
        final String INSTRUCCION_ELIMINAR
            = "DELETE FROM producto_venta WHERE producto_ID = \"%s\"";
        
        String instruccionFinalEliminar = 
                String.format(
                        INSTRUCCION_ELIMINAR,
                        IDProductoAEliminar
                );
        
        obtenerGestorInstrucciones().ejecutarConsulta(instruccionFinalEliminar);
        eliminarProducto(IDProductoAEliminar);
        
    }

    public void editarInformacionProductoVenta(ProductoVenta productoActualizado) {
        
        final String INSTRUCCION_MODIFICAR = 
                "UPDATE producto_venta SET precio_compra = %f, precio_venta = %f, ganancia = %f " + 
                "WHERE producto_ID = \"%s\"";
        
        String instruccionFinalModificar
                = String.format(
                        INSTRUCCION_MODIFICAR,
                        productoActualizado.obtenerPrecioCompra(),
                        productoActualizado.obtenerPrecioVenta(),
                        productoActualizado.obtenerGanancia(),
                        productoActualizado.obtenerID()
                );

        obtenerGestorInstrucciones().ejecutarModificacion(instruccionFinalModificar);
        editarInformacionProducto(productoActualizado);
        
    }
    
     public ProductoVenta obtenerProductoVenta(String IDProducto) throws ExcepcionProductoNoEncontrado{

        Producto productoBase = obtenerProducto(IDProducto);
        
        final String INSTRUCCION_OBTENER_UNO
                = "SELECT * FROM producto_venta WHERE producto_ID = \"%s\"";

        String instruccionFinalObtener
                = String.format(
                        INSTRUCCION_OBTENER_UNO,
                        IDProducto
                );

        ResultSet resultadoConsulta
                = obtenerGestorInstrucciones().ejecutarConsulta(instruccionFinalObtener);

        return extraerProductoDeResultado(resultadoConsulta, productoBase);
    }

    private ProductoVenta extraerProductoDeResultado(ResultSet resultadoConsulta, Producto productoBase) {
        
        try {

            if (resultadoConsulta.next()) {
                double precioCompra = resultadoConsulta.getDouble("precio_compra");
                double precioVenta = resultadoConsulta.getDouble("precio_venta");
                double ganancia = resultadoConsulta.getDouble("ganacia");

                ProductoVenta productoVenta = new ProductoVenta(
                        productoBase.obtenerID(), 
                        productoBase.obtenerNombre(), 
                        productoBase.obtenerCantidadMinima(),
                        precioCompra,
                        precioVenta,
                        ganancia
                );
                return productoVenta;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    
}
