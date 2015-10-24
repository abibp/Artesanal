package usuario.submenu;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import org.edisoncor.gui.label.LabelTask;
import org.edisoncor.gui.panel.Panel;
import org.edisoncor.gui.panel.PanelRound;
import usuario.MenuVentana;

/**
 *
 * @author PIX
 */
public class PopularesProductoSubmenuVentana extends MenuVentana{

    private JScrollPane barraDezplazamientoTabla;
    private JTable tablaProductos;
    private LabelTask tituloInstruccionLabel;
    private PanelRound panelTablaProductos;
    private Panel submenuPopularesPanel;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return submenuPopularesPanel;
    }

    @Override
    public void inicializarComponentes() {
        submenuPopularesPanel = new org.edisoncor.gui.panel.Panel();
        panelTablaProductos = new org.edisoncor.gui.panel.PanelRound();
        barraDezplazamientoTabla = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        tituloInstruccionLabel = new org.edisoncor.gui.label.LabelTask();

    }

    @Override
    public void establecerLayoutComponentes() {
        

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        barraDezplazamientoTabla.setViewportView(tablaProductos);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelTablaProductos);
        panelTablaProductos.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(barraDezplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(barraDezplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        tituloInstruccionLabel.setBackground(new java.awt.Color(255, 255, 255));
        tituloInstruccionLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloInstruccionLabel.setText("Productos Mas Vendidos");

        javax.swing.GroupLayout submenuPopularesPanelLayout = new javax.swing.GroupLayout(submenuPopularesPanel);
        submenuPopularesPanel.setLayout(submenuPopularesPanelLayout);
        submenuPopularesPanelLayout.setHorizontalGroup(submenuPopularesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submenuPopularesPanelLayout.createSequentialGroup()
                .addGroup(submenuPopularesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(submenuPopularesPanelLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(tituloInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(submenuPopularesPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(panelTablaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(622, Short.MAX_VALUE))
        );
        submenuPopularesPanelLayout.setVerticalGroup(submenuPopularesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submenuPopularesPanelLayout.createSequentialGroup()
                .addComponent(tituloInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(panelTablaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }
    
}
