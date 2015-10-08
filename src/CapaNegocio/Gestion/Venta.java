package CapaNegocio.Gestion;

import java.util.Date;

/**
 *
 * @author PIX
 */
public class Venta {
    private int IDVenta;
    private Date fecha;
    private float monto;

    public Venta(int IDVenta, Date fecha, float monto) {
        this.IDVenta = IDVenta;
        this.fecha = fecha;
        this.monto = monto;
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
