package negocio.entidades;

/**
 *
 * @author PIX
 */
public class Caja {

    private final double MONTO_INICIAL_;
    
    private double dineroActual_;

    public Caja(double montoInicial) {
        this.MONTO_INICIAL_ = montoInicial;
        establecerDineroActual(MONTO_INICIAL_);
    }

    public double obtenerCantidadDineroActual() {
        return dineroActual_;
    }
    
    public double obtenerMontoInicial() {
        return MONTO_INICIAL_;
    }
    
    public void establecerDineroActual(double dineroActual) {
        this.dineroActual_ = dineroActual;
    }

}
