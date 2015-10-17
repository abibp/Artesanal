package negocio.gestion;

import Excepciones.ExcepcionVentaNoEncontrada;
import datos.GestorBDVenta;
import negocio.entidades.Caja;
import negocio.entidades.Venta;
import negocio.entidades.ReporteDeVenta;

/**
 *
 * @author PIX
 */
public class GestorCaja {
    
    private Caja cajaHeladeria_;
    private GestorReporte reporte_;
    
    public Caja abrirCaja(float montoInicial){
        return null;
    }
    
    public void cerrarCaja(){
        
    }
    
    public void agregarVenta(Venta nuevaVenta){
        
        GestorBDVenta.agregarVenta(nuevaVenta);
    }
    
    public void cancelarVenta(int IDVenta) throws ExcepcionVentaNoEncontrada{
        boolean esEliminada = GestorBDVenta.eliminarVenta(IDVenta);
        
        if(!(esEliminada)){
            throw new ExcepcionVentaNoEncontrada();
        }
    }
    
    public Venta obtenerPrimeraVenta(){
        return GestorBDVenta.obtenerVenta(1);
    }
    
    public Venta obtenerUltimaVenta(){
        int numeroUltimaVenta = GestorBDVenta.obtenerNumeroDeVentas();
        return GestorBDVenta.obtenerVenta(numeroUltimaVenta);
    }
    
    private ReporteDeVenta realizarCorteCaja(){
        return null;
    }
    
    public float calcularPromedioDeVentas(){
        return 0.0f;
    }
}
