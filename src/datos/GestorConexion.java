package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class GestorConexion {

    private final String DIRECCION_CONEXION_ = "localhost";
    private final String NOMBRE_BD_ = "sis_artesanal";
    private final String NOMBRE_USUARIO_ = "root";
    private final String CLAVE_USUARIO_ = "";
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
        
        final String INICIO_URL = "jdbc:mysql://";
        final String SEPARADOR = "/";
        
        try {
            
            final String URL = 
                    INICIO_URL +
                    DIRECCION_CONEXION_ +
                    SEPARADOR +
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
