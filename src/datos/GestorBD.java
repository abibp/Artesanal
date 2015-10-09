package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author PIX
 */
public class GestorBD {
    
    private final String DIRECCION_CONEXION_;
    private final String NOMBRE_BD_;
    private final String NOMBRE_USUARIO_;
    private final String CLAVE_USUARIO_;
    
    private Connection conexion_;
    private Statement ejecutorInstrucciones_;

    public GestorBD() {
        this.DIRECCION_CONEXION_ = "";
        this.NOMBRE_BD_ = "";
        this.NOMBRE_USUARIO_ = "";
        this.CLAVE_USUARIO_ = "";
    }

    private Connection obtenerConexion() {
        return null;
    }

    public ResultSet ejecutarInstruccion(String instruccionAEjecutar) {//Revisar nombre del metodo
        return null;
    }

    public void iniciarConexion() {

    }

    public void finalizarConexion() {

    }

    private Statement obtenerEjecutorInstrucciones() {
        return null;
    }
}
