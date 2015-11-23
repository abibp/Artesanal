package negocio.entidades;

import java.util.ArrayList;

/**
 *
 * @author Astrid Briceño
 */
public class ReporteVenta {

    private final int ID_REPORTE_;
    private final String DESCRIPCION_;

    private ArrayList<NotaDeVenta> nVentas_;

    public ReporteVenta(int IDReporte, String descripcion, ArrayList<NotaDeVenta> ventas) {
        this.ID_REPORTE_ = IDReporte;
        this.DESCRIPCION_ = descripcion;
        this.nVentas_ = ventas;
    }

    public int obtenerIDReporte() {
        return ID_REPORTE_;
    }

    public String obtenerDescripcion() {
        return DESCRIPCION_;
    }

    public boolean isVentaEnReporte(int IDVentaABuscar) {
        return true;
    }

    public void agregarVenta(NotaDeVenta unaVenta) {
        this.nVentas_.add(unaVenta);
    }

    public void eliminarVenta(NotaDeVenta ventaAEliminar) {
        this.nVentas_.remove(ventaAEliminar);
    }

    
}