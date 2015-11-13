package negocio.entidades;

/**
 *
 * @author PIX
 */
public class ProductoInsumo extends Producto {

    private double precioCompra_;

    public ProductoInsumo(String idProducto, String nombre, double cantidadMinima, double precioCompra) {
        super(idProducto, nombre, cantidadMinima);
        this.precioCompra_ = precioCompra;
    }

    public double obtenerPrecioCompra() {
        return precioCompra_;
    }

    public void establecerPrecioCompra(double precioCompra_) {
        this.precioCompra_ = precioCompra_;
    }

}
