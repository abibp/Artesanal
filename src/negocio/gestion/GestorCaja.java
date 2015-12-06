package negocio.gestion;

import java.util.Date;
import negocio.entidades.Caja;
import negocio.entidades.ReporteVenta;

/**
 *
 * @author PIX
 */
public class GestorCaja {

    private static GestorCaja unicoGestor_;
    
    private Caja cajaHeladeria_;
    private GestorReportes reporte_;
    private double entradaTotal;
    private double salidaTotal;

    public synchronized static GestorCaja obtenerIntancia() {
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorCaja();
        }
        return unicoGestor_;
    }

    public Caja abrir(double montoInicial) {
        cajaHeladeria_ = new Caja(montoInicial);
        return cajaHeladeria_;
    }

    public void despositar(double efectivo) {
        entradaTotal += efectivo;

        cajaHeladeria_.establecerDineroActual(
                cajaHeladeria_.obtenerDineroActual() + efectivo);
    }

    public void retirar(double efectivo) {
        salidaTotal += efectivo;

        cajaHeladeria_.establecerDineroActual(
                cajaHeladeria_.obtenerDineroActual() - efectivo);
    }

    public double obtenerDineroActual() {
        return cajaHeladeria_.obtenerDineroActual();
    }

    public double obtenerEntradaTotal() {
        return entradaTotal;
    }

    public double obtenerSalidaTotal() {
        return salidaTotal;
    }

    public double cerrar() {
        double cantidadFinalEfectivo = cajaHeladeria_.obtenerDineroActual();
        return cantidadFinalEfectivo;
    }

    public double obtenerDineroInicial(){
        return cajaHeladeria_.obtenerDineroInicial();
    }
    
    private ReporteVenta realizarCorte() {
        Date fechaActual = new Date();
        return null;
    }
    
    private GestorCaja() {
        entradaTotal = 0.0;
        salidaTotal = 0.0;
    }
}
