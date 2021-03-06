package negocio.administracion;

import com.itextpdf.text.DocumentException;
import datos.gestores.GestorBDVenta;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Caja;
import negocio.entidades.ElementoNota;
import negocio.entidades.NotaDeVenta;
import negocio.entidades.Producto;
import negocio.excepciones.ExcepcionElementoNoEncontrado;
import negocio.excepciones.ExcepcionElementoYaExistente;
import negocio.excepciones.ExcepcionExistenciasInsuficientes;
import negocio.excepciones.ExcepcionListaVacia;

/**
 *
 * @author PIX
 */
public class Cajero {

    private final GestorBDVenta gestorBDVenta_;

    private static Cajero unicoGestor_;

    private Caja cajaHeladeria_;
    private double entradaTotal;
    private double salidaTotal;

    public synchronized static Cajero obtenerInstancia() {
        if (unicoGestor_ == null) {
            unicoGestor_ = new Cajero();
        }
        return unicoGestor_;
    }

    public Caja abrir(double montoInicial) {
        cajaHeladeria_ = new Caja(montoInicial);
        return cajaHeladeria_;
    }

    public void despositar(double efectivo) {
        cajaHeladeria_.establecerDineroActual(obtenerDineroActual() + efectivo);
        establecerEntradaTotal(obtenerEntradaTotal() + efectivo);
    }

    public void retirar(double efectivo) {
        cajaHeladeria_.establecerDineroActual(obtenerDineroActual() - efectivo);
        establecerSalidaTotal(obtenerSalidaTotal() + efectivo);
    }

    public void realizarCorte(String directorio, String nombreArchivo) {
        try {
            Date fechaActual = new Date();
            GeneradorReportes generador = new GeneradorReportes();
            generador.generarReporteVentas(fechaActual, fechaActual, directorio);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public double obtenerDineroActual() {
        return cajaHeladeria_.obtenerDineroActual();
    }

    public double obtenerEntradaTotal() {
        return entradaTotal;
    }

    public double obtenerSalidaTotal() {
        return salidaTotal;
    }

    public double obtenerDineroInicial() {
        return cajaHeladeria_.obtenerDineroInicial();
    }

    public void realizarVenta(ArrayList<ElementoNota> productos, double pago) throws ExcepcionElementoNoEncontrado, ExcepcionExistenciasInsuficientes, ExcepcionListaVacia, ExcepcionElementoYaExistente {
        
        if(hayExistencias(productos)){
            
            NotaDeVenta notaVenta = new NotaDeVenta(productos, pago);
            registrarVenta(notaVenta);
            actualizarExistencias(productos);
            
        }
        
    }
    
    private boolean hayExistencias(ArrayList<ElementoNota> elementos) throws ExcepcionExistenciasInsuficientes {

        for (ElementoNota elemento : elementos) {

            Producto actual = elemento.obtenerProductoVendido();
            int existenciaActual = actual.obtenerExistencia();
            int cantidadAVender = elemento.obtenerCantidadDeProducto();

            if (existenciaActual < cantidadAVender) {
                String mensaje = "Las existencias de " + actual.obtenerNombre() 
                        + " son insuficientes";
                throw new ExcepcionExistenciasInsuficientes(mensaje);
            }

        }
        
        return true;
        
    }
    
    private void actualizarExistencias(ArrayList<ElementoNota> productos) throws ExcepcionElementoNoEncontrado, ExcepcionExistenciasInsuficientes, ExcepcionListaVacia, ExcepcionElementoYaExistente{
        
        GestorProductos gestor = GestorProductos.obtenerInstancia();
        
        for (ElementoNota elemento : productos) {
            
            Producto actual = elemento.obtenerProductoVendido();
            int nuevaExistencia = actual.obtenerExistencia() - elemento.obtenerCantidadDeProducto();
             
            actual.establecerExistencia(nuevaExistencia);
            gestor.editarInformacion(actual);

        }
        
    }
    
    
    private void registrarVenta(NotaDeVenta nota) {      
        gestorBDVenta_.agregarVenta(nota);    
    }

    private Cajero() {
        this.gestorBDVenta_ = new GestorBDVenta();
        entradaTotal = 0.0;
        salidaTotal = 0.0;
    }

    private void establecerEntradaTotal(double entradaTotal) {
        this.entradaTotal = entradaTotal;
    }

    private void establecerSalidaTotal(double salidaTotal) {
        this.salidaTotal = salidaTotal;
    }
}
