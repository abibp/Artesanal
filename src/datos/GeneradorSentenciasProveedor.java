
package datos;

/**
 *
 * @author Astrid Briceño
 */

import negocio.entidades.Proveedor;


public class GeneradorSentenciasProveedor {

    private final String nombreTabla;

    public GeneradorSentenciasProveedor(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public String generarSentenciaInsertarProveedor(Proveedor nuevoProveedor) {
        final String INSTRUCCION_INSERTAR = "INSERT INTO " + nombreTabla + " VALUES (\"%s\", \"%s\", %f, %f, %d)";
        
        String sentenciaInsertarGenerada = 
                String.format(
                        INSTRUCCION_INSERTAR,
                        nuevoProveedor.obtenerID(),
                        nuevoProveedor.obtenerNombre(),
                        nuevoProveedor.obtenerCosto(),
                        nuevoProveedor.obtenerUnidadMedida(),
                        nuevoProveedor.obtenerExistencia()
                );
        
        return sentenciaInsertarGenerada;
    }

    public String generarSentenciaEliminarProveedor(String idProveedor) {
        final String INSTRUCCION_ELIMINAR = 
                "DELETE FROM " + nombreTabla + 
                " WHERE id_insumo = \"%s\"";
        
        String sentenciaEliminarGenerada =
                String.format(INSTRUCCION_ELIMINAR, idProveedor);
        
        return sentenciaEliminarGenerada;
    }

    public String generarSentenciaActualizarProveedor(Proveedor insumoActualizado) {
        String condicion = "id_producto = " + insumoActualizado.obtenerID();
        final String INSTRUCCION_ACTUALIZAR = 
                "UPDATE " + nombreTabla + 
                " SET nombre = \"%s\", costo = %f, unidad = %f, existencia = %d WHERE " 
                + condicion;
        
        String sentenciaActualizarGenerada =
                String.format(
                        INSTRUCCION_ACTUALIZAR, 
                        insumoActualizado.obtenerNombre(),
                        insumoActualizado.obtenerCosto(),
                        insumoActualizado.obtenerUnidadMedida(),
                        insumoActualizado.obtenerExistencia()
                );
        
        return sentenciaActualizarGenerada;
    }

    public String generarSentenciaObtenerProveedores(){
        final String INSTRUCCION_OBTENER = "SELECT * FROM " + nombreTabla;
        
        String sentenciaObtenerProveedorsGenerada = INSTRUCCION_OBTENER;
        
        return sentenciaObtenerProveedorsGenerada;
    }
    
    public String generarSentenciaObtenerProveedorPorId(String idProveedor){
        String condicion = "id_producto = " + idProveedor;
        final String INSTRUCCION_OBTENER_POR_ID = 
                "SELECT * FROM " + nombreTabla + "WHERE " + condicion;
        
        String sentenciaObtenerProveedorPorIdGenerada =
                String.format(INSTRUCCION_OBTENER_POR_ID, idProveedor);
        
        return sentenciaObtenerProveedorPorIdGenerada;
    }
    
    
}

