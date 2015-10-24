package usuario;

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
    
    public static void mostrarMensajeDeInformacion(String informacion){
        
        JOptionPane.showMessageDialog(
                NINGUN_COMPONENTE, 
                informacion, 
                TITULO_MENSAJE_INFORMACION, 
                JOptionPane.INFORMATION_MESSAGE
        );
        
    }
    
    
    public static void mostrarMensajeDeError(String descripcionError){
        
        JOptionPane.showMessageDialog(
                NINGUN_COMPONENTE, 
                descripcionError, 
                TITULO_MENSAJE_ERROR, 
                JOptionPane.ERROR_MESSAGE
        );
        
    }
}
