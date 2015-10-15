/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.entidades;

import java.util.ArrayList;

/**
 *
 * @author Astrid Briceño
 */
public class ReporteDeVenta {
    
    private final int         ID_REPORTE_;
    private final String      DESCRIPCION_;
    
    private ArrayList<Venta>  nVentas_;

    public ReporteDeVenta(int IDReporte, String descripcion, ArrayList<Venta> ventas) {
        this.ID_REPORTE_  = IDReporte;
        this.DESCRIPCION_ = descripcion;
        this.nVentas_      = ventas;
    }
    
    public int obtenerIDReporte() {
        return ID_REPORTE_;
    }

    public String obtenerDescripcion() {
        return DESCRIPCION_;
    }

    public ArrayList<Venta> obtenerVentas() {
        return nVentas_;
    }

    public boolean isVentaEnReporte(int IDVentaABuscar){
        return true;
    }
    
    public void agregarVenta(Venta unaVenta) {
        this.nVentas_.add(unaVenta);
    }
    
    public void eliminarVenta(Venta unaVenta) {
        Venta ventaAEliminar = unaVenta;
        this.nVentas_.remove(ventaAEliminar);
    }
    
    @Override
    public String toString(){
        final String RETORNO_DE_CARRO = "\n";
        return this.DESCRIPCION_ + RETORNO_DE_CARRO + this.ID_REPORTE_ + 
                RETORNO_DE_CARRO + this.nVentas_.toString().replace(", ", RETORNO_DE_CARRO);
    }
}
