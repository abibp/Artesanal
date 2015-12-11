
package datos.generadores;

import negocio.entidades.Producto;
import negocio.entidades.ProductoCompuesto;

/**
 *
 * @author Astrid Briceño
 */

public class GeneradorSentenciasProducto {
    
    
    private final String nombreTabla_;
    private final String VARIABLE_TEXTO = "\"%s\"";
    private final String VARIABLE_ENTERO = "%d";
    private final String VARIABLE_DECIMAL = "%f";

    
    public GeneradorSentenciasProducto(String nombreTabla) {
        this.nombreTabla_ = nombreTabla;
    }

    
    public String generarSentenciaInsertarProducto(Producto nuevoProducto) {
        final String INSTRUCCION_INSERTAR = 
                "INSERT INTO " + nombreTabla_ + 
                " VALUES ( " +
                VARIABLE_TEXTO + ", " +
                VARIABLE_TEXTO + ", " +
                VARIABLE_DECIMAL + ", " +
                VARIABLE_DECIMAL + ", " +
                VARIABLE_ENTERO +
                ")";
        
        String sentenciaInsertarGenerada = 
                String.format(
                        INSTRUCCION_INSERTAR,
                        nuevoProducto.obtenerID(),
                        nuevoProducto.obtenerNombre(),
                        nuevoProducto.obtenerCosto(),
                        nuevoProducto.obtenerPrecio(),
                        nuevoProducto.obtenerExistencia()
                );
        
        return sentenciaInsertarGenerada;
    }

    
    public String generarSentenciaEliminarProducto(String idProducto) {
        final String INSTRUCCION_ELIMINAR = 
                "DELETE FROM " + nombreTabla_ + 
                " WHERE id_producto = " + VARIABLE_TEXTO;
        
        String sentenciaEliminarGenerada =
                String.format(INSTRUCCION_ELIMINAR, idProducto);
        
        return sentenciaEliminarGenerada;
    }

    
    public String generarSentenciaActualizarProducto(Producto productoActualizado) {
        
        final String INSTRUCCION_ACTUALIZAR = 
                "UPDATE " + nombreTabla_ + 
                " SET nombre = " + VARIABLE_TEXTO +
                ", costo = " + VARIABLE_DECIMAL +
                ", precio = " + VARIABLE_DECIMAL +
                ", existencia = " + VARIABLE_ENTERO +
                " WHERE id_producto = " + VARIABLE_DECIMAL;
        
        String sentenciaActualizarGenerada =
                String.format(
                        INSTRUCCION_ACTUALIZAR, 
                        productoActualizado.obtenerNombre(),
                        productoActualizado.obtenerCosto(),
                        productoActualizado.obtenerPrecio(),
                        productoActualizado.obtenerExistencia(),
                        productoActualizado.obtenerID()
                );
        
        return sentenciaActualizarGenerada;
        
    }

    
    public String generarSentenciaObtenerProductos(){
        
        final String INSTRUCCION_OBTENER = "SELECT * FROM " + nombreTabla_;
        
        String sentenciaObtenerProductosGenerada = INSTRUCCION_OBTENER;
        
        return sentenciaObtenerProductosGenerada;
        
    }
    
    
    public String generarSentenciaObtenerProductoPorId(String idProducto){
        
        final String INSTRUCCION_OBTENER_POR_ID = 
                "SELECT * FROM " + nombreTabla_ + " WHERE id_producto = " + VARIABLE_TEXTO;
        
        String sentenciaObtenerProductoPorIdGenerada =
                String.format(INSTRUCCION_OBTENER_POR_ID, idProducto);
        
        return sentenciaObtenerProductoPorIdGenerada;
    }
    
    
    private String generarSentenciaInsertarProductoCompuesto(ProductoCompuesto nuevoProductoCompuesto){
        final String INSTRUCCION_INSERTAR_COMPUESTO = 
                "INSERT INTO usa fp_id_producto = \"%s\", fi_id_insumo = \"%s\" ";
        String sentenciaInsertarCompuestoGenerada = 
                String.format(
                        INSTRUCCION_INSERTAR_COMPUESTO,
                        nuevoProductoCompuesto.obtenerID()
                        //nuevoProductoCompuesto.
                );
        
        return sentenciaInsertarCompuestoGenerada;
    }
    
    
    private String generarSentenciaObtenerProductoCompuesto(ProductoCompuesto nuevoProductoCompuesto){
        final String NOMBRE_TABLA = "usa";
        final String INSTRUCCION_INSERTAR_COMPUESTO = 
                "INSERT INTO " + NOMBRE_TABLA + " ";
        
        String sentenciaInsertarCompuestoGenerada = 
                String.format(
                        INSTRUCCION_INSERTAR_COMPUESTO,
                        nuevoProductoCompuesto.obtenerID(),
                        nuevoProductoCompuesto.obtenerNombre(),
                        nuevoProductoCompuesto.obtenerCosto(),
                        nuevoProductoCompuesto.obtenerPrecio(),
                        nuevoProductoCompuesto.obtenerExistencia()
                );
        
        return sentenciaInsertarCompuestoGenerada;
    }
    
    
    
}
