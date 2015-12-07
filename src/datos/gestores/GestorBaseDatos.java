package datos;

import java.sql.Connection;

public class GestorBaseDatos {

    private final GestorConexion gestorConexion_;
    private final EjecutorInstrucciones ejecutorInstrucciones_;

    public GestorBaseDatos() {
        
        gestorConexion_ = new GestorConexion();
        gestorConexion_.iniciarConexion();
        
        Connection conexionEstablecida = gestorConexion_.obtenerConexion();
        
        ejecutorInstrucciones_ = new EjecutorInstrucciones( conexionEstablecida );
        
    }

    public GestorConexion obtenerGestorConexion() {
        return gestorConexion_;
    }

    public EjecutorInstrucciones obtenerEjecutorInstrucciones() {
        return ejecutorInstrucciones_;
    }
    
}
