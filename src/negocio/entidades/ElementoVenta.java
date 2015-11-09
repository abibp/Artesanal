package negocio.entidades;


public class ElementoVenta {

    private int cantidadDeProductos_;
    private Producto productoVendido_;
    private double monto;

    public ElementoVenta(int cantidadDeProductos, Producto productoVendido) {
        this.cantidadDeProductos_ = cantidadDeProductos;
        this.productoVendido_ = productoVendido;
    }

    public Producto obtenerProductoVendido() {
        return productoVendido_;
    }

    public void establecerProductoVendido(Producto productoVendido) {
        this.productoVendido_ = productoVendido;
    }

    public int obtenerCantidadDeProductos() {
        return cantidadDeProductos_;
    }

    public void establecerCantidadDeProductos(int cantidadDeProductos) {
        this.cantidadDeProductos_ = cantidadDeProductos;
    }

    public double obtenerMonto() {
        return monto;
    }

    public void establecerMonto(double monto) {
        this.monto = monto;
    }

}
