package usuario.submenu;

import org.edisoncor.gui.panel.Panel;
import usuario.MenuVentana;

/**
 *
 * @author PIX
 */
public class ModificarInventarioSubmenuVentana extends MenuVentana{

    private org.edisoncor.gui.button.ButtonAction buscarInventarioModificarBoton;
    private org.edisoncor.gui.button.ButtonAqua cancelarInventarioModificarBoton;
    private org.edisoncor.gui.textField.TextFieldRound cantidadNuevaProductoInventarioModificarCampo;
    private org.edisoncor.gui.label.LabelMetric cantidadNuevaProductoInventarioModificarLabel;
    private org.edisoncor.gui.textField.TextFieldRound codigoProductoInventarioModificarCampo;
    private org.edisoncor.gui.label.LabelRound descripcionProductoInventarioModificarCampo;
    private org.edisoncor.gui.label.LabelMetric descripcionProductoInventarioModificarLabel;
    private org.edisoncor.gui.button.ButtonAqua guardarProductoInventarioModificarBoton;
    private org.edisoncor.gui.label.LabelMetric labelMetric28;
    private org.edisoncor.gui.label.LabelTask labelTask8;
    private org.edisoncor.gui.label.LabelRound nombreProductoInventarioModificarCampo;
    private org.edisoncor.gui.label.LabelMetric nombreProductoInventarioModificarLabel;
    private org.edisoncor.gui.panel.Panel panel13;
    private org.edisoncor.gui.panel.PanelRound panelRound8;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return panel13;
    }

    @Override
    public void inicializarComponentes() {
        panel13 = new org.edisoncor.gui.panel.Panel();
        labelTask8 = new org.edisoncor.gui.label.LabelTask();
        guardarProductoInventarioModificarBoton = new org.edisoncor.gui.button.ButtonAqua();
        cancelarInventarioModificarBoton = new org.edisoncor.gui.button.ButtonAqua();
        panelRound8 = new org.edisoncor.gui.panel.PanelRound();
        labelMetric28 = new org.edisoncor.gui.label.LabelMetric();
        codigoProductoInventarioModificarCampo = new org.edisoncor.gui.textField.TextFieldRound();
        nombreProductoInventarioModificarLabel = new org.edisoncor.gui.label.LabelMetric();
        descripcionProductoInventarioModificarLabel = new org.edisoncor.gui.label.LabelMetric();
        cantidadNuevaProductoInventarioModificarLabel = new org.edisoncor.gui.label.LabelMetric();
        cantidadNuevaProductoInventarioModificarCampo = new org.edisoncor.gui.textField.TextFieldRound();
        buscarInventarioModificarBoton = new org.edisoncor.gui.button.ButtonAction();
        nombreProductoInventarioModificarCampo = new org.edisoncor.gui.label.LabelRound();
        descripcionProductoInventarioModificarCampo = new org.edisoncor.gui.label.LabelRound();

    }

    @Override
    public void establecerLayoutComponentes() {
        

        labelTask8.setForeground(new java.awt.Color(255, 255, 255));
        labelTask8.setText("Modificar en Inventario");

        guardarProductoInventarioModificarBoton.setBackground(new java.awt.Color(0, 204, 102));
        guardarProductoInventarioModificarBoton.setText("Guardar Producto");

        cancelarInventarioModificarBoton.setBackground(new java.awt.Color(255, 0, 51));
        cancelarInventarioModificarBoton.setText("Cancelar");

        labelMetric28.setText("Codigo :");

        nombreProductoInventarioModificarLabel.setText("Nombre :");

        descripcionProductoInventarioModificarLabel.setText("Descripcion :");

        cantidadNuevaProductoInventarioModificarLabel.setText("Cantidad Nueva :");

        buscarInventarioModificarBoton.setText("Buscar");

        nombreProductoInventarioModificarCampo.setText(" ");

        descripcionProductoInventarioModificarCampo.setText(" ");

        javax.swing.GroupLayout panelRound8Layout = new javax.swing.GroupLayout(panelRound8);
        panelRound8.setLayout(panelRound8Layout);
        panelRound8Layout.setHorizontalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound8Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMetric28, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProductoInventarioModificarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcionProductoInventarioModificarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nombreProductoInventarioModificarCampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codigoProductoInventarioModificarCampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(descripcionProductoInventarioModificarCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(buscarInventarioModificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cantidadNuevaProductoInventarioModificarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(cantidadNuevaProductoInventarioModificarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );
        panelRound8Layout.setVerticalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoProductoInventarioModificarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarInventarioModificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreProductoInventarioModificarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProductoInventarioModificarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcionProductoInventarioModificarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcionProductoInventarioModificarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadNuevaProductoInventarioModificarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadNuevaProductoInventarioModificarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout panel13Layout = new javax.swing.GroupLayout(panel13);
        panel13.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addComponent(panelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(labelTask8, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(839, Short.MAX_VALUE))
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addComponent(guardarProductoInventarioModificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarInventarioModificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        panel13Layout.setVerticalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addComponent(labelTask8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(panelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarProductoInventarioModificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarInventarioModificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }
    
}
