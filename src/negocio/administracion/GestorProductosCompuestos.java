/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.administracion;

import datos.excepciones.ExcepcionInsumoNoEncontrado;
import datos.excepciones.ExcepcionProductoNoEncontrado;
import datos.gestores.GestorBDProducto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.ProductoCompuesto;
import negocio.entidades.Proveedor;
import negocio.excepciones.ExcepcionElementoYaExistente;
import negocio.excepciones.ExcepcionListaVacia;

/**
 *
 * @author MiguelAngel
 */
public class GestorProductosCompuestos implements Gestor<ProductoCompuesto>{
    
    private final GestorBDProducto gestorBD_;
    private final HashMap<String,ProductoCompuesto> nInventario_;
    
    private static GestorProductosCompuestos unicoGestor_;

    public synchronized static GestorProductosCompuestos obtenerInstancia() throws ExcepcionProductoNoEncontrado, ExcepcionListaVacia, ExcepcionElementoYaExistente, ExcepcionInsumoNoEncontrado {
        
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorProductosCompuestos();
        }
        
        return unicoGestor_;
        
    }

    @Override
    public void agregar(ProductoCompuesto nuevoProducto) {
        nInventario_.put(nuevoProducto.obtenerID(), nuevoProducto);
        try {
            gestorBD_.agregar(nuevoProducto);
        } catch (ExcepcionListaVacia ex) {
            Logger.getLogger(GestorProductosCompuestos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(String id) {
        nInventario_.remove(id);
        gestorBD_.eliminar(id);
    }

    @Override
    public void editarInformacion(ProductoCompuesto actualizado) {
        nInventario_.replace(actualizado.obtenerID(), actualizado);
        gestorBD_.editarInformacion(actualizado.obtenerID(), actualizado);
    }

    @Override
    public ProductoCompuesto obtener(String id) {
        return nInventario_.get(id);
    }
    
    @Override
    public ArrayList<ProductoCompuesto> obtenerLista() {
        
        ArrayList<ProductoCompuesto> listaProductosCompuestos = new ArrayList<>();
        for (Map.Entry<String, ProductoCompuesto> entry : nInventario_.entrySet()) {
            ProductoCompuesto producto = entry.getValue();
            listaProductosCompuestos.add(producto);
        }
        
        return listaProductosCompuestos;
        
    }

    private void inicializarLista() throws ExcepcionProductoNoEncontrado, ExcepcionListaVacia, ExcepcionElementoYaExistente, ExcepcionInsumoNoEncontrado {
        
        ArrayList<ProductoCompuesto> listaProductos = gestorBD_.obtenerListaCompuestos();
        for (ProductoCompuesto producto : listaProductos) {
            nInventario_.put(producto.obtenerID(), producto);
        }
    }

    private GestorProductosCompuestos() throws ExcepcionProductoNoEncontrado, ExcepcionListaVacia, ExcepcionElementoYaExistente, ExcepcionInsumoNoEncontrado {
        this.gestorBD_ = new GestorBDProducto();
        this.nInventario_ = new HashMap();
        inicializarLista();
    }
    
}
