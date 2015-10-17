package negocio.entidades;

/**
 *
 * @author PIX
 */
public class ProductoProveedor extends Producto {

    private Proveedor proveedorDelProducto_;

    public ProductoProveedor(
            int idProducto, 
            String nombre, 
            float precio, 
            float costo, 
            int cantidad, 
            Proveedor proveedor
    ) {
        super(idProducto, nombre, precio, costo, cantidad);
        this.proveedorDelProducto_ = proveedor;
    }

}
