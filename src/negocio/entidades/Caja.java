package negocio.entidades;

import java.util.ArrayList;

/**
 *
 * @author PIX
 */
public class Caja {

    private final float MONTO_INICIAL_;
    
    private float dineroActual_;

    public Caja(float montoInicial) {
        this.MONTO_INICIAL_ = montoInicial;
        establecerDineroActual(MONTO_INICIAL_);
    }

    public float obtenerCantidadDineroActual() {
        return dineroActual_;
    }
    
    public float modificarDineroActual(float monto){
        return dineroActual_ + monto;
    }
    
    public float obtenerMontoInicial() {
        return MONTO_INICIAL_;
    }
    
    private void establecerDineroActual(float dineroActual) {
        this.dineroActual_ = dineroActual;
    }

}
