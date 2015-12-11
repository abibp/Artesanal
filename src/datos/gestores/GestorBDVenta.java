package datos.gestores;

import datos.generadores.GeneradorSentenciasVenta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.ElementoNota;
import negocio.entidades.NotaDeVenta;
import negocio.entidades.Producto;

public class GestorBDVenta extends GestorBaseDatos {
    
    public static String TABLA_NOTA_VENTA = "nota_venta";
        
    private final GeneradorSentenciasVenta generadorSentencia;

    
    public GestorBDVenta() {
        generadorSentencia = new GeneradorSentenciasVenta(TABLA_NOTA_VENTA);
    }
    
    
    public void registrar(NotaDeVenta nuevaVenta) {

        String sentenciaInsertarNotaVenta;
        sentenciaInsertarNotaVenta = generadorSentencia.generarSentenciaInsertarVenta(nuevaVenta);
        obtenerEjecutorInstrucciones().ejecutarModificacion(sentenciaInsertarNotaVenta);

        for (ElementoNota actual : nuevaVenta.obtenerElementos()) {
            agregarElemento(actual);
        }
    }

    
    public ArrayList<NotaDeVenta> obtenerPorRangoDeFecha(Date fechaInicio, Date fechaFin) {

        ArrayList<NotaDeVenta> notasVenta = new ArrayList();
        
        String sentenciaObtenerVentasPorRangoDeFecha;
        sentenciaObtenerVentasPorRangoDeFecha = 
                generadorSentencia.generarSentenciaObtenerVentasPorRangoDeFecha(fechaInicio, fechaFin);
        
        ResultSet resultadoConsulta = 
                obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerVentasPorRangoDeFecha);
        
        crearElementoVenta(resultadoConsulta);
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

    
    private void agregarElemento(ElementoNota nuevaVenta) {

        int idNotaVenta = obtenerUltimoID();
        
        String sentenciaInsertarElementoVenta;
        
        sentenciaInsertarElementoVenta = 
                generadorSentencia.generarSentenciaInsertarElementoVenta(nuevaVenta, idNotaVenta);
        
        obtenerEjecutorInstrucciones().ejecutarModificacion(sentenciaInsertarElementoVenta);

    }

    
    private int obtenerUltimoID() {
        
        int idObtenido = 0;
        
        try {
        
            String sentenciaObtenerUltimoId = generadorSentencia.generarSentenciaObtenerUltimoID();
            
            ResultSet resultadoUltimoID;
            resultadoUltimoID = obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerUltimoId);
            resultadoUltimoID.next();
            idObtenido = resultadoUltimoID.getInt(1);
        
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return idObtenido;
        
    }
    
    private final static String ENCABEZADO_ID_NOTA = "nota_venta";
    private final static String ENCABEZADO_IMPORTE_TOTAL = "importe_total";
    
    private NotaDeVenta crearNotaVenta(ResultSet resultadoConsulta) {

        ArrayList<ElementoNota> elementos = new ArrayList();
        
        try {

            int idNota = resultadoConsulta.getInt(ENCABEZADO_ID_NOTA);
            double importeTotal = resultadoConsulta.getDouble(ENCABEZADO_IMPORTE_TOTAL);
      
            String sentenciaObtenerElementoVenta;
            sentenciaObtenerElementoVenta = generadorSentencia.generarSentenciaObtenerElementoVenta(idNota);
            
            ResultSet resultadoConsultaElemento = 
                    obtenerEjecutorInstrucciones().ejecutarConsulta(sentenciaObtenerElementoVenta);
            
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
            
            return elemento;
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


}
