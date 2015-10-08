package capanegocio.entidades;

import java.util.ArrayList;

/**
 *
 * @author PIX
 */
public class Proveedor {
    
   private String                       nombre_;
   private String                       telefono_;
   private String                       direccion_;
   private ArrayList<ProductoProveedor> productos_;

    public String getNombre() {
        return nombre_;
    }

    public void setNombre(String nombre) {
        this.nombre_ = nombre;
    }

    public String getTelefono() {
        return telefono_;
    }

    public void setTelefono(String telefono) {
        this.telefono_ = telefono;
    }

    public String getDireccion() {
        return direccion_;
    }

    public void setDireccion(String direccion) {
        this.direccion_ = direccion;
    }
   
   
   
}
