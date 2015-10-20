package usuario.submenu;

import org.edisoncor.gui.panel.Panel;
import usuario.MenuVentana;

/**
 *
 * @author PIX
 */
public class ConsultaInventarioSubmenuVentana extends MenuVentana{

     private org.edisoncor.gui.textField.TextFieldRectImage articuloInventarioConsultaCampo;
    private org.edisoncor.gui.label.LabelMetric articuloInventarioConsultaLabel;
    private javax.swing.JTable articulosInventarioConsultaTabla;
    private org.edisoncor.gui.button.ButtonAction buscarInventarioConsultaBoton;
    private javax.swing.JScrollPane jScrollPane4;
    private org.edisoncor.gui.label.LabelTask labelTask10;
    private org.edisoncor.gui.panel.Panel panel15;
    private org.edisoncor.gui.panel.PanelRound panelRound9;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return panel15;
    }

    @Override
    public void inicializarComponentes() {
        panel15 = new org.edisoncor.gui.panel.Panel();
        panelRound9 = new org.edisoncor.gui.panel.PanelRound();
        jScrollPane4 = new javax.swing.JScrollPane();
        articulosInventarioConsultaTabla = new javax.swing.JTable();
        articuloInventarioConsultaLabel = new org.edisoncor.gui.label.LabelMetric();
        articuloInventarioConsultaCampo = new org.edisoncor.gui.textField.TextFieldRectImage();
        buscarInventarioConsultaBoton = new org.edisoncor.gui.button.ButtonAction();
        labelTask10 = new org.edisoncor.gui.label.LabelTask();

    }

    @Override
    public void establecerLayoutComponentes() {
        

        articulosInventarioConsultaTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(articulosInventarioConsultaTabla);

        articuloInventarioConsultaLabel.setText("Articulo :");

        articuloInventarioConsultaCampo.setText(" ");

        buscarInventarioConsultaBoton.setText("Buscar");

        javax.swing.GroupLayout panelRound9Layout = new javax.swing.GroupLayout(panelRound9);
        panelRound9.setLayout(panelRound9Layout);
        panelRound9Layout.setHorizontalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound9Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound9Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(articuloInventarioConsultaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(articuloInventarioConsultaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(buscarInventarioConsultaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panelRound9Layout.setVerticalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound9Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarInventarioConsultaBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(articuloInventarioConsultaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(articuloInventarioConsultaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        labelTask10.setBackground(new java.awt.Color(255, 255, 255));
        labelTask10.setForeground(new java.awt.Color(255, 255, 255));
        labelTask10.setText("Productos en el Inventario");

        javax.swing.GroupLayout panel15Layout = new javax.swing.GroupLayout(panel15);
        panel15.setLayout(panel15Layout);
        panel15Layout.setHorizontalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel15Layout.createSequentialGroup()
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel15Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(labelTask10, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel15Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(panelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panel15Layout.setVerticalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel15Layout.createSequentialGroup()
                .addComponent(labelTask10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(panelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }
    
}
