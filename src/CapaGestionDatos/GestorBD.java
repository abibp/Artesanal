package CapaGestionDatos;

import java.sql.Connection;

/**
 *
 * @author PIX
 */
public class GestorBD {

    private GestorBD instancia;
    private Connection conexion;

    public GestorBD() {}
    
    public Connection obtenerConexion(){
        return null;
    }
    
    private void inicializarConexion(){
        
    }
    
    public void cerrarConexion(){
        
    }
}
