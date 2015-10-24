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
public class AgregarInventarioSubmenuVentana extends MenuVentana{

    private ButtonAqua agregarProductoInventarioAgregarBoton;
    private ButtonAction buscarInventarioAgregarBoton;
    private ButtonAqua cancelarInventarioAgregarBoton;
    private TextFieldRound cantidadProductoInventarioAgregarCampo;
    private LabelMetric cantidadProductoInventarioAgregarLabel;
    private TextFieldRound codigoProductoInventarioAgregarCampo;
    private LabelMetric codigoProductoInventarioAgregarLabel;
    private LabelRound descripcionProductoInventarioAgregarCampo;
    private LabelMetric descripcionProductoInventarioAgregarLabel;
    private LabelTask tituloInstruccionLabel;
    private LabelRound nombreProductoInventarioAgregarCampo;
    private LabelMetric nombreProductoInventarioAgregarLabel;
    private Panel panelContenedor;
    private PanelRound panelAgregarInventario;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return panelContenedor;
    }

    @Override
    public void inicializarComponentes() {
        panelContenedor = new org.edisoncor.gui.panel.Panel();
        panelAgregarInventario = new org.edisoncor.gui.panel.PanelRound();
        codigoProductoInventarioAgregarLabel = new org.edisoncor.gui.label.LabelMetric();
        codigoProductoInventarioAgregarCampo = new org.edisoncor.gui.textField.TextFieldRound();
        nombreProductoInventarioAgregarLabel = new org.edisoncor.gui.label.LabelMetric();
        descripcionProductoInventarioAgregarLabel = new org.edisoncor.gui.label.LabelMetric();
        cantidadProductoInventarioAgregarLabel = new org.edisoncor.gui.label.LabelMetric();
        cantidadProductoInventarioAgregarCampo = new org.edisoncor.gui.textField.TextFieldRound();
        buscarInventarioAgregarBoton = new org.edisoncor.gui.button.ButtonAction();
        nombreProductoInventarioAgregarCampo = new org.edisoncor.gui.label.LabelRound();
        descripcionProductoInventarioAgregarCampo = new org.edisoncor.gui.label.LabelRound();
        tituloInstruccionLabel = new org.edisoncor.gui.label.LabelTask();
        cancelarInventarioAgregarBoton = new org.edisoncor.gui.button.ButtonAqua();
        agregarProductoInventarioAgregarBoton = new org.edisoncor.gui.button.ButtonAqua();

    }

    @Override
    public void establecerLayoutComponentes() {
        

        codigoProductoInventarioAgregarLabel.setText("Codigo :");

        nombreProductoInventarioAgregarLabel.setText("Nombre :");

        descripcionProductoInventarioAgregarLabel.setText("Descripcion :");

        cantidadProductoInventarioAgregarLabel.setText("Cantidad :");

        buscarInventarioAgregarBoton.setText("Buscar");

        nombreProductoInventarioAgregarCampo.setText(" ");

        descripcionProductoInventarioAgregarCampo.setText(" ");

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelAgregarInventario);
        panelAgregarInventario.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoProductoInventarioAgregarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProductoInventarioAgregarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcionProductoInventarioAgregarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nombreProductoInventarioAgregarCampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codigoProductoInventarioAgregarCampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(descripcionProductoInventarioAgregarCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(buscarInventarioAgregarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cantidadProductoInventarioAgregarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(cantidadProductoInventarioAgregarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoProductoInventarioAgregarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoProductoInventarioAgregarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarInventarioAgregarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreProductoInventarioAgregarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProductoInventarioAgregarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcionProductoInventarioAgregarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcionProductoInventarioAgregarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadProductoInventarioAgregarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadProductoInventarioAgregarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        tituloInstruccionLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloInstruccionLabel.setText("Agregar a Inventario");

        cancelarInventarioAgregarBoton.setBackground(new java.awt.Color(255, 0, 51));
        cancelarInventarioAgregarBoton.setText("Cancelar");

        agregarProductoInventarioAgregarBoton.setBackground(new java.awt.Color(0, 204, 102));
        agregarProductoInventarioAgregarBoton.setText("Agregar Cantidad a Inventario");

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel8Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(tituloInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel8Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelAgregarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel8Layout.createSequentialGroup()
                                .addComponent(agregarProductoInventarioAgregarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 802, Short.MAX_VALUE)
                                .addComponent(cancelarInventarioAgregarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
        );
        panel8Layout.setVerticalGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addComponent(tituloInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelAgregarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarProductoInventarioAgregarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarInventarioAgregarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }
    
}
