package negocio.entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PIX
 */
public class NotaDeVenta {
    
    private final Date FECHA_;
    private final ArrayList<ElementoNota> PRODUCTOS_VENDIDOS_;
    
    private int ID_;
    private double importeTotal_;

    public NotaDeVenta(int id, ArrayList<ElementoNota> elementos) {
        this.ID_ = id;
        this.FECHA_ = new Date();
        this.PRODUCTOS_VENDIDOS_ = elementos;
        this.importeTotal_ = 0.0;
    }

    public NotaDeVenta(ArrayList<ElementoNota> elementos) {
        this.FECHA_ = new Date();
        this.PRODUCTOS_VENDIDOS_ = elementos;
        this.importeTotal_ = 0.0;
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

        boolean importeHaSidoCalculado = importeTotal_ > 0.0;

        if (!importeHaSidoCalculado) importeTotal_ = calcularImporteTotal();

        return importeTotal_;
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
