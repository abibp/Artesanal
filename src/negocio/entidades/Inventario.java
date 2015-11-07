package negocio.entidades;

import java.util.ArrayList;

/**
 *
 * @author PIX
 */
public class Inventario {
    
    private ArrayList<Producto> nProductos_;
    private ArrayList<Insumo> nInsumos_;

    public Inventario() {
    }

    
    public ArrayList<Producto> getnProductos_() {
        return nProductos_;
    }

    public ArrayList<Insumo> getnInsumos_() {
        return nInsumos_;
    }
    
    
    
}
