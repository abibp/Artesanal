package datos.gestores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.ElementoNota;
import negocio.entidades.NotaDeVenta;

public class GestorBDVenta extends GestorBaseDatos {

    public void agregarVenta(NotaDeVenta nuevaVenta){
        
        final String INSTRUCCION_INSERTAR
                = "INSERT INTO nota_venta(fecha_expedicion, importe_total) VALUES(NOW(),%f)";

        String instruccionFinalInsertar
                = String.format(
                        INSTRUCCION_INSERTAR,
                        nuevaVenta.obtenerImporteTotal()
                );

        obtenerEjecutorInstrucciones().
                ejecutarModificacion(instruccionFinalInsertar);

        for(ElementoNota actual : nuevaVenta.obtenerElementos()){
            agregarElementoVenta(actual);
        }
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

    private int obtenerUltimoID(){
        int id = 0;
        try {
            String INSTRUCCION_OBTENER_ULTIMO_ID =
                    "SELECT * FROM nota_venta WHERE id_nota =(SELECT MAX(id_nota) FROM nota_venta)";
            ResultSet resultadoUltimoID = obtenerEjecutorInstrucciones().ejecutarConsulta(INSTRUCCION_OBTENER_ULTIMO_ID);
            resultadoUltimoID.next();
            id = resultadoUltimoID.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
