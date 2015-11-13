package usuario.submenu;

import datos.GestorBDProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSpinner;
import negocio.entidades.ProductoVenta;
import negocio.gestion.GestorProducto;
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
public class AgregarProductoSubmenuVentana extends MenuVentana implements ActionListener {

    private PanelRound agregarFormularioPanel;
    private ButtonAqua cancelarProductoAgregarBoton;
    private TextFieldRound cantidadMinimaProductoCampo;
    private LabelMetric cantidadMinimaProductoAgregarInstruccionLabel;
    private TextFieldRound cantidadProductoCampo;
    private LabelMetric cantidadProductoAgregarInstruccionLabel;
    private TextFieldRound codigoProductoCampo;
    private LabelMetric codigoProductoAgregarInstruccionLabel;
    private TextFieldRound descripcionProductoCampo;
    private LabelMetric descripcionProductoAgregarInstruccionLabel;
    private LabelMetric gananciaProductoAgregarInstruccionLabel;
    private JSpinner gananciaProductoSpinner;
    private ButtonAqua guardarProductoAgregarBoton;
    private LabelTask instruccionAgregarProductoLabel;
    private TextFieldRound nombreProductoCampo;
    private LabelMetric nombreProductoAgregarInstruccionLabel;
    private TextFieldRound precioCostoCampo;
    private LabelMetric precioCostoProductoAgregarInstruccionLabel;
    private TextFieldRound precioVentaProductoCampo;
    private LabelMetric precioVentaProductoAgregarInstruccionLabel;
    private Panel submenuAgregarPanel;

    @Override
    public Panel obtenerPanelContenedor() {
        return submenuAgregarPanel;
    }

    @Override
    public void inicializarComponentes() {
        submenuAgregarPanel = new Panel();
        agregarFormularioPanel = new PanelRound();
        codigoProductoAgregarInstruccionLabel = new LabelMetric();
        codigoProductoCampo = new org.edisoncor.gui.textField.TextFieldRound();
        nombreProductoAgregarInstruccionLabel = new org.edisoncor.gui.label.LabelMetric();
        descripcionProductoAgregarInstruccionLabel = new org.edisoncor.gui.label.LabelMetric();
        precioCostoProductoAgregarInstruccionLabel = new org.edisoncor.gui.label.LabelMetric();
        gananciaProductoAgregarInstruccionLabel = new org.edisoncor.gui.label.LabelMetric();
        precioVentaProductoAgregarInstruccionLabel = new org.edisoncor.gui.label.LabelMetric();
        cantidadProductoAgregarInstruccionLabel = new org.edisoncor.gui.label.LabelMetric();
        cantidadMinimaProductoAgregarInstruccionLabel = new org.edisoncor.gui.label.LabelMetric();
        nombreProductoCampo = new org.edisoncor.gui.textField.TextFieldRound();
        descripcionProductoCampo = new org.edisoncor.gui.textField.TextFieldRound();
        precioVentaProductoCampo = new org.edisoncor.gui.textField.TextFieldRound();
        precioCostoCampo = new org.edisoncor.gui.textField.TextFieldRound();
        cantidadMinimaProductoCampo = new org.edisoncor.gui.textField.TextFieldRound();
        cantidadProductoCampo = new org.edisoncor.gui.textField.TextFieldRound();
        gananciaProductoSpinner = new javax.swing.JSpinner();
        instruccionAgregarProductoLabel = new org.edisoncor.gui.label.LabelTask();
        cancelarProductoAgregarBoton = new org.edisoncor.gui.button.ButtonAqua();
        guardarProductoAgregarBoton = new org.edisoncor.gui.button.ButtonAqua();
    }

