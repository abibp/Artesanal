package negocio.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author PIX
 */
public class Venta {

    private final int ID_;
    private final Date FECHA_;
    private double monto_;
    private ArrayList<ProductoVendido> nProductosVendidos_;

    public Venta(int ID, Date FECHA_) {
        this.ID_ = ID;
        this.FECHA_ = FECHA_;
        this.monto_ = 0.0;
        this.nProductosVendidos_ = new ArrayList();
    }

    public ArrayList<ProductoVendido> obtenerProductos() {
        return nProductosVendidos_;
    }
    
    public void agregarElementoVenta(ElementoVenta elementoVenta){
        elementosVenta.add(elementoVenta);
    }
    
    public void eliminarElementoVenta(ElementoVenta elementoVenta){
        elementosVenta.remove(elementoVenta);
    }

    public double obtenerMonto() {

        boolean montoHaSidoCalculado = monto_ > 0.0;

        if (!montoHaSidoCalculado) {

            monto_ = calcularMontoTotal();

        }

        return monto_;

    }

    public int obtenerID_() {
        return ID_;
    }

    public Date obtenerFECHA_() {
        return FECHA_;
    }    
    
    private double calcularMontoTotal() {

        double montoTotal = 0.0;

        for (ProductoVendido elementoActual : nProductosVendidos_) {

            montoTotal += elementoActual.obtenerMonto();
        }

        return montoTotal;

    }
      
}
