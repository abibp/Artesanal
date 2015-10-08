package negocio.gestion;

import negocio.entidades.Caja;
import negocio.entidades.Venta;
import negocio.entidades.Reporte;

/**
 *
 * @author PIX
 */
public class GestorCaja {
    
    private Caja cajaHeladeria_;
    
    public void abrirCaja(float montoInicial){
        
    }
    
    public void cerrarCaja(){
        
    }
    
    public boolean agregarVenta(Venta nuevaVenta){
        return true;
    }
    
    public boolean cancelarVenta(int IDVenta){
        return true;
    }
    
    public Venta obtenerPrimeraVenta(){return null;}
    public Venta obtenerUltimaVenta(){return null;}
    
    private Reporte realizarCorteCaja(){
        return null;
    }
}
