package usuario;

import org.edisoncor.gui.panel.Panel;

/**
 *
 * @author PIX
 */
public abstract class MenuVentana {

    public MenuVentana() {
        prepararInterfazGrafica();
    }
    
    public final void prepararInterfazGrafica(){
        inicializarComponentes();
        establecerLayoutComponentes();
    }
    
    public abstract Panel obtenerPanelContenedor();
    
    public abstract void inicializarComponentes();
    
    public abstract void establecerLayoutComponentes();
}
