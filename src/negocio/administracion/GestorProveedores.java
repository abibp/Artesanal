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
import negocio.excepciones.ExcepcionElementoNoEncontrado;
import negocio.excepciones.ExcepcionElementoYaExistente;

/**
 *
 * @author MiguelAngel
 */
public class GestorProveedores implements Gestor<Proveedor>{
    
    private final GestorBDProveedor gestorBD_;
    private final HashMap<String, Proveedor> nDirectorio_;
    
    private static GestorProveedores unicoGestor_;

    public synchronized static GestorProveedores obtenerInstancia() throws ExcepcionElementoNoEncontrado {
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorProveedores();
        }
        return unicoGestor_;
    }

    @Override
    public void agregar(Proveedor nuevoProveedor) throws ExcepcionElementoYaExistente {
        
        if(!nDirectorio_.containsKey(nuevoProveedor.obtenerID())){
            
            nDirectorio_.put(nuevoProveedor.obtenerID(), nuevoProveedor);
            gestorBD_.agregar(nuevoProveedor);
            
        }else{
            throw new ExcepcionElementoYaExistente();
        }
        
    }

    @Override
    public void eliminar(String id) {
        nDirectorio_.remove(id);
        gestorBD_.eliminar(id);
    }

    @Override
    public void editarInformacion(Proveedor actualizado) {
        nDirectorio_.replace(actualizado.obtenerID(), actualizado);
        gestorBD_.editarInformacion(actualizado.obtenerID(), actualizado);
    }

    @Override
    public Proveedor obtener(String id) {
        return nDirectorio_.get(id);
    }

    @Override
    public ArrayList<Proveedor> obtenerLista() {

        ArrayList<Proveedor> listaProveedors = new ArrayList<>();
        for (Entry<String, Proveedor> entry : nDirectorio_.entrySet()) {
            Proveedor producto = entry.getValue();
            listaProveedors.add(producto);
        }
        return listaProveedors;
    }
    
    private void inicializarLista() throws ExcepcionElementoNoEncontrado {
        try {
            ArrayList<Proveedor> listaProveedors = gestorBD_.obtenerLista();
            
            for (Proveedor proveedor : listaProveedors) {
                nDirectorio_.put(proveedor.obtenerID(), proveedor);
            }
        } catch (ExcepcionProveedorNoEncontrado ex) {
            throw new ExcepcionElementoNoEncontrado();
        }
    }
    
    private GestorProveedores() throws ExcepcionElementoNoEncontrado {
        this.gestorBD_ = new GestorBDProveedor();
        this.nDirectorio_ = new HashMap();
        inicializarLista();
    }

}
