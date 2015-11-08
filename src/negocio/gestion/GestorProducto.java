package negocio.gestion;

import java.util.HashMap;
import negocio.entidades.Producto;
import negocio.entidades.ProductoProveedor;
import negocio.entidades.Proveedor;

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
        Proveedor proveedor = new Proveedor();
        proveedor.establecerNombre("Jaimito");
        proveedor.establecerDireccion("Calle 69");
        proveedor.establecerTelefono("12345678");
        
        ProductoProveedor sabrita = new ProductoProveedor(1, "Ruffles", 10.0, 8.0, proveedor);
        ProductoProveedor sabrita2 = new ProductoProveedor(2, "Doritos Nacho", 10.0, 8.0, proveedor);
        ProductoProveedor sabrita3 = new ProductoProveedor(3, "Palomitas", 15.0, 10.0, proveedor);
        ProductoProveedor sabrita4 = new ProductoProveedor(4, "Charritos", 10.0, 8.0, proveedor);
        ProductoProveedor sabrita5 = new ProductoProveedor(5, "Tostachos", 10.0, 8.0, proveedor);
        ProductoProveedor sabrita6 = new ProductoProveedor(6, "Paketaxo", 30.0, 22.0, proveedor);
        ProductoProveedor sabrita7 = new ProductoProveedor(7, "Churros", 10.0, 8.0, proveedor);
        
        directorioProductos.put(sabrita.obtenerIDProducto(), sabrita);
        directorioProductos.put(sabrita2.obtenerIDProducto(), sabrita2);
        directorioProductos.put(sabrita3.obtenerIDProducto(), sabrita3);
        directorioProductos.put(sabrita4.obtenerIDProducto(), sabrita4);
        directorioProductos.put(sabrita5.obtenerIDProducto(), sabrita5);
        directorioProductos.put(sabrita6.obtenerIDProducto(), sabrita6);
        directorioProductos.put(sabrita7.obtenerIDProducto(), sabrita7);
    }
}
