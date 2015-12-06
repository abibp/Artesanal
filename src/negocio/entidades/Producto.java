
package negocio.entidades;

/**
 *
 * @author PIX
 */
public class Producto {

    private final String ID_;
    private String nombre_;
    private double costo_;
    private double precio_;
    private int existencia_;

    public Producto(String ID, String nombre, double costo, double precio, int existencia) {
        this.ID_ = ID;
        this.nombre_ = nombre;
        this.costo_ = costo;
        this.precio_ = precio;
        this.existencia_ = existencia;
    }
    
    public String obtenerID(){
        return ID_;
    }

    public String obtenerNombre() {
        return nombre_;
    }

    public void establecerNombre(String nombre) {
        this.nombre_ = nombre;
    }

    public double obtenerCosto() {
        return costo_;
    }

    public void establecerCosto(double costo) {
        this.costo_ = costo;
    }

    public double obtenerPrecio() {
        return precio_;
    }

    public void establecerPrecio(double precio) {
        this.precio_ = precio;
    }

    public int obtenerExistencia() {
        return existencia_;
    }

    public void establecerExistencia(int existencia) {
        this.existencia_ = existencia;
    }
    
}