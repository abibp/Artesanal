package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PIX
 */
public class GestorConexion {

    private final String DIRECCION_CONEXION_ = "127.0.0.1";
    private final String NOMBRE_BD_ = "artesanal";
    private final String NOMBRE_USUARIO_ = "root";
    private final String CLAVE_USUARIO_ = "clave";
    private final String CLASE_MANEJADOR = "com.mysql.jdbc.Driver";
    
    private Connection conexion_;

    public GestorConexion() {
        
        try {
            
            Class.forName(CLASE_MANEJADOR);
            
        } catch (ClassNotFoundException excepcionDriverConexion) {
            excepcionDriverConexion.printStackTrace();
        }
        
    }
    
    public void iniciarConexion(){
        
        try {
            
            final String URL = "jdbc:mysql://" +
                    DIRECCION_CONEXION_ +
                    "/" +
                    NOMBRE_BD_;
            
            conexion_ = DriverManager.getConnection(
                    URL,
                    NOMBRE_USUARIO_,
                    CLAVE_USUARIO_
            );
            
        } catch (SQLException excepcionConexion) {
            excepcionConexion.printStackTrace();
        }
        
    }

    public void finalizarConexion(){
        
        try {
            
            conexion_.close();
            
        } catch (SQLException excepcionConexion) {
           excepcionConexion.printStackTrace();
        }
        
    }
    
    public Connection obtenerConexion(){
        return conexion_;
    }

}
