
package negocio.excepciones;

import presentacion.utileria.Informador;


/**
 *
 * @author MiguelAngel
 */
public class ExcepcionListaVacia extends Exception {

    private final String MENSAJE_DE_ERROR_ = "La lista no contiene elementos. ";
    private final String INFORMACION_ADICIONAL_ = "Detalles: ";
    
    /**
     * Creates a new instance of <code>NewException</code> without detail
     * message.
     */
    public ExcepcionListaVacia() {
        Informador.mostrarMensajeDeError(MENSAJE_DE_ERROR_);
    }

    /**
     * Constructs an instance of <code>NewException</code> with the specified
     * detail message.
     *
     * @param mensaje the detail message.
     */
    public ExcepcionListaVacia(String mensaje) {
        Informador.mostrarMensajeDeError(MENSAJE_DE_ERROR_ + INFORMACION_ADICIONAL_ + mensaje);
    }
}
