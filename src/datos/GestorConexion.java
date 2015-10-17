package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author PIX
 */
public class GestorConexion {

    private final String DIRECCION_CONEXION_ = "127.0.0.1";
    private final String NOMBRE_BD_ = "artesanal";
    private final String NOMBRE_USUARIO_ = "root";
    private final String CLAVE_USUARIO_ = "clave";

    private Connection conexion_;

    public Connection iniciarConexion() {
        return null;
    }

    public void finalizarConexion() {

    }

}
