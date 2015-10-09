package negocio.entidades;

import java.util.Date;

/**
 *
 * @author PIX
 */
public class Venta {

    private final int       ID_VENTA_;
    private final float     MONTO_;
    private final Date      FECHA_;
    
    private int             cantidadDeProductos_;
    private Producto        productoVendido_;

    public Venta(int IDVenta, float monto, int cantidadDeProductos, Producto productoVendido, Date fecha) {
        this.ID_VENTA_            = IDVenta;
        this.MONTO_               = monto;
        this.FECHA_               = fecha;
        this.cantidadDeProductos_ = cantidadDeProductos;
        this.productoVendido_     = productoVendido;
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

    public int obtenerIDVenta() {
        return ID_VENTA_;
    }

    public Date obtenerFecha() {
        return FECHA_;
    }

    public float obtenerMonto() {
        return MONTO_;
    }

}
