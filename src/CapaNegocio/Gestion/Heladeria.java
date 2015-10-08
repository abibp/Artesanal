package CapaNegocio.Gestion;

import CapaNegocio.Entidades.Producto;

/**
 *
 * @author PIX
 */
public abstract class Heladeria {
    
    public Producto obtenerProducto(String nombreDeProducto){
        
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
