package negocio.gestion;

import datos.GestorBDProducto;
import java.util.HashMap;
import negocio.entidades.Producto;
import negocio.entidades.ProductoVenta;

/**
 *
 * @author PIX
 */
public class GestorProducto {
    
    private GestorBDProducto manejadorDatos;
    private static GestorProducto gestorInstancia;
    
    private GestorProducto(){
        manejadorDatos = new GestorBDProducto();
        llenarDirectorio();
    }
    
    public synchronized static GestorProducto obtenerInstancia(){
        if(gestorInstancia == null){
            gestorInstancia = new GestorProducto();
            
        }
        return gestorInstancia;
    }
    
    
   private static HashMap<String, Producto> directorioProductos = new HashMap();
   
   
    
   public void agregarProducto(ProductoVenta nuevoProducto){
       
       directorioProductos.put(nuevoProducto.obtenerIDProducto(), nuevoProducto);
       
       manejadorDatos.agregarProducto(nuevoProducto);
        
    }
    public void eliminarProducto(int IDProductoAEliminar){
        
    }
    public void editarInformacionProducto(int IDProducto, Producto productoActualizado){
        
    }
    
    public Producto obtenerProducto(String IDProductoAObtener){
        return directorioProductos.get(IDProductoAObtener);
    }

    public boolean existeProducto(String IDProductoAObtener){
        return directorioProductos.containsKey(IDProductoAObtener);
    }
    
    private void llenarDirectorio() {

        Producto sabrita = new ProductoVenta("1", "Ruffles", 10, 10.0, 0.20, 12.0);
        Producto sabrita2 = new ProductoVenta("2", "Doritos", 10, 10.0, 0.20, 12.0);
        Producto sabrita3 = new ProductoVenta("3", "Charritos", 10, 10.0, 0.20, 12.0);
        Producto sabrita4 = new ProductoVenta("4", "Emperador", 10, 10.0, 0.20, 12.0);
        Producto sabrita5 = new ProductoVenta("5", "Pelos con Papa", 10.0, 100.0, 0.20, 120.0);
        Producto sabrita6 = new ProductoVenta("6", "Elote", 10, 10.0, 0.20, 12.0);
        Producto sabrita7 = new ProductoVenta("7", "Chicharron", 10, 10.0, 0.20, 12.0);
        
        directorioProductos.put(sabrita.obtenerIDProducto(), sabrita);
        directorioProductos.put(sabrita2.obtenerIDProducto(), sabrita2);
        directorioProductos.put(sabrita3.obtenerIDProducto(), sabrita3);
        directorioProductos.put(sabrita4.obtenerIDProducto(), sabrita4);
        directorioProductos.put(sabrita5.obtenerIDProducto(), sabrita5);
        directorioProductos.put(sabrita6.obtenerIDProducto(), sabrita6);
        directorioProductos.put(sabrita7.obtenerIDProducto(), sabrita7);
    }
}
