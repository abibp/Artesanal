package capanegocio.entidades;

/**
 *
 * @author PIX
 */
public abstract class Producto{
    
    private int     IDProducto;
    private String  nombre;
    private String  descripcion;
    private float   precio;
    private float   costo;
    private int     cantidad;

    public Producto(String nombre, float precio, float costo, int cantidad) {
        this.nombre     = nombre;
        this.precio     = precio;
        this.costo      = costo;
        this.cantidad   = cantidad;
    }
    
    public int getIDProducto() {
        return IDProducto;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;   
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
