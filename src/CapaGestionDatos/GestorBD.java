package CapaGestionDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author PIX
 */
public class GestorBD {
    private final String DIRECCION_CONEXION;
    private final String NOMBRE_BD;
    private final String NOMBRE_USUARIO;
    private final String CLAVE_USUARIO;
    
    private Connection conexion;
    private Statement ejecutorInstrucciones;

    public GestorBD() {
        this.DIRECCION_CONEXION = "";
        this.NOMBRE_BD = "";
        this.NOMBRE_USUARIO = "";
        this.CLAVE_USUARIO = "";
    }

    private Connection obtenerConexion() {
        return null;
    }

    public ResultSet ejecutarInstruccion(String instruccionAEjecutar) {
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
