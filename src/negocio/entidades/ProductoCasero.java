package negocio.entidades;


/**
 *
 * @author PIX
 */
public class ProductoCasero extends Producto {
    
    public ProductoCasero(
            int idProducto, 
            String nombre, 
            float precio, 
            float costo, 
            int cantidad
    ) {
        super(idProducto, nombre, precio, costo, cantidad);
    }

}
