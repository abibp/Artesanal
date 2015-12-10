package datos.gestores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.ElementoNota;
import negocio.entidades.NotaDeVenta;

public class GestorBDVenta extends GestorBaseDatos {

    public void agregarVenta(NotaDeVenta nuevaVenta) {

        final String INSTRUCCION_INSERTAR
                = "INSERT INTO nota_venta(fecha_expedicion, importe_total) VALUES(NOW(),%f)";

        String instruccionFinalInsertar
                = String.format(
                        INSTRUCCION_INSERTAR,
                        nuevaVenta.obtenerImporteTotal()
                );

        obtenerEjecutorInstrucciones().
                ejecutarModificacion(instruccionFinalInsertar);

        for (ElementoNota actual : nuevaVenta.obtenerElementos()) {
            agregarElementoVenta(actual);
        }
    }

    public ArrayList<NotaDeVenta> obtenerVentasRangoFecha(Date fechaInicio, Date fechaFin) {

        SimpleDateFormat formateadorFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        ArrayList<NotaDeVenta> notasVenta = new ArrayList();

        String fechaInicioConFormato = formateadorFecha.format(fechaInicio);
        String fechaFinConFormato = formateadorFecha.format(fechaFin);

        final String INSTRUCCION_OBTENER_POR_FECHA
                = "SELECT * FROM nota_venta WHERE fecha_expedicion >= \"%s\" AND fecha_expedicion <= \"%s\"";
        
        String instruccionFinalObtener = String.format(
                INSTRUCCION_OBTENER_POR_FECHA, 
                fechaInicioConFormato,
                fechaFinConFormato);
        
        ResultSet resultadoConsulta
                = obtenerEjecutorInstrucciones().ejecutarConsulta(instruccionFinalObtener);

        try {
            while (resultadoConsulta.next()) {
                NotaDeVenta actual = crearNotaVenta(resultadoConsulta);
                notasVenta.add(actual);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDVenta.class.getName()).log(Level.SEVERE, null, ex);
        }

        return notasVenta;
    }

    private void agregarElementoVenta(ElementoNota nuevaVenta) {

        int idNotaVenta = obtenerUltimoID();

        final String INSTRUCCION_INSERTAR
                = "INSERT INTO tiene VALUES(\"%s\",%d,%d)";

        String instruccionFinalInsertar
                = String.format(
                        INSTRUCCION_INSERTAR,
                        nuevaVenta.obtenerProductoVendido().obtenerID(),
                        idNotaVenta,
                        nuevaVenta.obtenerCantidadDeProducto()
                );

        obtenerEjecutorInstrucciones().
                ejecutarModificacion(instruccionFinalInsertar);

    }

    private int obtenerUltimoID() {
        int id = 0;
        try {
            final String INSTRUCCION_OBTENER_ULTIMO_ID
                    = "SELECT * FROM nota_venta WHERE id_nota =(SELECT MAX(id_nota) FROM nota_venta)";

            ResultSet resultadoUltimoID = obtenerEjecutorInstrucciones().ejecutarConsulta(INSTRUCCION_OBTENER_ULTIMO_ID);
            resultadoUltimoID.next();
            id = resultadoUltimoID.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    private NotaDeVenta crearNotaVenta(ResultSet resultadoConsulta) {

        ArrayList<ElementoNota> elementos = new ArrayList();
        
        
       // while (resultadoConsulta.next()) {
            //ElementoVenta actual = crearElementoVenta(resultadoConsulta);
      //  }
        return null;
    }
}
