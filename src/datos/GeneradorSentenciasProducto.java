
package datos;

import java.util.Locale;
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
        System.out.println(sentenciaInsertarGenerada);
        return sentenciaInsertarGenerada;
    }

    public String generarSentenciaEliminarProducto(String idProducto) {
        final String INSTRUCCION_ELIMINAR = 
                "DELETE FROM " + nombreTabla + 
                " WHERE id_producto = \"%s\"";
        
        String sentenciaEliminarGenerada =
                String.format(INSTRUCCION_ELIMINAR, idProducto);
        System.out.println(sentenciaEliminarGenerada);
        return sentenciaEliminarGenerada;
    }

    public String generarSentenciaActualizarProducto(Producto productoActualizado) {
        String condicion = "id_producto = " + productoActualizado.obtenerID();
        final String INSTRUCCION_ACTUALIZAR = 
                "UPDATE " + nombreTabla + 
                " SET nombre = \"%s\", costo = %f, precio = %f, existencia = %d WHERE " 
                + condicion;
        
        String sentenciaActualizarGenerada =
                String.format(
                        INSTRUCCION_ACTUALIZAR, 
                        productoActualizado.obtenerNombre(),
                        productoActualizado.obtenerCosto(),
                        productoActualizado.obtenerPrecio(),
                        productoActualizado.obtenerExistencia()
                );
        return sentenciaActualizarGenerada;
    }

    public String generarSentenciaObtenerProductos(){
        final String INSTRUCCION_OBTENER = "SELECT * FROM " + nombreTabla;
        
        String sentenciaObtenerProductosGenerada = INSTRUCCION_OBTENER;
        
        return sentenciaObtenerProductosGenerada;
    }
    
    public String generarSentenciaObtenerProductoPorId(String idProducto){
        String condicion = "id_producto = " + idProducto;
        final String INSTRUCCION_OBTENER_POR_ID = 
                "SELECT * FROM " + nombreTabla + "WHERE " + condicion;
        
        String sentenciaObtenerProductoPorIdGenerada =
                String.format(INSTRUCCION_OBTENER_POR_ID, idProducto);
        
        return sentenciaObtenerProductoPorIdGenerada;
    }
    
    
}
