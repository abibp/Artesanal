package datos;

import java.sql.Connection;

/**
 *
 * @author PIX
 */
public class GestorBD {

    private final GestorConexion gestorConexion_;
    private final GestorInstrucciones gestorInstrucciones_;

    public GestorBD() {
        this.gestorConexion_ = new GestorConexion();
        Connection conexionEstablecida = gestorConexion_.iniciarConexion();
        this.gestorInstrucciones_ = new GestorInstrucciones( conexionEstablecida );
    }

    public GestorConexion obtenerGestorConexion_() {
        return gestorConexion_;
    }

    public GestorInstrucciones obtenerGestorInstrucciones_() {
        return gestorInstrucciones_;
    }
    
}
