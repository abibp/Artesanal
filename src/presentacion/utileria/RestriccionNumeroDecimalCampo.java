package presentacion.utileria;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author PIX
 */
public class RestriccionNumeroDecimalCampo implements KeyListener {

    private final char LIMITE_INFERIOR_NUMEROS = '0';
    private final char LIMITE_SUPERIOR_NUMEROS = '9';
    private String textoEscrito = "";

    @Override
    public void keyTyped(KeyEvent eventoTeclado) {
        
        char caracter = eventoTeclado.getKeyChar();
        
        boolean esNumero = 
                (caracter >= LIMITE_INFERIOR_NUMEROS) && 
                (caracter <= LIMITE_SUPERIOR_NUMEROS);

        boolean esTeclaBorrar = caracter == KeyEvent.VK_BACK_SPACE;

        boolean esTeclaPunto = caracter == '.';

        if (!esNumero && !esTeclaBorrar && !esTeclaPunto) {

            ignorarTecla(eventoTeclado);

        } else {

            if (esTeclaPunto) {
                
                if (textoYaContienePunto()) {
                    
                    ignorarTecla(eventoTeclado);
                    
                } else {
                    
                    agregarLetraTexto(caracter);
                
                }
            } else if (esTeclaBorrar) {

                if (textoTieneLetras()) {
                    
                    borrarLetraTexto();
                
                }

            } else {
                
                agregarLetraTexto(caracter);
            }

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

    private void noHacerNada() {
    }
   
    private void ignorarTecla(KeyEvent e){
        e.consume();
    }

    private void borrarLetraTexto() {

        textoEscrito = textoEscrito.substring(0, textoEscrito.length() - 1);
    
    }

    private boolean textoYaContienePunto() {

        return textoEscrito.indexOf('.') != -1;
    
    }

    private void agregarLetraTexto(char letra) {

        textoEscrito += letra;
    
    }

    private boolean textoTieneLetras() {

        return textoEscrito.length() > 0;
    
    }
}
