package Pruebas;

import datos.gestores.GestorBaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PIX
 */
public class PruebaConsultas {
    public static void main(String[] args) throws SQLException {
        GestorBaseDatos gbd = new GestorBaseDatos();
        String consulta = "SELECT * FROM insumo";
        ResultSet rs = gbd.obtenerEjecutorInstrucciones().ejecutarConsulta(consulta);
        while(rs.next()){
            System.out.println(rs.getString(1));
        }
    }
}
