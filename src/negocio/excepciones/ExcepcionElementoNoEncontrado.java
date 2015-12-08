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
public class ExcepcionElementoNoEncontrado extends Exception {

    private final String MENSAJE_DE_ERROR_ = "Este elemento no se encuentra almacenado. ";
    private final String INFORMACION_ADICIONAL_ = "\nDetalles: \n";
    
    /**
     * Creates a new instance of <code>ExcepcionElementoNoEncontrado</code>
     * without detail message.
     */
    public ExcepcionElementoNoEncontrado() {
        Informador.mostrarMensajeDeError(MENSAJE_DE_ERROR_);
    }

    /**
     * Constructs an instance of <code>ExcepcionElementoNoEncontrado</code> with
     * the specified detail message.
     *
     * @param mensaje the detail message.
     */
    public ExcepcionElementoNoEncontrado(String mensaje) {
        Informador.mostrarMensajeDeError(MENSAJE_DE_ERROR_ + INFORMACION_ADICIONAL_ + mensaje);
    }
}
