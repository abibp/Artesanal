package CapaNegocio.Entidades;

/**
 *
 * @author PIX
 */
public class ProductoProveedor extends Producto{

    private Proveedor proveedorDelProducto;
    
    public ProductoProveedor(String nombre, float precio, float costo, 
            int cantidad, Proveedor proveedor) {
        super(nombre, precio, costo, cantidad);
        this.proveedorDelProducto = proveedor;
    }

}
