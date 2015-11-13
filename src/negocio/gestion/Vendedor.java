package negocio.gestion;

import datos.GestorBDVenta;
import java.util.ArrayList;
import negocio.entidades.Venta;
import negocio.entidades.ProductoVendido;
import negocio.excepcion.ExcepcionVentaNoEncontrada;
import usuario.Informador;

/**
 *
 * @author PIX
 */
public class Vendedor {

    private ArrayList<Venta> nRecibosDeVenta_;

    public void agregarVenta(Venta nuevaVenta) {
        nRecibosDeVenta_.add(nuevaVenta);
        GestorBDVenta.agregarVenta(nuevaVenta);
    }

    public void cancelarVenta(int IDVenta) throws ExcepcionVentaNoEncontrada {
        boolean esEliminada = GestorBDVenta.eliminarVenta(IDVenta);

        if (!(esEliminada)) {
            throw new ExcepcionVentaNoEncontrada();
        }
    }

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
            
            ArrayList<ProductoVendido> nVentas = reciboActual.obtenerProductos();
            for(ProductoVendido ventaActual : nVentas){
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
