package presentacion.insumos;

import datos.excepciones.ExcepcionInsumoNoEncontrado;
import java.awt.Component;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import negocio.entidades.Insumo;
import negocio.excepciones.ExcepcionElementoYaExistente;
import negocio.administracion.GestorInsumos;
import presentacion.utileria.RestriccionNumeroDecimalCampo;
import presentacion.utileria.Informador;
import presentacion.utileria.RestriccionNumeroEnteroCampo;

/**
 *
 * @author PIX
 */
public class FormularioRegistroInsumo extends javax.swing.JPanel {

    public FormularioRegistroInsumo() {
        initComponents();
        configurarComponentes();
        configurarEventos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new org.edisoncor.gui.panel.PanelImage();
        tituloFondoPanel = new org.edisoncor.gui.panel.PanelImage();
        clavoIzquierdoIconoEtiqueta = new javax.swing.JLabel();
        clavoDerechoIconoEtiqueta = new javax.swing.JLabel();
        tituloPanel = new org.edisoncor.gui.label.LabelMetric();
        registrarInsumoBoton = new javax.swing.JButton();
        formularioPanel = new javax.swing.JPanel();
        codigoEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        codigoCampo = new javax.swing.JTextField();
        costoCampo = new javax.swing.JTextField();
        costoEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        nombreCampo = new javax.swing.JTextField();
        nombreEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        cantidadActualCampo = new javax.swing.JTextField();
        cantidadActualEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        accionIconoEtiqueta = new javax.swing.JLabel();
        reiniciarCamposBoton = new javax.swing.JButton();

        fondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/madera_fondo.jpg"))); // NOI18N

        tituloFondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/titulo.jpg"))); // NOI18N

        clavoIzquierdoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        clavoDerechoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        tituloPanel.setText("Registro de Insumo");
        tituloPanel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        javax.swing.GroupLayout tituloFondoPanelLayout = new javax.swing.GroupLayout(tituloFondoPanel);
        tituloFondoPanel.setLayout(tituloFondoPanelLayout);
        tituloFondoPanelLayout.setHorizontalGroup(
            tituloFondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloFondoPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(clavoIzquierdoIconoEtiqueta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 476, Short.MAX_VALUE)
                .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(420, 420, 420)
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

        registrarInsumoBoton.setBackground(new java.awt.Color(153, 0, 0));
        registrarInsumoBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        registrarInsumoBoton.setForeground(new java.awt.Color(255, 255, 255));
        registrarInsumoBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/registrar.png"))); // NOI18N
        registrarInsumoBoton.setText("Registrar");

        formularioPanel.setBackground(new java.awt.Color(51, 0, 0));

        codigoEtiqueta.setText("Codigo :");
        codigoEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        codigoCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        costoCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        costoEtiqueta.setText("Costo :");
        costoEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        nombreCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        nombreEtiqueta.setText("Nombre :");
        nombreEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        cantidadActualCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        cantidadActualEtiqueta.setText("Cantidad Actual :");
        cantidadActualEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout formularioPanelLayout = new javax.swing.GroupLayout(formularioPanel);
        formularioPanel.setLayout(formularioPanelLayout);
        formularioPanelLayout.setHorizontalGroup(
            formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioPanelLayout.createSequentialGroup()
                .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formularioPanelLayout.createSequentialGroup()
                        .addComponent(costoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(costoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formularioPanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formularioPanelLayout.createSequentialGroup()
                                    .addComponent(nombreEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(nombreCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(formularioPanelLayout.createSequentialGroup()
                                    .addComponent(codigoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(codigoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(formularioPanelLayout.createSequentialGroup()
                                .addComponent(cantidadActualEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cantidadActualCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        formularioPanelLayout.setVerticalGroup(
            formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(91, Short.MAX_VALUE))
        );

        accionIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/agregar_main.png"))); // NOI18N

        reiniciarCamposBoton.setBackground(new java.awt.Color(102, 0, 0));
        reiniciarCamposBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        reiniciarCamposBoton.setForeground(new java.awt.Color(255, 255, 255));
        reiniciarCamposBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/borrador.png"))); // NOI18N
        reiniciarCamposBoton.setText("Reiniciar Campos");

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloFondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addGap(586, 586, 586)
                .addComponent(registrarInsumoBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reiniciarCamposBoton)
                .addGap(138, 138, 138))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(formularioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reiniciarCamposBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(registrarInsumoBoton)
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
    private javax.swing.JTextField cantidadActualCampo;
    private org.edisoncor.gui.label.LabelMetric cantidadActualEtiqueta;
    private javax.swing.JLabel clavoDerechoIconoEtiqueta;
    private javax.swing.JLabel clavoIzquierdoIconoEtiqueta;
    private javax.swing.JTextField codigoCampo;
    private org.edisoncor.gui.label.LabelMetric codigoEtiqueta;
    private javax.swing.JTextField costoCampo;
    private org.edisoncor.gui.label.LabelMetric costoEtiqueta;
    private org.edisoncor.gui.panel.PanelImage fondoPanel;
    private javax.swing.JPanel formularioPanel;
    private javax.swing.JTextField nombreCampo;
    private org.edisoncor.gui.label.LabelMetric nombreEtiqueta;
    private javax.swing.JButton registrarInsumoBoton;
    private javax.swing.JButton reiniciarCamposBoton;
    private org.edisoncor.gui.panel.PanelImage tituloFondoPanel;
    private org.edisoncor.gui.label.LabelMetric tituloPanel;
    // End of variables declaration//GEN-END:variables

    private void configurarComponentes() {

        establecerRestriccionCampo(costoCampo, new RestriccionNumeroDecimalCampo());
        establecerRestriccionCampo(cantidadActualCampo, new RestriccionNumeroEnteroCampo());

    }
    
    private void establecerRestriccionCampo(JTextField campo, KeyListener filtro){
        campo.addKeyListener(filtro);
        campo.setTransferHandler(null);
    }

    private void configurarEventos() {
        reiniciarCamposBoton.addActionListener(evento -> reiniciarInformacionFormulario());
        registrarInsumoBoton.addActionListener(evento -> registrarInsumo());
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

    private void registrarInsumo() {

        final boolean CORRECTO = true;

        boolean estadoValidacion = validarInformacionInsumo();

        if (estadoValidacion == CORRECTO) {

            Insumo insumoCreado = crearInsumo();
            
            try {
                                
                GestorInsumos gestorInsumos = GestorInsumos.obtenerInstancia();
                gestorInsumos.agregar(insumoCreado);
                reiniciarInformacionFormulario();
                
                final String MENSAJE_EXITO = "Insumo Agregado";
                Informador.mostrarMensajeDeInformacion(MENSAJE_EXITO);
                
            } catch (ExcepcionInsumoNoEncontrado | ExcepcionElementoYaExistente ex) {
                Logger.getLogger(FormularioRegistroInsumo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private boolean validarInformacionInsumo() {

        if (estaCompletaInformacionFormulario()) {

            return true;

        } else {

            final String MENSAJE_CAMPOS_INCOMPLETOS = 
                    "¡Rellena todos los campos!";
            Informador.mostrarMensajeDeError(MENSAJE_CAMPOS_INCOMPLETOS);

            return false;
        }

    }

    private Insumo crearInsumo() {
        
        String codigo = codigoCampo.getText();
        String nombre = nombreCampo.getText();
        double costo = Double.parseDouble(costoCampo.getText());
        int cantidadActual = Integer.parseInt(cantidadActualCampo.getText());
        
        Insumo insumoCreado = new Insumo(codigo, nombre, costo, "KG", cantidadActual);
        return insumoCreado;
    
    }
}
