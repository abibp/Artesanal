package negocio.gestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import negocio.entidades.ElementoNota;
import negocio.entidades.NotaDeVenta;
import usuario.Informador;

/**
 *
 * @author PIX
 */
public class GestorVenta {

    private static GestorVenta unicoGestor_;
    
    private HashMap<String,NotaDeVenta> nNotasDeVenta_;

    public synchronized static GestorVenta obtenerInstancia() {
        if (unicoGestor_ == null) {
            unicoGestor_ = new GestorVenta();
        }
        return unicoGestor_;
    }

//    public NotaDeVenta obtenerPrimeraVenta() {
//
//        int INDICE_PRIMERA_VENTA = 0;
//
//        NotaDeVenta primeraVentaDia = nNotasDeVenta_.get(INDICE_PRIMERA_VENTA);
//        return primeraVentaDia;
//    }
//
//    public NotaDeVenta obtenerUltimaVenta() {
//
//        int INDICE_ULTIMA_VENTA = nNotasDeVenta_.size() - 1;
//
//        NotaDeVenta primeraVentaDia = nNotasDeVenta_.get(INDICE_ULTIMA_VENTA);
//        return primeraVentaDia;
//
//    }

    public double calcularPromedioDeVentasTotales() {  //Investigar implementacion del forEach

        double importeTotalVentas = 0.0;
        for (Entry<String, NotaDeVenta> entry: nNotasDeVenta_.entrySet()) {
            NotaDeVenta reciboActual = entry.getValue();
            importeTotalVentas += reciboActual.obtenerImporteTotal();
        }

        int cantidadRecibosVenta = nNotasDeVenta_.size();
        double promedioVentas = 0.0f;

        try {

            promedioVentas = importeTotalVentas / cantidadRecibosVenta;

        } catch (ArithmeticException excepcionDivision) {
            String error_mensaje = "No tienes ninguna venta";
            Informador.mostrarMensajeDeError(error_mensaje);
        }

        return promedioVentas;
    }

    public HashMap<String, NotaDeVenta> obtenerRecibosDeVentas() {
        return nNotasDeVenta_;
    }
    
    public void realizarVenta(NotaDeVenta venta){
        
        String id = String.valueOf(nNotasDeVenta_.size() + 1);
        nNotasDeVenta_.put(id,venta);
        ArrayList<ElementoNota> elementos = venta.obtenerElementos();
        
        for (ElementoNota elemento : elementos) {
            GestorBDVenta.agregarVenta(elemento);
        }
    }

    private GestorVenta() {
        this.nNotasDeVenta_ = new HashMap();
    }

}
