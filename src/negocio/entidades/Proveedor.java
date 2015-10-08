package negocio.entidades;

import java.util.ArrayList;

/**
 *
 * @author PIX
 */
public class Proveedor {
    
   private String nombre;
   private String telefono;
   private String direccion;
   private ArrayList<ProductoProveedor> productos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
   
   
}
