package presentacion.productos;

import java.awt.Component;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import negocio.administracion.GestorProductos;
import negocio.entidades.Producto;
import negocio.excepciones.ExcepcionElementoNoEncontrado;
import presentacion.dialogos.AutocompletadoCodigoProductoDialogo;
import presentacion.dialogos.RegistroUsoInsumoDialogo;
import presentacion.utileria.ModeloPersonalizadoTabla;
import presentacion.utileria.RestriccionNumeroDecimalCampo;
import presentacion.utileria.Informador;
import presentacion.utileria.RestriccionNumeroEnteroCampo;

/**
 *
 * @author PIX
 */
public class FormularioModificacionProducto extends javax.swing.JPanel implements DocumentListener {

    private ModeloPersonalizadoTabla insumosUsadosTablaModelo;

    public FormularioModificacionProducto() {
        initComponents();
        configurarComponentes();
        configurarEventos();
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        completarInformacionProducto();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new org.edisoncor.gui.panel.PanelImage();
        tituloFondoPanel = new org.edisoncor.gui.panel.PanelImage();
        clavoIzquierdoIconoEtiqueta = new javax.swing.JLabel();
        clavoDerechoIconoEtiqueta = new javax.swing.JLabel();
        tituloPanel = new org.edisoncor.gui.label.LabelMetric();
        agregarProductoBoton = new javax.swing.JButton();
        formularioPanel = new javax.swing.JPanel();
        codigoEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        codigoCampo = new javax.swing.JTextField();
        costoCampo = new javax.swing.JTextField();
        costoEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        nombreCampo = new javax.swing.JTextField();
        nombreEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        precioCampo = new javax.swing.JTextField();
        precioEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        cantidadActualCampo = new javax.swing.JTextField();
        cantidadActualEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        completarCodigoProducto = new javax.swing.JButton();
        barraDesplazamientoTabla = new javax.swing.JScrollPane();
        insumosUsadosTabla = new javax.swing.JTable();
        insumosUsadosEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        accionIconoEtiqueta = new javax.swing.JLabel();
        agregarInsumoBoton = new javax.swing.JButton();
        removerInsumoBoton = new javax.swing.JButton();
        reiniciarCamposBoton = new javax.swing.JButton();

        fondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/madera_fondo.jpg"))); // NOI18N

        tituloFondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/titulo.jpg"))); // NOI18N

        clavoIzquierdoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        clavoDerechoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        tituloPanel.setText("Modificacion de Producto");
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
                .addGap(339, 339, 339)
                .addComponent(clavoDerechoIconoEtiqueta)
                .addGap(34, 34, 34))
        );
        tituloFondoPanelLayout.setVerticalGroup(
            tituloFondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloFondoPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(tituloFondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clavoDerechoIconoEtiqueta)
                    .addComponent(clavoIzquierdoIconoEtiqueta))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        agregarProductoBoton.setBackground(new java.awt.Color(153, 0, 0));
        agregarProductoBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        agregarProductoBoton.setForeground(new java.awt.Color(255, 255, 255));
        agregarProductoBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/registrar.png"))); // NOI18N
        agregarProductoBoton.setText("Registrar");

        formularioPanel.setBackground(new java.awt.Color(51, 0, 0));
        formularioPanel.setMaximumSize(new java.awt.Dimension(523, 405));
        formularioPanel.setMinimumSize(new java.awt.Dimension(523, 405));

        codigoEtiqueta.setText("Codigo :");
        codigoEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        codigoCampo.setEditable(false);
        codigoCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        costoCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        costoEtiqueta.setText("Costo :");
        costoEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        nombreCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        nombreEtiqueta.setText("Nombre :");
        nombreEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        precioCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        precioEtiqueta.setText("Precio :");
        precioEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        cantidadActualCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        cantidadActualEtiqueta.setText("Cantidad Actual :");
        cantidadActualEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        completarCodigoProducto.setBackground(new java.awt.Color(102, 0, 0));
        completarCodigoProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        completarCodigoProducto.setForeground(new java.awt.Color(255, 255, 255));
        completarCodigoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/buscar.png"))); // NOI18N
        completarCodigoProducto.setText("Buscar");

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
                        .addGap(69, 69, 69)
                        .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(formularioPanelLayout.createSequentialGroup()
                                .addComponent(precioEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(precioCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(formularioPanelLayout.createSequentialGroup()
                                .addComponent(nombreEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nombreCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(formularioPanelLayout.createSequentialGroup()
                                .addComponent(cantidadActualEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cantidadActualCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(formularioPanelLayout.createSequentialGroup()
                                .addComponent(codigoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(codigoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(completarCodigoProducto)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        formularioPanelLayout.setVerticalGroup(
            formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completarCodigoProducto))
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
                    .addComponent(precioEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadActualEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadActualCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        insumosUsadosTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        barraDesplazamientoTabla.setViewportView(insumosUsadosTabla);

        insumosUsadosEtiqueta.setText("Insumos Usados");
        insumosUsadosEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        accionIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/cambio_main.png"))); // NOI18N

        agregarInsumoBoton.setBackground(new java.awt.Color(102, 0, 0));
        agregarInsumoBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        agregarInsumoBoton.setForeground(new java.awt.Color(255, 255, 255));
        agregarInsumoBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/agregar_insumo.png"))); // NOI18N
        agregarInsumoBoton.setText("Agregar Insumo");

        removerInsumoBoton.setBackground(new java.awt.Color(102, 0, 0));
        removerInsumoBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        removerInsumoBoton.setForeground(new java.awt.Color(255, 255, 255));
        removerInsumoBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/borrar_insumo.png"))); // NOI18N
        removerInsumoBoton.setText("Eliminar Insumo");

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
                .addComponent(agregarProductoBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(formularioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(insumosUsadosEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregarInsumoBoton)
                            .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(removerInsumoBoton)
                                .addComponent(barraDesplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                        .addComponent(accionIconoEtiqueta)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                        .addComponent(reiniciarCamposBoton)
                        .addGap(138, 138, 138))))
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addComponent(tituloFondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(fondoPanelLayout.createSequentialGroup()
                                .addComponent(accionIconoEtiqueta)
                                .addGap(40, 40, 40)
                                .addComponent(reiniciarCamposBoton))
                            .addGroup(fondoPanelLayout.createSequentialGroup()
                                .addComponent(agregarInsumoBoton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removerInsumoBoton)
                                .addGap(18, 18, 18)
                                .addComponent(insumosUsadosEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(barraDesplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(formularioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(agregarProductoBoton)
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
    private javax.swing.JButton agregarInsumoBoton;
    private javax.swing.JButton agregarProductoBoton;
    private javax.swing.JScrollPane barraDesplazamientoTabla;
    private javax.swing.JTextField cantidadActualCampo;
    private org.edisoncor.gui.label.LabelMetric cantidadActualEtiqueta;
    private javax.swing.JLabel clavoDerechoIconoEtiqueta;
    private javax.swing.JLabel clavoIzquierdoIconoEtiqueta;
    private javax.swing.JTextField codigoCampo;
    private org.edisoncor.gui.label.LabelMetric codigoEtiqueta;
    private javax.swing.JButton completarCodigoProducto;
    private javax.swing.JTextField costoCampo;
    private org.edisoncor.gui.label.LabelMetric costoEtiqueta;
    private org.edisoncor.gui.panel.PanelImage fondoPanel;
    private javax.swing.JPanel formularioPanel;
    private org.edisoncor.gui.label.LabelMetric insumosUsadosEtiqueta;
    private javax.swing.JTable insumosUsadosTabla;
    private javax.swing.JTextField nombreCampo;
    private org.edisoncor.gui.label.LabelMetric nombreEtiqueta;
    private javax.swing.JTextField precioCampo;
    private org.edisoncor.gui.label.LabelMetric precioEtiqueta;
    private javax.swing.JButton reiniciarCamposBoton;
    private javax.swing.JButton removerInsumoBoton;
    private org.edisoncor.gui.panel.PanelImage tituloFondoPanel;
    private org.edisoncor.gui.label.LabelMetric tituloPanel;
    // End of variables declaration//GEN-END:variables

    private void configurarComponentes() {

        establecerRestriccionCampo(costoCampo, new RestriccionNumeroDecimalCampo());
        establecerRestriccionCampo(precioCampo, new RestriccionNumeroDecimalCampo());
        establecerRestriccionCampo(cantidadActualCampo, new RestriccionNumeroEnteroCampo());

        String[] cabeceraTabla = {"ID insumo", "Nombre"};
        insumosUsadosTablaModelo = new ModeloPersonalizadoTabla(cabeceraTabla);
        insumosUsadosTabla.setModel(insumosUsadosTablaModelo);

    }

    private void establecerRestriccionCampo(JTextField campo, KeyListener filtro) {
        campo.addKeyListener(filtro);
        campo.setTransferHandler(null);
    }

    private void configurarEventos() {

        completarCodigoProducto.addActionListener(evento -> autocompletarCodigoProducto());
        agregarInsumoBoton.addActionListener(evento -> agregarUsoInsumo());
        removerInsumoBoton.addActionListener(evento -> removerUsoInsumo());
        reiniciarCamposBoton.addActionListener(evento -> reiniciarInformacionFormulario());
        agregarProductoBoton.addActionListener(evento -> modificarProducto());

    }

    private void agregarUsoInsumo() {

        final boolean MODO_DIALOGO = true;
        JFrame ventanaActiva = (JFrame) SwingUtilities.getWindowAncestor(this);

        RegistroUsoInsumoDialogo dialogoAutocompletado
                = new RegistroUsoInsumoDialogo(ventanaActiva, MODO_DIALOGO);

        dialogoAutocompletado.establecerTablaPorAcompletar(insumosUsadosTablaModelo);

        dialogoAutocompletado.mostrarEnPantalla();

    }

    private void removerUsoInsumo() {

        boolean hayUnaFilaSeleccionada = insumosUsadosTabla.getSelectedRow() >= 0;

        if (hayUnaFilaSeleccionada) {

            int indiceFilaSeleccionada = insumosUsadosTabla.getSelectedRow();
            insumosUsadosTablaModelo.eliminarFila(indiceFilaSeleccionada);

        } else {

            final String NO_SELECCIONO_FILA_MENSAJE = "¡ Selecciona un insumo !";

            Informador.mostrarMensajeDeError(NO_SELECCIONO_FILA_MENSAJE);

        }

    }

    private void reiniciarInformacionFormulario() {

        final String VACIO = "";

        for (Component componente : formularioPanel.getComponents()) {

            if (componente instanceof JTextField) {

                JTextField campoTexto = (JTextField) componente;

                campoTexto.setText(VACIO);

            }
        }

        insumosUsadosTablaModelo.reiniciarTabla();
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

    private void modificarProducto() {

        final boolean CORRECTO = true;

        boolean estadoValidacion = validarInformacionProducto();

        if (estadoValidacion == CORRECTO) {

            try {
                Producto productoCreado = crearProducto();
                GestorProductos gestorProducto = GestorProductos.obtenerInstancia();
                gestorProducto.editarInformacion(productoCreado);

                boolean esProductoCompuesto = !insumosUsadosTablaModelo.estaVacia();

                if (esProductoCompuesto) {
                    modificarUsoInsumos();
                }

            } catch (ExcepcionElementoNoEncontrado ex) {
                Logger.getLogger(FormularioModificacionProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private boolean validarInformacionProducto() {

        if (estaCompletaInformacionFormulario()) {

            return true;

        } else {

            final String MENSAJE_CAMPOS_INCOMPLETOS
                    = "¡Rellena todos los campos!";
            Informador.mostrarMensajeDeError(MENSAJE_CAMPOS_INCOMPLETOS);

            return false;
        }

    }

    private Producto crearProducto() {
        String codigo = codigoCampo.getText();
        String nombre = nombreCampo.getText();
        double costo = Double.parseDouble(costoCampo.getText());
        double precio = Double.parseDouble(precioCampo.getText());
        int cantidadActual = Integer.parseInt(cantidadActualCampo.getText());

        Producto productoCreado = new Producto(codigo, nombre, costo, precio, cantidadActual);
        return productoCreado;
    }

    private void autocompletarCodigoProducto() {

        final boolean MODO_DIALOGO = true;
        JFrame ventanaActiva = (JFrame) SwingUtilities.getWindowAncestor(this);

        AutocompletadoCodigoProductoDialogo dialogoAutocompletado
                = new AutocompletadoCodigoProductoDialogo(ventanaActiva, MODO_DIALOGO);

        dialogoAutocompletado.establecerCampoPorAutocompletar(codigoCampo);

        dialogoAutocompletado.mostrarEnPantalla();
    }

    private void completarInformacionProducto() {

        String IDProducto = codigoCampo.getText();
        try {

            Producto insumoSolicitado = GestorProductos.obtenerInstancia().obtener(IDProducto);
            nombreCampo.setText(insumoSolicitado.obtenerNombre());
            costoCampo.setText(String.valueOf(insumoSolicitado.obtenerCosto()));
            precioCampo.setText(String.valueOf(insumoSolicitado.obtenerPrecio()));
            cantidadActualCampo.setText(String.valueOf(insumoSolicitado.obtenerExistencia()));

            boolean esProductoCompuesto = false;

            if (esProductoCompuesto) {

                completarInformacionUsoInsumos();

            }

            reiniciarInformacionFormulario();
        } catch (ExcepcionElementoNoEncontrado ex) {
            Logger.getLogger(FormularioModificacionProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void completarInformacionUsoInsumos() {

        //TODO: Buscar informacion sobre uso insumos
    }

    private void modificarUsoInsumos() {

        //TODO: Modificar los insumos
    }
}
