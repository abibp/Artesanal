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

    public ProductoCompuesto(
            String ID, 
            String nombre, 
            double costo, 
            double precio, 
            ArrayList<Ingrediente> ingredientes
    )throws ExcepcionListaVacia, ExcepcionElementoYaExistente {
        
        super(ID, nombre, costo, precio);
        this.nIngredientes_ = new HashMap();
        agregarReceta(ingredientes);
    }

    public Ingrediente obtenerIngrediente(String id) throws ExcepcionElementoNoEncontrado {
        
        if (nIngredientes_.containsKey(id)){
            return nIngredientes_.get(id);
        }else{
            final String mensaje = "Este producto no contiene dicho ingrediente"
                    + " o no existe el ingrediente.";
        }
        
        return null;
    }

    public void agregarIngrediente(Ingrediente ingrediente) throws ExcepcionElementoYaExistente {

        if(nIngredientes_.containsKey(ingrediente.obtenerID())){
            nIngredientes_.put(ingrediente.obtenerID(), ingrediente);
        }else{
            final String mensaje = "Este ingrediente ya se encuentra en la receta.";
            System.out.println(nIngredientes_.size());
            for (Entry<String, Ingrediente> entry : nIngredientes_.entrySet()) {
                System.out.println(entry.getValue().obtenerID() + " -- " + entry.getValue().obtenerInsumo().obtenerNombre());
            }
            
        }
    }

    public void eliminarIngrediente(String id) throws ExcepcionElementoNoEncontrado {
        
        if (nIngredientes_.containsKey(id)) {
            nIngredientes_.remove(id);
        } else {
            final String mensaje = "Este producto no contiene dicho ingrediente"
                    + " o no existe el ingrediente.";
            
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

    public void agregarReceta(ArrayList<Ingrediente> ingredientes) throws ExcepcionElementoYaExistente {
        
        for (Ingrediente ingrediente : ingredientes) {
            nIngredientes_.put(ingrediente.obtenerID(), ingrediente);
        }
        
    }
    
    public boolean tieneIngredientes(){
        return nIngredientes_.size() > 0;
    }

    
}
