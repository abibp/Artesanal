package negocio.gestion;

import negocio.entidades.Caja;
import negocio.entidades.ReporteVenta;

/**
 *
 * @author PIX
 */
public class GestorCaja {

    private Caja cajaHeladeria_;
    private GestorReporte reporte_;
    private double entradaTotalEfectivo;
    private double salidaTotalEfectivo;
    private static GestorCaja primerGestor;

    private GestorCaja() {
        entradaTotalEfectivo = 0.0;
        salidaTotalEfectivo = 0.0;
    }

    public synchronized static GestorCaja obtenerIntancia() {
        if (primerGestor == null) {
            primerGestor = new GestorCaja();
        }
        return primerGestor;
    }

    public Caja abrirCaja(double montoInicial) {

        cajaHeladeria_ = new Caja(montoInicial);
        return cajaHeladeria_;

    }

    public void aumentarDineroCaja(double montoAumentar) {

        entradaTotalEfectivo += montoAumentar;

        cajaHeladeria_.establecerDineroActual(
                cajaHeladeria_.obtenerCantidadDineroActual() + montoAumentar
        );

    }

    public void decrementarDineroCaja(double montoDecrementar) {

        salidaTotalEfectivo += montoDecrementar;

        cajaHeladeria_.establecerDineroActual(
                cajaHeladeria_.obtenerCantidadDineroActual() - montoDecrementar
        );

    }

    public double obtenerCantidadActualCaja() {
        return cajaHeladeria_.obtenerCantidadDineroActual();
    }

    public double obtenerEntradaTotalEfectivo() {
        return entradaTotalEfectivo;
    }

    public double obtenerSalidaTotalEfectivo() {
        return salidaTotalEfectivo;
    }

    public double cerrarCaja() {

        double cantidadFinalDinero = cajaHeladeria_.obtenerCantidadDineroActual();
        return cantidadFinalDinero;

    }

    public double obtenerCantidadInicialCaja(){
        return cajaHeladeria_.obtenerMontoInicial();
    }
    
    private ReporteVenta realizarCorteCaja() {
        return null;
    }
}
