/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.gestion;

import datos.GestorBDProveedor;
import java.util.ArrayList;
import java.util.HashMap;
import negocio.entidades.Proveedor;

/**
 *
 * @author MiguelAngel
 */
public class GestorProveedores implements Gestor<Proveedor>{
    
    private final GestorBDProveedor gestorBD_;
    private final HashMap<String, Proveedor> nProveedores_;
    
    private static GestorProveedores unicoGestor_;

    public synchronized static GestorProveedores obtenerInstancia() {
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
    public void editarInformacion(String id, Proveedor actualizado) {
        nProveedores_.replace(id, actualizado);
        gestorBD_.editarInformacion(id, actualizado);
    }

    @Override
    public Proveedor obtener(String id) {
        return nProveedores_.get(id);
    }
    
    private void inicializarLista() {
        ArrayList<Proveedor> listaProveedors = gestorBD_.obtenerListaProveedores();
        
        for (Proveedor proveedor : listaProveedors) {
            nProveedores_.put(proveedor.obtenerID(), proveedor);
        }
    }
    
    private GestorProveedores() {
        this.gestorBD_ = new GestorBDProveedor();
        this.nProveedores_ = new HashMap();
        inicializarLista();
    }

}
