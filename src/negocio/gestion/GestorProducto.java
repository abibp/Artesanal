package negocio.gestion;

import java.util.HashMap;
import negocio.entidades.Producto;

/**
 *
 * @author PIX
 */
public class GestorProducto {
    
   private static HashMap<Integer, Producto> directorioProductos = new HashMap();

    public GestorProducto() {
        llenarDirectorio();
    }
   
    
   public void agregarProducto(Producto nuevoProducto){
       directorioProductos.put(nuevoProducto.obtenerIDProducto(), nuevoProducto);
        
    }
    public void eliminarProducto(int IDProductoAEliminar){
        
    }
    public void editarInformacionProducto(int IDProducto, Producto productoActualizado){
        
    }
    
    public Producto obtenerProducto(int IDProductoAObtener){
        return directorioProductos.get(IDProductoAObtener);
    }

    public boolean existeProducto(int IDProductoAObtener){
        return directorioProductos.containsKey(IDProductoAObtener);
    }
    
    private void llenarDirectorio() {

        Producto sabrita = new Producto(1, "Ruffles", 10.0, 8.0);
        Producto sabrita2 = new Producto(2, "Doritos Nacho", 10.0, 8.0);
        Producto sabrita3 = new Producto(3, "Palomitas", 15.0, 10.0);
        Producto sabrita4 = new Producto(4, "Charritos", 10.0, 8.0);
        Producto sabrita5 = new Producto(5, "Tostachos", 10.0, 8.0);
        Producto sabrita6 = new Producto(6, "Paketaxo", 30.0, 22.0);
        Producto sabrita7 = new Producto(7, "Churros", 10.0, 8.0);
        
        directorioProductos.put(sabrita.obtenerIDProducto(), sabrita);
        directorioProductos.put(sabrita2.obtenerIDProducto(), sabrita2);
        directorioProductos.put(sabrita3.obtenerIDProducto(), sabrita3);
        directorioProductos.put(sabrita4.obtenerIDProducto(), sabrita4);
        directorioProductos.put(sabrita5.obtenerIDProducto(), sabrita5);
        directorioProductos.put(sabrita6.obtenerIDProducto(), sabrita6);
        directorioProductos.put(sabrita7.obtenerIDProducto(), sabrita7);
    }
}
