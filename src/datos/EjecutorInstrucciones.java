package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EjecutorInstrucciones {

    private final Connection conexionActual_;

    public EjecutorInstrucciones(Connection conexionActual_) {
        this.conexionActual_ = conexionActual_;
    }

    public ResultSet ejecutarConsulta(String instruccionSQL) {
        ResultSet resultadoConsulta = null;

        try {
            Statement consultaActual = conexionActual_.createStatement();
            resultadoConsulta = consultaActual.executeQuery(instruccionSQL);

        } catch (SQLException excepcionConsulta) {
            excepcionConsulta.printStackTrace();
        }

        return resultadoConsulta;

    }

    public int ejecutarModificacion(String instruccionSQL) {
        int filasAfectadas = 0;

        try {
            Statement consultaActual = conexionActual_.createStatement();
            filasAfectadas = consultaActual.executeUpdate(instruccionSQL);

        } catch (SQLException excepcionConsulta) {
            excepcionConsulta.printStackTrace();
        }

        return filasAfectadas;
    }
}
