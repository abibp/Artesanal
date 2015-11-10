package datos;

import negocio.entidades.ElementoVenta;


public class GestorBDVenta extends GestorBaseDatos{
    
    private GestorBDVenta() {
    }   
    
    public static void agregarVenta(ElementoVenta nuevaVenta){
    }
    
    public static boolean eliminarVenta(int IDVenta){
        return false;
    }
    
    public static void editarInformacionProducto(int IDVenta, ElementoVenta ventaActualizada){    
    }
    
    public static ElementoVenta obtenerVenta(int IDVentaAObtener){
        return null;
    }
    
    public static int obtenerNumeroDeVentas(){
        return 0;
    }
}
