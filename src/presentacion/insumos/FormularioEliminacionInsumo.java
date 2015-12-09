package presentacion.insumos;

import datos.excepciones.ExcepcionInsumoNoEncontrado;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import negocio.entidades.Insumo;
import negocio.excepciones.ExcepcionElementoYaExistente;
import negocio.administracion.GestorInsumos;
import presentacion.dialogos.AutocompletadoCodigoInsumoDialogo;
import presentacion.utileria.Informador;

/**
 *
 * @author PIX
 */
public class FormularioEliminacionInsumo extends javax.swing.JPanel implements DocumentListener {

    public FormularioEliminacionInsumo() {
        initComponents();
        configurarEventos();
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        completarInformacionInsumo();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {}

    @Override
    public void changedUpdate(DocumentEvent e) {}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new org.edisoncor.gui.panel.PanelImage();
        tituloFondoPanel = new org.edisoncor.gui.panel.PanelImage();
        clavoIzquierdoIconoEtiqueta = new javax.swing.JLabel();
        clavoDerechoIconoEtiqueta = new javax.swing.JLabel();
        tituloPanel = new org.edisoncor.gui.label.LabelMetric();
        eliminacionInsumoBoton = new javax.swing.JButton();
        formularioPanel = new javax.swing.JPanel();
        codigoEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        codigoCampo = new javax.swing.JTextField();
        costoCampo = new javax.swing.JTextField();
        costoEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        nombreCampo = new javax.swing.JTextField();
        nombreEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        cantidadActualCampo = new javax.swing.JTextField();
        cantidadActualEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        busquedaCodigoInsumoBoton = new javax.swing.JButton();
        accionIconoEtiqueta = new javax.swing.JLabel();

        fondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/madera_fondo.jpg"))); // NOI18N

        tituloFondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/titulo.jpg"))); // NOI18N

        clavoIzquierdoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        clavoDerechoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        tituloPanel.setText("Eliminacion de Insumo");
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
                .addGap(395, 395, 395)
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

        eliminacionInsumoBoton.setBackground(new java.awt.Color(153, 0, 0));
        eliminacionInsumoBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        eliminacionInsumoBoton.setForeground(new java.awt.Color(255, 255, 255));
        eliminacionInsumoBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/registrar.png"))); // NOI18N
        eliminacionInsumoBoton.setText("Eliminar");

        formularioPanel.setBackground(new java.awt.Color(51, 0, 0));

        codigoEtiqueta.setText("Codigo :");
        codigoEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        codigoCampo.setEditable(false);
        codigoCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        costoCampo.setEditable(false);
        costoCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        costoEtiqueta.setText("Costo :");
        costoEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        nombreCampo.setEditable(false);
        nombreCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        nombreEtiqueta.setText("Nombre :");
        nombreEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        cantidadActualCampo.setEditable(false);
        cantidadActualCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        cantidadActualEtiqueta.setText("Cantidad Actual :");
        cantidadActualEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        busquedaCodigoInsumoBoton.setBackground(new java.awt.Color(153, 0, 0));
        busquedaCodigoInsumoBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        busquedaCodigoInsumoBoton.setForeground(new java.awt.Color(255, 255, 255));
        busquedaCodigoInsumoBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/buscar.png"))); // NOI18N
        busquedaCodigoInsumoBoton.setText("Buscar");

        javax.swing.GroupLayout formularioPanelLayout = new javax.swing.GroupLayout(formularioPanel);
        formularioPanel.setLayout(formularioPanelLayout);
        formularioPanelLayout.setHorizontalGroup(
            formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioPanelLayout.createSequentialGroup()
                        .addComponent(costoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(costoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioPanelLayout.createSequentialGroup()
                        .addComponent(nombreEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nombreCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioPanelLayout.createSequentialGroup()
                        .addComponent(cantidadActualEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cantidadActualCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioPanelLayout.createSequentialGroup()
                .addGap(0, 142, Short.MAX_VALUE)
                .addComponent(codigoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(codigoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(busquedaCodigoInsumoBoton)
                .addGap(47, 47, 47))
        );
        formularioPanelLayout.setVerticalGroup(
            formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busquedaCodigoInsumoBoton))
                .addGap(18, 18, 18)
                .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadActualEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadActualCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        accionIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/baja_main.png"))); // NOI18N

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloFondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addGap(586, 586, 586)
                .addComponent(eliminacionInsumoBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(formularioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addComponent(accionIconoEtiqueta)
                .addGap(151, 151, 151))
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addComponent(tituloFondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accionIconoEtiqueta)
                    .addComponent(formularioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(eliminacionInsumoBoton)
                .addGap(30, 30, 30))
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
    private javax.swing.JButton busquedaCodigoInsumoBoton;
    private javax.swing.JTextField cantidadActualCampo;
    private org.edisoncor.gui.label.LabelMetric cantidadActualEtiqueta;
    private javax.swing.JLabel clavoDerechoIconoEtiqueta;
    private javax.swing.JLabel clavoIzquierdoIconoEtiqueta;
    private javax.swing.JTextField codigoCampo;
    private org.edisoncor.gui.label.LabelMetric codigoEtiqueta;
    private javax.swing.JTextField costoCampo;
    private org.edisoncor.gui.label.LabelMetric costoEtiqueta;
    private javax.swing.JButton eliminacionInsumoBoton;
    private org.edisoncor.gui.panel.PanelImage fondoPanel;
    private javax.swing.JPanel formularioPanel;
    private javax.swing.JTextField nombreCampo;
    private org.edisoncor.gui.label.LabelMetric nombreEtiqueta;
    private org.edisoncor.gui.panel.PanelImage tituloFondoPanel;
    private org.edisoncor.gui.label.LabelMetric tituloPanel;
    // End of variables declaration//GEN-END:variables

    private void configurarEventos() {

        busquedaCodigoInsumoBoton.addActionListener(evento -> autocompletarCodigoInsumo());
        eliminacionInsumoBoton.addActionListener(evento -> eliminarInsumo());
        codigoCampo.getDocument().addDocumentListener(this);
    }

    private boolean estaCompletaInformacionFormulario() {

        for (Component componente : formularioPanel.getComponents()) {

            if (componente instanceof JTextField) {

                JTextField campoTexto = (JTextField) componente;

                if (campoTexto.getText().isEmpty()) {

                    return false;

                }

            }
        }
        return true;
    }

        private void reiniciarInformacionFormulario() {
        final String VACIO = "";

        for (Component componente : formularioPanel.getComponents()) {

            if (componente instanceof JTextField) {

                JTextField campoTexto = (JTextField) componente;

                campoTexto.setText(VACIO);

            }
        }

    }
    
    private void eliminarInsumo() {

        final boolean CORRECTO = true;

        boolean estadoValidacion = validarInformacionInsumo();

        if (estadoValidacion == CORRECTO) {

            String IDInsumo = codigoCampo.getText();
            try {
                
                GestorInsumos gestorInsumos = GestorInsumos.obtenerInstancia();
                gestorInsumos.eliminar(IDInsumo);
                reiniciarInformacionFormulario();
                
                final String MENSAJE_EXITO = "Insumo Eliminado";
                Informador.mostrarMensajeDeInformacion(MENSAJE_EXITO);
                
            } catch (ExcepcionInsumoNoEncontrado ex) {
                Logger.getLogger(FormularioEliminacionInsumo.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            
        }

    }

    private boolean validarInformacionInsumo() {

        if (estaCompletaInformacionFormulario()) {

            return true;

        } else {

            final String MENSAJE_CAMPOS_INCOMPLETOS
                    = "¡Selecciona un insumo a eliminar!";
            Informador.mostrarMensajeDeError(MENSAJE_CAMPOS_INCOMPLETOS);

            return false;
        }

    }

    private void completarInformacionInsumo() {

        String IDInsumo = codigoCampo.getText();
        
        try {
            
            Insumo insumoSolicitado = GestorInsumos.obtenerInstancia().obtener(IDInsumo);
            nombreCampo.setText(insumoSolicitado.obtenerNombre());
            costoCampo.setText(String.valueOf(insumoSolicitado.obtenerCosto()));
            cantidadActualCampo.setText(String.valueOf(insumoSolicitado.obtenerExistencia()));

        } catch (ExcepcionInsumoNoEncontrado ex) {
            Logger.getLogger(FormularioEliminacionInsumo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void autocompletarCodigoInsumo() {

        final boolean MODO_DIALOGO = true;
        JFrame ventanaActiva = (JFrame) SwingUtilities.getWindowAncestor(this);

        AutocompletadoCodigoInsumoDialogo dialogoAutocompletado
                = new AutocompletadoCodigoInsumoDialogo(ventanaActiva, MODO_DIALOGO);

        dialogoAutocompletado.establecerCampoPorAutocompletar(codigoCampo);

        dialogoAutocompletado.mostrarEnPantalla();
    }
}
