package capanegocio.gestion;

import capanegocio.entidades.Producto;

/**
 *
 * @author PIX
 */
public class GestorHeladeria {
    
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
}