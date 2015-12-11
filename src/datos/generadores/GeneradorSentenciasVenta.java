
package datos.generadores;

import datos.gestores.GestorBDVenta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.ElementoNota;
import negocio.entidades.NotaDeVenta;

/**
 *
 * @author Astrid Briceño
 */
public class GeneradorSentenciasVenta {
    
    private final String nombreTabla;

    
    public GeneradorSentenciasVenta(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }
    
    
    public String generarSentenciaInsertarVenta(NotaDeVenta nuevaVenta){
        final String INSTRUCCION_INSERTAR
                = "INSERT INTO " +  nombreTabla + "(fecha_expedicion, importe_total) VALUES(NOW(),%f)";

        String instruccionInsertarGenerada
                = String.format(
                        INSTRUCCION_INSERTAR,
                        nuevaVenta.obtenerImporteTotal()
                );
        
        return instruccionInsertarGenerada;
    }
        
    
    public String generarSentenciaObtenerVentasPorRangoDeFecha(Date fechaInicio, Date fechaFin){
        
        String fechaInicioConFormato = formatearFecha(fechaInicio);
        String fechaFinConFormato = formatearFecha(fechaFin);
        
        final String INSTRUCCION_OBTENER_POR_RANGO_FECHA = 
                "SELECT * FROM " + nombreTabla + 
                " WHERE fecha_expedicion >= \"%s\" AND fecha_expedicion <= \"%s\"";

        String sentenciaObtenerVentasPorRangoDeFechaGenerada = 
                String.format(
                        INSTRUCCION_OBTENER_POR_RANGO_FECHA,
                        fechaInicioConFormato,
                        fechaFinConFormato
                );
        
        return sentenciaObtenerVentasPorRangoDeFechaGenerada;
        
    }
    
    
    public String generarSentenciaInsertarElementoVenta(ElementoNota nuevoElemento, int idNotaVenta){
        
        final String INSTRUCCION_INSERTAR
                = "INSERT INTO tiene VALUES(\"%s\",%d,%d,%f)";

        String sentenciaInsertarElementoGenerada
                = String.format(
                        INSTRUCCION_INSERTAR,
                        nuevoElemento.obtenerProductoVendido().obtenerID(),
                        idNotaVenta,
                        nuevoElemento.obtenerCantidadDeProducto(),
                        nuevoElemento.obtenerImporte()
                );

        return sentenciaInsertarElementoGenerada;
        
    }
    
    
    public String generarSentenciaObtenerUltimoID(){
       
        final String INSTRUCCION_OBTENER_ULTIMO_ID = 
                "SELECT * FROM " + nombreTabla + 
                " WHERE id_nota =(SELECT MAX(id_nota) FROM nota_venta)";
        
        String sentenciaObtenerUltimoIDGenerada = INSTRUCCION_OBTENER_ULTIMO_ID;
        
        return sentenciaObtenerUltimoIDGenerada;
        
    }

    
    private String formatearFecha(Date fecha) {

        SimpleDateFormat formateadorFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String fechaConFormato = formateadorFecha.format(fecha);

        return fechaConFormato;

    }

}
