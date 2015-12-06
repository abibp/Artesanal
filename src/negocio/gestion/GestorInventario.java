/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.gestion;

import java.util.ArrayList;
import java.util.HashMap;
import negocio.entidades.Insumo;
import negocio.entidades.Producto;

/**
 *
 * @author MiguelAngel
 */
public class GestorInventario {

    private static GestorInventario unicoGestor_;

    private HashMap<String,Producto> nProductos_;
    private HashMap<String,Insumo> nInsumos_;

    public synchronized static GestorInventario obtenerInstancia() {
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorInventario();
        }
        return unicoGestor_;
    }

    public void agregarProducto(Producto nuevoProducto) {
        nProductos_.put(nuevoProducto.obtenerID(), nuevoProducto);
        GestorBDProducto.obtenerInstancia().agregar(nuevoProducto);
        GestorBDInventario.obtenerInstancia().agregarProducto(nuevoProducto);
    }

    public void eliminarProducto(String id) {
        nProductos_.remove(id);
        GestorBDProducto.obtenerInstancia().eliminar(id);
        GestorBDInventario.obtenerInstancia().eliminarProducto(id);
    }

    public void editarInformacionProducto(String id, Producto actualizado) {
        nProductos_.replace(id, actualizado);
        GestorBDProducto.obtenerInstancia().editarInformacion(id, actualizado);
        GestorBDInventario.obtenerInstancia().editarInformacionProducto(id, actualizado);
    }

    public void inicializarListaProductos (ArrayList<Producto> productos) {
        for (Producto producto : productos) {
            nProductos_.put(producto.obtenerID(), producto);
        }
    }
    
    public Producto obtenerProducto(String id) {
        return nProductos_.get(id);
    }

    public void agregarInsumo(Insumo nuevoInsumo) {
        nInsumos_.put(nuevoInsumo.obtenerID(), nuevoInsumo);
        GestorBDInsumo.obtenerInstancia().agregar(nuevoInsumo);
        GestorBDInventario.obtenerInstancia().agregarInsumo(nuevoInsumo);
    }

    public void eliminarInsumo(String id) {
        nInsumos_.remove(id);
        GestorBDInsumo.obtenerInstancia().eliminar(id);
        GestorBDInventario.obtenerInstancia().eliminarInsumo(id);
    }

    public void editarInformacionInsumo(String id, Insumo actualizado) {
        nInsumos_.replace(id, actualizado);
        GestorBDInsumo.obtenerInstancia().editarInformacion(id, actualizado);
        GestorBDInventario.obtenerInstancia().editarInformacionInsumo(id, actualizado);
    }

    public Insumo obtenerInsumo(String id) {
        return nInsumos_.get(id);
    }
    
    public void inicializarListaInsumos (ArrayList<Insumo> insumos) {
        for (Insumo insumo : insumos) {
            nInsumos_.put(insumo.obtenerID(), insumo);
        }
    }

    private GestorInventario() {
        this.nProductos_ = new HashMap();
        this.nInsumos_ = new HashMap();
    }
}
