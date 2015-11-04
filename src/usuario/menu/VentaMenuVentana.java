package usuario.menu;

import java.awt.Color;
import java.awt.Font;
import javax.swing.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.edisoncor.gui.button.ButtonAction;
import org.edisoncor.gui.button.ButtonSeven;
import org.edisoncor.gui.label.LabelMetric;
import org.edisoncor.gui.label.LabelRect;
import org.edisoncor.gui.label.LabelRound;
import org.edisoncor.gui.label.LabelTask;
import org.edisoncor.gui.panel.Panel;
import usuario.MenuVentana;

/**
 *
 * @author PIX
 */
public class VentaMenuVentana extends MenuVentana{

    private ButtonAction agregarEfectivoBoton;
    private ButtonSeven agregarProductoVentaBoton;
    private ButtonAction buscarProductoVentaBoton;
    private JLabel cambioVentaLabel;
    private JSpinner cantidadVentaSpinner;
    private ButtonAction cobrarImporteVentaBoton;
    private JTextField codigoVentaCampo;
    private LabelTask instruccionAgregarProductoVentaLabel;
    private LabelRect instruccionCambioVentaLabel;
    private LabelMetric instruccionCantidadVentaLabel;
    private LabelMetric instruccionCodigoProductoVentaLabel;
    private LabelRect instruccionPagoVentaLabel;
    private LabelMetric instruccionTotalImporteVentaLabel;
    private LabelRect instruccionTotalVentaLabel;
    private JLabel pagoConVentaLabel;
    private JTable productosEnVentaTabla;
    private JScrollPane productosEnVentaTablaBarraDesplazamiento;
    private ButtonAction quitarEfectivoBoton;
    private LabelRound simboloPesoLabel;
    private LabelRound totalImporteVentaLabel;
    private JLabel totalVentalLabel;
    private Panel ventaPanel;

    @Override
    public Panel obtenerPanelContenedor(){
        return ventaPanel;
    }
    
    @Override
    public void inicializarComponentes() {
        ventaPanel = new Panel();
        instruccionAgregarProductoVentaLabel = new LabelTask();
        instruccionAgregarProductoVentaLabel.setForeground(new java.awt.Color(255, 255, 255));
        instruccionAgregarProductoVentaLabel.setText("Agrega un producto");
        codigoVentaCampo = new JTextField();
        instruccionCodigoProductoVentaLabel = new LabelMetric();
        instruccionCodigoProductoVentaLabel.setText("Codigo de Producto :");

    }

