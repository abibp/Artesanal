package negocio.gestion;

import java.util.ArrayList;
import negocio.entidades.Venta;
import negocio.entidades.ElementoVenta;
import usuario.Informador;

/**
 *
 * @author PIX
 */
public class GestorVenta {

    private ArrayList<Venta> nRecibosDeVenta_;

    public Venta obtenerPrimerReciboVenta() {
        
        int INDICE_PRIMERA_VENTA = 0;

        Venta primeraVentaDia = nRecibosDeVenta_.get(INDICE_PRIMERA_VENTA);
        return primeraVentaDia;
    }

    public Venta obtenerUltimaVenta() {
        int INDICE_ULTIMA_VENTA = nRecibosDeVenta_.size() - 1;

        Venta primeraVentaDia = nRecibosDeVenta_.get(INDICE_ULTIMA_VENTA);
        return primeraVentaDia;
    }

    public double calcularPromedioDeVentasTotales() {

        double montoTotalVentas = 0.0f;
        int cantidadRecibosVenta = nRecibosDeVenta_.size();

        for (Venta reciboActual : nRecibosDeVenta_) {
            
            ArrayList<ElementoVenta> nVentas = reciboActual.obtenerElementosVenta();
            for(ElementoVenta ventaActual : nVentas){
                montoTotalVentas += ventaActual.obtenerMonto();
            }
        }

        double promedioVentas = 0.0f;
        
        try {
            
            promedioVentas = montoTotalVentas / cantidadRecibosVenta;
            
        } catch (ArithmeticException excepcionDivision) {
            String error_mensaje = "No tienes ninguna venta";
            Informador.mostrarMensajeDeError(error_mensaje);
        }

        return promedioVentas;
    }

    public ArrayList<Venta> obtenerRecibosVentas() {
        return nRecibosDeVenta_;
    }

}
