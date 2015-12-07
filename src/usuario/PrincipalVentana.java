package usuario;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JFrame;
import negocio.gestion.Cajero;
import org.edisoncor.gui.panel.Panel;
import org.edisoncor.gui.tabbedPane.TabbedPaneHeader;
import usuario.menu.CorteMenuVentana;
import usuario.menu.InventarioMenuVentana;
import usuario.menu.ProductoMenuVentana;
import usuario.menu.ReporteMenuVentana;
import usuario.menu.VentaMenuVentana;

/**
 *
 * @author PIX
 */
public class PrincipalVentana extends MenuVentana{
    
    private TabbedPaneHeader menuPrincipalPanelSecciones;
    private JFrame ventanaPrincipal;
    private Panel panelPrincipal;
    private final Cajero gestorCaja;

    public PrincipalVentana(double cantidadInicialEnCaja) {
        super();
        gestorCaja = Cajero.obtenerIntancia();
        gestorCaja.abrirCaja(cantidadInicialEnCaja);
    }
    
    
    public void mostrarEnPantalla(){
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setExtendedState(MAXIMIZED_BOTH);
        ventanaPrincipal.pack();
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setVisible(true);
    }
    
    @Override
    public Panel obtenerPanelContenedor() {
        return panelPrincipal;
    }

    @Override
    public void inicializarComponentes() {
        ventanaPrincipal  = new JFrame("Sistema De Ventas Heladeria \"Artesanal\"");
        panelPrincipal  = new Panel();
        menuPrincipalPanelSecciones = new org.edisoncor.gui.tabbedPane.TabbedPaneHeader();
        panelPrincipal.add(menuPrincipalPanelSecciones);
        ventanaPrincipal.setContentPane(panelPrincipal);
        agregarSecciones();
    }

    @Override
    public void establecerDisenoComponentes() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPrincipalPanelSecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPrincipalPanelSecciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );
    }
    
    private void agregarSecciones() {
        menuPrincipalPanelSecciones.addTab("Venta"     , new VentaMenuVentana().obtenerPanelContenedor());
        menuPrincipalPanelSecciones.addTab("Producto"  , new ProductoMenuVentana().obtenerPanelContenedor());
        menuPrincipalPanelSecciones.addTab("Inventario", new InventarioMenuVentana().obtenerPanelContenedor());
        menuPrincipalPanelSecciones.addTab("Corte"     , new CorteMenuVentana().obtenerPanelContenedor());
        menuPrincipalPanelSecciones.addTab("Reporte"   , new ReporteMenuVentana().obtenerPanelContenedor());
    }
}
