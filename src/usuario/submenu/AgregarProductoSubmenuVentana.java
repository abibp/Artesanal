package usuario.submenu;


import java.awt.Color;
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

/**
 *
 * @author PIX
 */
public class AgregarProductoSubmenuVentana extends MenuVentana{

    private PanelRound agregarFormularioPanel;
    private ButtonAqua cancelarProductoAgregarBoton;
    private TextFieldRound cantidadMinimaProductoAgregarCampo;
    private LabelMetric cantidadMinimaProductoAgregarInstruccionLabel;
    private TextFieldRound cantidadProductoAgregarCampo;
    private LabelMetric cantidadProductoAgregarInstruccionLabel;
    private TextFieldRound codigoProductoAgregarCampo;
    private LabelMetric codigoProductoAgregarInstruccionLabel;
    private TextFieldRound descripcionProductoAgregarCampo;
    private LabelMetric descripcionProductoAgregarInstruccionLabel;
    private LabelMetric gananciaProductoAgregarInstruccionLabel;
    private JSpinner gananciaProductoAgregarSpinner;
    private ButtonAqua guardarProductoAgregarBoton;
    private LabelTask instruccionAgregarProductoLabel;
    private TextFieldRound nombreProductoAgregarCampo;
    private LabelMetric nombreProductoAgregarInstruccionLabel;
    private TextFieldRound precioCostoProductoAgregarBoton;
    private LabelMetric precioCostoProductoAgregarInstruccionLabel;
    private TextFieldRound precioVentaProductoAgregarCampo;
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
        codigoProductoAgregarCampo = new TextFieldRound();
        nombreProductoAgregarInstruccionLabel = new LabelMetric();
        descripcionProductoAgregarInstruccionLabel = new LabelMetric();
        precioCostoProductoAgregarInstruccionLabel = new LabelMetric();
        gananciaProductoAgregarInstruccionLabel = new LabelMetric();
        precioVentaProductoAgregarInstruccionLabel = new LabelMetric();
        cantidadProductoAgregarInstruccionLabel = new LabelMetric();
        cantidadMinimaProductoAgregarInstruccionLabel = new LabelMetric();
        nombreProductoAgregarCampo = new TextFieldRound();
        descripcionProductoAgregarCampo = new TextFieldRound();
        precioVentaProductoAgregarCampo = new TextFieldRound();
        precioCostoProductoAgregarBoton = new TextFieldRound();
        cantidadMinimaProductoAgregarCampo = new TextFieldRound();
        cantidadProductoAgregarCampo = new TextFieldRound();
        gananciaProductoAgregarSpinner = new JSpinner();
        instruccionAgregarProductoLabel = new LabelTask();
        cancelarProductoAgregarBoton = new ButtonAqua();
        guardarProductoAgregarBoton = new ButtonAqua();
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

        cantidadMinimaProductoAgregarCampo.setText(" ");

        GroupLayout agregarFormularioPanelLayout = new GroupLayout(agregarFormularioPanel);
        agregarFormularioPanel.setLayout(agregarFormularioPanelLayout);
        agregarFormularioPanelLayout.setHorizontalGroup(
            agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                        .addComponent(gananciaProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gananciaProductoAgregarSpinner, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                    .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(codigoProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcionProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(descripcionProductoAgregarCampo, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(nombreProductoAgregarCampo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigoProductoAgregarCampo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                                .addComponent(cantidadProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cantidadProductoAgregarCampo, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
                            .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                                .addComponent(precioCostoProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioCostoProductoAgregarBoton, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(precioVentaProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadMinimaProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(cantidadMinimaProductoAgregarCampo, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(precioVentaProductoAgregarCampo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        agregarFormularioPanelLayout.setVerticalGroup(
            agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(agregarFormularioPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoProductoAgregarCampo, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProductoAgregarCampo, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, agregarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(precioCostoProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioVentaProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioVentaProductoAgregarCampo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioCostoProductoAgregarBoton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(gananciaProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(gananciaProductoAgregarSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(GroupLayout.Alignment.TRAILING, agregarFormularioPanelLayout.createSequentialGroup()
                        .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(descripcionProductoAgregarCampo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcionProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(156, 156, 156)))
                .addGroup(agregarFormularioPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadMinimaProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadProductoAgregarInstruccionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadProductoAgregarCampo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadMinimaProductoAgregarCampo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );

        instruccionAgregarProductoLabel.setForeground(new Color(255, 255, 255));
        instruccionAgregarProductoLabel.setText("Agregar Nuevo Producto");

        cancelarProductoAgregarBoton.setBackground(new Color(255, 0, 51));
        cancelarProductoAgregarBoton.setText("Cancelar");

        guardarProductoAgregarBoton.setBackground(new Color(0, 204, 102));
        guardarProductoAgregarBoton.setText("Guardar Producto");

        GroupLayout submenuAgregarPanelLayout = new GroupLayout(submenuAgregarPanel);
        submenuAgregarPanel.setLayout(submenuAgregarPanelLayout);
        submenuAgregarPanelLayout.setHorizontalGroup(
            submenuAgregarPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(submenuAgregarPanelLayout.createSequentialGroup()
                .addGroup(submenuAgregarPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(submenuAgregarPanelLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(instruccionAgregarProductoLabel, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE))
                    .addGroup(submenuAgregarPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(submenuAgregarPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(agregarFormularioPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGroup(submenuAgregarPanelLayout.createSequentialGroup()
                                .addComponent(guardarProductoAgregarBoton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 802, Short.MAX_VALUE)
                                .addComponent(cancelarProductoAgregarBoton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
        );
        submenuAgregarPanelLayout.setVerticalGroup(
            submenuAgregarPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(submenuAgregarPanelLayout.createSequentialGroup()
                .addComponent(instruccionAgregarProductoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(agregarFormularioPanel, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(submenuAgregarPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarProductoAgregarBoton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarProductoAgregarBoton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }
    
}
