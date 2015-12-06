package aplicacion;


import presentacion.inicio.AperturaCajaRegistradoraVentana;

/**
 *
 * @author PIX
 */
public class Principal {

    public static void main(String[] args) {
        iniciarSistema();
    }


    private static void iniciarSistema() {
        
        AperturaCajaRegistradoraVentana aperturaCajaVentana = new AperturaCajaRegistradoraVentana();
        aperturaCajaVentana.setLocationRelativeTo(null);
        aperturaCajaVentana.setVisible(true);
        
    }
}
