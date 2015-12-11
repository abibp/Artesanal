
package datos.generadores;

import negocio.entidades.Insumo;

/**
 *
 * @author Astrid Briceño
 */

public class GeneradorSentenciasInsumo {

    
    private final String nombreTabla_;
    private final String VARIABLE_TEXTO = "\"%s\"";
    private final String VARIABLE_ENTERO = "%d";
    private final String VARIABLE_DECIMAL = "%f";

    
    public GeneradorSentenciasInsumo(String nombreTabla) {
        this.nombreTabla_ = nombreTabla;
    }

    
    public String generarSentenciaInsertarInsumo(Insumo nuevoInsumo) {
        final String INSTRUCCION_INSERTAR = 
                "INSERT INTO " + nombreTabla_ + 
                " VALUES ( " + 
                VARIABLE_TEXTO + ", " + 
                VARIABLE_TEXTO + ", " +
                VARIABLE_DECIMAL + ", " +
                VARIABLE_TEXTO + ", " +
                VARIABLE_ENTERO +
                ")";
        
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
                "DELETE FROM " + nombreTabla_ + 
                " WHERE id_insumo = " + VARIABLE_TEXTO;
        
        String sentenciaEliminarGenerada =
                String.format(INSTRUCCION_ELIMINAR, idInsumo);
        
        return sentenciaEliminarGenerada;
    }

    
    public String generarSentenciaActualizarInsumo(Insumo insumoActualizado) {
        
        final String INSTRUCCION_ACTUALIZAR = 
                "UPDATE " + nombreTabla_ + 
                " SET nombre = " + VARIABLE_TEXTO + 
                ", precio = " + VARIABLE_DECIMAL +
                ", unidadMedida = " + VARIABLE_TEXTO +
                ", existencia = " + VARIABLE_ENTERO +
                " WHERE id_insumo = " + VARIABLE_TEXTO;
        
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
        
        final String INSTRUCCION_OBTENER = "SELECT * FROM " + nombreTabla_;
        
        String sentenciaObtenerInsumosGenerada = INSTRUCCION_OBTENER;
        
        return sentenciaObtenerInsumosGenerada;
    }
    
    
    public String generarSentenciaObtenerInsumoPorId(String idInsumo){

        final String INSTRUCCION_OBTENER_POR_ID = 
                "SELECT * FROM " + nombreTabla_ + " WHERE id_insumo = " + VARIABLE_TEXTO;
        
        String sentenciaObtenerInsumoPorIdGenerada =
                String.format(INSTRUCCION_OBTENER_POR_ID, idInsumo);
        
        return sentenciaObtenerInsumoPorIdGenerada;
    }
    
    
}
