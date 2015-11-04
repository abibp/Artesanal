package usuario.submenu;

import org.edisoncor.gui.button.ButtonAction;
import org.edisoncor.gui.button.ButtonAqua;
import org.edisoncor.gui.label.LabelMetric;
import org.edisoncor.gui.label.LabelRound;
import org.edisoncor.gui.label.LabelTask;
import org.edisoncor.gui.panel.Panel;
import org.edisoncor.gui.panel.PanelRound;
import org.edisoncor.gui.textField.TextFieldRound;
import usuario.MenuVentana;

/**
 *
 * @author PIX
 */
public class ModificarInventarioSubmenuVentana extends MenuVentana{

    private ButtonAction buscarInventarioModificarBoton;
    private ButtonAqua cancelarInventarioModificarBoton;
    private TextFieldRound cantidadNuevaProductoInventarioModificarCampo;
    private LabelMetric cantidadNuevaProductoInventarioModificarLabel;
    private TextFieldRound codigoProductoInventarioModificarCampo;
    private LabelRound descripcionProductoInventarioModificarCampo;
    private LabelMetric descripcionProductoInventarioModificarLabel;
    private ButtonAqua guardarProductoInventarioModificarBoton;
    private LabelMetric codigoModificarInventarioLabel;
    private LabelTask tituloMenuLabel;
    private LabelRound nombreProductoInventarioModificarCampo;
    private LabelMetric nombreProductoInventarioModificarLabel;
    private Panel panelContenedor;
    private PanelRound formularioModificacionProductoPanel;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return panelContenedor;
    }

    @Override
    public void inicializarComponentes() {
        panelContenedor = new org.edisoncor.gui.panel.Panel();
        tituloMenuLabel = new org.edisoncor.gui.label.LabelTask();
        guardarProductoInventarioModificarBoton = new org.edisoncor.gui.button.ButtonAqua();
        cancelarInventarioModificarBoton = new org.edisoncor.gui.button.ButtonAqua();
        formularioModificacionProductoPanel = new org.edisoncor.gui.panel.PanelRound();
        codigoModificarInventarioLabel = new org.edisoncor.gui.label.LabelMetric();
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
    public void establecerDisenoComponentes() {
        

        tituloMenuLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloMenuLabel.setText("Modificar en Inventario");

        guardarProductoInventarioModificarBoton.setBackground(new java.awt.Color(0, 204, 102));
        guardarProductoInventarioModificarBoton.setText("Guardar Producto");

        cancelarInventarioModificarBoton.setBackground(new java.awt.Color(255, 0, 51));
        cancelarInventarioModificarBoton.setText("Cancelar");

        codigoModificarInventarioLabel.setText("Codigo :");

        nombreProductoInventarioModificarLabel.setText("Nombre :");

        descripcionProductoInventarioModificarLabel.setText("Descripcion :");

        cantidadNuevaProductoInventarioModificarLabel.setText("Cantidad Nueva :");

        buscarInventarioModificarBoton.setText("Buscar");

        nombreProductoInventarioModificarCampo.setText(" ");

        descripcionProductoInventarioModificarCampo.setText(" ");

        javax.swing.GroupLayout panelRound8Layout = new javax.swing.GroupLayout(formularioModificacionProductoPanel);
        formularioModificacionProductoPanel.setLayout(panelRound8Layout);
        panelRound8Layout.setHorizontalGroup(panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound8Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoModificarInventarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        panelRound8Layout.setVerticalGroup(panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoModificarInventarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout panel13Layout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addComponent(formularioModificacionProductoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(tituloMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(839, Short.MAX_VALUE))
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addComponent(guardarProductoInventarioModificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarInventarioModificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        panel13Layout.setVerticalGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addComponent(tituloMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(formularioModificacionProductoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarProductoInventarioModificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarInventarioModificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }
    
}
