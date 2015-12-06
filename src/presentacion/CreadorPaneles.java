package presentacion;

import presentacion.inicio.DefaultPanel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author PIX
 */
public class CreadorPaneles {

    
    public JPanel crear(String nombreClase){
        try {
            return ((JPanel)Class.forName(nombreClase).newInstance());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            Logger.getLogger(CreadorPaneles.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new DefaultPanel();
    }
    
}
