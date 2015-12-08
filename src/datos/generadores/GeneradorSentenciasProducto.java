
package datos.generadores;

import negocio.entidades.Producto;

/**
 *
 * @author Astrid Briceño
 */

public class GeneradorSentenciasProducto {
    private final String nombreTabla;

    public GeneradorSentenciasProducto(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public String generarSentenciaInsertarProducto(Producto nuevoProducto) {
        final String INSTRUCCION_INSERTAR = "INSERT INTO " + nombreTabla + " VALUES (\"%s\", \"%s\", %f, %f, %d)";
        
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
    
    public String generarSentenciaInsertarProductoCompuesto(ProductoCompuesto nuevoProductoCompuesto){
        final String INSTRUCCION_INSERTAR_COMPUESTO = "INSERT INTO " + ;
    }

    public String generarSentenciaEliminarProducto(String idProducto) {
        final String INSTRUCCION_ELIMINAR = 
                "DELETE FROM " + nombreTabla + 
                " WHERE id_producto = \"%s\"";
        
        String sentenciaEliminarGenerada =
                String.format(INSTRUCCION_ELIMINAR, idProducto);
        
        return sentenciaEliminarGenerada;
    }

    public String generarSentenciaActualizarProducto(Producto productoActualizado) {
        
        final String INSTRUCCION_ACTUALIZAR = 
                "UPDATE " + nombreTabla + 
                " SET nombre = \"%s\", costo = %f, precio = %f, existencia = %d" +
                " WHERE id_producto = \"%s\"";
        
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
        
        final String INSTRUCCION_OBTENER = "SELECT * FROM " + nombreTabla;
        
        String sentenciaObtenerProductosGenerada = INSTRUCCION_OBTENER;
        
        return sentenciaObtenerProductosGenerada;
        
    }
    
    public String generarSentenciaObtenerProductoPorId(String idProducto){
        
        final String INSTRUCCION_OBTENER_POR_ID = 
                "SELECT * FROM " + nombreTabla + " WHERE id_producto = \"%s\"";
        
        String sentenciaObtenerProductoPorIdGenerada =
                String.format(INSTRUCCION_OBTENER_POR_ID, idProducto);
        
        return sentenciaObtenerProductoPorIdGenerada;
    }
    
    
}
