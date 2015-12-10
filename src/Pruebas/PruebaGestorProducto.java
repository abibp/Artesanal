/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import datos.excepciones.ExcepcionProductoNoEncontrado;
import negocio.entidades.Producto;
import negocio.excepciones.ExcepcionElementoNoEncontrado;
import negocio.administracion.GestorProductos;
import negocio.excepciones.ExcepcionElementoYaExistente;

/**
 *
 * @author MiguelAngel
 */
public class PruebaGestorProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepcionElementoNoEncontrado, ExcepcionProductoNoEncontrado, ExcepcionElementoYaExistente {
        // TODO code application logic here
        GestorProductos gestor = GestorProductos.obtenerInstancia();
        try{
            gestor.obtener("sup");
        }catch(ExcepcionElementoNoEncontrado ex){
            
        }
        gestor.agregar(new Producto("1", "papita", 3.0, 6.0, 10));
        System.out.println("Exito");
        Producto el = gestor.obtener("1");
        System.out.println(el.obtenerNombre());
    }
    
}
