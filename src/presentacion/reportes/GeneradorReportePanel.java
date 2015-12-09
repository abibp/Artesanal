package presentacion.reportes;

import com.itextpdf.text.DocumentException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import negocio.administracion.GeneradorReporte;
import presentacion.utileria.Informador;

/**
 *
 * @author PIX
 */
public class GeneradorReportePanel extends javax.swing.JPanel {

    public GeneradorReportePanel() {
        initComponents();
        configurarComponentes();
        configurarEvento();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new org.edisoncor.gui.panel.PanelImage();
        tituloFondoPanel = new org.edisoncor.gui.panel.PanelImage();
        clavoIzquierdoIconoEtiqueta = new javax.swing.JLabel();
        clavoDerechoIconoEtiqueta = new javax.swing.JLabel();
        tituloPanel = new org.edisoncor.gui.label.LabelMetric();
        generacionReporteBoton = new javax.swing.JButton();
        formularioPanel = new javax.swing.JPanel();
        fechaFinalEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        fechaInicioEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        fechaInicialCampo = new com.toedter.calendar.JDateChooser();
        fechaFinalCampo = new com.toedter.calendar.JDateChooser();
        tituloPanel1 = new org.edisoncor.gui.label.LabelMetric();
        accionIconoEtiqueta = new javax.swing.JLabel();

        fondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/madera_fondo.jpg"))); // NOI18N

        tituloFondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/titulo.jpg"))); // NOI18N

        clavoIzquierdoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        clavoDerechoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        tituloPanel.setText("Generacion de Reportes");
        tituloPanel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        javax.swing.GroupLayout tituloFondoPanelLayout = new javax.swing.GroupLayout(tituloFondoPanel);
        tituloFondoPanel.setLayout(tituloFondoPanelLayout);
        tituloFondoPanelLayout.setHorizontalGroup(
            tituloFondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloFondoPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(clavoIzquierdoIconoEtiqueta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330)
                .addComponent(clavoDerechoIconoEtiqueta)
                .addGap(34, 34, 34))
        );
        tituloFondoPanelLayout.setVerticalGroup(
            tituloFondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloFondoPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(tituloFondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clavoDerechoIconoEtiqueta)
                    .addComponent(clavoIzquierdoIconoEtiqueta)
                    .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        generacionReporteBoton.setBackground(new java.awt.Color(153, 0, 0));
        generacionReporteBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        generacionReporteBoton.setForeground(new java.awt.Color(255, 255, 255));
        generacionReporteBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/registrar.png"))); // NOI18N
        generacionReporteBoton.setText("Generar");

        formularioPanel.setBackground(new java.awt.Color(51, 0, 0));

        fechaFinalEtiqueta.setText("Hasta :");
        fechaFinalEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        fechaInicioEtiqueta.setText("Desde :");
        fechaInicioEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        fechaInicialCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        fechaFinalCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        tituloPanel1.setText("Nuevo Reporte de Ventas");
        tituloPanel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        javax.swing.GroupLayout formularioPanelLayout = new javax.swing.GroupLayout(formularioPanel);
        formularioPanel.setLayout(formularioPanelLayout);
        formularioPanelLayout.setHorizontalGroup(
            formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioPanelLayout.createSequentialGroup()
                .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(fechaInicioEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaInicialCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(fechaFinalEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fechaFinalCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formularioPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(tituloPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        formularioPanelLayout.setVerticalGroup(
            formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(tituloPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaFinalEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaInicioEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaInicialCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaFinalCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        accionIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/reporte.png"))); // NOI18N

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloFondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addGap(586, 586, 586)
                .addComponent(generacionReporteBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(formularioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(accionIconoEtiqueta)
                .addGap(151, 151, 151))
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addComponent(tituloFondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addComponent(formularioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(generacionReporteBoton)
                        .addGap(30, 30, 30))
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addComponent(accionIconoEtiqueta)
                        .addContainerGap(267, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accionIconoEtiqueta;
    private javax.swing.JLabel clavoDerechoIconoEtiqueta;
    private javax.swing.JLabel clavoIzquierdoIconoEtiqueta;
    private com.toedter.calendar.JDateChooser fechaFinalCampo;
    private org.edisoncor.gui.label.LabelMetric fechaFinalEtiqueta;
    private com.toedter.calendar.JDateChooser fechaInicialCampo;
    private org.edisoncor.gui.label.LabelMetric fechaInicioEtiqueta;
    private org.edisoncor.gui.panel.PanelImage fondoPanel;
    private javax.swing.JPanel formularioPanel;
    private javax.swing.JButton generacionReporteBoton;
    private org.edisoncor.gui.panel.PanelImage tituloFondoPanel;
    private org.edisoncor.gui.label.LabelMetric tituloPanel;
    private org.edisoncor.gui.label.LabelMetric tituloPanel1;
    // End of variables declaration//GEN-END:variables

    private void configurarEvento() {
        generacionReporteBoton.addActionListener(evento -> generarReporte());
    }

    private boolean estaCompletaInformacionFormulario() {

        Date fechaInicio = fechaInicialCampo.getDate();
        Date fechaFinal = fechaFinalCampo.getDate();
        boolean fechaInicioVacia = fechaInicio == null;
        boolean fechaFinalVacia = fechaFinal == null;
        
        return ! fechaInicioVacia && ! fechaFinalVacia;
    }

    private void generarReporte() {

        final boolean CORRECTO = true;

        boolean estadoValidacion = validarInformacionReporte();

        if (estadoValidacion == CORRECTO) {

            File directorioElegido = solicitarDirectorioDestino();
            boolean esUbicacionValida = directorioElegido != null;

            if (esUbicacionValida) {
                
                String ubicacionDirectorioDestino = directorioElegido.getAbsolutePath();
                Date fechaInicial = fechaInicialCampo.getDate();
                Date fechaFinal = fechaFinalCampo.getDate();
                GeneradorReporte generadorReporte = new GeneradorReporte();
                try {
                    generadorReporte.generarReporteVentas(fechaInicial, fechaFinal, ubicacionDirectorioDestino);
                    Informador.mostrarMensajeDeInformacion("Reporte generado con exito");
                } catch (FileNotFoundException | DocumentException ex) {
                    Logger.getLogger(GeneradorReportePanel.class.getName()).log(Level.SEVERE, null, ex);
                    Informador.mostrarMensajeDeError("Valio madre este pex");
                }
                
            }
            
        }

    }

    private boolean validarInformacionReporte() {

        if (estaCompletaInformacionFormulario()) {

            return validarRangoFechas();

        } else {

            final String MENSAJE_CAMPOS_INCOMPLETOS
                    = "¡Establece las fechas del reporte!";
            Informador.mostrarMensajeDeError(MENSAJE_CAMPOS_INCOMPLETOS);

            return false;
        }

    }

    private File solicitarDirectorioDestino() {

        JFileChooser dialogoArchivo = new JFileChooser();
        dialogoArchivo.setDialogTitle("Seleccione un directorio destino para el reporte");
        dialogoArchivo.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        dialogoArchivo.showOpenDialog(null);
        
        File directorioElegido = dialogoArchivo.getSelectedFile();
        return directorioElegido;
    }

    private void configurarComponentes() {

        fechaInicialCampo.getDateEditor().setEnabled(false);
        fechaFinalCampo.getDateEditor().setEnabled(false);
    }

    private boolean validarRangoFechas() {

        Date fechaInicio = fechaInicialCampo.getDate();
        Date fechaFinal = fechaFinalCampo.getDate();
        
        if(fechaInicio.before(fechaFinal)){
            
            return true;
        
        }else{
            
            final String MENSAJE_RANGO_ERRONEO
                    = "¡Verifica el rango de fechas seleccionado!";
            Informador.mostrarMensajeDeError(MENSAJE_RANGO_ERRONEO);

            return false;
        }

    }

}
