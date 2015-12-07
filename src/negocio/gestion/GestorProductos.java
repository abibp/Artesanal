/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.gestion;

import datos.GestorBDProducto;
import java.util.ArrayList;
import java.util.HashMap;
import negocio.entidades.Producto;

/**
 *
 * @author MiguelAngel
 */
public class GestorProductos implements Gestor<Producto>{
    
    private final GestorBDProducto gestorBD_;
    private final HashMap<String,Producto> nProductos_;
    
    private static GestorProductos unicoGestor_;

    public synchronized static GestorProductos obtenerInstancia() {
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorProductos();
        }
        return unicoGestor_;
    }

    @Override
    public void agregar(Producto nuevoProducto) {
        nProductos_.put(nuevoProducto.obtenerID(), nuevoProducto);
        gestorBD_.agregar(nuevoProducto);
    }

    @Override
    public void eliminar(String id) {
        nProductos_.remove(id);
        gestorBD_.eliminar(id);
    }

    @Override
    public void editarInformacion(String id, Producto actualizado) {
        nProductos_.replace(id, actualizado);
        gestorBD_.editarInformacion(id, actualizado);
    }

    @Override
    public Producto obtener(String id) {
        return nProductos_.get(id);
    }
    
    private void inicializarLista() {
        ArrayList<Producto> listaProductos = gestorBD_.obtenerListaProductos();
        
        for (Producto producto : listaProductos) {
            nProductos_.put(producto.obtenerID(), producto);
        }
    }

    private GestorProductos() {
        this.gestorBD_ = new GestorBDProducto();
        this.nProductos_ = new HashMap();
        inicializarLista();
    }
    
}
