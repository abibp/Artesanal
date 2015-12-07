package presentacion.utileria;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author PIX
 */
public class Informador {
    
    private static final Component NINGUN_COMPONENTE = null;
    private static final String TITULO_MENSAJE_INFORMACION = "Informacion";
    private static final String TITULO_MENSAJE_ERROR = "Hubo un error";
    
    public static void mostrarMensajeDeInformacion(String informacionMensaje){
        
        JOptionPane.showMessageDialog(NINGUN_COMPONENTE, 
                informacionMensaje, 
                TITULO_MENSAJE_INFORMACION, 
                JOptionPane.INFORMATION_MESSAGE
        );
        
    }
    
    public static void mostrarMensajeDeError(String errorMensaje){
        
        JOptionPane.showMessageDialog(NINGUN_COMPONENTE, 
                errorMensaje, 
                TITULO_MENSAJE_ERROR, 
                JOptionPane.ERROR_MESSAGE
        );
        
    }
    
    
}
