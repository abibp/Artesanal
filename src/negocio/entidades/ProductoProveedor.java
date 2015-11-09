package negocio.entidades;

/**
 *
 * @author PIX
 */
public class ProductoProveedor extends Producto {

    private Proveedor proveedorDelProducto_;

    public ProductoProveedor(int idProducto, String nombre, double precio, 
            double costo, Proveedor proveedor) {
        super(idProducto, nombre, precio, costo);
        this.proveedorDelProducto_ = proveedor;
    }

}
