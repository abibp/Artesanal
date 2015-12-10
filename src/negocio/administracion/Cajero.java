package negocio.administracion;

import datos.gestores.GestorBDVenta;
import java.util.ArrayList;
import java.util.Date;
import negocio.entidades.Caja;
import negocio.entidades.ElementoNota;
import negocio.entidades.NotaDeVenta;
import negocio.entidades.Producto;
import negocio.entidades.ReporteVentas;
import negocio.excepciones.ExcepcionElementoNoEncontrado;
import negocio.excepciones.ExcepcionExistenciasInsuficientes;

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

    public double realizarVenta(ArrayList<ElementoNota> productos, double pago) throws ExcepcionElementoNoEncontrado, ExcepcionExistenciasInsuficientes {
        
        if(hayExistencias(productos)){
            
            NotaDeVenta notaVenta = new NotaDeVenta(productos, pago);
            registrarVenta(notaVenta);
            actualizarExistencias(productos);

            double cambio = pago - (notaVenta.obtenerImporteTotal());
            return cambio;
            
        }else{
            throw new ExcepcionExistenciasInsuficientes();
        }
        
    }

    private void actualizarExistencias(ArrayList<ElementoNota> productos) throws ExcepcionElementoNoEncontrado, ExcepcionExistenciasInsuficientes{
        
        GestorProductos gestor = GestorProductos.obtenerInstancia();
        
        for (ElementoNota elemento : productos) {
            
            Producto actual = elemento.obtenerProductoVendido();
            int nuevaExistencia = actual.obtenerExistencia() - elemento.obtenerCantidadDeProducto();
             
            actual.establecerExistencia(nuevaExistencia);
            gestor.editarInformacion(actual);

        }
        
    }
    
    
    private void registrarVenta(NotaDeVenta nota) {      
        gestorBDVenta_.agregarVenta(null);    
    }

    private boolean hayExistencias(ArrayList<ElementoNota> elementos){
        
        for (ElementoNota elemento : elementos) {
            
            Producto actual = elemento.obtenerProductoVendido();
            int existenciaActual = actual.obtenerExistencia();
            int cantidadAVender = elemento.obtenerCantidadDeProducto();
            
            if(existenciaActual < cantidadAVender){
                return false;
            }
            
        }
        return true;
    }
    
    private void realizarCorte() {
        Date fechaActual = new Date();
        cerrar();
    }

    private double cerrar() {
        double cantidadFinalEfectivo = cajaHeladeria_.obtenerDineroActual();
        return cantidadFinalEfectivo;
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
