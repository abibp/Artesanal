package negocio.gestion;

import negocio.entidades.Caja;
import negocio.entidades.ReporteDeVenta;

/**
 *
 * @author PIX
 */
public class GestorCaja {

    private Caja cajaHeladeria_;
    private GestorReporte reporte_;

    public Caja abrirCaja(double montoInicial) {

        cajaHeladeria_ = new Caja(montoInicial);
        return cajaHeladeria_;

    }

    public void modificarDineroActual(double monto) {

        cajaHeladeria_.establecerDineroActual(
                cajaHeladeria_.obtenerCantidadDineroActual() + monto
        );

    }

    public double obtenerCantidadActualDineroCaja(){
        return cajaHeladeria_.obtenerCantidadDineroActual();
    }
    
    public double cerrarCaja() {

        double cantidadFinalDinero = cajaHeladeria_.obtenerCantidadDineroActual();
        return cantidadFinalDinero;

    }

    private ReporteDeVenta realizarCorteCaja() {
        return null;
    }

}
