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
    
    public Caja abrirCaja(float montoInicial){
        return null;
    }
    
    public void cerrarCaja(){
        
    }
    
    public boolean agregarVenta(Venta nuevaVenta){
        return true;
    }
    
    public void cancelarVenta(int IDVenta){
    }
    
    public Venta obtenerPrimeraVenta(){return null;}
    public Venta obtenerUltimaVenta(){return null;}
    
    private Reporte realizarCorteCaja(){
        return null;
    }
    
    public float calcularPromedioDeVentas(){
        return 0.0f;
    }
}
