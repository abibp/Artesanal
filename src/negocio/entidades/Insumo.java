package negocio.entidades;

/**
 *
 * @author PIX
 */
public abstract class Insumo {
    
    private int    IDInsumo_;
    private String nombre_;
    private String descripcion_;
    private float  costo_;
    private int    cantidad_;

    public Insumo(String nombre, float costo) {
        this.nombre_ = nombre;
        this.costo_ = costo;
    }
    
    public String getNombre() {
        return nombre_;
    }

    public void setNombre(String nombre) {
        this.nombre_ = nombre;
    }

    public String getDescripcion() {
        return descripcion_;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion_ = descripcion;
    }

    public float getCosto() {
        return costo_;
    }

    public void setCosto(float costo) {
        this.costo_ = costo;
    }
    
    
}
