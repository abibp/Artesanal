package negocio.gestion;

import java.util.HashMap;
import negocio.entidades.ReporteVenta;

/**
 *
 * @author PIX
 */
public class GestorReportes {

    private static GestorReportes unicoGestor_;
    
    private HashMap<String,ReporteVenta> nReportesDeVenta_;
    
    public synchronized static GestorReportes obtenerInstancia() {
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorReportes();
        }
        return unicoGestor_;
    }
    
    public void generarReporteDeCaja() {
        
    }

    public void generarReporteDeInventario() {
        
    }

    public void generarReporteDeVentas() {
        
    }

    private GestorReportes() {
        this.nReportesDeVenta_ = new HashMap();
    }
    
}
