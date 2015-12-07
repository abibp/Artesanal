package negocio.gestion;

import datos.GestorBDVenta;
import java.util.ArrayList;
import java.util.Map.Entry;
import negocio.entidades.ElementoNota;
import negocio.entidades.NotaDeVenta;
import usuario.Informador;

/**
 *
 * @author PIX
 */
public class Vendedor {

    private final GestorBDVenta gestorBD_;

    private Vendedor() {
        this.gestorBD_ = new GestorBDVenta();
    }
    
//    public NotaDeVenta obtenerPrimeraVenta() {
//
//        int INDICE_PRIMERA_VENTA = 0;
//
//        NotaDeVenta primeraVentaDia = nNotasDeVenta_.get(INDICE_PRIMERA_VENTA);
//        return primeraVentaDia;
//    }
//
//    public NotaDeVenta obtenerUltimaVenta() {
//
//        int INDICE_ULTIMA_VENTA = nNotasDeVenta_.size() - 1;
//
//        NotaDeVenta primeraVentaDia = nNotasDeVenta_.get(INDICE_ULTIMA_VENTA);
//        return primeraVentaDia;
//
//    }
//
//    public double calcularImporteTotal() {  //Investigar implementacion del forEach
//
//        double importeTotalVentas = 0.0;
//        for (Entry<String, NotaDeVenta> entry: nNotasDeVenta_.entrySet()) {
//            NotaDeVenta reciboActual = entry.getValue();
//            importeTotalVentas += reciboActual.obtenerImporteTotal();
//        }
//
//        return importeTotalVentas;
//    }
//
//    public double calcularPromedioTotal () {
//        int cantidadRecibosVenta = nNotasDeVenta_.size();
//        double promedioVentas = 0.0f;
//
//        try {
//
//            promedioVentas = calcularImporteTotal() / cantidadRecibosVenta;
//
//        } catch (ArithmeticException excepcionDivision) {
//            String error_mensaje = "No tienes ninguna venta";
//            Informador.mostrarMensajeDeError(error_mensaje);
//        }
//
//        return promedioVentas;
//    }
    
    public NotaDeVenta realizarVenta(ArrayList<ElementoNota> productos, double pago){
          
        NotaDeVenta nota = new NotaDeVenta();
        
    }

}
