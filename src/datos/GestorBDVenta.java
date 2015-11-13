package datos;

import negocio.entidades.ProductoVendido;
import negocio.entidades.Venta;

/**
 *
 * @author PIX
 */
public class GestorBDVenta extends GestorBaseDatos{
    
    private GestorBDVenta() {
    }   
    
    public static void agregarVenta(Venta nuevaVenta){
    }
    
    public static boolean eliminarVenta(int IDVenta){
        return false;
    }
    
    public static void editarInformacionProducto(int IDVenta, ProductoVendido ventaActualizada){    
    }
    
    public static Venta obtenerVenta(int IDVentaAObtener){
        return null;
    }
    
    public static int obtenerNumeroDeVentas(){
        return 0;
    }
}
