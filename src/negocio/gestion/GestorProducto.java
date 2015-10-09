package negocio.gestion;

import negocio.entidades.Producto;

/**
 *
 * @author PIX
 */
public class GestorProducto {
    
    public Producto crearProducto(String nombreDeProducto){
        
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
