package CapaNegocio;

import CapaNegocio.Entidades.Reporte;
import CapaNegocio.Gestion.Caja;
import CapaNegocio.Gestion.Venta;

/**
 *
 * @author PIX
 */
public class EncargadoCaja {
    
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
    
    private Reporte realizarCorteCaja(){
        return null;
    }
}
