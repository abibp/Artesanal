package capanegocio.gestion;

import capanegocio.entidades.Producto;
import java.util.Date;

/**
 *
 * @author PIX
 */
public class Venta {

    private int IDVenta;
    private float monto;
    private int cantidadDeProductos;
    private Producto productoVendido;
    private Date fecha;

    public Venta(int IDVenta, float monto, int cantidadDeProductos, Producto productoVendido, Date fecha) {
        this.IDVenta = IDVenta;
        this.monto = monto;
        this.cantidadDeProductos = cantidadDeProductos;
        this.productoVendido = productoVendido;
        this.fecha = fecha;
    }

    public Producto getProductoVendido() {
        return productoVendido;
    }

    public void setProductoVendido(Producto productoVendido) {
        this.productoVendido = productoVendido;
    }

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public void setCantidadDeProductos(int cantidadDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
    }

    public int getIDVenta() {
        return IDVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getMonto() {
        return monto;
    }

}
