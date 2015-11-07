package negocio.entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PIX
 */
public class Venta {

    private final int ID_;
    private final Date FECHA_;
    private double monto_;
    private final ArrayList<ElementoVenta> ventas;
    private boolean montoEstaCalculado;

    public Venta(int FOLIO, Date FECHA_) {
        this.ID_ = FOLIO;
        this.FECHA_ = FECHA_;
        this.montoEstaCalculado = false;
        this.ventas = new ArrayList();
    }

    public ArrayList<ElementoVenta> obtenerVentas() {
        return ventas;
    }

    public double obtenerMonto() {

        if (!montoEstaCalculado) {
            monto_ = calcularMontoTotal();
            montoEstaCalculado = true;
        }

        return monto_;

    }

    private double calcularMontoTotal() {

        double montoTotal = 0.0;
        for (ElementoVenta ventaActual : ventas) {
            montoTotal += ventaActual.obtenerMonto();
        }

        return montoTotal;

    }

}
