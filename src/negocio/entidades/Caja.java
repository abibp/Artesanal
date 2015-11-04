package negocio.entidades;

import java.util.ArrayList;

/**
 *
 * @author PIX
 */
public class Caja {

    private final float      MONTO_INICIAL_;
    
    private float            dineroActual_;
    private ArrayList<Venta> nVentas_;

    public Caja(float montoInicial) {
        this.MONTO_INICIAL_ = montoInicial;
        this.nVentas_       = new ArrayList();
        establecerDineroActual(MONTO_INICIAL_);
    }

    public float obtenerDineroActual() {
        return dineroActual_;
    }
    
    public float modificarDineroActual(float monto){
        return dineroActual_ + monto;
    }
    
    public float obtenerMontoInicial() {
        return MONTO_INICIAL_;
    }

    public ArrayList<Venta> obtenerVentas() {
        return nVentas_;
    }
    
    public void agregarVenta(Venta unaVenta){
        nVentas_.add(unaVenta);
    }
    
    private void establecerDineroActual(float dineroActual) {
        this.dineroActual_ = dineroActual;
    }

}
