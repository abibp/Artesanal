/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.gestion;

import datos.gestores.GestorBDProducto;
import java.util.ArrayList;
import java.util.HashMap;
import negocio.entidades.Producto;

/**
 *
 * @author MiguelAngel
 */
public class GestorProductos implements Gestor<Producto>{
    
    private final GestorBDProducto gestorBD;
    
    private static GestorProductos unicoGestor_;
    
    private HashMap<String,Producto> nProductos_;

    public synchronized static GestorProductos obtenerInstancia() {
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorProductos();
        }
        return unicoGestor_;
    }

    @Override
    public void agregar(Producto nuevoProducto) {
        nProductos_.put(nuevoProducto.obtenerID(), nuevoProducto);
        GestorBDProducto.obtenerInstancia().agregar(nuevoProducto);
    }

    @Override
    public void eliminar(String id) {
        nProductos_.remove(id);
        GestorBDProducto.obtenerInstancia().eliminar(id);
    }

    @Override
    public void editarInformacion(String id, Producto actualizado) {
        nProductos_.replace(id, actualizado);
        GestorBDProducto.obtenerInstancia().editarInformacion(id, actualizado);
    }

    @Override
    public Producto obtener(String id) {
        return nProductos_.get(id);
    }
    
    private void inicializarLista() {
        ArrayList<Producto> listaProductos = gestorBD.obtenerListaProductos();
        
        for (Producto producto : listaProductos) {
            nProductos_.put(producto.obtenerID(), producto);
        }
    }

    private GestorProductos() {
        this.gestorBD = new GestorBDProducto();
        inicializarLista();
    }
    
}
