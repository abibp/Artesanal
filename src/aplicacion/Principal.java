package aplicacion;


import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.administracion.GestorInsumos;
import negocio.excepciones.ExcepcionElementoNoEncontrado;
import presentacion.inicio.AperturaCajaRegistradoraVentana;

/**
 *
 * @author PIX
 */
public class Principal {

    public static void main(String[] args) {
        iniciarGestores();
        iniciarSistema();
    }


    private static void iniciarSistema() {
        
        AperturaCajaRegistradoraVentana aperturaCajaVentana = new AperturaCajaRegistradoraVentana();
        aperturaCajaVentana.setLocationRelativeTo(null);
        aperturaCajaVentana.setVisible(true);
        
    }

    private static void iniciarGestores() {
        try {
            GestorInsumos.obtenerInstancia();
        } catch (ExcepcionElementoNoEncontrado ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