    @Override
    public void establecerDisenoComponentes() {
        codigoProductoAgregarInstruccionLabel.setText("Codigo :");

        nombreProductoAgregarInstruccionLabel.setText("Nombre :");

        descripcionProductoAgregarInstruccionLabel.setText("Descripcion :");

        precioCostoProductoAgregarInstruccionLabel.setText("Precio Costo :");

        gananciaProductoAgregarInstruccionLabel.setText("Ganancia :");

        precioVentaProductoAgregarInstruccionLabel.setText("Precio venta : ");

        cantidadProductoAgregarInstruccionLabel.setText("Cantidad :");

        cantidadMinimaProductoAgregarInstruccionLabel.setText("Cantidad Minima :");

        cantidadMinimaProductoCampo.setText(" ");

        javax.swing.GroupLayout agregarFormularioPanelLayout = new javax.swing.GroupLayout(agregarFormularioPanel);
        agregarFormularioPanel.setLayout(agregarFormularioPanelLayout);
        agregarFormularioPanelLayout.setHorizontalGroup(agregarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                                        .addComponent(gananciaProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(gananciaProductoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(codigoProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(nombreProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(descripcionProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(55, 55, 55)
                                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(descripcionProductoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                                .addComponent(nombreProductoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(codigoProductoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                                                        .addComponent(cantidadProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cantidadProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                                                        .addComponent(precioCostoProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(precioCostoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(41, 41, 41)
                                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(precioVentaProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cantidadMinimaProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cantidadMinimaProductoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                                .addComponent(precioVentaProductoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(75, Short.MAX_VALUE))
        );
        agregarFormularioPanelLayout.setVerticalGroup(agregarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(codigoProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(codigoProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nombreProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombreProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarFormularioPanelLayout.createSequentialGroup()
                                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(precioCostoProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(precioVentaProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(precioVentaProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(precioCostoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(gananciaProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(gananciaProductoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarFormularioPanelLayout.createSequentialGroup()
                                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(descripcionProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(descripcionProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(156, 156, 156)))
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cantidadMinimaProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cantidadProductoAgregarInstruccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cantidadProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cantidadMinimaProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106))
        );

        instruccionAgregarProductoLabel.setForeground(new java.awt.Color(255, 255, 255));
        instruccionAgregarProductoLabel.setText("Agregar Nuevo Producto");

        cancelarProductoAgregarBoton.setBackground(new java.awt.Color(255, 0, 51));
        cancelarProductoAgregarBoton.setText("Cancelar");

        guardarProductoAgregarBoton.setBackground(new java.awt.Color(0, 204, 102));
        guardarProductoAgregarBoton.setText("Guardar Producto");

        javax.swing.GroupLayout submenuAgregarPanelLayout = new javax.swing.GroupLayout(submenuAgregarPanel);
        submenuAgregarPanel.setLayout(submenuAgregarPanelLayout);
        submenuAgregarPanelLayout.setHorizontalGroup(
                submenuAgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(submenuAgregarPanelLayout.createSequentialGroup()
                        .addGroup(submenuAgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(submenuAgregarPanelLayout.createSequentialGroup()
                                        .addGap(216, 216, 216)
                                        .addComponent(instruccionAgregarProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(submenuAgregarPanelLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(submenuAgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(agregarFormularioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(submenuAgregarPanelLayout.createSequentialGroup()
                                                        .addComponent(guardarProductoAgregarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 802, Short.MAX_VALUE)
                                                        .addComponent(cancelarProductoAgregarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(24, 24, 24))
        );
        submenuAgregarPanelLayout.setVerticalGroup(
                submenuAgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(submenuAgregarPanelLayout.createSequentialGroup()
                        .addComponent(instruccionAgregarProductoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(agregarFormularioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(submenuAgregarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(guardarProductoAgregarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancelarProductoAgregarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
        );
        
        guardarProductoAgregarBoton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean formularioCompletado = formularioCompletado();
        if (formularioCompletado) {
            String codigoProduto = codigoProductoCampo.getText();
            String nombreProducto = nombreProductoCampo.getText();
            String descricionProducto = descripcionProductoCampo.getText();
            String precioCosto = precioCostoCampo.getText();
            String precioVenta = precioVentaProductoCampo.getText();
            String cantidad = cantidadProductoCampo.getText();
            String cantidadMinima = cantidadMinimaProductoCampo.getText();
            String ganancia = gananciaProductoSpinner.getValue().toString();
            
            ProductoVenta productoVenta = new ProductoVenta(
                    codigoProduto, 
                    nombreProducto, 
                    Double.parseDouble(cantidadMinima), 
                    Double.parseDouble(precioVenta), 
                    Double.parseDouble(ganancia), 
                    Double.parseDouble(precioCosto));
            
            GestorProducto gestor = GestorProducto.obtenerInstancia();
            gestor.agregarProducto(productoVenta);
        }

    }

    private boolean formularioCompletado() {
        return true;
    }

}
