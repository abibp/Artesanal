package aplicacion;


import datos.excepciones.ExcepcionInsumoNoEncontrado;
import datos.excepciones.ExcepcionProductoNoEncontrado;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.administracion.GestorInsumos;
import negocio.administracion.GestorProductosCompuestos;
import negocio.excepciones.ExcepcionElementoNoEncontrado;
import negocio.excepciones.ExcepcionElementoYaExistente;
import negocio.excepciones.ExcepcionListaVacia;
import presentacion.inicio.AperturaCajaRegistradoraVentana;

/**
 *
 * @author PIX
 */
public class Principal {

    public static void main(String[] args) throws ExcepcionProductoNoEncontrado, ExcepcionListaVacia, ExcepcionElementoYaExistente, ExcepcionInsumoNoEncontrado {
        iniciarGestores();
        iniciarSistema();
    }


    private static void iniciarSistema() {
        
        AperturaCajaRegistradoraVentana aperturaCajaVentana = new AperturaCajaRegistradoraVentana();
        aperturaCajaVentana.setLocationRelativeTo(null);
        aperturaCajaVentana.setVisible(true);
        
    }

    private static void iniciarGestores() throws ExcepcionProductoNoEncontrado, ExcepcionListaVacia, ExcepcionElementoYaExistente, ExcepcionInsumoNoEncontrado {
        try {
            GestorInsumos.obtenerInstancia();
            GestorProductosCompuestos.obtenerInstancia();

        } catch (ExcepcionElementoNoEncontrado ex){
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
