/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capanegocio.entidades;

import java.util.ArrayList;

/**
 *
 * @author Astrid Briceño
 */
public class Reporte {
    
    private final int         ID_REPORTE_;
    private final String      DESCRIPCION_;
    
    private ArrayList<Venta>  ventas_;

    public Reporte(int IDReporte, String descripcion, ArrayList<Venta> ventas) {
        this.ID_REPORTE_  = IDReporte;
        this.DESCRIPCION_ = descripcion;
        this.ventas_      = ventas;
    }
    
    public int getIDReporte() {
        return ID_REPORTE_;
    }

    public String getDescripcion() {
        return DESCRIPCION_;
    }

    public ArrayList<Venta> getVentas() {
        return ventas_;
    }

    public boolean isVentaEnReporte(int IDVentaABuscar){
        return true;
    }
    
    @Override
    public String toString(){
        final String RETORNO_DE_CARRO = "\n";
        return this.DESCRIPCION_ + RETORNO_DE_CARRO + this.ID_REPORTE_ + 
                RETORNO_DE_CARRO + this.ventas_.toString().replace(", ", RETORNO_DE_CARRO);
    }
}
