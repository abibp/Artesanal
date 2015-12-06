/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.gestion;

import java.util.ArrayList;
import java.util.HashMap;
import negocio.entidades.Producto;

/**
 *
 * @author MiguelAngel
 */
public class GestorProductos implements Gestor<Producto>{
    
    private static GestorProductos unicoGestor_;
    
    private HashMap<String,Producto> nProductos_;

    public synchronized static GestorProductos obtenerInstancia() {
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorProductos();
        }
        return unicoGestor_;
    }

    public void agregar(Producto nuevoProducto) {
        nProductos_.put(nuevoProducto.obtenerID(), nuevoProducto);
        GestorBDProducto.obtenerInstancia().agregar(nuevoProducto);
    }

    public void eliminar(String id) {
        nProductos_.remove(id);
        GestorBDProducto.obtenerInstancia().eliminar(id);
    }

    public void editarInformacion(String id, Producto actualizado) {
        nProductos_.replace(id, actualizado);
        GestorBDProducto.obtenerInstancia().editarInformacion(id, actualizado);
    }

    public void inicializarLista(ArrayList<Producto> productos) {
        for (Producto producto : productos) {
            nProductos_.put(producto.obtenerID(), producto);
        }
    }
    
    public Producto obtener(String id) {
        return nProductos_.get(id);
    }
}
