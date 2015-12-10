/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.administracion;

import datos.excepciones.ExcepcionInsumoNoEncontrado;
import datos.gestores.GestorBDInsumo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Insumo;
import negocio.excepciones.ExcepcionElementoNoEncontrado;
import negocio.excepciones.ExcepcionElementoYaExistente;

/**
 *
 * @author MiguelAngel
 */
public class GestorInsumos implements Gestor<Insumo>{
    
    private final GestorBDInsumo gestorBD_;
    private final HashMap<String,Insumo> nInventario_;
    
    private static GestorInsumos unicoGestor_;
    
    public synchronized static GestorInsumos obtenerInstancia() throws ExcepcionElementoNoEncontrado {
        
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorInsumos();
        }
        
        return unicoGestor_;
        
    }

    @Override
    public void agregar(Insumo nuevoInsumo) throws ExcepcionElementoYaExistente{
        
        if(!nInventario_.containsKey(nuevoInsumo.obtenerID())){
            
            nInventario_.put(nuevoInsumo.obtenerID(), nuevoInsumo);
            gestorBD_.agregar(nuevoInsumo);
        
        }else{
            throw new ExcepcionElementoYaExistente();
        }
        
    }

    @Override
    public void eliminar(String id) throws ExcepcionElementoNoEncontrado {
        
        if(!nInventario_.containsKey(id)){
            
            nInventario_.remove(id);
        gestorBD_.eliminar(id);
        
        }else{
            throw new ExcepcionElementoNoEncontrado();
        }
        
    }

    @Override
    public void editarInformacion(Insumo actualizado) {
        
        nInventario_.replace(actualizado.obtenerID(), actualizado);
        gestorBD_.editarInformacion(actualizado.obtenerID(), actualizado);
        
    }

    @Override
    public Insumo obtener(String id) {  
        return nInventario_.get(id);  
    }
    
    @Override
    public List<Insumo> obtenerLista() {    
        return Collections.unmodifiableList(convertirCatalogoALista());
    }
    
    private ArrayList<Insumo> convertirCatalogoALista(){
        
        ArrayList<Insumo> listaInsumos = new ArrayList<>();
        
        for (Entry<String, Insumo> entry : nInventario_.entrySet()) {
            
            Insumo ingrediente = entry.getValue();
            listaInsumos.add(ingrediente);
            
        }
        
        return listaInsumos;
        
    }
    
    private void inicializarLista () throws ExcepcionElementoNoEncontrado {
        
        try {
            
            ArrayList<Insumo> listaInsumos = gestorBD_.obtenerLista();
            
            for (Insumo insumo : listaInsumos) {
                nInventario_.put(insumo.obtenerID(), insumo);
            }
            
        } catch (ExcepcionInsumoNoEncontrado insumoNoEncontrado) {
            throw new ExcepcionElementoNoEncontrado();
        }
    }

    private GestorInsumos() throws ExcepcionElementoNoEncontrado {
        this.gestorBD_ = new GestorBDInsumo();
        this.nInventario_ = new HashMap();
        inicializarLista();
    }
    
}
