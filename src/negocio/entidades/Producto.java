package negocio.entidades;

/**
 *
 * @author PIX
 */
public abstract class Producto{
    
    private final int   ID_PRODUCTO_;
    
    private String      nombre_;
    private String      descripcion_;
    private float       precioVenta_;
    private float       precioCompra_;
    private int         cantidad_;

    public Producto(int idProducto,String nombre, float precio, float costo, 
            int cantidad) {
        this.ID_PRODUCTO_   = idProducto;
        this.nombre_        = nombre;
        this.precioVenta_        = precio;
        this.precioCompra_         = costo;
        this.cantidad_      = cantidad;
    }
    
    public int obtenerIDProducto() {
        return ID_PRODUCTO_;
    }

    public float obtenerCosto() {
        return precioCompra_;
    }

    public void establecerCosto(float costo) {
        this.precioCompra_ = costo;
    }

    public int obtenerCantidad() {
        return cantidad_;   
    }

    public void establecerCantidad(int cantidad) {
        this.cantidad_ = cantidad;
    }
    
    public String obtenerNombre() {
        return nombre_;
    }

    public String obtenerDescripcion() {
        return descripcion_;
    }

    public void establecerDescripcion(String descripcion) {
        this.descripcion_ = descripcion;
    }

    public void establecerNombre(String nombre) {
        this.nombre_ = nombre;
    }

    public float obtenerPrecio() {
        return precioVenta_;
    }

    public void establecerPrecio(float precio) {
        this.precioVenta_ = precio;
    }
    
}
