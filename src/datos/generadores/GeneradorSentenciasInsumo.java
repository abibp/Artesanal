
package datos.generadores;

import negocio.entidades.Insumo;

/**
 *
 * @author Astrid Briceño
 */

public class GeneradorSentenciasInsumo {

    
    private final String nombreTabla;
    private final String VARIABLE_TEXTO = "\"%s\"";

    
    public GeneradorSentenciasInsumo(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    
    public String generarSentenciaInsertarInsumo(Insumo nuevoInsumo) {
        final String INSTRUCCION_INSERTAR = 
                "INSERT INTO " + nombreTabla + 
                " VALUES (\"%s\", \"%s\", %f, \"%s\", %d)";
        
        String sentenciaInsertarGenerada = 
                String.format(
                        INSTRUCCION_INSERTAR,
                        nuevoInsumo.obtenerID(),
                        nuevoInsumo.obtenerNombre(),
                        nuevoInsumo.obtenerCosto(),
                        nuevoInsumo.obtenerUnidadMedida(),
                        nuevoInsumo.obtenerExistencia()
                );
        
        return sentenciaInsertarGenerada;
    }

    
    public String generarSentenciaEliminarInsumo(String idInsumo) {
        final String INSTRUCCION_ELIMINAR = 
                "DELETE FROM " + nombreTabla + 
                " WHERE id_insumo = \"%s\"";
        
        String sentenciaEliminarGenerada =
                String.format(INSTRUCCION_ELIMINAR, idInsumo);
        
        return sentenciaEliminarGenerada;
    }

    
    public String generarSentenciaActualizarInsumo(Insumo insumoActualizado) {
        final String INSTRUCCION_ACTUALIZAR = 
                "UPDATE " + nombreTabla + 
                " SET nombre = " + VARIABLE_TEXTO + ", precio = %f, unidadMedida = \"%s\", existencia = %d" +
                " WHERE id_insumo = \"%s\" ";
        
        String sentenciaActualizarGenerada =
                String.format(
                        INSTRUCCION_ACTUALIZAR, 
                        insumoActualizado.obtenerNombre(),
                        insumoActualizado.obtenerCosto(),
                        insumoActualizado.obtenerUnidadMedida(),
                        insumoActualizado.obtenerExistencia(),
                        insumoActualizado.obtenerID()
                );
        
        return sentenciaActualizarGenerada;
    }

    
    public String generarSentenciaObtenerInsumos(){
        final String INSTRUCCION_OBTENER = "SELECT * FROM " + nombreTabla;
        
        String sentenciaObtenerInsumosGenerada = INSTRUCCION_OBTENER;
        
        return sentenciaObtenerInsumosGenerada;
    }
    
    
    public String generarSentenciaObtenerInsumoPorId(String idInsumo){
        String condicion = "id_insumo = " + idInsumo;
        final String INSTRUCCION_OBTENER_POR_ID = 
                "SELECT * FROM " + nombreTabla + " WHERE id_insumo = \"%s\" ";
        
        String sentenciaObtenerInsumoPorIdGenerada =
                String.format(INSTRUCCION_OBTENER_POR_ID, idInsumo);
        
        return sentenciaObtenerInsumoPorIdGenerada;
    }
    
    
}
