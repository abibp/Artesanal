package usuario.menu;

import org.edisoncor.gui.panel.Panel;
import org.edisoncor.gui.tabbedPane.TabbedPaneHeader;
import usuario.MenuVentana;
import usuario.submenu.AgregarProductoSubmenuVentana;
import usuario.submenu.EliminarProductoSubmenuVentana;
import usuario.submenu.ModificarProductoSubmenuVentana;
import usuario.submenu.PopularesProductoSubmenuVentana;

/**
 *
 * @author PIX
 */
public class ProductoMenuVentana extends MenuVentana{

    private Panel productoPanel;
    private TabbedPaneHeader submenuProductosPanelSecciones;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return productoPanel;
    }

    @Override
    public void inicializarComponentes() {
         productoPanel = new org.edisoncor.gui.panel.Panel();
        submenuProductosPanelSecciones = new org.edisoncor.gui.tabbedPane.TabbedPaneHeader();
       
        agregarSecciones();
    }

    @Override
    public void establecerDisenoComponentes() {
       
        javax.swing.GroupLayout productoPanelLayout = new javax.swing.GroupLayout(productoPanel);
        productoPanel.setLayout(productoPanelLayout);
        productoPanelLayout.setHorizontalGroup(
            productoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productoPanelLayout.createSequentialGroup()
                .addComponent(submenuProductosPanelSecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 1372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        productoPanelLayout.setVerticalGroup(
            productoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submenuProductosPanelSecciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

    private void agregarSecciones() {
        submenuProductosPanelSecciones.addTab("Agregar", new AgregarProductoSubmenuVentana().obtenerPanelContenedor());
        submenuProductosPanelSecciones.addTab("Modificar", new ModificarProductoSubmenuVentana().obtenerPanelContenedor());
        submenuProductosPanelSecciones.addTab("Eliminar", new EliminarProductoSubmenuVentana().obtenerPanelContenedor());
        submenuProductosPanelSecciones.addTab("Populares", new PopularesProductoSubmenuVentana().obtenerPanelContenedor());
    }
    
}
