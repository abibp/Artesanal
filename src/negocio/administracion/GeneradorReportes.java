/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.administracion;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import datos.AlmacenadorDeArchivos;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import negocio.entidades.ElementoNota;
import negocio.entidades.NotaDeVenta;
import negocio.entidades.Producto;

/**
 *
 * @author MiguelAngel
 */
public class GeneradorReportes {
    
    private final Document REPORTE_;
    private final Paragraph SEPARADOR_;
    
    private AlmacenadorDeArchivos almacenador;
    private String nombreReporte_ = "reporte.pdf";
   
    public GeneradorReportes() {
        this.REPORTE_ = new Document();
        this.SEPARADOR_ = new Paragraph("\n");
        this.almacenador = new AlmacenadorDeArchivos();
    }
    
    public void generarReporteVentas(
            Date fechaInicio,
            Date fechaFinalizacion,
            String ubicacionDirectorio,
            ArrayList<NotaDeVenta> notasVenta
    ) throws FileNotFoundException, DocumentException {
        
        this.almacenador.establecerArchivo(ubicacionDirectorio, nombreReporte_);
        iniciarEdicion(ubicacionDirectorio);
        agregarTitulo(formatearFechas(fechaInicio, fechaFinalizacion));
       
        //ArrayList<NotaDeVenta> notasVenta = new ArrayList<>();
        //TODO: Jalar todos los datos del Gestor de Venta
        for (NotaDeVenta actual : notasVenta) {
            agregarSeccion(actual);
        }
        agregarPiePagina();
        finalizarEdicion();
    }

   
    private void agregarCabeceraTabla(PdfPTable tablaProductosVendidos) {
       
        final String[] cabecera = {"Nombre", "Cantidad", "Importe"};
       
        tablaProductosVendidos.addCell(cabecera[0]);
        tablaProductosVendidos.addCell(cabecera[1]);
        tablaProductosVendidos.addCell(cabecera[2]);
       
    }


    private void agregarFilaTabla(PdfPTable tablaProductosVendidos, ElementoNota actual) {
        
        Producto productoVendido = actual.obtenerProductoVendido();
       
        tablaProductosVendidos.addCell(productoVendido.obtenerNombre());
        tablaProductosVendidos.addCell(String.valueOf(actual.obtenerCantidadDeProducto()));
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


    private void agregarTitulo(String fechas) throws DocumentException {

        String encabezado = "Reporte de Ventas: " + fechas;
        Paragraph titulo = new Paragraph(encabezado);
        
        REPORTE_.add(titulo);
        REPORTE_.add(SEPARADOR_);

    }


    private void agregarSeccion(NotaDeVenta actual) throws DocumentException {
        REPORTE_.add(generarTablaNotaVenta(actual));
        REPORTE_.add(SEPARADOR_);
    }


    private void agregarPiePagina() {

    }

    private void finalizarEdicion() {
        REPORTE_.close();
    }

    private String formatearFechas(Date primeraFecha, Date segundaFecha){

        final String GUION = " - "; 
        final String FORMATO = "yyyy-MM-dd";
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO);

        String fechaFormateada = formateador.format(primeraFecha) + GUION 
            + formateador.format(segundaFecha);
        return fechaFormateada;

    }

    private void iniciarEdicion(String ubicacionDirectorio) throws FileNotFoundException, DocumentException {
        
        PdfWriter.getInstance(REPORTE_, almacenador.obtenerArchivo());
        REPORTE_.open();
        
    }
}
