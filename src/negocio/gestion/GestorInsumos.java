/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.gestion;

import datos.GestorBDInsumo;
import java.util.ArrayList;
import java.util.HashMap;
import negocio.entidades.Insumo;

/**
 *
 * @author MiguelAngel
 */
public class GestorInsumos implements Gestor<Insumo>{
    
    private final GestorBDInsumo gestorBD_;
    private final HashMap<String,Insumo> nInsumos_;
    
    private static GestorInsumos unicoGestor_;
    
    public synchronized static GestorInsumos obtenerInstancia() {
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorInsumos();
        }
        return unicoGestor_;
    }

    @Override
    public void agregar(Insumo nuevoInsumo) {
        nInsumos_.put(nuevoInsumo.obtenerID(), nuevoInsumo);
        gestorBD_.agregar(nuevoInsumo);
    }

    @Override
    public void eliminar(String id) {
        nInsumos_.remove(id);
        gestorBD_.eliminar(id);
    }

    @Override
    public void editarInformacion(String id, Insumo actualizado) {
        nInsumos_.replace(id, actualizado);
        gestorBD_.editarInformacion(id, actualizado);
    }

    @Override
    public Insumo obtener(String id) {
        return nInsumos_.get(id);
    }
    
    private void inicializarLista () {
        ArrayList<Insumo> listaInsumos = gestorBD_.obtenerListaInsumos();
        
        for (Insumo insumo : listaInsumos) {
            nInsumos_.put(insumo.obtenerID(), insumo);
        }
    }

    private GestorInsumos() {
        this.gestorBD_ = new GestorBDInsumo();
        this.nInsumos_ = new HashMap();
        inicializarLista();
    }
    
    
}
