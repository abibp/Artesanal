package negocio.entidades;

/**
 *
 * @author PIX
 */
public class Proveedor {

    private final String ID_;
   
    private String nombre_;
    private String direccion_;
    private String telefono_;

    public Proveedor(String ID, String nombre_, String direccion_, String telefono_) {
        this.ID_ = ID;
        this.nombre_ = nombre_;
        this.direccion_ = direccion_;
        this.telefono_ = telefono_;
    }

    public String obtenerID() {
        return ID_;
    }
    
    public String obtenerNombre() {
        return nombre_;
    }

    public void establecerNombre(String nombre_) {
        this.nombre_ = nombre_;
    }

    public String obtenerDireccion() {
        return direccion_;
    }

    public void establecerDireccion(String direccion_) {
        this.direccion_ = direccion_;
    }

    public String obtenerTelefono() {
        return telefono_;
    }

    public void establecerTelefono(String telefono_) {
        this.telefono_ = telefono_;
    }
    
    
}
