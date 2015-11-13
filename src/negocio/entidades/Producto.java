
package negocio.entidades;

/**
 *
 * @author PIX
 */
public class Producto {

    private final String ID_PRODUCTO_;
    private String NOMBRE_;
    private double cantidadMinima_;

    public Producto(String idProducto, String nombre, double cantidadMinima) {
        this.ID_PRODUCTO_ = idProducto;
        this.NOMBRE_ = nombre;
        this.cantidadMinima_ = cantidadMinima;
    }

    public String obtenerID() {
        return ID_PRODUCTO_;
    }

    public String obtenerNombre() {
        return NOMBRE_;
    }

    public double obtenerCantidadMinima() {
        return cantidadMinima_;
    }

    public void establecerCantidadMinima(double cantidadMinima_) {
        this.cantidadMinima_ = cantidadMinima_;
    }
    
    
}