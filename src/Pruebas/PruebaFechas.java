package Pruebas;

import datos.gestores.GestorBDVenta;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import negocio.entidades.NotaDeVenta;

/**
 *
 * @author PIX
 */
public class PruebaFechas {
    public static void main(String[] args) {
        GestorBDVenta gbv = new GestorBDVenta();
        
        SimpleDateFormat formateadorFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String fechaInicioConFormato = formateadorFecha.format(new Date());
        String fechaFinConFormato = formateadorFecha.format(new Date());
        
        //gbv.obtenerVentasRangoFecha(, null);
    }
}
