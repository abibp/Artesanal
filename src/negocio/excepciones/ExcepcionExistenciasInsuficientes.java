/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.excepciones;

/**
 *
 * @author MiguelAngel
 */
public class ExcepcionExistenciasInsuficientes extends Exception {

    /**
     * Creates a new instance of <code>ExcepcionExistenciasInsuficientes</code>
     * without detail message.
     */
    public ExcepcionExistenciasInsuficientes() {
    }

    /**
     * Constructs an instance of <code>ExcepcionExistenciasInsuficientes</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public ExcepcionExistenciasInsuficientes(String msg) {
        super(msg);
    }
}
