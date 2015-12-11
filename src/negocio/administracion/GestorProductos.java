/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.administracion;

import datos.excepciones.ExcepcionProductoNoEncontrado;
import datos.gestores.GestorBDProducto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Insumo;
import negocio.entidades.Producto;
import negocio.excepciones.ExcepcionElementoNoEncontrado;
import negocio.excepciones.ExcepcionElementoYaExistente;
import negocio.excepciones.ExcepcionListaVacia;

/**
 *
 * @author MiguelAngel
 */
public class GestorProductos implements Gestor<Producto> {

    private final GestorBDProducto gestorBD_;
    private final HashMap<String, Producto> nInventario_;

    private static GestorProductos unicoGestor_;

    public synchronized static GestorProductos obtenerInstancia() throws ExcepcionElementoNoEncontrado, ExcepcionListaVacia, ExcepcionElementoYaExistente {
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorProductos();
        }
        return unicoGestor_;
    }

    @Override
    public void agregar(Producto nuevoProducto) throws ExcepcionElementoYaExistente {

        if (!nInventario_.containsKey(nuevoProducto.obtenerID())) {

            nInventario_.put(nuevoProducto.obtenerID(), nuevoProducto);
            gestorBD_.agregar(nuevoProducto);

        } else {
            throw new ExcepcionElementoYaExistente();
        }

    }

    @Override
    public void eliminar(String id) {
        nInventario_.remove(id);
        gestorBD_.eliminar(id);
    }

    @Override
    public void editarInformacion(Producto actualizado) {
        nInventario_.replace(actualizado.obtenerID(), actualizado);
        gestorBD_.editarInformacion(actualizado.obtenerID(), actualizado);
    }

    @Override
    public Producto obtener(String id) throws ExcepcionElementoNoEncontrado {
        if (nInventario_.containsKey(id)) {
            return nInventario_.get(id);
        } else {
            throw new ExcepcionElementoNoEncontrado();
        }
    }

    @Override
    public List<Producto> obtenerLista() {
        return Collections.unmodifiableList(convertirCatalogoALista());
    }
    
    private ArrayList<Producto> convertirCatalogoALista(){
        
        ArrayList<Producto> listaProducto = new ArrayList<>();
        
        for (Entry<String, Producto> entry : nInventario_.entrySet()) {
            
            Producto producto = entry.getValue();
            listaProducto.add(producto);
            
        }
        
        return listaProducto;
        
    }

    private void inicializarLista() throws ExcepcionElementoNoEncontrado, ExcepcionListaVacia, ExcepcionElementoYaExistente {
        try {
            ArrayList<Producto> listaProductos = gestorBD_.obtenerLista();

            for (Producto producto : listaProductos) {
                nInventario_.put(producto.obtenerID(), producto);
            }
        } catch (ExcepcionProductoNoEncontrado ex) {
            throw new ExcepcionElementoNoEncontrado();
        }
    }

    private GestorProductos() throws ExcepcionElementoNoEncontrado, ExcepcionListaVacia, ExcepcionElementoYaExistente {
        this.gestorBD_ = new GestorBDProducto();
        this.nInventario_ = new HashMap();
        inicializarLista();
    }

}
