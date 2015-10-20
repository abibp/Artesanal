package usuario.menu;

import org.edisoncor.gui.panel.Panel;
import usuario.MenuVentana;

/**
 *
 * @author PIX
 */
public class ReporteMenuVentana extends MenuVentana{

    private com.toedter.calendar.JDateChooser desdeFechaReporteCalendario;
    private org.edisoncor.gui.label.LabelMetric desdeFechaReporteLabel;
    private org.edisoncor.gui.button.ButtonAqua generarReporteBoton;
    private com.toedter.calendar.JDateChooser hastaFechaReporteCalendario;
    private org.edisoncor.gui.label.LabelMetric hastaFechaReporteLabel;
    private org.edisoncor.gui.label.LabelTask labelTask9;
    private org.edisoncor.gui.panel.PanelRound panelRound7;
    private org.edisoncor.gui.panel.Panel reportePanel;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return reportePanel;
    }

    @Override
    public void inicializarComponentes() {
         reportePanel = new org.edisoncor.gui.panel.Panel();
        labelTask9 = new org.edisoncor.gui.label.LabelTask();
        panelRound7 = new org.edisoncor.gui.panel.PanelRound();
        desdeFechaReporteLabel = new org.edisoncor.gui.label.LabelMetric();
        hastaFechaReporteCalendario = new com.toedter.calendar.JDateChooser();
        desdeFechaReporteCalendario = new com.toedter.calendar.JDateChooser();
        hastaFechaReporteLabel = new org.edisoncor.gui.label.LabelMetric();
        generarReporteBoton = new org.edisoncor.gui.button.ButtonAqua();

    }

    @Override
    public void establecerLayoutComponentes() {
       

        labelTask9.setForeground(new java.awt.Color(255, 255, 255));
        labelTask9.setText("Hacer Reporte");

        desdeFechaReporteLabel.setText("Desde :");

        hastaFechaReporteLabel.setText("Hasta :");

        generarReporteBoton.setBackground(new java.awt.Color(0, 204, 102));
        generarReporteBoton.setText("Generar");

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
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
        reportePanelLayout.setHorizontalGroup(
            reportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportePanelLayout.createSequentialGroup()
                .addGroup(reportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportePanelLayout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(labelTask9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(reportePanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(panelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(820, Short.MAX_VALUE))
        );
        reportePanelLayout.setVerticalGroup(
            reportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTask9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );
    }
    
}
