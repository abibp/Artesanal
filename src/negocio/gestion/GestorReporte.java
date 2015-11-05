package negocio.gestion;

import negocio.entidades.Inventario;
import negocio.entidades.Caja;
import negocio.entidades.Venta;
import negocio.entidades.ReporteDeVenta;

/**
 *
 * @author PIX
 */
public class GestorReporte {

    private ReporteDeVenta reporteDeVentas;

    public ReporteDeVenta generarReporteDeVentas(Caja caja) {
        return null;
    }

    public ReporteDeVenta generarReporteDeInventario(Inventario inventario) {
        return null;
    }

    public boolean agregarVentaAlReporte(Venta ventaPorAgregar) {
        reporteDeVentas.agregarVenta(ventaPorAgregar);
        return true;
    }

    public boolean eliminarVentaDelReporte(Venta ventaAEliminar) {
        reporteDeVentas.eliminarVenta(ventaAEliminar);
        return true;
    }

    public ReporteDeVenta generarReporteDeVentas() {
        return this.reporteDeVentas;
    }
}
