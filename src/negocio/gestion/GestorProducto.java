package negocio.gestion;

import datos.GestorBDProducto;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Producto;
import datos.excepcion.ExcepcionProductoNoEncontrado;

/**
 *
 * @author PIX
 */
public class GestorProducto {
    
    private final GestorBDProducto manejadorDatos;
    private static GestorProducto gestorInstancia;
    
    private GestorProducto(){
        manejadorDatos = new GestorBDProducto();
    }
    
    public synchronized static GestorProducto obtenerInstancia(){
        if(gestorInstancia == null){
            gestorInstancia = new GestorProducto();
            
        }
        return gestorInstancia;
    }
    
   public void agregarProducto(Producto nuevoProducto){       
       manejadorDatos.agregarProducto(nuevoProducto);
    }
    public void eliminarProducto(int IDProductoAEliminar){
        
    }
    public void editarInformacionProducto(int IDProducto, Producto productoActualizado){
        
    }
    
    public Producto obtenerProducto(String IDProductoAObtener){
       return null;
    }
    
}
