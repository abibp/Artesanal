package usuario.menu;

import org.edisoncor.gui.button.ButtonAqua;
import org.edisoncor.gui.label.LabelMetric;
import org.edisoncor.gui.label.LabelRect;
import org.edisoncor.gui.label.LabelTask;
import org.edisoncor.gui.panel.Panel;
import org.edisoncor.gui.panel.PanelRound;
import usuario.MenuVentana;

/**
 *
 * @author PIX
 */
public class CorteMenuVentana extends MenuVentana{

    private ButtonAqua realizacionCorteBoton;
    private Panel cortePanel;
    private LabelMetric corteResponsableLabel;
    private LabelMetric corteFechaLabel;
    private LabelMetric ventasTotalesLabel;
    private LabelMetric gananciaLabel;
    private LabelMetric simboloMonedaVentasTotalesLabel;
    private LabelMetric simboloMonedaGananciaLabel;
    private LabelMetric dineroEnCajaSeccionTituloLabel;
    private LabelMetric fondoDeCajaLabel;
    private LabelMetric entradasLabel;
    private LabelMetric ventasLabel;
    private LabelMetric salidasLabel;
    private LabelMetric simboloMonedaFondoDeCajaLabel;
    private LabelMetric simboloMonedaVentasLabel;
    private LabelMetric simboloMonedaEntradasLabel;
    private LabelMetric simboloMonedaSalidaLabel;
    private LabelMetric totalDineroEnCajaLabel;
    private LabelMetric simboloMonedaTotalVentasLabel;
    private LabelRect entradasValorLabel;
    private LabelRect salidasValorLabel;
    private LabelRect totalVentasValorLabel;
    private LabelRect corteResponsableValorLabel;
    private LabelRect corteFechaValorLabel;
    private LabelRect ganaciaValorLabel;
    private LabelRect labelRect7;
    private LabelRect fondoDeCajaValorLabel;
    private LabelRect ventasValorLabel;
    private LabelTask tituloSubmenu;
    private PanelRound formularioCortePanel;
    
    @Override
    public Panel obtenerPanelContenedor() {
        return cortePanel;
    }

    @Override
    public void inicializarComponentes() {
        cortePanel = new org.edisoncor.gui.panel.Panel();
        formularioCortePanel = new org.edisoncor.gui.panel.PanelRound();
        realizacionCorteBoton = new org.edisoncor.gui.button.ButtonAqua();
        corteResponsableLabel = new org.edisoncor.gui.label.LabelMetric();
        corteResponsableValorLabel = new org.edisoncor.gui.label.LabelRect();
        corteFechaLabel = new org.edisoncor.gui.label.LabelMetric();
        corteFechaValorLabel = new org.edisoncor.gui.label.LabelRect();
        ventasTotalesLabel = new org.edisoncor.gui.label.LabelMetric();
        gananciaLabel = new org.edisoncor.gui.label.LabelMetric();
        ganaciaValorLabel = new org.edisoncor.gui.label.LabelRect();
        labelRect7 = new org.edisoncor.gui.label.LabelRect();
        simboloMonedaVentasTotalesLabel = new org.edisoncor.gui.label.LabelMetric();
        simboloMonedaGananciaLabel = new org.edisoncor.gui.label.LabelMetric();
        dineroEnCajaSeccionTituloLabel = new org.edisoncor.gui.label.LabelMetric();
        fondoDeCajaLabel = new org.edisoncor.gui.label.LabelMetric();
        entradasLabel = new org.edisoncor.gui.label.LabelMetric();
        ventasLabel = new org.edisoncor.gui.label.LabelMetric();
        salidasLabel = new org.edisoncor.gui.label.LabelMetric();
        fondoDeCajaValorLabel = new org.edisoncor.gui.label.LabelRect();
        simboloMonedaFondoDeCajaLabel = new org.edisoncor.gui.label.LabelMetric();
        simboloMonedaVentasLabel = new org.edisoncor.gui.label.LabelMetric();
        ventasValorLabel = new org.edisoncor.gui.label.LabelRect();
        simboloMonedaEntradasLabel = new org.edisoncor.gui.label.LabelMetric();
        entradasValorLabel = new org.edisoncor.gui.label.LabelRect();
        simboloMonedaSalidaLabel = new org.edisoncor.gui.label.LabelMetric();
        salidasValorLabel = new org.edisoncor.gui.label.LabelRect();
        totalDineroEnCajaLabel = new org.edisoncor.gui.label.LabelMetric();
        simboloMonedaTotalVentasLabel = new org.edisoncor.gui.label.LabelMetric();
        totalVentasValorLabel = new org.edisoncor.gui.label.LabelRect();
        tituloSubmenu = new org.edisoncor.gui.label.LabelTask();

    }

