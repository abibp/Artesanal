package negocio.entidades;

import java.util.Date;

/**
 *
 * @author PIX
 */
public class Venta {

    private final int ID_VENTA_;
    
    private float     monto_;
    private int       cantidadDeProductos_;
    private Producto  productoVendido_;
    private Date      fecha_;

    public Venta(int IDVenta, float monto, int cantidadDeProductos, Producto productoVendido, Date fecha) {
        this.ID_VENTA_            = IDVenta;
        this.monto_               = monto;
        this.cantidadDeProductos_ = cantidadDeProductos;
        this.productoVendido_     = productoVendido;
        this.fecha_               = fecha;
    }

    public Producto obtenerProductoVendido() {
        return productoVendido_;
    }

    public void setProductoVendido(Producto productoVendido) {
        this.productoVendido_ = productoVendido;
    }

    public int obtenerCantidadDeProductos() {
        return cantidadDeProductos_;
    }

    public void setCantidadDeProductos(int cantidadDeProductos) {
        this.cantidadDeProductos_ = cantidadDeProductos;
    }

    public int obtenerIDVenta() {
        return ID_VENTA_;
    }

    public Date obtenerFecha() {
        return fecha_;
    }

    public float obtenerMonto() {
        return monto_;
    }

}
