/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.gestion;

import java.util.ArrayList;
import java.util.HashMap;
import negocio.entidades.Insumo;

/**
 *
 * @author MiguelAngel
 */
public class GestorInsumos implements Gestor<Insumo>{
    
    private static GestorInsumos unicoGestor_;
    
    private HashMap<String,Insumo> nInsumos_;

    public synchronized static GestorInsumos obtenerInstancia() {
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorInsumos();
        }
        return unicoGestor_;
    }

    @Override
    public void agregar(Insumo nuevoInsumo) {
        nInsumos_.put(nuevoInsumo.obtenerID(), nuevoInsumo);
        GestorBDInsumo.obtenerInstancia().agregar(nuevoInsumo);
    }

    @Override
    public void eliminar(String id) {
        nInsumos_.remove(id);
        GestorBDInsumo.obtenerInstancia().eliminar(id);
    }

    @Override
    public void editarInformacion(String id, Insumo actualizado) {
        nInsumos_.replace(id, actualizado);
        GestorBDInsumo.obtenerInstancia().editarInformacion(id, actualizado);
    }

    @Override
    public void inicializarLista (ArrayList<Insumo> insumos) {
        for (Insumo insumo : insumos) {
            nInsumos_.put(insumo.obtenerID(), insumo);
        }
    }
    
    @Override
    public Insumo obtener(String id) {
        return nInsumos_.get(id);
    }
}
