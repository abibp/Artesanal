package negocio.gestion;

import negocio.entidades.Producto;

/**
 *
 * @author PIX
 */
public class GestorProducto {
    
    /**
     * Funcion que recibe un nombre de producto y apartir de devuelve un objeto de tipo Producto
     * @param nombreDeProducto
     * @return Producto
     */
    public Producto crearProducto( String nombreDeProducto ){
        //Faltan más productos.
        switch (nombreDeProducto.toLowerCase()) {
            case "troll":
                break;
            case "helado":
                break;
            case "paleta":
                break;
            case "boli":
                break;
            default:
                throw new AssertionError();
        }
        
        return null;
        
    }
    
   public void agregarProducto(Producto nuevoProducto){
        
    }
    public void eliminarProducto(int IDProductoAEliminar){
        
    }
    public void editarInformacionProducto(int IDProducto, Producto productoActualizado){
        
    }
    
    public Producto obtenerProducto(int IDProductoAObtener){
        return null;
    }
}
