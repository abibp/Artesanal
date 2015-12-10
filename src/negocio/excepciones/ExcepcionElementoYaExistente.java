package negocio.excepciones;

import presentacion.utileria.Informador;

/**
 *
 * @author MiguelAngel
 */
public class ExcepcionElementoYaExistente extends Exception {

    private final String MENSAJE_DE_ERROR_ = "Este elemento ya existe.  ";

    private final String INFORMACION_ADICIONAL_ = "Detalles: ";
    
    /**
     * Creates a new instance of <code>ExcepcionElementoYaExistente</code>
     * without detail message.
     */
    public ExcepcionElementoYaExistente() {Informador.mostrarMensajeDeError(MENSAJE_DE_ERROR_);
    }

    /**
     * Constructs an instance of <code>ExcepcionElementoYaExistente</code> with
     * the specified detail message.
     *
     * @param mensaje the detail message.
     */
    public ExcepcionElementoYaExistente(String mensaje) {
        Informador.mostrarMensajeDeError(MENSAJE_DE_ERROR_ + INFORMACION_ADICIONAL_ + mensaje);
    }
}
