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
    
    public Caja abrirCaja(float montoInicial){
        
        cajaHeladeria_ = new Caja( montoInicial );
        return cajaHeladeria_;
        
    }
    
    private float cerrarCaja(){
        
        float cantidadFinalDinero = cajaHeladeria_.obtenerCantidadDineroActual();
        return cantidadFinalDinero;
        
    }
    
    private ReporteDeVenta realizarCorteCaja(){
        return null;
    }
    
}
