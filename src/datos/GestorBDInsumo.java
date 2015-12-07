package datos;

import datos.excepcion.ExcepcionInsumoNoEncontrado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Insumo;

/**
 *
 * @author Astrid Briceño
 */

public class GestorBDInsumo extends GestorBaseDatos {
    
    public static String TABLA_INSUMO = "productos";
    private final GeneradorSentenciasInsumo generadorSentencia;

    public GestorBDInsumo() {
        generadorSentencia = new GeneradorSentenciasInsumo(TABLA_INSUMO);
    }
    
    
    public void agregar(Insumo nuevoInsumo) {
        
        String sentenciaInsertarInsumo;
        sentenciaInsertarInsumo = generadorSentencia.generarSentenciaInsertarInsumo(nuevoInsumo);
        obtenerEjecutorInstrucciones().ejecutarModificacion(sentenciaInsertarInsumo);
        
    }

    
    public void eliminar(String idInsumo) {
        
        String sentenciaEliminarInsumo;
        sentenciaEliminarInsumo = generadorSentencia.generarSentenciaEliminarInsumo(idInsumo);
        obtenerEjecutorInstrucciones().ejecutarModificacion(sentenciaEliminarInsumo);
        
    }

    
    public void editarInformacion(String id, Insumo productoActualizado) {
        
        String sentenciaEditarInformacionInsumo;
        sentenciaEditarInformacionInsumo = generadorSentencia.generarSentenciaActualizarInsumo(productoActualizado);
        obtenerEjecutorInstrucciones().ejecutarModificacion(sentenciaEditarInformacionInsumo);
        
    }
    
    
    public Insumo obtenerLista(String idInsumo) throws ExcepcionInsumoNoEncontrado{
        
        String sentenciaObtenerInsumos;
        sentenciaObtenerInsumos = generadorSentencia.generarSentenciaObtenerInsumos();
        ResultSet resultadoConsulta = obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerInsumos);
        
        return extraerDeResultado(resultadoConsulta);
        
    }

    
    public Insumo obtenerPorId(String idInsumo) throws ExcepcionInsumoNoEncontrado{
        
        String sentenciaObtenerInsumoPorId;
        sentenciaObtenerInsumoPorId = generadorSentencia.generarSentenciaObtenerInsumoPorId(idInsumo);
        ResultSet resultadoConsulta = obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerInsumoPorId);

        return extraerDeResultado(resultadoConsulta);
        
    }
    
    
    private Insumo extraerDeResultado(ResultSet resultadoConsulta) throws ExcepcionInsumoNoEncontrado{
        
        try {

            if (resultadoConsulta.next()) {

                String id = resultadoConsulta.getString("id_producto");
                String nombre = resultadoConsulta.getString("nombre");
                double costo = resultadoConsulta.getDouble("costo");
                String unidadMedida = resultadoConsulta.getString("unidadMedida");
                int existencia = resultadoConsulta.getInt("existencia");

                Insumo producto = new Insumo(id, nombre, costo, unidadMedida, existencia);
                return producto;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDInsumo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        throw new ExcepcionInsumoNoEncontrado();
    }

}
