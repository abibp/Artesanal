package CapaNegocio;

import CapaNegocio.Gestion.Venta;
import java.util.ArrayList;

/**
 *
 * @author PIX
 */
public class Caja {

    private final float montoInicial;
    private float dineroActual;
    private ArrayList<Venta> ventas;

    public Caja(float montoInicial) {
        this.montoInicial = montoInicial;
        this.ventas = new ArrayList();
    }

    public float getDineroActual() {
        return dineroActual;
    }

    public void setDineroActual(float dineroActual) {
        this.dineroActual = dineroActual;
    }

    public float getMontoInicial() {
        return montoInicial;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }    
    
}
