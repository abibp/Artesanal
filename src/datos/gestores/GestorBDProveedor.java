package datos.gestores;

import datos.generadores.GeneradorSentenciasProveedor;
import datos.excepciones.ExcepcionProveedorNoEncontrado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Proveedor;

/**
 *
 * @author Astrid Briceño
 */
public class GestorBDProveedor extends GestorBaseDatos {

    
    public static String TABLA_PROVEEDOR_ = "proveedor";
    private final GeneradorSentenciasProveedor generadorSentencia;

    
    public GestorBDProveedor() {
        generadorSentencia = new GeneradorSentenciasProveedor(TABLA_PROVEEDOR_);
    }

    
    public void agregar(Proveedor nuevoProveedor) {

        String sentenciaInsertarProveedor;
        sentenciaInsertarProveedor = 
                generadorSentencia.generarSentenciaInsertarProveedor(nuevoProveedor);
        obtenerEjecutorInstrucciones().ejecutarModificacion(sentenciaInsertarProveedor);

    }

    
    public void eliminar(String idProveedor) {

        String sentenciaEliminarProveedor;
        sentenciaEliminarProveedor = 
                generadorSentencia.generarSentenciaEliminarProveedor(idProveedor);
        obtenerEjecutorInstrucciones().ejecutarModificacion(sentenciaEliminarProveedor);

    }

    
    public void editarInformacion(String id, Proveedor productoActualizado) {

        String sentenciaEditarInformacionProveedor;
        sentenciaEditarInformacionProveedor = 
                generadorSentencia.generarSentenciaActualizarProveedor(productoActualizado);
        obtenerEjecutorInstrucciones().ejecutarModificacion(sentenciaEditarInformacionProveedor);

    }

    
    public ArrayList<Proveedor> obtenerLista() throws ExcepcionProveedorNoEncontrado {

        ArrayList<Proveedor> listaProveedors = new ArrayList<>();
        
        String sentenciaObtenerProveedores;
        sentenciaObtenerProveedores = 
                generadorSentencia.generarSentenciaObtenerProveedores();
        
        ResultSet resultadoConsulta = 
                obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerProveedores);

        try {
            while (resultadoConsulta.next()) {
                Proveedor actual = crearProveedor(resultadoConsulta);
                listaProveedors.add(actual);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaProveedors;
        
    }

    
    public Proveedor obtenerPorId(String idProveedor) throws ExcepcionProveedorNoEncontrado {

        String sentenciaObtenerProveedorPorId;
        sentenciaObtenerProveedorPorId = 
                generadorSentencia.generarSentenciaObtenerProveedorPorId(idProveedor);
        ResultSet resultadoConsulta = 
                obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerProveedorPorId);

        return crearProveedor(resultadoConsulta);

    }

    
    private Proveedor crearProveedor(ResultSet resultadoConsulta) {

        Proveedor proveedor = null;
        try {
            
            String id = resultadoConsulta.getString("id_proveedor");
            String nombre = resultadoConsulta.getString("nombre");
            String direccion = resultadoConsulta.getString("direccion");
            String telefono = resultadoConsulta.getString("telefono");
            
            proveedor = new Proveedor(id, nombre, direccion, telefono);
            return proveedor;
            
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return proveedor;
        
    }

    
}
