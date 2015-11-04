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
public class EliminarProductoSubmenuVentana extends MenuVentana{

    private ButtonAction busquedaProductoPorCodigoBoton;
    private ButtonAqua confirmarBajaProductoBoton;
    private ButtonAqua cancelarBajaProductoBoton;
    private LabelMetric codigoEliminarProductoInstruccion;
    private LabelMetric nombreEliminarProductoInstruccion;
    private LabelMetric descripcionEliminarProductoInstruccion;
    private LabelMetric precioCostoEliminarProductoInstruccion;
    private LabelMetric gananciaEliminarProductoInstruccion;
    private LabelMetric precioVentaEliminarProductoInstruccion;
    private LabelMetric cantidadEliminarProductoInstruccion;
    private LabelMetric cantidadMinimaEliminarProductoInstruccion;
    private LabelRound nombreElimnarLabelResultado;
    private LabelRound descripcionElimnarLabelResultado;
    private LabelRound gananciaElimnarLabelResultado;
    private LabelRound precioCostoElimnarLabelResultado;
    private LabelRound precioVentaElimnarLabelResultado;
    private LabelRound cantidadMinimaElimnarLabelResultado;
    private LabelRound cantidadElimnarLabelResultado;
    private LabelTask instruccionEliminarProductoLabel;
    private PanelRound eliminarFormularioPanel;
    private Panel submenuEliminarPanel;
    private TextFieldRound codigoEliminarCampo;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return submenuEliminarPanel;
    }

    @Override
    public void inicializarComponentes() {
        submenuEliminarPanel = new org.edisoncor.gui.panel.Panel();
        instruccionEliminarProductoLabel = new org.edisoncor.gui.label.LabelTask();
        eliminarFormularioPanel = new org.edisoncor.gui.panel.PanelRound();
        codigoEliminarProductoInstruccion = new org.edisoncor.gui.label.LabelMetric();
        codigoEliminarCampo = new org.edisoncor.gui.textField.TextFieldRound();
        nombreEliminarProductoInstruccion = new org.edisoncor.gui.label.LabelMetric();
        descripcionEliminarProductoInstruccion = new org.edisoncor.gui.label.LabelMetric();
        precioCostoEliminarProductoInstruccion = new org.edisoncor.gui.label.LabelMetric();
        gananciaEliminarProductoInstruccion = new org.edisoncor.gui.label.LabelMetric();
        precioVentaEliminarProductoInstruccion = new org.edisoncor.gui.label.LabelMetric();
        cantidadEliminarProductoInstruccion = new org.edisoncor.gui.label.LabelMetric();
        cantidadMinimaEliminarProductoInstruccion = new org.edisoncor.gui.label.LabelMetric();
        busquedaProductoPorCodigoBoton = new org.edisoncor.gui.button.ButtonAction();
        nombreElimnarLabelResultado = new org.edisoncor.gui.label.LabelRound();
        descripcionElimnarLabelResultado = new org.edisoncor.gui.label.LabelRound();
        gananciaElimnarLabelResultado = new org.edisoncor.gui.label.LabelRound();
        precioCostoElimnarLabelResultado = new org.edisoncor.gui.label.LabelRound();
        precioVentaElimnarLabelResultado = new org.edisoncor.gui.label.LabelRound();
        cantidadMinimaElimnarLabelResultado = new org.edisoncor.gui.label.LabelRound();
        cantidadElimnarLabelResultado = new org.edisoncor.gui.label.LabelRound();
        confirmarBajaProductoBoton = new org.edisoncor.gui.button.ButtonAqua();
        cancelarBajaProductoBoton = new org.edisoncor.gui.button.ButtonAqua();
    }

    @Override
    public void establecerDisenoComponentes() {

        instruccionEliminarProductoLabel.setForeground(new java.awt.Color(255, 255, 255));
        instruccionEliminarProductoLabel.setText("Eliminar Producto");

        codigoEliminarProductoInstruccion.setText("Codigo :");

        nombreEliminarProductoInstruccion.setText("Nombre :");

        descripcionEliminarProductoInstruccion.setText("Descripcion :");

        precioCostoEliminarProductoInstruccion.setText("Precio Costo :");

        gananciaEliminarProductoInstruccion.setText("Ganancia :");

        precioVentaEliminarProductoInstruccion.setText("Precio venta : ");

        cantidadEliminarProductoInstruccion.setText("Cantidad :");

        cantidadMinimaEliminarProductoInstruccion.setText("Cantidad Minima :");

        busquedaProductoPorCodigoBoton.setText("Buscar");

        nombreElimnarLabelResultado.setText(" ");

        descripcionElimnarLabelResultado.setText(" ");

        gananciaElimnarLabelResultado.setText(" ");

        precioCostoElimnarLabelResultado.setText(" ");

        precioVentaElimnarLabelResultado.setText(" ");

        cantidadMinimaElimnarLabelResultado.setText(" ");

        cantidadElimnarLabelResultado.setText(" ");

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(eliminarFormularioPanel);
        eliminarFormularioPanel.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcionEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreElimnarLabelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigoEliminarCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(descripcionElimnarLabelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(busquedaProductoPorCodigoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound5Layout.createSequentialGroup()
                                    .addComponent(gananciaEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(gananciaElimnarLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound5Layout.createSequentialGroup()
                                    .addComponent(cantidadEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cantidadElimnarLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRound5Layout.createSequentialGroup()
                                .addComponent(precioCostoEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioCostoElimnarLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioVentaEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadMinimaEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioVentaElimnarLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadMinimaElimnarLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelRound5Layout.setVerticalGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoEliminarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busquedaProductoPorCodigoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreElimnarLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcionElimnarLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcionEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioCostoEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioVentaEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioCostoElimnarLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioVentaElimnarLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound5Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(gananciaEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(gananciaElimnarLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadMinimaEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadEliminarProductoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadMinimaElimnarLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadElimnarLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );

        confirmarBajaProductoBoton.setBackground(new java.awt.Color(0, 204, 102));
        confirmarBajaProductoBoton.setText("Eliminar Producto");

        cancelarBajaProductoBoton.setBackground(new java.awt.Color(255, 0, 51));
        cancelarBajaProductoBoton.setText("Cancelar");

        javax.swing.GroupLayout submenuEliminarPanelLayout = new javax.swing.GroupLayout(submenuEliminarPanel);
        submenuEliminarPanel.setLayout(submenuEliminarPanelLayout);
        submenuEliminarPanelLayout.setHorizontalGroup(submenuEliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submenuEliminarPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(submenuEliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(submenuEliminarPanelLayout.createSequentialGroup()
                        .addGroup(submenuEliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminarFormularioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(submenuEliminarPanelLayout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(instruccionEliminarProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(696, Short.MAX_VALUE))
                    .addGroup(submenuEliminarPanelLayout.createSequentialGroup()
                        .addComponent(confirmarBajaProductoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarBajaProductoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        submenuEliminarPanelLayout.setVerticalGroup(submenuEliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submenuEliminarPanelLayout.createSequentialGroup()
                .addComponent(instruccionEliminarProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(eliminarFormularioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(submenuEliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarBajaProductoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBajaProductoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }
    
}
