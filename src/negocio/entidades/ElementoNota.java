package negocio.entidades;

/**
 *
 * @author PIX
 */
public class ElementoNota {
    
    private final Producto PRODUCTO_VENDIDO_;
    private final int CANTIDAD_PRODUCTO_;
    private final double IMPORTE_;

    public ElementoNota(int cantidad, Producto producto) {
        this.CANTIDAD_PRODUCTO_ = cantidad;
        this.PRODUCTO_VENDIDO_ = producto;
        this.IMPORTE_ = calcularImporte(cantidad, producto.obtenerPrecio());
    }

    public Producto obtenerProductoVendido() {
        return PRODUCTO_VENDIDO_;
    }

    public int obtenerCantidadDeProducto() {
        return CANTIDAD_PRODUCTO_;
    }

    public double obtenerImporte() {
        return IMPORTE_;
    }

    private double calcularImporte(int cantidad, double precio) {
        double costo = cantidad * precio;
        return costo;
    }

}
