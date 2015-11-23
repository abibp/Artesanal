package negocio.gestion;

import java.util.ArrayList;
import negocio.entidades.ElementoNota;
import negocio.entidades.NotaDeVenta;
import usuario.Informador;

/**
 *
 * @author PIX
 */
public class GestorVenta {

    private ArrayList<NotaDeVenta> nRecibosDeVenta_;

    public NotaDeVenta obtenerPrimeraVenta() {

        int INDICE_PRIMERA_VENTA = 0;

        NotaDeVenta primeraVentaDia = nRecibosDeVenta_.get(INDICE_PRIMERA_VENTA);
        return primeraVentaDia;
    }

    public NotaDeVenta obtenerUltimaVenta() {

        int INDICE_ULTIMA_VENTA = nRecibosDeVenta_.size() - 1;

        NotaDeVenta primeraVentaDia = nRecibosDeVenta_.get(INDICE_ULTIMA_VENTA);
        return primeraVentaDia;

    }

    public double calcularPromedioDeVentasTotales() {

        double montoTotalVentas = 0.0;

        for (NotaDeVenta reciboActual : nRecibosDeVenta_) {

            ArrayList<ElementoNota> nVentas = reciboActual.obtenerElementos();

            montoTotalVentas += reciboActual.obtenerMonto();

        }

        int cantidadRecibosVenta = nRecibosDeVenta_.size();
        double promedioVentas = 0.0f;

        try {

            promedioVentas = montoTotalVentas / cantidadRecibosVenta;

        } catch (ArithmeticException excepcionDivision) {
            String error_mensaje = "No tienes ninguna venta";
            Informador.mostrarMensajeDeError(error_mensaje);
        }

        return promedioVentas;
    }

    public ArrayList<NotaDeVenta> obtenerRecibosVentas() {
        return nRecibosDeVenta_;
    }

}
