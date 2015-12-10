/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import negocio.excepciones.ExcepcionElementoNoEncontrado;
import negocio.excepciones.ExcepcionElementoYaExistente;
import negocio.excepciones.ExcepcionListaVacia;

/**
 *
 * @author MiguelAngel
 */
public class ProductoCompuesto extends Producto {

    private final HashMap<String, Ingrediente> nIngredientes_;

    public ProductoCompuesto(
            String ID, 
            String nombre, 
            double costo, 
            double precio, 
            int existencia
    ) {
        
        super(ID, nombre, costo, precio, existencia);
        this.nIngredientes_ = new HashMap();
    }

    public Ingrediente obtenerIngrediente(String id) throws ExcepcionElementoNoEncontrado {
        
        if (nIngredientes_.containsKey(id)){
            return nIngredientes_.get(id);
        }else{
            final String mensaje = "Este producto no contiene dicho ingrediente"
                    + " o no existe el ingrediente.";
            throw new ExcepcionElementoNoEncontrado(mensaje);
        }
    }

    public void agregarIngrediente(Ingrediente ingrediente) throws ExcepcionElementoYaExistente {
        System.out.println(ingrediente.obtenerID());
        if(nIngredientes_.containsKey(ingrediente.obtenerID())){
            nIngredientes_.put(ingrediente.obtenerID(), ingrediente);
        }else{
            final String mensaje = "Este ingrediente ya se encuentra en la receta.";
            System.out.println(nIngredientes_.size());
            for (Entry<String, Ingrediente> entry : nIngredientes_.entrySet()) {
                System.out.println(entry.getValue().obtenerID() + " -- " + entry.getValue().obtenerInsumo().obtenerNombre());
            }
            throw new ExcepcionElementoYaExistente(mensaje);
        }
    }

    public void eliminarIngrediente(String id) throws ExcepcionElementoNoEncontrado {
        
        if (nIngredientes_.containsKey(id)) {
            nIngredientes_.remove(id);
        } else {
            final String mensaje = "Este producto no contiene dicho ingrediente"
                    + " o no existe el ingrediente.";
            throw new ExcepcionElementoNoEncontrado(mensaje);
        }
    }

    public ArrayList<Ingrediente> obtenerReceta() throws ExcepcionListaVacia {
        
        ArrayList<Ingrediente> listaIngredientes = new ArrayList<>();
        if(tieneIngredientes()){
            for (Entry<String, Ingrediente> entry : nIngredientes_.entrySet()) {
                Ingrediente ingrediente = entry.getValue();
                listaIngredientes.add(ingrediente);
            }
        }else{
            final String mensaje = "Este producto no tiene ingredientes.";
            throw new ExcepcionListaVacia(mensaje);
        }
        
        return listaIngredientes;
    }

    public void agregarReceta(ArrayList<Ingrediente> ingredientes) throws ExcepcionListaVacia, ExcepcionElementoYaExistente {
        
        boolean listaVacia = ingredientes.isEmpty();
        if (!listaVacia) {
            for (Ingrediente ingrediente : ingredientes) {
                agregarIngrediente(ingrediente);
            }
        }else{
            throw new ExcepcionListaVacia();
        }
    }
    
    public boolean tieneIngredientes(){
        return nIngredientes_.size() > 0;
    }

    
}
