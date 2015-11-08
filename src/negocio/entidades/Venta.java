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
    private final ArrayList<ElementoVenta> elementosVenta;

    public Venta(int FOLIO, Date FECHA_) {
        this.ID_ = FOLIO;
        this.FECHA_ = FECHA_;
        this.monto_ = 0.0;
        this.elementosVenta = new ArrayList();
    }

    public ArrayList<ElementoVenta> obtenerElementosVenta() {
        return elementosVenta;
    }

    public double obtenerMonto() {

        boolean montoHaSidoCalculado = monto_ > 0.0;

        if (!montoHaSidoCalculado) {

            monto_ = calcularMontoTotal();

        }

        return monto_;

    }

    private double calcularMontoTotal() {

        double montoTotal = 0.0;

        for (ElementoVenta elementoActual : elementosVenta) {

            montoTotal += elementoActual.obtenerMonto();
        }

        return montoTotal;

    }

}
