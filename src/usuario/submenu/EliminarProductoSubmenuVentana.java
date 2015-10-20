package usuario.submenu;

import org.edisoncor.gui.panel.Panel;
import usuario.MenuVentana;

/**
 *
 * @author PIX
 */
public class EliminarProductoSubmenuVentana extends MenuVentana{

    private org.edisoncor.gui.button.ButtonAction buttonAction7;
    private org.edisoncor.gui.button.ButtonAqua buttonAqua5;
    private org.edisoncor.gui.button.ButtonAqua buttonAqua6;
    private org.edisoncor.gui.label.LabelMetric labelMetric17;
    private org.edisoncor.gui.label.LabelMetric labelMetric18;
    private org.edisoncor.gui.label.LabelMetric labelMetric19;
    private org.edisoncor.gui.label.LabelMetric labelMetric20;
    private org.edisoncor.gui.label.LabelMetric labelMetric21;
    private org.edisoncor.gui.label.LabelMetric labelMetric22;
    private org.edisoncor.gui.label.LabelMetric labelMetric23;
    private org.edisoncor.gui.label.LabelMetric labelMetric24;
    private org.edisoncor.gui.label.LabelRound labelRound3;
    private org.edisoncor.gui.label.LabelRound labelRound4;
    private org.edisoncor.gui.label.LabelRound labelRound5;
    private org.edisoncor.gui.label.LabelRound labelRound6;
    private org.edisoncor.gui.label.LabelRound labelRound7;
    private org.edisoncor.gui.label.LabelRound labelRound8;
    private org.edisoncor.gui.label.LabelRound labelRound9;
    private org.edisoncor.gui.label.LabelTask labelTask6;
    private org.edisoncor.gui.panel.PanelRound panelRound5;
    private org.edisoncor.gui.panel.Panel submenuEliminarPanel;
    private org.edisoncor.gui.textField.TextFieldRound textFieldRound15;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return submenuEliminarPanel;
    }

    @Override
    public void inicializarComponentes() {
        submenuEliminarPanel = new org.edisoncor.gui.panel.Panel();
        labelTask6 = new org.edisoncor.gui.label.LabelTask();
        panelRound5 = new org.edisoncor.gui.panel.PanelRound();
        labelMetric17 = new org.edisoncor.gui.label.LabelMetric();
        textFieldRound15 = new org.edisoncor.gui.textField.TextFieldRound();
        labelMetric18 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric19 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric20 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric21 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric22 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric23 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric24 = new org.edisoncor.gui.label.LabelMetric();
        buttonAction7 = new org.edisoncor.gui.button.ButtonAction();
        labelRound3 = new org.edisoncor.gui.label.LabelRound();
        labelRound4 = new org.edisoncor.gui.label.LabelRound();
        labelRound5 = new org.edisoncor.gui.label.LabelRound();
        labelRound6 = new org.edisoncor.gui.label.LabelRound();
        labelRound7 = new org.edisoncor.gui.label.LabelRound();
        labelRound8 = new org.edisoncor.gui.label.LabelRound();
        labelRound9 = new org.edisoncor.gui.label.LabelRound();
        buttonAqua5 = new org.edisoncor.gui.button.ButtonAqua();
        buttonAqua6 = new org.edisoncor.gui.button.ButtonAqua();
    }

    @Override
    public void establecerLayoutComponentes() {

        labelTask6.setForeground(new java.awt.Color(255, 255, 255));
        labelTask6.setText("Eliminar Producto");

        labelMetric17.setText("Codigo :");

        labelMetric18.setText("Nombre :");

        labelMetric19.setText("Descripcion :");

        labelMetric20.setText("Precio Costo :");

        labelMetric21.setText("Ganancia :");

        labelMetric22.setText("Precio venta : ");

        labelMetric23.setText("Cantidad :");

        labelMetric24.setText("Cantidad Minima :");

        buttonAction7.setText("Buscar");

        labelRound3.setText(" ");

        labelRound4.setText(" ");

        labelRound5.setText(" ");

        labelRound6.setText(" ");

        labelRound7.setText(" ");

        labelRound8.setText(" ");

        labelRound9.setText(" ");

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetric17, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldRound15, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(labelRound4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonAction7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound5Layout.createSequentialGroup()
                                    .addComponent(labelMetric21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(labelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound5Layout.createSequentialGroup()
                                    .addComponent(labelMetric23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRound5Layout.createSequentialGroup()
                                .addComponent(labelMetric20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetric22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldRound15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMetric18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(labelMetric21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(labelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );

        buttonAqua5.setBackground(new java.awt.Color(0, 204, 102));
        buttonAqua5.setText("Eliminar Producto");

        buttonAqua6.setBackground(new java.awt.Color(255, 0, 51));
        buttonAqua6.setText("Cancelar");

        javax.swing.GroupLayout submenuEliminarPanelLayout = new javax.swing.GroupLayout(submenuEliminarPanel);
        submenuEliminarPanel.setLayout(submenuEliminarPanelLayout);
        submenuEliminarPanelLayout.setHorizontalGroup(
            submenuEliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submenuEliminarPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(submenuEliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(submenuEliminarPanelLayout.createSequentialGroup()
                        .addGroup(submenuEliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(submenuEliminarPanelLayout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(labelTask6, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(696, Short.MAX_VALUE))
                    .addGroup(submenuEliminarPanelLayout.createSequentialGroup()
                        .addComponent(buttonAqua5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAqua6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        submenuEliminarPanelLayout.setVerticalGroup(
            submenuEliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submenuEliminarPanelLayout.createSequentialGroup()
                .addComponent(labelTask6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(submenuEliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAqua5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAqua6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }
    
}
