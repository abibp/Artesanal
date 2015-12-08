/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.gestion;

import datos.gestores.GestorBDProducto;
import java.util.ArrayList;
import java.util.HashMap;
import negocio.entidades.ProductoCompuesto;

/**
 *
 * @author MiguelAngel
 */
public class GestorProductosCompuestos implements Gestor<ProductoCompuesto>{
    
    private final GestorBDProducto gestorBD_;
    private final HashMap<String,ProductoCompuesto> nProductosCompuestos_;
    
    private static GestorProductosCompuestos unicoGestor_;

    public synchronized static GestorProductosCompuestos obtenerInstancia() {
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorProductosCompuestos();
        }
        return unicoGestor_;
    }

    @Override
    public void agregar(ProductoCompuesto nuevoProducto) {
        nProductosCompuestos_.put(nuevoProducto.obtenerID(), nuevoProducto);
        gestorBD_.agregar(nuevoProducto);
    }

    @Override
    public void eliminar(String id) {
        nProductosCompuestos_.remove(id);
        gestorBD_.eliminar(id);
    }

    @Override
    public void editarInformacion(String id, ProductoCompuesto actualizado) {
        nProductosCompuestos_.replace(id, actualizado);
        gestorBD_.editarInformacion(id, actualizado);
    }

    @Override
    public ProductoCompuesto obtener(String id) {
        return nProductosCompuestos_.get(id);
    }
    
    private void inicializarLista() {
        
//        ArrayList<ProductoCompuesto> listaProductos = gestorBD_.obtenerListaProductosCompuestos();
//        for (ProductoCompuesto producto : listaProductos) {
//            nProductosCompuestos_.put(producto.obtenerID(), producto);
//        }
    }

    private GestorProductosCompuestos() {
        this.gestorBD_ = new GestorBDProducto();
        this.nProductosCompuestos_ = new HashMap();
        inicializarLista();
    }

    @Override
    public ArrayList<ProductoCompuesto> obtenerLista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