    @Override
    public void establecerLayoutComponentes() {

        ventaPanel = new Panel();
        instruccionAgregarProductoVentaLabel = new LabelTask();
        agregarEfectivoBoton = new ButtonAction();
        quitarEfectivoBoton = new ButtonAction();
        buscarProductoVentaBoton = new ButtonAction();
        codigoVentaCampo = new JTextField();
        agregarProductoVentaBoton = new ButtonSeven();
        cantidadVentaSpinner = new JSpinner();
        productosEnVentaTablaBarraDesplazamiento = new JScrollPane();
        productosEnVentaTabla = new JTable();
        instruccionTotalVentaLabel = new LabelRect();
        totalVentalLabel = new JLabel();
        pagoConVentaLabel = new JLabel();
        instruccionPagoVentaLabel = new LabelRect();
        instruccionCambioVentaLabel = new LabelRect();
        cambioVentaLabel = new JLabel();
        cobrarImporteVentaBoton = new ButtonAction();
        simboloPesoLabel = new LabelRound();
        totalImporteVentaLabel = new LabelRound();
        instruccionCodigoProductoVentaLabel = new LabelMetric();
        instruccionCantidadVentaLabel = new LabelMetric();
        instruccionTotalImporteVentaLabel = new LabelMetric();

        instruccionAgregarProductoVentaLabel.setForeground(new Color(255, 255, 255));
        instruccionAgregarProductoVentaLabel.setText("Agrega un producto");

        agregarEfectivoBoton.setText("Agregar Efectivo");

        quitarEfectivoBoton.setText("Quitar Efectivo");

        buscarProductoVentaBoton.setText("Buscar");

        agregarProductoVentaBoton.setText("Agregar");

        productosEnVentaTabla.setModel(new DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String[]{
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        productosEnVentaTablaBarraDesplazamiento.setViewportView(productosEnVentaTabla);

        instruccionTotalVentaLabel.setText("Total");

        totalVentalLabel.setFont(new Font("Arial", 1, 48)); // NOI18N
        totalVentalLabel.setForeground(new Color(255, 255, 255));
        totalVentalLabel.setText("0.0");

        pagoConVentaLabel.setFont(new Font("Arial", 1, 48)); // NOI18N
        pagoConVentaLabel.setForeground(new Color(255, 255, 255));
        pagoConVentaLabel.setText("0.0");

        instruccionPagoVentaLabel.setText("Pago con");

        instruccionCambioVentaLabel.setText("Cambio");

        cambioVentaLabel.setFont(new Font("Arial", 1, 48)); // NOI18N
        cambioVentaLabel.setForeground(new Color(255, 255, 255));
        cambioVentaLabel.setText("0.0");

        cobrarImporteVentaBoton.setText("Cobrar");
        cobrarImporteVentaBoton.setFont(new Font("Arial", 1, 48)); // NOI18N

        simboloPesoLabel.setText("$");
        simboloPesoLabel.setFont(new Font("Arial", 1, 48)); // NOI18N

        totalImporteVentaLabel.setText("O.O");
        totalImporteVentaLabel.setFont(new Font("Arial", 1, 48)); // NOI18N

        instruccionCodigoProductoVentaLabel.setText("Codigo de Producto :");

        instruccionCantidadVentaLabel.setText("Cantidad :");

        instruccionTotalImporteVentaLabel.setText("Total :");
        instruccionTotalImporteVentaLabel.setFont(new Font("Arial", 1, 48)); // NOI18N

        GroupLayout ventaPanelLayout = new GroupLayout(ventaPanel);
        ventaPanel.setLayout(ventaPanelLayout);
        ventaPanelLayout.setHorizontalGroup(
                ventaPanelLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(ventaPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(ventaPanelLayout.createParallelGroup(Alignment.LEADING)
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addGroup(ventaPanelLayout.createParallelGroup(Alignment.LEADING)
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addGap(7, 7, 7)
                                                        .addComponent(instruccionAgregarProductoVentaLabel, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(24, 24, 24)
                                                        .addGroup(ventaPanelLayout.createParallelGroup(Alignment.LEADING, false)
                                                                .addComponent(codigoVentaCampo)
                                                                .addComponent(instruccionCodigoProductoVentaLabel, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                                                        .addGroup(ventaPanelLayout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                                        .addGap(46, 46, 46)
                                                                        .addComponent(cantidadVentaSpinner, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(44, 44, 44)
                                                                        .addComponent(agregarProductoVentaBoton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                                        .addGap(36, 36, 36)
                                                                        .addComponent(instruccionCantidadVentaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addComponent(agregarEfectivoBoton, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(quitarEfectivoBoton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(15, 15, 15)
                                                        .addComponent(buscarProductoVentaBoton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addGroup(ventaPanelLayout.createParallelGroup(Alignment.LEADING)
                                                                .addComponent(instruccionTotalVentaLabel, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                                        .addGap(26, 26, 26)
                                                                        .addComponent(totalVentalLabel)))
                                                        .addGroup(ventaPanelLayout.createParallelGroup(Alignment.LEADING)
                                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                                        .addGap(117, 117, 117)
                                                                        .addComponent(pagoConVentaLabel)
                                                                        .addGap(103, 103, 103))
                                                                .addGroup(Alignment.TRAILING, ventaPanelLayout.createSequentialGroup()
                                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                                        .addComponent(instruccionPagoVentaLabel, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(40, 40, 40)))
                                                        .addGroup(ventaPanelLayout.createParallelGroup(Alignment.LEADING)
                                                                .addComponent(instruccionCambioVentaLabel, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                                        .addGap(20, 20, 20)
                                                                        .addComponent(cambioVentaLabel)))
                                                        .addGap(219, 219, 219)
                                                        .addComponent(cobrarImporteVentaBoton, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(25, 25, 25)
                                                        .addComponent(simboloPesoLabel, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(totalImporteVentaLabel, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(31, Short.MAX_VALUE))
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addComponent(productosEnVentaTablaBarraDesplazamiento, GroupLayout.PREFERRED_SIZE, 860, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(instruccionTotalImporteVentaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56))))
        );
        ventaPanelLayout.setVerticalGroup(
                ventaPanelLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(ventaPanelLayout.createSequentialGroup()
                        .addGroup(ventaPanelLayout.createParallelGroup(Alignment.LEADING)
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(ventaPanelLayout.createParallelGroup(Alignment.BASELINE)
                                                .addComponent(instruccionAgregarProductoVentaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(instruccionCodigoProductoVentaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(instruccionCantidadVentaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(codigoVentaCampo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(cantidadVentaSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(agregarProductoVentaBoton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(ventaPanelLayout.createParallelGroup(Alignment.LEADING)
                                .addComponent(agregarEfectivoBoton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(quitarEfectivoBoton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(buscarProductoVentaBoton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(ventaPanelLayout.createParallelGroup(Alignment.LEADING)
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addGap(331, 331, 331)
                                        .addComponent(cobrarImporteVentaBoton, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addGroup(ventaPanelLayout.createParallelGroup(Alignment.LEADING)
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(productosEnVentaTablaBarraDesplazamiento, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18))
                                                .addGroup(Alignment.TRAILING, ventaPanelLayout.createSequentialGroup()
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(instruccionTotalImporteVentaLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(ComponentPlacement.RELATED)))
                                        .addGroup(ventaPanelLayout.createParallelGroup(Alignment.LEADING)
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addComponent(instruccionTotalVentaLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(totalVentalLabel))
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addComponent(instruccionPagoVentaLabel, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(15, 15, 15)
                                                        .addComponent(pagoConVentaLabel))
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addGap(1, 1, 1)
                                                        .addComponent(instruccionCambioVentaLabel, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(14, 14, 14)
                                                        .addComponent(cambioVentaLabel))
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addGap(34, 34, 34)
                                                        .addGroup(ventaPanelLayout.createParallelGroup(Alignment.BASELINE)
                                                                .addComponent(simboloPesoLabel, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(totalImporteVentaLabel, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(33, Short.MAX_VALUE))
        );
    }

}
