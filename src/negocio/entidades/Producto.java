package negocio.entidades;

/**
 *
 * @author PIX
 */
public abstract class Producto{
    
    private final int   ID_PRODUCTO_;
    
    private String      nombre_;
    private String      descripcion_;
    private float       precio_;
    private float       costo_;
    private int         cantidad_;

    public Producto(int idProducto,String nombre, float precio, float costo, 
            int cantidad) {
        this.ID_PRODUCTO_   = idProducto;
        this.nombre_        = nombre;
        this.precio_        = precio;
        this.costo_         = costo;
        this.cantidad_      = cantidad;
    }
    
    public int getIDProducto() {
        return ID_PRODUCTO_;
    }

    public float getCosto() {
        return costo_;
    }

    public void setCosto(float costo) {
        this.costo_ = costo;
    }

    public int getCantidad() {
        return cantidad_;   
    }

    public void setCantidad(int cantidad) {
        this.cantidad_ = cantidad;
    }
    
    public String getNombre() {
        return nombre_;
    }

    public String getDescripcion() {
        return descripcion_;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion_ = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre_ = nombre;
    }

    public float getPrecio() {
        return precio_;
    }

    public void setPrecio(float precio) {
        this.precio_ = precio;
    }
    
}
