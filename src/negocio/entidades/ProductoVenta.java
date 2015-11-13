package negocio.entidades;

/**
 *
 * @author PIX
 */
public class ProductoVenta extends Producto{

    private double precio_;
    private double ganancia_;
    private double costo_;

    public ProductoVenta(
            String idProducto, 
            String nombre, 
            double cantidadMinima,
            double precioVenta_, 
            double ganancia_, 
            double costo_) {
        super(idProducto, nombre, cantidadMinima);
        this.precio_ = precioVenta_;
        this.ganancia_ = ganancia_;
        this.costo_ = costo_;
    }

    public double obtenerPrecioVenta() {
        return precio_;
    }

    public void establecerPrecioVenta(double precio) {
        this.precio_ = precio;
    }

    public double obtenerGanancia() {
        return ganancia_;
    }

    public void establecerGanancia(double ganancia) {
        this.ganancia_ = ganancia;
    }

    public double obtenerPrecioCompra() {
        return costo_;
    }

    public void establecerPrecioCompra(double costo) {
        this.costo_ = costo;
    }
    
    
    
    
}
