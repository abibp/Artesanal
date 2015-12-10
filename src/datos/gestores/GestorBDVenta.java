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
import negocio.entidades.Producto;

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
                = "INSERT INTO tiene VALUES(\"%s\",%d,%d,%f)";

        String instruccionFinalInsertar
                = String.format(
                        INSTRUCCION_INSERTAR,
                        nuevaVenta.obtenerProductoVendido().obtenerID(),
                        idNotaVenta,
                        nuevaVenta.obtenerCantidadDeProducto(),
                        nuevaVenta.obtenerImporte()
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
        try {

            int idNota = resultadoConsulta.getInt("id_nota");
            Date fechaExpedicion = resultadoConsulta.getDate("fecha_expedicion");
            double importeTotal = resultadoConsulta.getDouble("importe_total");

            final String INSTRUCCION_OBTENER_ELEMENTO_VENTA
                    = "SELECT * FROM tiene JOIN producto ON tiene.fp_id_producto = producto.id_producto WHERE fnv_id_nota = %d";

            String instruccionFinal = String.format(
                    INSTRUCCION_OBTENER_ELEMENTO_VENTA,
                    idNota
            );
            ResultSet resultadoConsultaElemento = obtenerEjecutorInstrucciones().ejecutarConsulta(instruccionFinal);
            while (resultadoConsultaElemento.next()) {
                ElementoNota elemento = crearElementoVenta(resultadoConsultaElemento);
                elementos.add(elemento);
            }

            NotaDeVenta notaDeVenta = new NotaDeVenta(elementos, importeTotal);
            return notaDeVenta;
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private ElementoNota crearElementoVenta(ResultSet resultadoConsulta) {

        try {
            String idProducto = resultadoConsulta.getString("id_producto");
            String nombreProdcuto = resultadoConsulta.getString("nombre");
            double costoProducto = resultadoConsulta.getDouble("costo");
            double precioProducto = resultadoConsulta.getDouble("precio");
            int existencia = resultadoConsulta.getInt("existencia");
            
            int cantidad = resultadoConsulta.getInt("cantidad");
            
            Producto productoVendido = new Producto(
                    idProducto,
                    nombreProdcuto,
                    costoProducto,
                    precioProducto,
                    existencia);
            
            ElementoNota elemento = new ElementoNota(cantidad, productoVendido);
            System.out.println(":CCCCCC");
            return elemento;
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
