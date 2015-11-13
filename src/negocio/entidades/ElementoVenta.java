package negocio.entidades;

/**
 *
 * @author PIX
 */
public class ElementoVenta {

    private double cantidadDeProducto_;
    private Producto productoVendido_;
    private double monto;

    public ElementoVenta(double cantidadDeProductos, Producto productoVendido) {
        this.cantidadDeProducto_ = cantidadDeProductos;
        this.productoVendido_ = productoVendido;
    }

    public Producto obtenerProductoVendido() {
        return productoVendido_;
    }

    public void establecerProductoVendido(Producto productoVendido) {
        this.productoVendido_ = productoVendido;
    }

    public double obtenerCantidadDeProducto() {
        return cantidadDeProducto_;
    }

    public void establecerCantidadDeProductos(double cantidadDeProducto) {
        this.cantidadDeProducto_ = cantidadDeProducto;
    }

    public double obtenerMonto() {
        return monto;
    }

    public void establecerMonto(double monto) {
        this.monto = monto;
    }

}
