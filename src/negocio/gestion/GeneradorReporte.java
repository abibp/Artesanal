package negocio.gestion;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import negocio.entidades.ElementoNota;
import negocio.entidades.NotaDeVenta;
import negocio.entidades.Producto;

/**
 *
 * @author PIX
 */
public class GeneradorReporte {

    private final Document reporte;
    private final String nombreReporte = "ReporteVentas.pdf";

    public GeneradorReporte() {
        reporte = new Document();
    }

    public void generarReporteVentas(
            Date fechaInicio,
            Date fechaFinalizacion,
            String ubicacionDirectorio) throws FileNotFoundException, DocumentException {

        iniciarEdicion(ubicacionDirectorio);
        agregarTitulo();

        ArrayList<NotaDeVenta> notasVenta = new ArrayList<>();
        //TODO: Jalar todos los datos del Gestor de Venta
        for (NotaDeVenta actual : notasVenta) {
            agregarSeccion(actual);
        }
        agregarPiePagina();
        finalizarEdicion();
    }

    private void agregarCabeceraTabla(PdfPTable tablaProductosVendidos) {

        final String[] cabecera = {"Cantidad", "Codigo", "Nombre", "Importe"};

        tablaProductosVendidos.addCell(cabecera[0]);
        tablaProductosVendidos.addCell(cabecera[1]);
        tablaProductosVendidos.addCell(cabecera[2]);
        tablaProductosVendidos.addCell(cabecera[3]);

    }

    private void agregarFilaTabla(PdfPTable tablaProductosVendidos, ElementoNota actual) {

        Producto productoVendido = actual.obtenerProductoVendido();

        tablaProductosVendidos.addCell(String.valueOf(actual.obtenerCantidadDeProducto()));
        tablaProductosVendidos.addCell(productoVendido.obtenerID());
        tablaProductosVendidos.addCell(productoVendido.obtenerNombre());
        tablaProductosVendidos.addCell(String.valueOf(actual.obtenerImporte()));

    }

    private PdfPTable generarTablaNotaVenta(NotaDeVenta notaVenta) {

        ArrayList<ElementoNota> elementosNotaVenta = notaVenta.obtenerElementos();

        final int NUMERO_COLUMNAS = 3;
        PdfPTable tablaProductosVendidos = new PdfPTable(NUMERO_COLUMNAS);

        agregarCabeceraTabla(tablaProductosVendidos);

        for (ElementoNota actual : elementosNotaVenta) {
            agregarFilaTabla(tablaProductosVendidos, actual);
        }

        return tablaProductosVendidos;
    }

    private void agregarTitulo() throws DocumentException {

        Paragraph titulo = new Paragraph("PELOS");
        reporte.add(titulo);
    }

    private void agregarSeccion(NotaDeVenta actual) {
        generarTablaNotaVenta(actual);
    }

    private void agregarPiePagina() {

    }

    private void finalizarEdicion() {
        reporte.close();
    }

    private void iniciarEdicion(String ubicacionDirectorio) throws FileNotFoundException, DocumentException {

        final String SEPARADOR = "\\";
        FileOutputStream archivoPDF = new FileOutputStream(ubicacionDirectorio + SEPARADOR + nombreReporte);
        PdfWriter.getInstance(reporte, archivoPDF);
        reporte.open();
    }

}
