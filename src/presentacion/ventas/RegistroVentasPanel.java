package presentacion.ventas;

import java.awt.Component;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import negocio.administracion.Cajero;
import negocio.administracion.GestorProductos;
import negocio.entidades.ElementoNota;
import negocio.entidades.Producto;
import negocio.excepciones.ExcepcionElementoNoEncontrado;
import negocio.excepciones.ExcepcionExistenciasInsuficientes;
import presentacion.dialogos.AutocompletadoCodigoProductoDialogo;
import presentacion.utileria.ModeloPersonalizadoTabla;
import presentacion.utileria.RestriccionNumeroDecimalCampo;
import presentacion.utileria.Informador;

/**
 *
 * @author PIX
 */
public class RegistroVentasPanel extends javax.swing.JPanel {

    private ModeloPersonalizadoTabla productosVentaActualTablaModelo;
    private ArrayList<ElementoNota> notaVenta_;
    private final Cajero cajeroActual;

    public RegistroVentasPanel() {
        initComponents();
        configurarComponentes();
        configurarEventos();
        cajeroActual = Cajero.obtenerInstancia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new org.edisoncor.gui.panel.PanelImage();
        tituloFondoPanel = new org.edisoncor.gui.panel.PanelImage();
        clavoIzquierdoIconoEtiqueta = new javax.swing.JLabel();
        clavoDerechoIconoEtiqueta = new javax.swing.JLabel();
        tituloPanel = new org.edisoncor.gui.label.LabelMetric();
        cobroBoton = new javax.swing.JButton();
        barraDesplazamientoTabla = new javax.swing.JScrollPane();
        productosVentaActualTabla = new javax.swing.JTable();
        codigoProductoEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        accionIconoEtiqueta = new javax.swing.JLabel();
        agregarProductoBoton = new javax.swing.JButton();
        removerProductoBoton = new javax.swing.JButton();
        reiniciarCamposBoton = new javax.swing.JButton();
        codigoProductoCampo = new javax.swing.JTextField();
        cantidadProductoCampo = new javax.swing.JTextField();
        cantidadProductoEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        busquedaCodigoProductoBoton = new javax.swing.JButton();
        abonoBoton = new javax.swing.JButton();
        retiroBoton = new javax.swing.JButton();
        totalVentaEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        pagoClienteCampo = new javax.swing.JTextField();
        pagoClienteEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        totalVentaCampo = new javax.swing.JTextField();

        fondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/madera_fondo.jpg"))); // NOI18N

        tituloFondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/titulo.jpg"))); // NOI18N

        clavoIzquierdoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        clavoDerechoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        tituloPanel.setText("Registro de Ventas");
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

        cobroBoton.setBackground(new java.awt.Color(153, 0, 0));
        cobroBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cobroBoton.setForeground(new java.awt.Color(255, 255, 255));
        cobroBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/registrar.png"))); // NOI18N
        cobroBoton.setText("Cobrar");

        productosVentaActualTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        barraDesplazamientoTabla.setViewportView(productosVentaActualTabla);

        codigoProductoEtiqueta.setText("Codigo Producto :");
        codigoProductoEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        accionIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/venta.png"))); // NOI18N

        agregarProductoBoton.setBackground(new java.awt.Color(102, 0, 0));
        agregarProductoBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        agregarProductoBoton.setForeground(new java.awt.Color(255, 255, 255));
        agregarProductoBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/agregar_insumo.png"))); // NOI18N
        agregarProductoBoton.setText("Agregar Producto");

        removerProductoBoton.setBackground(new java.awt.Color(102, 0, 0));
        removerProductoBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        removerProductoBoton.setForeground(new java.awt.Color(255, 255, 255));
        removerProductoBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/borrar_insumo.png"))); // NOI18N
        removerProductoBoton.setText("Eliminar Producto");

        reiniciarCamposBoton.setBackground(new java.awt.Color(102, 0, 0));
        reiniciarCamposBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        reiniciarCamposBoton.setForeground(new java.awt.Color(255, 255, 255));
        reiniciarCamposBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/borrador.png"))); // NOI18N
        reiniciarCamposBoton.setText("Cancelar Venta");

        codigoProductoCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        cantidadProductoCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        cantidadProductoEtiqueta.setText("Cantidad :");
        cantidadProductoEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        busquedaCodigoProductoBoton.setBackground(new java.awt.Color(153, 0, 0));
        busquedaCodigoProductoBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        busquedaCodigoProductoBoton.setForeground(new java.awt.Color(255, 255, 255));
        busquedaCodigoProductoBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/buscar.png"))); // NOI18N
        busquedaCodigoProductoBoton.setText("Buscar");

        abonoBoton.setBackground(new java.awt.Color(102, 0, 0));
        abonoBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        abonoBoton.setForeground(new java.awt.Color(255, 255, 255));
        abonoBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/abono.png"))); // NOI18N
        abonoBoton.setText("Abonar Dinero");

        retiroBoton.setBackground(new java.awt.Color(102, 0, 0));
        retiroBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        retiroBoton.setForeground(new java.awt.Color(255, 255, 255));
        retiroBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/retiro.png"))); // NOI18N
        retiroBoton.setText("Retirar Dinero");

        totalVentaEtiqueta.setText("Total :");
        totalVentaEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        pagoClienteCampo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        pagoClienteEtiqueta.setText("Pago del Cliente :");
        pagoClienteEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        totalVentaCampo.setEditable(false);
        totalVentaCampo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloFondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addComponent(codigoProductoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(codigoProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busquedaCodigoProductoBoton)
                        .addGap(51, 51, 51)
                        .addComponent(cantidadProductoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removerProductoBoton)
                            .addComponent(agregarProductoBoton)))
                    .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(barraDesplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(fondoPanelLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(totalVentaEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(totalVentaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pagoClienteEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(pagoClienteCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(76, 76, 76)
                            .addComponent(cobroBoton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                            .addComponent(reiniciarCamposBoton)
                            .addGap(74, 74, 74))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                            .addComponent(accionIconoEtiqueta)
                            .addGap(49, 49, 49)))
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(retiroBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(abonoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                        .addGap(50, 50, 50))))
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addComponent(tituloFondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(accionIconoEtiqueta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reiniciarCamposBoton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(codigoProductoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codigoProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(busquedaCodigoProductoBoton)
                                    .addComponent(cantidadProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadProductoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(fondoPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(agregarProductoBoton)
                                    .addComponent(abonoBoton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removerProductoBoton)
                            .addComponent(retiroBoton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(barraDesplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cobroBoton)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pagoClienteCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalVentaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalVentaEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                                .addComponent(pagoClienteEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGap(58, 58, 58))))
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
    private javax.swing.JButton abonoBoton;
    private javax.swing.JLabel accionIconoEtiqueta;
    private javax.swing.JButton agregarProductoBoton;
    private javax.swing.JScrollPane barraDesplazamientoTabla;
    private javax.swing.JButton busquedaCodigoProductoBoton;
    private javax.swing.JTextField cantidadProductoCampo;
    private org.edisoncor.gui.label.LabelMetric cantidadProductoEtiqueta;
    private javax.swing.JLabel clavoDerechoIconoEtiqueta;
    private javax.swing.JLabel clavoIzquierdoIconoEtiqueta;
    private javax.swing.JButton cobroBoton;
    private javax.swing.JTextField codigoProductoCampo;
    private org.edisoncor.gui.label.LabelMetric codigoProductoEtiqueta;
    private org.edisoncor.gui.panel.PanelImage fondoPanel;
    private javax.swing.JTextField pagoClienteCampo;
    private org.edisoncor.gui.label.LabelMetric pagoClienteEtiqueta;
    private javax.swing.JTable productosVentaActualTabla;
    private javax.swing.JButton reiniciarCamposBoton;
    private javax.swing.JButton removerProductoBoton;
    private javax.swing.JButton retiroBoton;
    private org.edisoncor.gui.panel.PanelImage tituloFondoPanel;
    private org.edisoncor.gui.label.LabelMetric tituloPanel;
    private javax.swing.JTextField totalVentaCampo;
    private org.edisoncor.gui.label.LabelMetric totalVentaEtiqueta;
    // End of variables declaration//GEN-END:variables

    private void configurarComponentes() {

        cantidadProductoCampo.addKeyListener(new RestriccionNumeroDecimalCampo());
        cantidadProductoCampo.setTransferHandler(null);
        pagoClienteCampo.addKeyListener(new RestriccionNumeroDecimalCampo());
        pagoClienteCampo.setTransferHandler(null);

        notaVenta_ = new ArrayList<>();

        String[] cabeceraTabla = {"ID producto", "nombre", "precio", "cantidad", "importe"};
        productosVentaActualTablaModelo = new ModeloPersonalizadoTabla(cabeceraTabla);
        productosVentaActualTabla.setModel(productosVentaActualTablaModelo);

    }

    private void configurarEventos() {
        busquedaCodigoProductoBoton.addActionListener(evento -> completarCodigoProducto());
        agregarProductoBoton.addActionListener(evento -> agregarProductoVenta());
        removerProductoBoton.addActionListener(evento -> removerProductoVenta());
        reiniciarCamposBoton.addActionListener(evento -> reiniciarDatosVenta());
        cobroBoton.addActionListener(evento -> realizarCobro());
        abonoBoton.addActionListener(evento -> realizarDeposito());
        retiroBoton.addActionListener(evento -> realizarRetiro());
    }

    private void completarCodigoProducto() {

        final boolean MODO_DIALOGO = true;
        JFrame ventanaActiva = (JFrame) SwingUtilities.getWindowAncestor(this);

        AutocompletadoCodigoProductoDialogo dialogoAutocompletado
                = new AutocompletadoCodigoProductoDialogo(ventanaActiva, MODO_DIALOGO);

        dialogoAutocompletado.establecerCampoPorAutocompletar(codigoProductoCampo);

        dialogoAutocompletado.mostrarEnPantalla();

    }

    private void agregarProductoVenta() {
        final boolean CORRECTO = true;

        boolean estadoValidacion = validarInformacionProducto();

        if (estadoValidacion == CORRECTO) {

            try {

                String codigo = codigoProductoCampo.getText();
                GestorProductos gestorProducto = GestorProductos.obtenerInstancia();
                Producto productoObtenido = gestorProducto.obtener(codigo);

                actualizarNotaVenta(productoObtenido);
                agregarFila(productoObtenido);
                totalVentaCampo.setText(String.valueOf(calcularTotalVenta()));

                final String VACIO = "";
                codigoProductoCampo.setText(VACIO);
                cantidadProductoCampo.setText(VACIO);

            } catch (ExcepcionElementoNoEncontrado ex) {
                Logger.getLogger(RegistroVentasPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void removerProductoVenta() {

        boolean hayUnaFilaSeleccionada = productosVentaActualTabla.getSelectedRow() >= 0;

        if (hayUnaFilaSeleccionada) {

            int indiceFilaSeleccionada = productosVentaActualTabla.getSelectedRow();
            productosVentaActualTablaModelo.eliminarFila(indiceFilaSeleccionada);
            notaVenta_.remove(indiceFilaSeleccionada);

        } else {

            final String NO_SELECCIONO_FILA_MENSAJE = "¡No seleccionaste un producto!";

            Informador.mostrarMensajeDeError(NO_SELECCIONO_FILA_MENSAJE);

        }

    }

    private void reiniciarDatosVenta() {
        final String VACIO = "";

        for (Component componente : fondoPanel.getComponents()) {

            if (componente instanceof JTextField) {

                JTextField campoTexto = (JTextField) componente;

                campoTexto.setText(VACIO);

            }
        }

        productosVentaActualTablaModelo.reiniciarTabla();
        notaVenta_.clear();
    }

    private void realizarCobro() {

        boolean estaVacia = productosVentaActualTablaModelo.estaVacia();
        boolean esVentaValida = !estaVacia;

        if (esVentaValida) {

            double cantidadPagadaCliente = Double.parseDouble(pagoClienteCampo.getText());
            boolean estadoValidacionPago = validarPagoCliente(cantidadPagadaCliente);

            boolean CORRECTO = true;
            if (estadoValidacionPago == CORRECTO) {

                double importeTotalVenta = Double.parseDouble(totalVentaCampo.getText());

                try {

                    cajeroActual.realizarVenta(notaVenta_, cantidadPagadaCliente);
                    mostrarImporteCambio(cantidadPagadaCliente, importeTotalVenta);
                    reiniciarDatosVenta();
                } catch (ExcepcionElementoNoEncontrado | ExcepcionExistenciasInsuficientes ex) {
                    Logger.getLogger(RegistroVentasPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        } else {

            final String NO_HAY_PRODUCTOS_MENSAJE = "¡ No hay ningun producto en esta venta !";

            Informador.mostrarMensajeDeError(NO_HAY_PRODUCTOS_MENSAJE);

        }

    }

    private boolean validarInformacionProducto() {

        String codigo = codigoProductoCampo.getText();
        String cantidad = cantidadProductoCampo.getText();

        if (!codigo.isEmpty()) {

            if (!cantidad.isEmpty()) {

                return true;

            } else {

                final String NO_SELECCIONO_CANTIDAD = "¡Selecciona una cantidad!";

                Informador.mostrarMensajeDeError(NO_SELECCIONO_CANTIDAD);
                return false;
            }

        } else {

            final String NO_SELECCIONO_PRODUCTO = "¡Selecciona un producto!";

            Informador.mostrarMensajeDeError(NO_SELECCIONO_PRODUCTO);
            return false;

        }
    }

    private void realizarDeposito() {

        String deposito = JOptionPane.showInputDialog("Ingresa la cantidad a abonar");
        try {

            double cantidadPorDepositar = Double.parseDouble(deposito);
            cajeroActual.despositar(cantidadPorDepositar);

        } catch (NumberFormatException excepcion) {

            final String CANTIDAD_NO_VALIDA_MENSAJE = "Ingresa una cantidad valida";

            Informador.mostrarMensajeDeError(CANTIDAD_NO_VALIDA_MENSAJE);

        }

    }

    private void realizarRetiro() {

        String retiro = JOptionPane.showInputDialog("Ingresa la cantidad a retirar");
        try {

            double cantidadPorRetirar = Double.parseDouble(retiro);
            cajeroActual.retirar(cantidadPorRetirar);

        } catch (NumberFormatException excepcion) {

            final String CANTIDAD_NO_VALIDA_MENSAJE = "Ingresa una cantidad valida";

            Informador.mostrarMensajeDeError(CANTIDAD_NO_VALIDA_MENSAJE);

        }

    }

    private boolean validarPagoCliente(double cantidadPagadaCliente) {

        double importeTotalVenta = Double.parseDouble(pagoClienteCampo.getText());

        if (cantidadPagadaCliente >= importeTotalVenta) {

            return true;

        } else {

            double faltante = importeTotalVenta - cantidadPagadaCliente;

            final String FALTA_DINERO_MENSAJE = "Al cliente le falta "
                    + faltante
                    + " para cubrir el total de la venta.";

            Informador.mostrarMensajeDeInformacion(FALTA_DINERO_MENSAJE);

            return false;
        }

    }

    private void mostrarImporteCambio(double cantidadPagadaCliente, double importeTotalVenta) {

        double cambio = cantidadPagadaCliente - importeTotalVenta;

        final String CAMBIO_MENSAJE = "Cambio : $ " + cambio;

        Informador.mostrarMensajeDeInformacion(CAMBIO_MENSAJE);
    }

    private void agregarFila(Producto producto) {

        int cantidad = Integer.parseInt(cantidadProductoCampo.getText());

        int indiceProducto = indiceDeProductoEnTabla(producto);
        boolean existeProductoEnTabla = indiceProducto != -1;

        if (existeProductoEnTabla) {
            incrementarCantidadProductoEnTabla(indiceProducto, cantidad, producto);
        } else {

            agregarProductoTabla(producto, cantidad);
        }

    }

    private void actualizarNotaVenta(Producto productoObtenido) {

        int cantidad = Integer.parseInt(cantidadProductoCampo.getText());
        ElementoNota elementoNota = new ElementoNota(cantidad, productoObtenido);

        int indiceProducto = indiceDeProductoEnTabla(productoObtenido);
        boolean existeProductoEnTabla = indiceProducto != -1;
        notaVenta_.add(elementoNota);
    }

    private double calcularTotalVenta() {

        double importeTotal = 0.0;
        for (ElementoNota actual : notaVenta_) {
            importeTotal += actual.obtenerImporte();
        }
        return importeTotal;

    }

    private int indiceDeProductoEnTabla(Producto productoVenta) {

        final int INDICE_COLUMNA_ID = 0;
        final int NO_ENCONTRADO = -1;

        for (int indice = 0; indice < productosVentaActualTablaModelo.getRowCount(); indice++) {

            String IDProductoActual = productosVentaActualTablaModelo.getValueAt(indice, INDICE_COLUMNA_ID).toString();
            if (IDProductoActual.equals(productoVenta.obtenerID())) {
                return indice;
            }
        }

        return NO_ENCONTRADO;
    }

    private void incrementarCantidadProductoEnTabla(
            int indiceProducto,
            int cantidadAdicionalProductosVenta,
            Producto productoVenta) {

        final int INDICE_COLUMNA_CANTIDAD = 3;
        final int INDICE_COLUMNA_MONTO = 4;

        int cantidadProductosVenta
                = ((Integer) productosVentaActualTablaModelo.getValueAt(indiceProducto, INDICE_COLUMNA_CANTIDAD));

        int nuevaCantidadProductosVenta = cantidadProductosVenta + cantidadAdicionalProductosVenta;
        productosVentaActualTablaModelo.setValueAt(nuevaCantidadProductosVenta, indiceProducto, INDICE_COLUMNA_CANTIDAD);

        double montoParcialVenta = nuevaCantidadProductosVenta * productoVenta.obtenerPrecio();
        productosVentaActualTablaModelo.setValueAt(montoParcialVenta, indiceProducto, INDICE_COLUMNA_MONTO);
    }

    private void agregarProductoTabla(Producto producto, int cantidad) {

        ArrayList fila = new ArrayList();
        fila.add(producto.obtenerID());
        fila.add(producto.obtenerNombre());
        fila.add(producto.obtenerPrecio());
        fila.add(cantidad);
        double importeIndividual = cantidad * producto.obtenerPrecio();
        fila.add(importeIndividual);

        productosVentaActualTablaModelo.agregarFila(fila);
    }
}
