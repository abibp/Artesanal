package negocio.entidades;

/**
 *
 * @author PIX
 */
public class Caja {

    private final double DINERO_INICIAL_;
    
    private double dineroActual_;

    public Caja(double montoInicial) {
        this.DINERO_INICIAL_ = montoInicial;
        establecerDineroActual(DINERO_INICIAL_);
    }

    public double obtenerDineroActual() {
        return dineroActual_;
    }
    
    public double obtenerDineroInicial() {
        return DINERO_INICIAL_;
    }
    
    public void establecerDineroActual(double dineroActual) {
        this.dineroActual_ = dineroActual;
    }

}
