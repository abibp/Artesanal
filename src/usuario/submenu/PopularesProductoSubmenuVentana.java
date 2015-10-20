package usuario.submenu;

import org.edisoncor.gui.panel.Panel;
import usuario.MenuVentana;

/**
 *
 * @author PIX
 */
public class PopularesProductoSubmenuVentana extends MenuVentana{

    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private org.edisoncor.gui.label.LabelTask labelTask3;
    private org.edisoncor.gui.panel.PanelRound panelRound2;
    private org.edisoncor.gui.panel.Panel submenuPopularesPanel;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return submenuPopularesPanel;
    }

    @Override
    public void inicializarComponentes() {
        submenuPopularesPanel = new org.edisoncor.gui.panel.Panel();
        panelRound2 = new org.edisoncor.gui.panel.PanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        labelTask3 = new org.edisoncor.gui.label.LabelTask();

    }

    @Override
    public void establecerLayoutComponentes() {
        

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        labelTask3.setBackground(new java.awt.Color(255, 255, 255));
        labelTask3.setForeground(new java.awt.Color(255, 255, 255));
        labelTask3.setText("Productos Mas Vendidos");

        javax.swing.GroupLayout submenuPopularesPanelLayout = new javax.swing.GroupLayout(submenuPopularesPanel);
        submenuPopularesPanel.setLayout(submenuPopularesPanelLayout);
        submenuPopularesPanelLayout.setHorizontalGroup(
            submenuPopularesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submenuPopularesPanelLayout.createSequentialGroup()
                .addGroup(submenuPopularesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(submenuPopularesPanelLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(labelTask3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(submenuPopularesPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(622, Short.MAX_VALUE))
        );
        submenuPopularesPanelLayout.setVerticalGroup(
            submenuPopularesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submenuPopularesPanelLayout.createSequentialGroup()
                .addComponent(labelTask3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }
    
}
