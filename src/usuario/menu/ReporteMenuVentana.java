package usuario.menu;

import com.toedter.calendar.JDateChooser;
import org.edisoncor.gui.button.ButtonAqua;
import org.edisoncor.gui.label.LabelMetric;
import org.edisoncor.gui.label.LabelTask;
import org.edisoncor.gui.panel.Panel;
import org.edisoncor.gui.panel.PanelRound;
import usuario.MenuVentana;

/**
 *
 * @author PIX
 */
public class ReporteMenuVentana extends MenuVentana{

    private JDateChooser desdeFechaReporteCalendario;
    private LabelMetric desdeFechaReporteLabel;
    private ButtonAqua generarReporteBoton;
    private JDateChooser hastaFechaReporteCalendario;
    private LabelMetric hastaFechaReporteLabel;
    private LabelTask tituloMenu;
    private PanelRound formularioReportePanel;
    private Panel reportePanel;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return reportePanel;
    }

    @Override
    public void inicializarComponentes() {
         reportePanel = new org.edisoncor.gui.panel.Panel();
        tituloMenu = new org.edisoncor.gui.label.LabelTask();
        formularioReportePanel = new org.edisoncor.gui.panel.PanelRound();
        desdeFechaReporteLabel = new org.edisoncor.gui.label.LabelMetric();
        hastaFechaReporteCalendario = new com.toedter.calendar.JDateChooser();
        desdeFechaReporteCalendario = new com.toedter.calendar.JDateChooser();
        hastaFechaReporteLabel = new org.edisoncor.gui.label.LabelMetric();
        generarReporteBoton = new org.edisoncor.gui.button.ButtonAqua();

    }

    @Override
    public void establecerDisenoComponentes() {
       

        tituloMenu.setForeground(new java.awt.Color(255, 255, 255));
        tituloMenu.setText("Hacer Reporte");

        desdeFechaReporteLabel.setText("Desde :");

        hastaFechaReporteLabel.setText("Hasta :");

        generarReporteBoton.setBackground(new java.awt.Color(0, 204, 102));
        generarReporteBoton.setText("Generar");

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(formularioReportePanel);
        formularioReportePanel.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(desdeFechaReporteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(desdeFechaReporteCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hastaFechaReporteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hastaFechaReporteCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generarReporteBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hastaFechaReporteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desdeFechaReporteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(hastaFechaReporteCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(desdeFechaReporteCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(generarReporteBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout reportePanelLayout = new javax.swing.GroupLayout(reportePanel);
        reportePanel.setLayout(reportePanelLayout);
        reportePanelLayout.setHorizontalGroup(reportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportePanelLayout.createSequentialGroup()
                .addGroup(reportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportePanelLayout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(tituloMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(reportePanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(formularioReportePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(820, Short.MAX_VALUE))
        );
        reportePanelLayout.setVerticalGroup(reportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formularioReportePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );
    }
    
}
