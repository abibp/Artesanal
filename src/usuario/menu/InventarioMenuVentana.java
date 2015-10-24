package usuario.menu;

import org.edisoncor.gui.panel.Panel;
import org.edisoncor.gui.tabbedPane.TabbedPaneHeader;
import usuario.MenuVentana;
import usuario.submenu.AgregarInventarioSubmenuVentana;
import usuario.submenu.ConsultaInventarioSubmenuVentana;
import usuario.submenu.ModificarInventarioSubmenuVentana;
import usuario.submenu.ReservaInventarioSubmenuVentana;

/**
 *
 * @author PIX
 */
public class InventarioMenuVentana extends MenuVentana{

    private Panel inventarioPanel;
    private TabbedPaneHeader submenuInventarioPanelSecciones;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return inventarioPanel;
    }

    @Override
    public void inicializarComponentes() {
        inventarioPanel = new org.edisoncor.gui.panel.Panel();
        submenuInventarioPanelSecciones = new org.edisoncor.gui.tabbedPane.TabbedPaneHeader();
       
        agregarSecciones();
    }

    @Override
    public void establecerLayoutComponentes() {
       
        javax.swing.GroupLayout productoPanelLayout = new javax.swing.GroupLayout(inventarioPanel);
        inventarioPanel.setLayout(productoPanelLayout);
        productoPanelLayout.setHorizontalGroup(productoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productoPanelLayout.createSequentialGroup()
                .addComponent(submenuInventarioPanelSecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 1372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        productoPanelLayout.setVerticalGroup(productoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submenuInventarioPanelSecciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

    private void agregarSecciones() {
        submenuInventarioPanelSecciones.addTab("Agregar", new AgregarInventarioSubmenuVentana().obtenerPanelContenedor());
        submenuInventarioPanelSecciones.addTab("Modificar", new ModificarInventarioSubmenuVentana().obtenerPanelContenedor());
        submenuInventarioPanelSecciones.addTab("Consulta", new ConsultaInventarioSubmenuVentana().obtenerPanelContenedor());
        submenuInventarioPanelSecciones.addTab("En Reserva", new ReservaInventarioSubmenuVentana().obtenerPanelContenedor());
    }
    
}
