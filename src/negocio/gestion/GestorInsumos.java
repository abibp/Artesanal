/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.gestion;

import datos.excepciones.ExcepcionInsumoNoEncontrado;
import datos.gestores.GestorBDInsumo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import negocio.entidades.Insumo;
import negocio.excepciones.ExcepcionElementoYaExistente;

/**
 *
 * @author MiguelAngel
 */
public class GestorInsumos implements Gestor<Insumo>{
    
    private final GestorBDInsumo gestorBD_;
    private final HashMap<String,Insumo> nInsumos_;
    
    private static GestorInsumos unicoGestor_;
    
    public synchronized static GestorInsumos obtenerInstancia() throws ExcepcionInsumoNoEncontrado {
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorInsumos();
        }
        return unicoGestor_;
    }

    @Override
    public void agregar(Insumo nuevoInsumo) throws ExcepcionElementoYaExistente{
        if(!nInsumos_.containsKey(nuevoInsumo.obtenerID())){
            nInsumos_.put(nuevoInsumo.obtenerID(), nuevoInsumo);
            gestorBD_.agregar(nuevoInsumo);
        }else{
            throw new ExcepcionElementoYaExistente();
        }
    }

    @Override
    public void eliminar(String id) {
        nInsumos_.remove(id);
        gestorBD_.eliminar(id);
    }

    @Override
    public void editarInformacion(Insumo actualizado) {
        nInsumos_.replace(actualizado.obtenerID(), actualizado);
        gestorBD_.editarInformacion(actualizado.obtenerID(), actualizado);
    }

    @Override
    public Insumo obtener(String id) {
        return nInsumos_.get(id);
    }
    
    @Override
    public ArrayList<Insumo> obtenerLista() {
        
        ArrayList<Insumo> listaInsumos = new ArrayList<>();
        for (Entry<String, Insumo> entry : nInsumos_.entrySet()) {
                Insumo ingrediente = entry.getValue();
                listaInsumos.add(ingrediente);
            }
        return listaInsumos;
    }
    
    private void inicializarLista () throws ExcepcionInsumoNoEncontrado {
        ArrayList<Insumo> listaInsumos = gestorBD_.obtenerLista();
        
        for (Insumo insumo : listaInsumos) {
            nInsumos_.put(insumo.obtenerID(), insumo);
        }
    }

    private GestorInsumos() throws ExcepcionInsumoNoEncontrado {
        this.gestorBD_ = new GestorBDInsumo();
        this.nInsumos_ = new HashMap();
        inicializarLista();
    }
    
}
