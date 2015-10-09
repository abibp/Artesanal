package negocio.entidades;

/**
 *
 * @author PIX
 */
public abstract class Insumo {
    
    private final int ID_INSUMO_;   
    private final String NOMBRE_;
    
    private String descripcion_;
    private float  costo_;
    private int    cantidad_;

    public Insumo(int idInsumo, String nombre, float costo) {
        this.ID_INSUMO_ = idInsumo;
        this.NOMBRE_ = nombre;
        this.costo_ = costo;
    }

    public String obtenerDescripcion() {
        return descripcion_;
    }

    public void establecerDescripcion(String descripcion) {
        this.descripcion_ = descripcion;
    }

    public float obtenerCosto_() {
        return costo_;
    }

    public void establecerCosto(float costo) {
        this.costo_ = costo;
    }

    public int obtenerIDInsumo() {
        return ID_INSUMO_;
    }

    public String obtenerNombre() {
        return NOMBRE_;
    }
    
}
