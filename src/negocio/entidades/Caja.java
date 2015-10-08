package negocio.entidades;

import java.util.ArrayList;

/**
 *
 * @author PIX
 */
public class Caja {

    private final float      MONTO_INICIAL_;
    
    private float            dineroActual_;
    private ArrayList<Venta> ventas_;

    public Caja(float montoInicial) {
        this.MONTO_INICIAL_ = montoInicial;
        this.ventas_        = new ArrayList();
    }

    public float getDineroActual() {
        return dineroActual_;
    }

    public void setDineroActual(float dineroActual) {
        this.dineroActual_ = dineroActual;
    }

    public float getMontoInicial() {
        return MONTO_INICIAL_;
    }

    public ArrayList<Venta> getVentas() {
        return ventas_;
    }
    
    public void agregarVenta(Venta unaVenta){
        ventas_.add(unaVenta);
    }
}
