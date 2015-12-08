/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.ArrayList;
import negocio.entidades.ElementoNota;
import negocio.entidades.NotaDeVenta;
import negocio.entidades.Producto;

/**
 *
 * @author MiguelAngel
 */
public class PruebaNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<ElementoNota> elementos = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    elementos.add(new ElementoNota(2, new Producto(String.valueOf(i), "papitas", 3.0, 6.0)));
                    break;
                case 1:
                    elementos.add(new ElementoNota(1, new Producto(String.valueOf(i), "galletitas", 3.5, 7.0)));
                    break;
                case 2:
                    elementos.add(new ElementoNota(1, new Producto(String.valueOf(i), "refresquito", 4.0, 8.0)));
                    break;
            }
        }
        
        NotaDeVenta nota = new NotaDeVenta(elementos, 50.0);
        
        System.out.println(nota.obtenerImporteTotal());
        System.out.println(nota.obtenerFecha());
    }
    
}
