package usuario.submenu;

import javax.swing.JSpinner;
import org.edisoncor.gui.button.ButtonAction;
import org.edisoncor.gui.button.ButtonAqua;
import org.edisoncor.gui.label.LabelMetric;
import org.edisoncor.gui.label.LabelTask;
import org.edisoncor.gui.panel.Panel;
import org.edisoncor.gui.panel.PanelRound;
import org.edisoncor.gui.textField.TextFieldRound;
import usuario.MenuVentana;

/**
 *
 * @author PIX
 */
public class ModificarProductoSubmenuVentana extends MenuVentana{

    private ButtonAction busquedaProductoProCodigoBoton;
    private ButtonAqua cancelarProductoModificarBoton;
    private LabelMetric codigoProductoModificarInstruccionLabel;
    private LabelMetric descripcionProductoModificarInstruccionLabel;
    private ButtonAqua guardarProductoModificarBoton;
    private LabelTask instruccionModificarProductoLabel;
    private JSpinner gananciaProductoCampoNumerico;
    private LabelMetric precioCostoModificarProductoLabel;
    private LabelMetric gananciaProductoInstruccionLabel;
    private LabelMetric precioVentaModificarProductoLabel;
    private LabelMetric cantidadProductoLabel;
    private LabelMetric cantidadMinimaProductoLabel;
    private PanelRound modificarFormularioPanel;
    private LabelMetric nombreProductoModificarInstruccionLabel;
    private Panel submenuModificarPanel;
    private TextFieldRound descripcionProductoCampo;
    private TextFieldRound precioVentaProductoCampo;
    private TextFieldRound precioCostoProductoCampo;
    private TextFieldRound cantidadMinimaProductoCampo;
    private TextFieldRound cantidadProductoCampo;
    private TextFieldRound codigoProductoCampo;
    private TextFieldRound nombreProductoCampo;
    
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
        codigoProductoCampo = new org.edisoncor.gui.textField.TextFieldRound();
        nombreProductoModificarInstruccionLabel = new org.edisoncor.gui.label.LabelMetric();
        descripcionProductoModificarInstruccionLabel = new org.edisoncor.gui.label.LabelMetric();
        precioCostoModificarProductoLabel = new org.edisoncor.gui.label.LabelMetric();
        gananciaProductoInstruccionLabel = new org.edisoncor.gui.label.LabelMetric();
        precioVentaModificarProductoLabel = new org.edisoncor.gui.label.LabelMetric();
        cantidadProductoLabel = new org.edisoncor.gui.label.LabelMetric();
        cantidadMinimaProductoLabel = new org.edisoncor.gui.label.LabelMetric();
        nombreProductoCampo = new org.edisoncor.gui.textField.TextFieldRound();
        descripcionProductoCampo = new org.edisoncor.gui.textField.TextFieldRound();
        precioVentaProductoCampo = new org.edisoncor.gui.textField.TextFieldRound();
        precioCostoProductoCampo = new org.edisoncor.gui.textField.TextFieldRound();
        cantidadMinimaProductoCampo = new org.edisoncor.gui.textField.TextFieldRound();
        cantidadProductoCampo = new org.edisoncor.gui.textField.TextFieldRound();
        gananciaProductoCampoNumerico = new javax.swing.JSpinner();
        busquedaProductoProCodigoBoton = new org.edisoncor.gui.button.ButtonAction();
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

        precioCostoModificarProductoLabel.setText("Precio Costo :");

        gananciaProductoInstruccionLabel.setText("Ganancia :");

        precioVentaModificarProductoLabel.setText("Precio venta : ");

        cantidadProductoLabel.setText("Cantidad :");

        cantidadMinimaProductoLabel.setText("Cantidad Minima :");

        cantidadMinimaProductoCampo.setText(" ");

        busquedaProductoProCodigoBoton.setText("Buscar");

        javax.swing.GroupLayout modificarFormularioPanelLayout = new javax.swing.GroupLayout(modificarFormularioPanel);
        modificarFormularioPanel.setLayout(modificarFormularioPanelLayout);
        modificarFormularioPanelLayout.setHorizontalGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarFormularioPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modificarFormularioPanelLayout.createSequentialGroup()
                        .addComponent(gananciaProductoInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gananciaProductoCampoNumerico, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(modificarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoProductoModificarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreProductoModificarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcionProductoModificarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(descripcionProductoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(nombreProductoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigoProductoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busquedaProductoProCodigoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(modificarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(modificarFormularioPanelLayout.createSequentialGroup()
                                .addComponent(cantidadProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cantidadProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(modificarFormularioPanelLayout.createSequentialGroup()
                                .addComponent(precioCostoModificarProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioCostoProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioVentaModificarProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadMinimaProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cantidadMinimaProductoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(precioVentaProductoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        modificarFormularioPanelLayout.setVerticalGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarFormularioPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoProductoModificarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busquedaProductoProCodigoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreProductoModificarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioCostoModificarProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioVentaModificarProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioVentaProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioCostoProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gananciaProductoInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gananciaProductoCampoNumerico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descripcionProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcionProductoModificarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(156, 156, 156)))
                .addGroup(modificarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadMinimaProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadMinimaProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
