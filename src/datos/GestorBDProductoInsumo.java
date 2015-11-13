package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Producto;
import negocio.entidades.ProductoInsumo;

/**
 *
 * @author PIX
 */
public class GestorBDProductoInsumo extends GestorBDProducto {

    public void agregarProductoInsumo(ProductoInsumo nuevoProducto) {
        
        agregarProducto(nuevoProducto);
        
        final String INSTRUCCION_INSERTAR
                = "INSERT INTO producto_insumo VALUES(\"%s\",%f)";
        
        String instruccionFinalInsertar = 
                String.format(
                        INSTRUCCION_INSERTAR,
                        nuevoProducto.obtenerID(),
                        nuevoProducto.obtenerPrecioCompra()
                );

        obtenerGestorInstrucciones().ejecutarModificacion(instruccionFinalInsertar);
        
    }

    public void eliminarProductoInsumo(String IDProductoAEliminar) {
        
        final String INSTRUCCION_ELIMINAR
            = "DELETE FROM producto_insumo WHERE ID = \"%s\"";
        
        String instruccionFinalEliminar = 
                String.format(
                        INSTRUCCION_ELIMINAR,
                        IDProductoAEliminar
                );
        
        obtenerGestorInstrucciones().ejecutarConsulta(instruccionFinalEliminar);
        eliminarProducto(IDProductoAEliminar);
        
    }

    public void editarInformacionProductoInsumo(ProductoInsumo productoActualizado) {
        
        final String INSTRUCCION_MODIFICAR
            = "UPDATE producto SET precio_compra = %f WHERE ID = \"%s\"";
        
        String instruccionFinalModificar
                = String.format(
                        INSTRUCCION_MODIFICAR,
                        productoActualizado.obtenerPrecioCompra(),
                        productoActualizado.obtenerID()
                );

        obtenerGestorInstrucciones().ejecutarModificacion(instruccionFinalModificar);
        editarInformacionProducto(productoActualizado);
    }
   
    public ProductoInsumo obtenerProductoInsumo(String IDProducto) {

        Producto productoBase = obtenerProducto(IDProducto);
        
        final String INSTRUCCION_OBTENER_UNO
                = "SELECT * FROM producto_insumo WHERE ID = \"%s\"";

        String instruccionFinalObtener
                = String.format(
                        INSTRUCCION_OBTENER_UNO,
                        IDProducto
                );

        ResultSet resultadoConsulta
                = obtenerGestorInstrucciones().ejecutarConsulta(instruccionFinalObtener);

        return extraerProductoDeResultado(resultadoConsulta, productoBase);
    }

    private ProductoInsumo extraerProductoDeResultado(ResultSet resultadoConsulta, Producto productoBase) {
        try {

            if (resultadoConsulta.next()) {
                double precioCompra = resultadoConsulta.getDouble("precio_compra");

                ProductoInsumo productoInsumo = new ProductoInsumo(
                        productoBase.obtenerID(), 
                        productoBase.obtenerNombre(), 
                        productoBase.obtenerCantidadMinima(),
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
