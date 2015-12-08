package presentacion.utileria;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author PIX
 */
public class RestriccionNumeroEnteroCampo implements KeyListener{
    
    private final char LIMITE_INFERIOR_NUMEROS = '0';
    private final char LIMITE_SUPERIOR_NUMEROS = '9';
    
   @Override
    public void keyTyped(KeyEvent e) {
        char caracter = e.getKeyChar();
        if (((caracter < LIMITE_INFERIOR_NUMEROS) || 
             (caracter > LIMITE_SUPERIOR_NUMEROS))&& 
             (caracter != KeyEvent.VK_BACK_SPACE)) {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        noHacerNada();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        noHacerNada();
    }
    
    private void noHacerNada(){}
}
