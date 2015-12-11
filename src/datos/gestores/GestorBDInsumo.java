package datos.gestores;

import datos.generadores.GeneradorSentenciasInsumo;
import datos.excepciones.ExcepcionInsumoNoEncontrado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Insumo;

/**
 *
 * @author Astrid Briceño
 */
public class GestorBDInsumo extends GestorBaseDatos {

    
    public static String TABLA_INSUMO_ = "insumo";
    private final GeneradorSentenciasInsumo generadorSentencia;

    
    public GestorBDInsumo() {
        generadorSentencia = new GeneradorSentenciasInsumo(TABLA_INSUMO_);
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

    
    public ArrayList<Insumo> obtenerLista() throws ExcepcionInsumoNoEncontrado {

        ArrayList<Insumo> listaInsumos = new ArrayList<>();
        String sentenciaObtenerInsumos;
        sentenciaObtenerInsumos = generadorSentencia.generarSentenciaObtenerInsumos();
        ResultSet resultadoConsulta = obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerInsumos);

        try {
            while (resultadoConsulta.next()) {
                Insumo actual = crearInsumo(resultadoConsulta);
                listaInsumos.add(actual);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GestorBDInsumo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaInsumos;
    }

    
    public Insumo obtenerPorId(String idInsumo) throws ExcepcionInsumoNoEncontrado, SQLException {

        String sentenciaObtenerInsumoPorId;
        sentenciaObtenerInsumoPorId = generadorSentencia.generarSentenciaObtenerInsumoPorId(idInsumo);
        ResultSet resultadoConsulta = obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerInsumoPorId);
        resultadoConsulta.next();
        return crearInsumo(resultadoConsulta);

    }

    
    private Insumo crearInsumo(ResultSet resultadoConsulta) throws ExcepcionInsumoNoEncontrado {

        try {

            String id = resultadoConsulta.getString("id_insumo");
            String nombre = resultadoConsulta.getString("nombre");
            double costo = resultadoConsulta.getDouble("precio");
            String unidadMedida = resultadoConsulta.getString("unidadMedida");
            int existencia = resultadoConsulta.getInt("existencia");

            Insumo producto = new Insumo(id, nombre, costo, unidadMedida, existencia);
            return producto;

        } catch (SQLException ex) {
            Logger.getLogger(GestorBDInsumo.class.getName()).log(Level.SEVERE, null, ex);
        }

        throw new ExcepcionInsumoNoEncontrado();
    }

    
}
