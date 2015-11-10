package datos;

import java.sql.Connection;

public class GestorBaseDatos {

    private final GestorConexion gestorConexion_;
    private final GestorInstrucciones gestorInstrucciones_;

    public GestorBaseDatos() {
        
        gestorConexion_ = new GestorConexion();
        gestorConexion_.iniciarConexion();
        
        Connection conexionEstablecida = gestorConexion_.obtenerConexion();
        
        gestorInstrucciones_ = new GestorInstrucciones( conexionEstablecida );
        
    }

    public GestorConexion obtenerGestorConexion() {
        return gestorConexion_;
    }

    public GestorInstrucciones obtenerGestorInstrucciones() {
        return gestorInstrucciones_;
    }
    
}
