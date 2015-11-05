package negocio.gestion;

import datos.GestorBDVenta;
import java.util.ArrayList;
import negocio.entidades.Venta;
import negocio.excepcion.ExcepcionVentaNoEncontrada;

/**
 *
 * @author PIX
 */
public class GestorVenta {

    private ArrayList<Venta> nVentas_;

    public void agregarVenta(Venta nuevaVenta) {
        nVentas_.add(nuevaVenta);
        GestorBDVenta.agregarVenta(nuevaVenta);
    }

    public void cancelarVenta(int IDVenta) throws ExcepcionVentaNoEncontrada {
        boolean esEliminada = GestorBDVenta.eliminarVenta(IDVenta);

        if (!(esEliminada)) {
            throw new ExcepcionVentaNoEncontrada();
        }
    }

    public Venta obtenerPrimeraVenta() {
        return GestorBDVenta.obtenerVenta(1);
    }

    public Venta obtenerUltimaVenta() {
        int numeroUltimaVenta = GestorBDVenta.obtenerNumeroDeVentas();
        return GestorBDVenta.obtenerVenta(numeroUltimaVenta);
    }

    public float calcularPromedioDeVentas() {
        return 0.0f;
    }

    public ArrayList<Venta> obtenerVentas() {
        return nVentas_;
    }

}
