package negocio.entidades;

/**
 *
 * @author PIX
 */
public abstract class Producto{
    
    private final int   ID_PRODUCTO_;    
    private String      NOMBRE_;
    
    private String      descripcion_;
    private double       precioVenta_;
    private double       precioCompra_;

    public Producto(int idProducto, String nombre, double precio, double costo) {
        this.ID_PRODUCTO_   = idProducto;
        this.NOMBRE_        = nombre;
        this.precioVenta_   = precio;
        this.precioCompra_  = costo;
    }

    public double obtenerCosto() {
        return precioCompra_;
    }

    public void establecerCosto(double costo) {
        this.precioCompra_ = costo;
    }

    public String obtenerDescripcion() {
        return descripcion_;
    }

    public void establecerDescripcion(String descripcion) {
        this.descripcion_ = descripcion;
    }

    public double obtenerPrecio() {
        return precioVenta_;
    }

    public void establecerPrecio(double precio) {
        this.precioVenta_ = precio;
    }
        
    public int obtenerIDProducto() {
        return ID_PRODUCTO_;
    }

    public String obtenerNombre() {
        return NOMBRE_;
    }
}
