/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.administracion;

import datos.excepciones.ExcepcionProveedorNoEncontrado;
import datos.gestores.GestorBDProveedor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import negocio.entidades.Proveedor;

/**
 *
 * @author MiguelAngel
 */
public class GestorProveedores implements Gestor<Proveedor>{
    
    private final GestorBDProveedor gestorBD_;
    private final HashMap<String, Proveedor> nProveedores_;
    
    private static GestorProveedores unicoGestor_;

    public synchronized static GestorProveedores obtenerInstancia() throws ExcepcionProveedorNoEncontrado {
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorProveedores();
        }
        return unicoGestor_;
    }

    @Override
    public void agregar(Proveedor nuevoProveedor) {
        nProveedores_.put(nuevoProveedor.obtenerID(), nuevoProveedor);
        gestorBD_.agregar(nuevoProveedor);
    }

    @Override
    public void eliminar(String id) {
        nProveedores_.remove(id);
        gestorBD_.eliminar(id);
    }

    @Override
    public void editarInformacion(Proveedor actualizado) {
        nProveedores_.replace(actualizado.obtenerID(), actualizado);
        gestorBD_.editarInformacion(actualizado.obtenerID(), actualizado);
    }

    @Override
    public Proveedor obtener(String id) {
        return nProveedores_.get(id);
    }
    
    @Override
    public ArrayList<Proveedor> obtenerLista() {
        
        ArrayList<Proveedor> listaProveedors = new ArrayList<>();
        for (Entry<String, Proveedor> entry : nProveedores_.entrySet()) {
                Proveedor producto = entry.getValue();
                listaProveedors.add(producto);
            }
        return listaProveedors;
    }
    
    private void inicializarLista() throws ExcepcionProveedorNoEncontrado {
        ArrayList<Proveedor> listaProveedors = gestorBD_.obtenerLista();
        
        for (Proveedor proveedor : listaProveedors) {
            nProveedores_.put(proveedor.obtenerID(), proveedor);
        }
    }
    
    private GestorProveedores() throws ExcepcionProveedorNoEncontrado {
        this.gestorBD_ = new GestorBDProveedor();
        this.nProveedores_ = new HashMap();
        inicializarLista();
    }

}
