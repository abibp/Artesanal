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
public class ReservaInventarioSubmenuVentana extends MenuVentana{

    private JScrollPane barraDezplazamientoTabla;
    private LabelTask tituloSubmenu;
    private Panel panelContenedor;
    private PanelRound formularioProductosEnReservaPanel;
    private JTable reservaInventarioReservaTabla;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return panelContenedor;
    }

    @Override
    public void inicializarComponentes() {
         panelContenedor = new org.edisoncor.gui.panel.Panel();
        tituloSubmenu = new org.edisoncor.gui.label.LabelTask();
        formularioProductosEnReservaPanel = new org.edisoncor.gui.panel.PanelRound();
        barraDezplazamientoTabla = new javax.swing.JScrollPane();
        reservaInventarioReservaTabla = new javax.swing.JTable();

    }

    @Override
    public void establecerDisenoComponentes() {
       

        tituloSubmenu.setBackground(new java.awt.Color(255, 255, 255));
        tituloSubmenu.setForeground(new java.awt.Color(255, 255, 255));
        tituloSubmenu.setText("Productos En Cantidad de Reserva");

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
        barraDezplazamientoTabla.setViewportView(reservaInventarioReservaTabla);

        javax.swing.GroupLayout panelRound10Layout = new javax.swing.GroupLayout(formularioProductosEnReservaPanel);
        formularioProductosEnReservaPanel.setLayout(panelRound10Layout);
        panelRound10Layout.setHorizontalGroup(panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound10Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(barraDezplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panelRound10Layout.setVerticalGroup(panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound10Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(barraDezplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout panel16Layout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panel16Layout);
        panel16Layout.setHorizontalGroup(panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel16Layout.createSequentialGroup()
                .addGroup(panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel16Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(formularioProductosEnReservaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel16Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(tituloSubmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(622, Short.MAX_VALUE))
        );
        panel16Layout.setVerticalGroup(panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel16Layout.createSequentialGroup()
                .addComponent(tituloSubmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(formularioProductosEnReservaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }
    
}
