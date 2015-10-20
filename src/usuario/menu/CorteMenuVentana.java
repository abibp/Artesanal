package usuario.menu;

import org.edisoncor.gui.panel.Panel;
import usuario.MenuVentana;

/**
 *
 * @author PIX
 */
public class CorteMenuVentana extends MenuVentana{

    private org.edisoncor.gui.button.ButtonAqua buttonAqua11;
    private org.edisoncor.gui.panel.Panel cortePanel;
    private org.edisoncor.gui.label.LabelMetric labelMetric33;
    private org.edisoncor.gui.label.LabelMetric labelMetric34;
    private org.edisoncor.gui.label.LabelMetric labelMetric35;
    private org.edisoncor.gui.label.LabelMetric labelMetric36;
    private org.edisoncor.gui.label.LabelMetric labelMetric37;
    private org.edisoncor.gui.label.LabelMetric labelMetric38;
    private org.edisoncor.gui.label.LabelMetric labelMetric39;
    private org.edisoncor.gui.label.LabelMetric labelMetric40;
    private org.edisoncor.gui.label.LabelMetric labelMetric45;
    private org.edisoncor.gui.label.LabelMetric labelMetric46;
    private org.edisoncor.gui.label.LabelMetric labelMetric47;
    private org.edisoncor.gui.label.LabelMetric labelMetric48;
    private org.edisoncor.gui.label.LabelMetric labelMetric49;
    private org.edisoncor.gui.label.LabelMetric labelMetric50;
    private org.edisoncor.gui.label.LabelMetric labelMetric51;
    private org.edisoncor.gui.label.LabelMetric labelMetric52;
    private org.edisoncor.gui.label.LabelMetric labelMetric53;
    private org.edisoncor.gui.label.LabelRect labelRect10;
    private org.edisoncor.gui.label.LabelRect labelRect11;
    private org.edisoncor.gui.label.LabelRect labelRect12;
    private org.edisoncor.gui.label.LabelRect labelRect4;
    private org.edisoncor.gui.label.LabelRect labelRect5;
    private org.edisoncor.gui.label.LabelRect labelRect6;
    private org.edisoncor.gui.label.LabelRect labelRect7;
    private org.edisoncor.gui.label.LabelRect labelRect8;
    private org.edisoncor.gui.label.LabelRect labelRect9;
    private org.edisoncor.gui.label.LabelTask labelTask4;
    private org.edisoncor.gui.panel.PanelRound panelRound3;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return cortePanel;
    }

    @Override
    public void inicializarComponentes() {
        cortePanel = new org.edisoncor.gui.panel.Panel();
        panelRound3 = new org.edisoncor.gui.panel.PanelRound();
        buttonAqua11 = new org.edisoncor.gui.button.ButtonAqua();
        labelMetric33 = new org.edisoncor.gui.label.LabelMetric();
        labelRect4 = new org.edisoncor.gui.label.LabelRect();
        labelMetric34 = new org.edisoncor.gui.label.LabelMetric();
        labelRect5 = new org.edisoncor.gui.label.LabelRect();
        labelMetric35 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric36 = new org.edisoncor.gui.label.LabelMetric();
        labelRect6 = new org.edisoncor.gui.label.LabelRect();
        labelRect7 = new org.edisoncor.gui.label.LabelRect();
        labelMetric37 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric38 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric39 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric40 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric45 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric46 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric47 = new org.edisoncor.gui.label.LabelMetric();
        labelRect8 = new org.edisoncor.gui.label.LabelRect();
        labelMetric48 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric49 = new org.edisoncor.gui.label.LabelMetric();
        labelRect9 = new org.edisoncor.gui.label.LabelRect();
        labelMetric50 = new org.edisoncor.gui.label.LabelMetric();
        labelRect10 = new org.edisoncor.gui.label.LabelRect();
        labelMetric51 = new org.edisoncor.gui.label.LabelMetric();
        labelRect11 = new org.edisoncor.gui.label.LabelRect();
        labelMetric52 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric53 = new org.edisoncor.gui.label.LabelMetric();
        labelRect12 = new org.edisoncor.gui.label.LabelRect();
        labelTask4 = new org.edisoncor.gui.label.LabelTask();

    }

    @Override
    public void establecerLayoutComponentes() {
        

        buttonAqua11.setBackground(new java.awt.Color(0, 204, 102));
        buttonAqua11.setText("Hacer Corte");

        labelMetric33.setText("Corte del");

        labelRect4.setText("ADMIN");

        labelMetric34.setText("del");

        labelRect5.setText("FECHA DEL DIA");

        labelMetric35.setText("Ventas Totales : ");

        labelMetric36.setText("Ganancia : ");

        labelRect6.setText("0.0");

        labelRect7.setText("0.0");

        labelMetric37.setText("$");
        labelMetric37.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        labelMetric38.setText("$");
        labelMetric38.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        labelMetric39.setText("Dinero en Caja ( Resumen ):");
        labelMetric39.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        labelMetric40.setText("Fondo de Caja : ");

        labelMetric45.setText("Entradas :");

        labelMetric46.setText("Ventas :");

        labelMetric47.setText("Salidas : ");

        labelRect8.setForeground(new java.awt.Color(0, 204, 102));
        labelRect8.setText("0.0");

        labelMetric48.setForeground(new java.awt.Color(0, 204, 102));
        labelMetric48.setText("$");
        labelMetric48.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        labelMetric49.setForeground(new java.awt.Color(0, 204, 102));
        labelMetric49.setText("$");
        labelMetric49.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        labelRect9.setForeground(new java.awt.Color(0, 204, 102));
        labelRect9.setText("0.0");

        labelMetric50.setForeground(new java.awt.Color(0, 204, 102));
        labelMetric50.setText("$");
        labelMetric50.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        labelRect10.setForeground(new java.awt.Color(0, 204, 102));
        labelRect10.setText("0.0");

        labelMetric51.setForeground(new java.awt.Color(255, 51, 51));
        labelMetric51.setText("$");
        labelMetric51.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        labelRect11.setForeground(new java.awt.Color(255, 51, 51));
        labelRect11.setText("0.0");

        labelMetric52.setText("Total :");
        labelMetric52.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        labelMetric53.setForeground(new java.awt.Color(0, 153, 153));
        labelMetric53.setText("$");
        labelMetric53.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        labelRect12.setForeground(new java.awt.Color(0, 153, 153));
        labelRect12.setText("0.0");

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetric39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAqua11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelRound3Layout.createSequentialGroup()
                                        .addComponent(labelMetric33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(labelRect4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))
                                    .addGroup(panelRound3Layout.createSequentialGroup()
                                        .addComponent(labelMetric35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelMetric37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelRect7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRound3Layout.createSequentialGroup()
                                        .addComponent(labelMetric36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelMetric38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(labelRect6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelRound3Layout.createSequentialGroup()
                                        .addComponent(labelMetric34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(labelRect5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addComponent(labelMetric47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelMetric51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelRect11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addComponent(labelMetric45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelMetric50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelRect10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                                .addComponent(labelMetric46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelMetric49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelRect9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                                .addComponent(labelMetric40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(labelMetric48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelRect8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelMetric52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMetric53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelRect12, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(buttonAqua11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMetric33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelRect4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelMetric34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelRect5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelMetric35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMetric36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMetric37, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(labelRect7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelRect6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53)
                .addComponent(labelMetric39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRect8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric48, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRect9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric49, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRect10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric50, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRect11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric51, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMetric53, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRect12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        labelTask4.setForeground(new java.awt.Color(255, 255, 255));
        labelTask4.setText("Hacer Corte del Dia");

        javax.swing.GroupLayout cortePanelLayout = new javax.swing.GroupLayout(cortePanel);
        cortePanel.setLayout(cortePanelLayout);
        cortePanelLayout.setHorizontalGroup(
            cortePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cortePanelLayout.createSequentialGroup()
                .addGroup(cortePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cortePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cortePanelLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(labelTask4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(737, Short.MAX_VALUE))
        );
        cortePanelLayout.setVerticalGroup(
            cortePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cortePanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(labelTask4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }
    
}
