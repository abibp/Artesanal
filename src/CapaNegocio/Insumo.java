package CapaNegocio;

/**
 *
 * @author PIX
 */
public abstract class Insumo {
    private int    IDInsumo;
    private String nombre;
    private String descripcion;
    private float  costo;

    public Insumo(String nombre, float costo) {
        this.nombre = nombre;
        this.costo = costo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    
}
