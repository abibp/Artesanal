package datos;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author PIX
 */
public class GestorInstrucciones {
    
    private final Connection conexionActual_;

    public GestorInstrucciones( Connection conexionActual_ ) {
        this.conexionActual_ = conexionActual_;
    }
    
    public ResultSet ejecutarInstruccion( String instruccionSQL ) {
        return null;
    }
}
