package negocio.entidades;

import java.util.ArrayList;

/**
 *
 * @author Astrid Briceño
 */
public class ReporteVentas {

    private final int ID_;
    private final String DESCRIPCION_;

    private ArrayList<NotaDeVenta> nVentas_;

    public ReporteVentas(int IDReporte, String descripcion, ArrayList<NotaDeVenta> ventas) {
        this.ID_ = IDReporte;
        this.DESCRIPCION_ = descripcion;
        this.nVentas_ = ventas;
    }

    public int obtenerIDReporte() {
        return ID_;
    }

    public String obtenerDescripcion() {
        return DESCRIPCION_;
    }

    public boolean estaVentaEnReporte(int IDVentaABuscar) {
        return true;
    }

    public void agregarVenta(NotaDeVenta unaVenta) {
        this.nVentas_.add(unaVenta);
    }

    public void eliminarVenta(NotaDeVenta ventaAEliminar) {
        this.nVentas_.remove(ventaAEliminar);
    }

    
}
