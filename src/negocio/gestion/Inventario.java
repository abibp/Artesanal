package negocio.gestion;

import negocio.entidades.Producto;
import negocio.entidades.Insumo;
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
