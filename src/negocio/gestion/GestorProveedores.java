/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.gestion;

import java.util.ArrayList;
import java.util.HashMap;
import negocio.entidades.Proveedor;

/**
 *
 * @author MiguelAngel
 */
public class GestorProveedores {
    
    private static GestorProveedores unicoGestor_;
    
    private HashMap<String, Proveedor> nProveedores_;

    public synchronized static GestorProveedores obtenerInstancia() {
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorProveedores();
        }
        return unicoGestor_;
    }

    public void agregar(Proveedor nuevoProveedor) {
        nProveedores_.put(nuevoProveedor.obtenerID(), nuevoProveedor);
        GestorBDProveedor.obtenerInstancia().agregar(nuevoProveedor);
    }

    public void eliminar(String id) {
        nProveedores_.remove(id);
        GestorBDProveedor.obtenerInstancia().eliminar(id);
    }

    public void editarInformación(String id, Proveedor actualizado) {
        nProveedores_.replace(id, actualizado);
        GestorBDProveedor.obtenerInstancia().editarInformacion(id, actualizado);
    }

    public void inicializarListaProveedores (ArrayList<Proveedor> proveedores) {
        for (Proveedor proveedor : proveedores) {
            nProveedores_.put(proveedor.obtenerID(), proveedor);
        }
    }
    
    public Proveedor obtenerProveedor(String id) {
        return nProveedores_.get(id);
    }
    
    private GestorProveedores() {
        this.nProveedores_ = new HashMap();
    }

}
