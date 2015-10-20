package usuario.submenu;

import org.edisoncor.gui.panel.Panel;
import usuario.MenuVentana;

/**
 *
 * @author PIX
 */
public class ReservaInventarioSubmenuVentana extends MenuVentana{

    private javax.swing.JScrollPane jScrollPane5;
    private org.edisoncor.gui.label.LabelTask labelTask11;
    private org.edisoncor.gui.panel.Panel panel16;
    private org.edisoncor.gui.panel.PanelRound panelRound10;
    private javax.swing.JTable reservaInventarioReservaTabla;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return panel16;
    }

    @Override
    public void inicializarComponentes() {
         panel16 = new org.edisoncor.gui.panel.Panel();
        labelTask11 = new org.edisoncor.gui.label.LabelTask();
        panelRound10 = new org.edisoncor.gui.panel.PanelRound();
        jScrollPane5 = new javax.swing.JScrollPane();
        reservaInventarioReservaTabla = new javax.swing.JTable();

    }

    @Override
    public void establecerLayoutComponentes() {
       

        labelTask11.setBackground(new java.awt.Color(255, 255, 255));
        labelTask11.setForeground(new java.awt.Color(255, 255, 255));
        labelTask11.setText("Productos En Cantidad de Reserva");

        reservaInventarioReservaTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(reservaInventarioReservaTabla);

        javax.swing.GroupLayout panelRound10Layout = new javax.swing.GroupLayout(panelRound10);
        panelRound10.setLayout(panelRound10Layout);
        panelRound10Layout.setHorizontalGroup(
            panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound10Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panelRound10Layout.setVerticalGroup(
            panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound10Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout panel16Layout = new javax.swing.GroupLayout(panel16);
        panel16.setLayout(panel16Layout);
        panel16Layout.setHorizontalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel16Layout.createSequentialGroup()
                .addGroup(panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel16Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel16Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(labelTask11, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(622, Short.MAX_VALUE))
        );
        panel16Layout.setVerticalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel16Layout.createSequentialGroup()
                .addComponent(labelTask11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }
    
}
