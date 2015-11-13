package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class GestorInstrucciones {
    
    private final Connection conexionActual_;

    public GestorInstrucciones( Connection conexionActual_ ) {
        this.conexionActual_ = conexionActual_;
    }
    
    public ResultSet ejecutar( String instruccionSQL ) {
        
       ResultSet resultadoConsulta = null;
       
        try {
            
            PreparedStatement consultaActual =
                    conexionActual_.prepareStatement( instruccionSQL );
            resultadoConsulta = consultaActual.executeQuery();
            
        } catch (SQLException excepcionConsulta) {
            excepcionConsulta.printStackTrace();
        }
        
      return resultadoConsulta;
      
    }
    
}
