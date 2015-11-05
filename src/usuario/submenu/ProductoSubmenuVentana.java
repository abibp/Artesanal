package usuario.submenu;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.edisoncor.gui.button.ButtonAqua;
import org.edisoncor.gui.label.LabelMetric;
import org.edisoncor.gui.panel.Panel;
import org.edisoncor.gui.panel.PanelRound;
import javax.swing.GroupLayout;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import org.edisoncor.gui.label.LabelTask;
import org.edisoncor.gui.textField.TextFieldRound;
import usuario.MenuVentana;


public class ProductoSubmenuVentana extends MenuVentana implements ActionListener{

    private PanelRound agregarFormularioPanel;
    private ButtonAqua cancelarProductoBoton;
    private TextFieldRound cantidadMinimaProductoCampo;
    private LabelMetric cantidadMinimaProductoInstruccionLabel;
    private TextFieldRound cantidadProductoCampo;
    private LabelMetric cantidadProductoInstruccionLabel;
    private TextFieldRound codigoProductoCampo;
    private LabelMetric codigoProductoInstruccionLabel;
    private TextFieldRound descripcionProductoCampo;
    private LabelMetric descripcionProductoInstruccionLabel;
    private LabelMetric gananciaProductoInstruccionLabel;
    private JSpinner gananciaProductoSpinner;
    private ButtonAqua guardarProductoBoton;
    private LabelTask instruccionProductoLabel;
    private TextFieldRound nombreProductoCampo;
    private LabelMetric nombreProductoInstruccionLabel;
    private TextFieldRound precioCostoProductoCampo;
    private LabelMetric precioCostoProductoInstruccionLabel;
    private TextFieldRound precioVentaProductoCampo;
    private LabelMetric precioVentaProductoInstruccionLabel;
    private Panel submenuPanel;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return submenuPanel;
    }

    @Override
    public void inicializarComponentes() {
        submenuPanel = new Panel();
        agregarFormularioPanel = new PanelRound();
        codigoProductoInstruccionLabel = new LabelMetric();
        codigoProductoCampo = new TextFieldRound();
        nombreProductoInstruccionLabel = new LabelMetric();
        descripcionProductoInstruccionLabel = new LabelMetric();
        precioCostoProductoInstruccionLabel = new LabelMetric();
        gananciaProductoInstruccionLabel = new LabelMetric();
        precioVentaProductoInstruccionLabel = new LabelMetric();
        cantidadProductoInstruccionLabel = new LabelMetric();
        cantidadMinimaProductoInstruccionLabel = new LabelMetric();
        nombreProductoCampo = new TextFieldRound();
        descripcionProductoCampo = new TextFieldRound();
        precioVentaProductoCampo = new TextFieldRound();
        precioCostoProductoCampo = new TextFieldRound();
        cantidadMinimaProductoCampo = new TextFieldRound();
        cantidadProductoCampo = new TextFieldRound();
        gananciaProductoSpinner = new JSpinner();
        instruccionProductoLabel = new LabelTask();
        cancelarProductoBoton = new ButtonAqua();
        guardarProductoBoton = new ButtonAqua();
    }

    @Override
    public void establecerDisenoComponentes() {
        codigoProductoInstruccionLabel.setText("Codigo :");

        nombreProductoInstruccionLabel.setText("Nombre :");

        descripcionProductoInstruccionLabel.setText("Descripcion :");

        precioCostoProductoInstruccionLabel.setText("Precio Costo :");

        gananciaProductoInstruccionLabel.setText("Ganancia :");

        precioVentaProductoInstruccionLabel.setText("Precio venta : ");

        cantidadProductoInstruccionLabel.setText("Cantidad :");

        cantidadMinimaProductoInstruccionLabel.setText("Cantidad Minima :");

        cantidadMinimaProductoCampo.setText(" ");

        GroupLayout agregarFormularioPanelLayout = new GroupLayout(agregarFormularioPanel);
        agregarFormularioPanel.setLayout(agregarFormularioPanelLayout);
        agregarFormularioPanelLayout.setHorizontalGroup(
            agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                        .addComponent(gananciaProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)

                        .addComponent(gananciaProductoSpinner, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))

                    .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(codigoProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcionProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(descripcionProductoCampo, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(nombreProductoCampo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigoProductoCampo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                                .addComponent(cantidadProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cantidadProductoCampo, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
                            .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                                .addComponent(precioCostoProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioCostoProductoCampo, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(precioVentaProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadMinimaProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(cantidadMinimaProductoCampo, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(precioVentaProductoCampo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        agregarFormularioPanelLayout.setVerticalGroup(
            agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoProductoCampo, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProductoCampo, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, agregarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(precioCostoProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioVentaProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioVentaProductoCampo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioCostoProductoCampo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(gananciaProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(gananciaProductoSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(GroupLayout.Alignment.TRAILING, agregarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(descripcionProductoCampo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcionProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(156, 156, 156)))
                .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadMinimaProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadProductoInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadProductoCampo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadMinimaProductoCampo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );

        instruccionProductoLabel.setForeground(new Color(255, 255, 255));
        instruccionProductoLabel.setText(" Nuevo Producto");

        cancelarProductoBoton.setBackground(new Color(255, 0, 51));
        cancelarProductoBoton.setText("Cancelar");

        guardarProductoBoton.setBackground(new Color(0, 204, 102));
        guardarProductoBoton.setText("Guardar Producto");

        GroupLayout submenuPanelLayout = new GroupLayout(submenuPanel);
        submenuPanel.setLayout(submenuPanelLayout);
        submenuPanelLayout.setHorizontalGroup(
            submenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(submenuPanelLayout.createSequentialGroup()
                .addGroup(submenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(submenuPanelLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(instruccionProductoLabel, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE))
                    .addGroup(submenuPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(submenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(agregarFormularioPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGroup(submenuPanelLayout.createSequentialGroup()
                                .addComponent(guardarProductoBoton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 802, Short.MAX_VALUE)
                                .addComponent(cancelarProductoBoton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
        );
        submenuPanelLayout.setVerticalGroup(
            submenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(submenuPanelLayout.createSequentialGroup()
                .addComponent(instruccionProductoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(agregarFormularioPanel, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(submenuPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarProductoBoton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarProductoBoton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean formularioCompletado = formularioCompletado();
        
    }

    private boolean formularioCompletado() {
        String codigoProduto = codigoProductoCampo.getText();
        String nombreProducto = nombreProductoCampo.getText();
        String descricionProducto = descripcionProductoCampo.getText();
        String precioCosto = precioCostoProductoCampo.getText();
        String precioVenta = precioVentaProductoCampo.getText();
        String cantidad = cantidadProductoCampo.getText();
        String cantidadMinima = cantidadMinimaProductoCampo.getText();
        String ganancia = gananciaProductoSpinner.getValue().toString();
        return false;
    }
    
}
