/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.excepciones;

import presentacion.utileria.Informador;

/**
 *
 * @author MiguelAngel
 */
public class ExcepcionExistenciasInsuficientes extends Exception {

        private final String MENSAJE_DE_ERROR_ = "Existencia insuficientes para vender.  ";
    private final String INFORMACION_ADICIONAL_ = "Detalles: ";
    
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
     * @param mensaje the detail message.
     */
    public ExcepcionExistenciasInsuficientes(String mensaje) {
        Informador.mostrarMensajeDeError(MENSAJE_DE_ERROR_ + INFORMACION_ADICIONAL_ + mensaje);
    }
}
