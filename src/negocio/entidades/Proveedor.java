package negocio.entidades;

import java.util.ArrayList;

/**
 *
 * @author PIX
 */
public class Proveedor {
    
   private String                       nombre_;
   private String                       telefono_;
   private String                       direccion_;
   private ArrayList<ProductoProveedor> nProductos_;

    public String obtenerNombre() {
        return nombre_;
    }

    public void setNombre(String nombre) {
        this.nombre_ = nombre;
    }

    public String obtenerTelefono() {
        return telefono_;
    }

    public void setTelefono(String telefono) {
        this.telefono_ = telefono;
    }

    public String obtenerDireccion() {
        return direccion_;
    }

    public void setDireccion(String direccion) {
        this.direccion_ = direccion;
    }
   
   public void agregarProducto(ProductoProveedor unProducto){
       this.nProductos_.add(unProducto);
   }
   
}
