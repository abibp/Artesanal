package usuario.submenu;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import org.edisoncor.gui.button.ButtonAction;
import org.edisoncor.gui.label.LabelMetric;
import org.edisoncor.gui.label.LabelTask;
import org.edisoncor.gui.panel.Panel;
import org.edisoncor.gui.panel.PanelRound;
import org.edisoncor.gui.textField.TextFieldRectImage;
import usuario.MenuVentana;

/**
 *
 * @author PIX
 */
public class ConsultaInventarioSubmenuVentana extends MenuVentana{

    private TextFieldRectImage articuloInventarioConsultaCampo;
    private LabelMetric articuloInventarioConsultaLabel;
    private JTable articulosInventarioConsultaTabla;
    private ButtonAction buscarInventarioConsultaBoton;
    private JScrollPane barraDezplazamientoTabla;
    private LabelTask tituloConsultaInventario;
    private Panel panelContenedor;
    private PanelRound formularioConsultaProductosPanel;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return panelContenedor;
    }

    @Override
    public void inicializarComponentes() {
        panelContenedor = new org.edisoncor.gui.panel.Panel();
        formularioConsultaProductosPanel = new org.edisoncor.gui.panel.PanelRound();
        barraDezplazamientoTabla = new javax.swing.JScrollPane();
        articulosInventarioConsultaTabla = new javax.swing.JTable();
        articuloInventarioConsultaLabel = new org.edisoncor.gui.label.LabelMetric();
        articuloInventarioConsultaCampo = new org.edisoncor.gui.textField.TextFieldRectImage();
        buscarInventarioConsultaBoton = new org.edisoncor.gui.button.ButtonAction();
        tituloConsultaInventario = new org.edisoncor.gui.label.LabelTask();

    }

    @Override
    public void establecerLayoutComponentes() {
        

        articulosInventarioConsultaTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        barraDezplazamientoTabla.setViewportView(articulosInventarioConsultaTabla);

        articuloInventarioConsultaLabel.setText("Articulo :");

        articuloInventarioConsultaCampo.setText(" ");

        buscarInventarioConsultaBoton.setText("Buscar");

        javax.swing.GroupLayout panelRound9Layout = new javax.swing.GroupLayout(formularioConsultaProductosPanel);
        formularioConsultaProductosPanel.setLayout(panelRound9Layout);
        panelRound9Layout.setHorizontalGroup(panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound9Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound9Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(articuloInventarioConsultaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(articuloInventarioConsultaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(buscarInventarioConsultaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(barraDezplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panelRound9Layout.setVerticalGroup(panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound9Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarInventarioConsultaBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(articuloInventarioConsultaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(articuloInventarioConsultaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(barraDezplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        tituloConsultaInventario.setBackground(new java.awt.Color(255, 255, 255));
        tituloConsultaInventario.setForeground(new java.awt.Color(255, 255, 255));
        tituloConsultaInventario.setText("Productos en el Inventario");

        javax.swing.GroupLayout panel15Layout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panel15Layout);
        panel15Layout.setHorizontalGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel15Layout.createSequentialGroup()
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel15Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(tituloConsultaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel15Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(formularioConsultaProductosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panel15Layout.setVerticalGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel15Layout.createSequentialGroup()
                .addComponent(tituloConsultaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(formularioConsultaProductosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }
    
}