    @Override
    public void establecerLayoutComponentes() {
        

        realizacionCorteBoton.setBackground(new java.awt.Color(0, 204, 102));
        realizacionCorteBoton.setText("Hacer Corte");

        corteResponsableLabel.setText("Corte del");

        corteResponsableValorLabel.setText("ADMIN");

        corteFechaLabel.setText("del");

        corteFechaValorLabel.setText("FECHA DEL DIA");

        ventasTotalesLabel.setText("Ventas Totales : ");

        gananciaLabel.setText("Ganancia : ");

        ganaciaValorLabel.setText("0.0");

        labelRect7.setText("0.0");

        simboloMonedaVentasTotalesLabel.setText("$");
        simboloMonedaVentasTotalesLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        simboloMonedaGananciaLabel.setText("$");
        simboloMonedaGananciaLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        dineroEnCajaSeccionTituloLabel.setText("Dinero en Caja ( Resumen ):");
        dineroEnCajaSeccionTituloLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        fondoDeCajaLabel.setText("Fondo de Caja : ");

        entradasLabel.setText("Entradas :");

        ventasLabel.setText("Ventas :");

        salidasLabel.setText("Salidas : ");

        fondoDeCajaValorLabel.setForeground(new java.awt.Color(0, 204, 102));
        fondoDeCajaValorLabel.setText("0.0");

        simboloMonedaFondoDeCajaLabel.setForeground(new java.awt.Color(0, 204, 102));
        simboloMonedaFondoDeCajaLabel.setText("$");
        simboloMonedaFondoDeCajaLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        simboloMonedaVentasLabel.setForeground(new java.awt.Color(0, 204, 102));
        simboloMonedaVentasLabel.setText("$");
        simboloMonedaVentasLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        ventasValorLabel.setForeground(new java.awt.Color(0, 204, 102));
        ventasValorLabel.setText("0.0");

        simboloMonedaEntradasLabel.setForeground(new java.awt.Color(0, 204, 102));
        simboloMonedaEntradasLabel.setText("$");
        simboloMonedaEntradasLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        entradasValorLabel.setForeground(new java.awt.Color(0, 204, 102));
        entradasValorLabel.setText("0.0");

        simboloMonedaSalidaLabel.setForeground(new java.awt.Color(255, 51, 51));
        simboloMonedaSalidaLabel.setText("$");
        simboloMonedaSalidaLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        salidasValorLabel.setForeground(new java.awt.Color(255, 51, 51));
        salidasValorLabel.setText("0.0");

        totalDineroEnCajaLabel.setText("Total :");
        totalDineroEnCajaLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        simboloMonedaTotalVentasLabel.setForeground(new java.awt.Color(0, 153, 153));
        simboloMonedaTotalVentasLabel.setText("$");
        simboloMonedaTotalVentasLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        totalVentasValorLabel.setForeground(new java.awt.Color(0, 153, 153));
        totalVentasValorLabel.setText("0.0");

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(formularioCortePanel);
        formularioCortePanel.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dineroEnCajaSeccionTituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(realizacionCorteBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelRound3Layout.createSequentialGroup()
                                        .addComponent(corteResponsableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(corteResponsableValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))
                                    .addGroup(panelRound3Layout.createSequentialGroup()
                                        .addComponent(ventasTotalesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(simboloMonedaVentasTotalesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelRect7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRound3Layout.createSequentialGroup()
                                        .addComponent(gananciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(simboloMonedaGananciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(ganaciaValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelRound3Layout.createSequentialGroup()
                                        .addComponent(corteFechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(corteFechaValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addComponent(salidasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(simboloMonedaSalidaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salidasValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addComponent(entradasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(simboloMonedaEntradasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(entradasValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                                .addComponent(ventasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(simboloMonedaVentasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ventasValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                                .addComponent(fondoDeCajaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(simboloMonedaFondoDeCajaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fondoDeCajaValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(totalDineroEnCajaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(simboloMonedaTotalVentasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalVentasValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(realizacionCorteBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(corteResponsableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(corteResponsableValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(corteFechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(corteFechaValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ventasTotalesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gananciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(simboloMonedaVentasTotalesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(labelRect7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ganaciaValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(simboloMonedaGananciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53)
                .addComponent(dineroEnCajaSeccionTituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fondoDeCajaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fondoDeCajaValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simboloMonedaFondoDeCajaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ventasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ventasValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simboloMonedaVentasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entradasValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simboloMonedaEntradasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salidasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salidasValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simboloMonedaSalidaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(simboloMonedaTotalVentasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalDineroEnCajaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalVentasValorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tituloSubmenu.setForeground(new java.awt.Color(255, 255, 255));
        tituloSubmenu.setText("Hacer Corte del Dia");

        javax.swing.GroupLayout cortePanelLayout = new javax.swing.GroupLayout(cortePanel);
        cortePanel.setLayout(cortePanelLayout);
        cortePanelLayout.setHorizontalGroup(cortePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cortePanelLayout.createSequentialGroup()
                .addGroup(cortePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cortePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(formularioCortePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cortePanelLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(tituloSubmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(737, Short.MAX_VALUE))
        );
        cortePanelLayout.setVerticalGroup(cortePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cortePanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(tituloSubmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formularioCortePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }
    
}
