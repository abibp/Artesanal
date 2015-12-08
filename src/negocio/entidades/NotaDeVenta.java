package negocio.entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PIX
 */
public final class NotaDeVenta {
    
    private final Date FECHA_;
    private final ArrayList<ElementoNota> PRODUCTOS_VENDIDOS_;
    private final double IMPORTE_TOTAL_;
    private final double PAGO_;
    private final double CAMBIO_; 
    
    private int ID_;

    public NotaDeVenta(ArrayList<ElementoNota> elementos, double importeTotal, double pago, double cambio, int id) {
        this.FECHA_ = new Date();
        this.PRODUCTOS_VENDIDOS_ = elementos;
        this.IMPORTE_TOTAL_ = calcularImporteTotal();
        this.PAGO_ = pago;
        this.CAMBIO_ = cambio;
        this.ID_ = id;
    }

    public NotaDeVenta(ArrayList<ElementoNota> elementos, double pago) {
        this.FECHA_ = new Date();
        this.PRODUCTOS_VENDIDOS_ = elementos;
        this.IMPORTE_TOTAL_ = calcularImporteTotal();
        this.PAGO_ = pago;
        this.CAMBIO_ = pago - obtenerImporteTotal();
    }
    
    public int obtenerID() {
        return ID_;
    }

    public Date obtenerFecha() {
        return FECHA_;
    }
    
    public ArrayList<ElementoNota> obtenerElementos() {
        return PRODUCTOS_VENDIDOS_;
    }

    public double obtenerImporteTotal() {
        return IMPORTE_TOTAL_;
    }
    
    public void agregarElemento(ElementoNota elementoVenta) {
        PRODUCTOS_VENDIDOS_.add(elementoVenta);
    }

    public void eliminarElemento(ElementoNota elementoVenta) {
        PRODUCTOS_VENDIDOS_.remove(elementoVenta);
    }

    private double calcularImporteTotal() {
        
        double montoTotal = 0.0;
        for (ElementoNota elementoActual : PRODUCTOS_VENDIDOS_) {
            montoTotal += elementoActual.obtenerImporte();
        }
        return montoTotal;
    }

}
