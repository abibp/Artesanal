package usuario.submenu;

import org.edisoncor.gui.panel.Panel;
import usuario.MenuVentana;

/**
 *
 * @author PIX
 */
public class ModificarProductoSubmenuVentana extends MenuVentana{

    private org.edisoncor.gui.button.ButtonAction buttonAction6;
    private org.edisoncor.gui.button.ButtonAqua cancelarProductoModificarBoton;
    private org.edisoncor.gui.label.LabelMetric codigoProductoModificarInstruccionLabel;
    private org.edisoncor.gui.label.LabelMetric descripcionProductoModificarInstruccionLabel;
    private org.edisoncor.gui.button.ButtonAqua guardarProductoModificarBoton;
    private org.edisoncor.gui.label.LabelTask instruccionModificarProductoLabel;
    private javax.swing.JSpinner jSpinner3;
    private org.edisoncor.gui.label.LabelMetric labelMetric12;
    private org.edisoncor.gui.label.LabelMetric labelMetric13;
    private org.edisoncor.gui.label.LabelMetric labelMetric14;
    private org.edisoncor.gui.label.LabelMetric labelMetric15;
    private org.edisoncor.gui.label.LabelMetric labelMetric16;
    private org.edisoncor.gui.panel.PanelRound modificarFormularioPanel;
    private org.edisoncor.gui.label.LabelMetric nombreProductoModificarInstruccionLabel;
    private org.edisoncor.gui.panel.Panel submenuModificarPanel;
    private org.edisoncor.gui.textField.TextFieldRound textFieldRound10;
    private org.edisoncor.gui.textField.TextFieldRound textFieldRound11;
    private org.edisoncor.gui.textField.TextFieldRound textFieldRound12;
    private org.edisoncor.gui.textField.TextFieldRound textFieldRound13;
    private org.edisoncor.gui.textField.TextFieldRound textFieldRound14;
    private org.edisoncor.gui.textField.TextFieldRound textFieldRound8;
    private org.edisoncor.gui.textField.TextFieldRound textFieldRound9;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return submenuModificarPanel;
    }

    @Override
    public void inicializarComponentes() {
        submenuModificarPanel = new org.edisoncor.gui.panel.Panel();
        instruccionModificarProductoLabel = new org.edisoncor.gui.label.LabelTask();
        modificarFormularioPanel = new org.edisoncor.gui.panel.PanelRound();
        codigoProductoModificarInstruccionLabel = new org.edisoncor.gui.label.LabelMetric();
        textFieldRound8 = new org.edisoncor.gui.textField.TextFieldRound();
        nombreProductoModificarInstruccionLabel = new org.edisoncor.gui.label.LabelMetric();
        descripcionProductoModificarInstruccionLabel = new org.edisoncor.gui.label.LabelMetric();
        labelMetric12 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric13 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric14 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric15 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric16 = new org.edisoncor.gui.label.LabelMetric();
        textFieldRound9 = new org.edisoncor.gui.textField.TextFieldRound();
        textFieldRound10 = new org.edisoncor.gui.textField.TextFieldRound();
        textFieldRound11 = new org.edisoncor.gui.textField.TextFieldRound();
        textFieldRound12 = new org.edisoncor.gui.textField.TextFieldRound();
        textFieldRound13 = new org.edisoncor.gui.textField.TextFieldRound();
        textFieldRound14 = new org.edisoncor.gui.textField.TextFieldRound();
        jSpinner3 = new javax.swing.JSpinner();
        buttonAction6 = new org.edisoncor.gui.button.ButtonAction();
        guardarProductoModificarBoton = new org.edisoncor.gui.button.ButtonAqua();
        cancelarProductoModificarBoton = new org.edisoncor.gui.button.ButtonAqua();
    }

    @Override
    public void establecerLayoutComponentes() {
        instruccionModificarProductoLabel.setForeground(new java.awt.Color(255, 255, 255));
        instruccionModificarProductoLabel.setText("Modificar Producto");

        codigoProductoModificarInstruccionLabel.setText("Codigo :");

        nombreProductoModificarInstruccionLabel.setText("Nombre :");

        descripcionProductoModificarInstruccionLabel.setText("Descripcion :");

        labelMetric12.setText("Precio Costo :");

        labelMetric13.setText("Ganancia :");

        labelMetric14.setText("Precio venta : ");

        labelMetric15.setText("Cantidad :");

        labelMetric16.setText("Cantidad Minima :");

        textFieldRound13.setText(" ");

        buttonAction6.setText("Buscar");

        javax.swing.GroupLayout modificarFormularioPanelLayout = new javax.swing.GroupLayout(modificarFormularioPanel);
        modificarFormularioPanel.setLayout(modificarFormularioPanelLayout);
        modificarFormularioPanelLayout.setHorizontalGroup(
            modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarFormularioPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modificarFormularioPanelLayout.createSequentialGroup()
                        .addComponent(labelMetric13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(modificarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoProductoModificarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreProductoModificarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcionProductoModificarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldRound10, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(textFieldRound9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldRound8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAction6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(modificarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(modificarFormularioPanelLayout.createSequentialGroup()
                                .addComponent(labelMetric15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textFieldRound14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(modificarFormularioPanelLayout.createSequentialGroup()
                                .addComponent(labelMetric12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldRound12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetric14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldRound13, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(textFieldRound11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        modificarFormularioPanelLayout.setVerticalGroup(
            modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarFormularioPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoProductoModificarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldRound8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreProductoModificarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldRound9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldRound11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldRound12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldRound10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcionProductoModificarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(156, 156, 156)))
                .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldRound14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldRound13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );

        guardarProductoModificarBoton.setBackground(new java.awt.Color(0, 204, 102));
        guardarProductoModificarBoton.setText("Guardar Producto");

        cancelarProductoModificarBoton.setBackground(new java.awt.Color(255, 0, 51));
        cancelarProductoModificarBoton.setText("Cancelar");

        javax.swing.GroupLayout submenuModificarPanelLayout = new javax.swing.GroupLayout(submenuModificarPanel);
        submenuModificarPanel.setLayout(submenuModificarPanelLayout);
        submenuModificarPanelLayout.setHorizontalGroup(
            submenuModificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submenuModificarPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(submenuModificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(submenuModificarPanelLayout.createSequentialGroup()
                        .addGroup(submenuModificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modificarFormularioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(submenuModificarPanelLayout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(instruccionModificarProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(696, Short.MAX_VALUE))
                    .addGroup(submenuModificarPanelLayout.createSequentialGroup()
                        .addComponent(guardarProductoModificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarProductoModificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        submenuModificarPanelLayout.setVerticalGroup(
            submenuModificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submenuModificarPanelLayout.createSequentialGroup()
                .addComponent(instruccionModificarProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(modificarFormularioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(submenuModificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarProductoModificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarProductoModificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }
    
}
