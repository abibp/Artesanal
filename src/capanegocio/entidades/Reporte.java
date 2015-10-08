/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capanegocio.entidades;

import capanegocio.gestion.Venta;
import java.util.ArrayList;

/**
 *
 * @author Astrid Briceño
 */
public class Reporte {
    
    private final int IDReporte;
    private final String descripcion;
    private ArrayList<Venta> ventas;

    public Reporte(int IDReporte, String descripcion, ArrayList<Venta> ventas) {
        this.IDReporte = IDReporte;
        this.descripcion = descripcion;
        this.ventas = ventas;
    }
    
    public int getIDReporte() {
        return IDReporte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public boolean isVentaEnReporte(int IDVentaABuscar){
        return true;
    }
    
    @Override
    public String toString(){
        final String RETORNO_DE_CARRO = "\n";
        return this.descripcion + RETORNO_DE_CARRO + this.IDReporte + 
                RETORNO_DE_CARRO + this.ventas.toString().replace(", ", RETORNO_DE_CARRO);
    }
}
