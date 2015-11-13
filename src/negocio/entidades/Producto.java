
package negocio.entidades;

/**
 *
 * @author PIX
 */
public class Producto {

    private final String ID_;
    private String nombre_;
    private double cantidadMinima_;

    public Producto(String idProducto, String nombre, double cantidadMinima) {
        this.ID_ = idProducto;
        this.nombre_ = nombre;
        this.cantidadMinima_ = cantidadMinima;
    }

    public String obtenerID() {
        return ID_;
    }

    public String obtenerNombre() {
        return nombre_;
    }

    public double obtenerCantidadMinima() {
        return cantidadMinima_;
    }

    public void establecerNombre(String nombre_) {
        this.nombre_ = nombre_;
    }

    
    public void establecerCantidadMinima(double cantidadMinima_) {
        this.cantidadMinima_ = cantidadMinima_;
    }
    
    
}