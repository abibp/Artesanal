/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.entidades;

/**
 *
 * @author MiguelAngel
 */
public class Ingrediente {
    
    private final Insumo insumo_;
    private final int cantidad_; 

    public Ingrediente(Insumo insumo, int cantidad) {
        this.insumo_ = insumo;
        this.cantidad_ = cantidad;
    }

    public Insumo obtenerInsumo() {
        return insumo_;
    }
    
    public int obtenerCantidad() {
        return cantidad_;
    }
    
    public String obtenerID(){
        return obtenerInsumo().obtenerID();
    }
     
}
