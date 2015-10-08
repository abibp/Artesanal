package capanegocio.gestion;

import capanegocio.entidades.Reporte;

/**
 *
 * @author PIX
 */
public class GestorCaja {
    
    private Caja cajaHeladeria;
    
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
