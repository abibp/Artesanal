package usuario.menu;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
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
        ventaPanel = new org.edisoncor.gui.panel.Panel();
        instruccionAgregarProductoVentaLabel = new org.edisoncor.gui.label.LabelTask();
        instruccionAgregarProductoVentaLabel.setForeground(new java.awt.Color(255, 255, 255));
        instruccionAgregarProductoVentaLabel.setText("Agrega un producto");
        codigoVentaCampo = new javax.swing.JTextField();
        instruccionCodigoProductoVentaLabel = new org.edisoncor.gui.label.LabelMetric();
        instruccionCodigoProductoVentaLabel.setText("Codigo de Producto :");

    }

    @Override
    public void establecerLayoutComponentes() {

        ventaPanel = new org.edisoncor.gui.panel.Panel();
        instruccionAgregarProductoVentaLabel = new org.edisoncor.gui.label.LabelTask();
        agregarEfectivoBoton = new org.edisoncor.gui.button.ButtonAction();
        quitarEfectivoBoton = new org.edisoncor.gui.button.ButtonAction();
        buscarProductoVentaBoton = new org.edisoncor.gui.button.ButtonAction();
        codigoVentaCampo = new javax.swing.JTextField();
        agregarProductoVentaBoton = new org.edisoncor.gui.button.ButtonSeven();
        cantidadVentaSpinner = new javax.swing.JSpinner();
        productosEnVentaTablaBarraDesplazamiento = new javax.swing.JScrollPane();
        productosEnVentaTabla = new javax.swing.JTable();
        instruccionTotalVentaLabel = new org.edisoncor.gui.label.LabelRect();
        totalVentalLabel = new javax.swing.JLabel();
        pagoConVentaLabel = new javax.swing.JLabel();
        instruccionPagoVentaLabel = new org.edisoncor.gui.label.LabelRect();
        instruccionCambioVentaLabel = new org.edisoncor.gui.label.LabelRect();
        cambioVentaLabel = new javax.swing.JLabel();
        cobrarImporteVentaBoton = new org.edisoncor.gui.button.ButtonAction();
        simboloPesoLabel = new org.edisoncor.gui.label.LabelRound();
        totalImporteVentaLabel = new org.edisoncor.gui.label.LabelRound();
        instruccionCodigoProductoVentaLabel = new org.edisoncor.gui.label.LabelMetric();
        instruccionCantidadVentaLabel = new org.edisoncor.gui.label.LabelMetric();
        instruccionTotalImporteVentaLabel = new org.edisoncor.gui.label.LabelMetric();

        instruccionAgregarProductoVentaLabel.setForeground(new java.awt.Color(255, 255, 255));
        instruccionAgregarProductoVentaLabel.setText("Agrega un producto");

        agregarEfectivoBoton.setText("Agregar Efectivo");

        quitarEfectivoBoton.setText("Quitar Efectivo");

        buscarProductoVentaBoton.setText("Buscar");

        agregarProductoVentaBoton.setText("Agregar");

        productosEnVentaTabla.setModel(new javax.swing.table.DefaultTableModel(
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

        totalVentalLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        totalVentalLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalVentalLabel.setText("0.0");

        pagoConVentaLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        pagoConVentaLabel.setForeground(new java.awt.Color(255, 255, 255));
        pagoConVentaLabel.setText("0.0");

        instruccionPagoVentaLabel.setText("Pago con");

        instruccionCambioVentaLabel.setText("Cambio");

        cambioVentaLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        cambioVentaLabel.setForeground(new java.awt.Color(255, 255, 255));
        cambioVentaLabel.setText("0.0");

        cobrarImporteVentaBoton.setText("Cobrar");
        cobrarImporteVentaBoton.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N

        simboloPesoLabel.setText("$");
        simboloPesoLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N

        totalImporteVentaLabel.setText("O.O");
        totalImporteVentaLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N

        instruccionCodigoProductoVentaLabel.setText("Codigo de Producto :");

        instruccionCantidadVentaLabel.setText("Cantidad :");

        instruccionTotalImporteVentaLabel.setText("Total :");
        instruccionTotalImporteVentaLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N

        javax.swing.GroupLayout ventaPanelLayout = new javax.swing.GroupLayout(ventaPanel);
        ventaPanel.setLayout(ventaPanelLayout);
        ventaPanelLayout.setHorizontalGroup(
                ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ventaPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addGroup(ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addGap(7, 7, 7)
                                                        .addComponent(instruccionAgregarProductoVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(24, 24, 24)
                                                        .addGroup(ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(codigoVentaCampo)
                                                                .addComponent(instruccionCodigoProductoVentaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                                                        .addGroup(ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                                        .addGap(46, 46, 46)
                                                                        .addComponent(cantidadVentaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(44, 44, 44)
                                                                        .addComponent(agregarProductoVentaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                                        .addGap(36, 36, 36)
                                                                        .addComponent(instruccionCantidadVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addComponent(agregarEfectivoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(quitarEfectivoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(15, 15, 15)
                                                        .addComponent(buscarProductoVentaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addGroup(ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(instruccionTotalVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                                        .addGap(26, 26, 26)
                                                                        .addComponent(totalVentalLabel)))
                                                        .addGroup(ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                                        .addGap(117, 117, 117)
                                                                        .addComponent(pagoConVentaLabel)
                                                                        .addGap(103, 103, 103))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventaPanelLayout.createSequentialGroup()
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(instruccionPagoVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(40, 40, 40)))
                                                        .addGroup(ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(instruccionCambioVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                                        .addGap(20, 20, 20)
                                                                        .addComponent(cambioVentaLabel)))
                                                        .addGap(219, 219, 219)
                                                        .addComponent(cobrarImporteVentaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(25, 25, 25)
                                                        .addComponent(simboloPesoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(totalImporteVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(31, Short.MAX_VALUE))
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addComponent(productosEnVentaTablaBarraDesplazamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(instruccionTotalImporteVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56))))
        );
        ventaPanelLayout.setVerticalGroup(
                ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ventaPanelLayout.createSequentialGroup()
                        .addGroup(ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(instruccionAgregarProductoVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(instruccionCodigoProductoVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(instruccionCantidadVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(codigoVentaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(cantidadVentaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(agregarProductoVentaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(agregarEfectivoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quitarEfectivoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buscarProductoVentaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addGap(331, 331, 331)
                                        .addComponent(cobrarImporteVentaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                        .addGroup(ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(productosEnVentaTablaBarraDesplazamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventaPanelLayout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(instruccionTotalImporteVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addComponent(instruccionTotalVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(totalVentalLabel))
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addComponent(instruccionPagoVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(15, 15, 15)
                                                        .addComponent(pagoConVentaLabel))
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addGap(1, 1, 1)
                                                        .addComponent(instruccionCambioVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(14, 14, 14)
                                                        .addComponent(cambioVentaLabel))
                                                .addGroup(ventaPanelLayout.createSequentialGroup()
                                                        .addGap(34, 34, 34)
                                                        .addGroup(ventaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(simboloPesoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(totalImporteVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(33, Short.MAX_VALUE))
        );
    }

}
