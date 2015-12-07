
package datos;
import datos.excepcion.ExcepcionInsumoNoEncontrado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Insumo;

/**
 *
 * @author PIX
 */
public class GestorBDInsumo extends GestorBDProducto {

    public void agregarInsumo(Insumo nuevoInsumo) {
        
        final String INSTRUCCION_INSERTAR
                = "INSERT INTO insumo VALUES(\"%s\",%f)";
          
        String instruccionFinalInsertar = 
                String.format(
                        INSTRUCCION_INSERTAR,
                        nuevoInsumo.obtenerID(),
                        nuevoInsumo.obtenerNombre(),
                        nuevoInsumo.obtenerCosto(),
                        nuevoInsumo.obtenerUnidadMedida()
                );

        obtenerEjecutorInstrucciones().ejecutarModificacion(instruccionFinalInsertar);
        
    }

    public void eliminarInsumo(String IDInsumoPorEliminar) {
        
        final String INSTRUCCION_ELIMINAR
            = "DELETE FROM insumo WHERE ID = \"%s\"";
        
        String instruccionFinalEliminar = 
                String.format(
                        INSTRUCCION_ELIMINAR,
                        IDInsumoPorEliminar
                );
        
        obtenerEjecutorInstrucciones().ejecutarModificacion(instruccionFinalEliminar);
    }

    public void editarInformacionInsumo(Insumo insumoActualizado) {
        
        final String INSTRUCCION_MODIFICAR
            = "UPDATE insumo SET costo = %f WHERE ID = \"%s\"";
        
        String instruccionFinalModificar
                = String.format(
                        INSTRUCCION_MODIFICAR,
                        insumoActualizado.obtenerCosto(),
                        insumoActualizado.obtenerID()
                );

        obtenerEjecutorInstrucciones().ejecutarModificacion(instruccionFinalModificar);
        editarInformacionInsumo(insumoActualizado);
    }
   
    public Insumo obtenerInsumo(String IDInsumo) throws ExcepcionInsumoNoEncontrado {

        final String INSTRUCCION_OBTENER_UNO
                = "SELECT * FROM insumo WHERE id_insumo = \"%s\"";

        String instruccionFinalObtener
                = String.format(
                        INSTRUCCION_OBTENER_UNO,
                        IDInsumo
                );

        ResultSet resultadoConsulta = 
                obtenerEjecutorInstrucciones().ejecutarConsulta(instruccionFinalObtener);

        return extraerInsumoDeResultado(resultadoConsulta);
    }

    private Insumo extraerInsumoDeResultado(ResultSet resultadoConsulta) throws ExcepcionInsumoNoEncontrado {
        try {

            if (resultadoConsulta.next()) {
                String ID = resultadoConsulta.getString("id_insumo");
                String nombre = resultadoConsulta.getString("nombre");
                double costo = resultadoConsulta.getDouble("costo");
                String unidadMedida = resultadoConsulta.getString("unidades");

                Insumo insumo = new Insumo(ID, nombre, costo, unidadMedida);
                
                return insumo;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDInsumo.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new ExcepcionInsumoNoEncontrado();
    }

}
