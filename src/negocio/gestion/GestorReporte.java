package negocio.gestion;

import negocio.entidades.Caja;
import negocio.entidades.Venta;
import negocio.entidades.ReporteDeVenta;


/**
 *
 * @author PIX
 */
public class GestorReporte {
    
    private ReporteDeVenta reporteDeVentas;
    
    public void generarReporteDeVentas(Caja caja){
    
    }
    
    public boolean agregarVentaAlReporte(Venta ventaPorAgregar){
       reporteDeVentas.agregarVenta(ventaPorAgregar);
       return true;
    }
    
    public boolean eliminarVentaDelReporte(Venta ventaAEliminar){
        reporteDeVentas.eliminarVenta(ventaAEliminar);
        return true;
    }
    
    public ReporteDeVenta generarReporteDeVentas(){
        
        return null;
    }
}
