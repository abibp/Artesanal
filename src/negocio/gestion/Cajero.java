package negocio.gestion;

import java.util.Date;
import negocio.entidades.Caja;
import negocio.entidades.ReporteVenta;

/**
 *
 * @author PIX
 */
public class Cajero {

    private static Cajero unicoGestor_;
    
    private Caja cajaHeladeria_;
    private GestorReportes reporte_;
    private double entradaTotal;
    private double salidaTotal;

    public synchronized static Cajero obtenerInstancia() {
        if (unicoGestor_ == null) {
            unicoGestor_ = new Cajero();
        }
        return unicoGestor_;
    }

    public Caja abrir(double montoInicial) {
        cajaHeladeria_ = new Caja(montoInicial);
        return cajaHeladeria_;
    }

    public void despositar(double efectivo) {
        cajaHeladeria_.establecerDineroActual(obtenerDineroActual() + efectivo);
        establecerEntradaTotal(obtenerEntradaTotal() + efectivo);
    }

    public void retirar(double efectivo) {
        cajaHeladeria_.establecerDineroActual(obtenerDineroActual() - efectivo);
        establecerSalidaTotal(obtenerSalidaTotal() + efectivo);
    }

    public double obtenerDineroActual() {
        return cajaHeladeria_.obtenerDineroActual();
    }

    public double obtenerEntradaTotal() {
        return entradaTotal;
    }

    public void establecerEntradaTotal(double entradaTotal) {
        this.entradaTotal = entradaTotal;
    }
    
    public double obtenerSalidaTotal() {
        return salidaTotal;
    }

    public void establecerSalidaTotal(double salidaTotal) {
        this.salidaTotal = salidaTotal;
    }

    public double obtenerDineroInicial(){
        return cajaHeladeria_.obtenerDineroInicial();
    }
    
    private ReporteVenta realizarCorte() {
        Date fechaActual = new Date();
        cerrar();
        return null;
    }
    
    private double cerrar() {
        double cantidadFinalEfectivo = cajaHeladeria_.obtenerDineroActual();
        return cantidadFinalEfectivo;
    }
    
    private Cajero() {
        entradaTotal = 0.0;
        salidaTotal = 0.0;
    }
}
