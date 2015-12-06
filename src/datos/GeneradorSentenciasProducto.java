/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import negocio.entidades.Producto;

/**
 *
 * @author Astrid Briceño
 */
public class GeneradorSentenciasProducto {
    private final String nombreTabla;

    public GeneradorSentenciasProducto(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public String generarSentenciaInsertarProducto(Producto producto) {
        String sentenciaGenerada;
        sentenciaGenerada = "INSERT INTO " + nombreTabla + " (id_producto, nombre, costo, precio) " +
                "VALUES ('" +  producto.obtenerID()+ 
                "', '"  + producto.obtenerNombre() + 
                "', '" + producto.obtenerCosto() + 
                "', '" + producto.obtenerPrecio() +
                "')";
        System.out.println(sentenciaGenerada);
        return sentenciaGenerada;
    }

    public String generarSentenciaEliminarProducto(String idProducto) {
        String sentenciaGenerada;
        sentenciaGenerada = "DELETE FROM " + nombreTabla + " WHERE " +
                "id_producto = '" + idProducto + "'";
        return sentenciaGenerada;
    }

    public String generarSentenciaActualizarProducto(Producto productoActualizado) {
        String condicion = "id_producto = " + productoActualizado.obtenerID();
        String sentenciaGenerada;
        sentenciaGenerada = "UPDATE " + nombreTabla +
                " SET nombre = '" + productoActualizado.obtenerNombre() +
                "', costo = " + productoActualizado.obtenerCosto() +
                ", precio = " + productoActualizado.obtenerPrecio() +
                ", existencia = " + productoActualizado.obtenerExistencia()
                ;
        return sentenciaGenerada;
    }

    
}
