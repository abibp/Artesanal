package presentacion.ventas;

import java.awt.Component;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
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
    private LinkedList<Object> productosVentaActual;

    public RegistroVentasPanel() {
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

        totalVentaCampo.setEditable(false);
        totalVentaCampo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloFondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(codigoProductoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(codigoProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(busquedaCodigoProductoBoton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                            .addComponent(cantidadProductoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(cantidadProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(agregarProductoBoton)
                            .addGap(78, 78, 78))
                        .addGroup(fondoPanelLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(barraDesplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(fondoPanelLayout.createSequentialGroup()
                                    .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                                            .addComponent(totalVentaEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(totalVentaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(47, 47, 47))
                                        .addGroup(fondoPanelLayout.createSequentialGroup()
                                            .addComponent(abonoBoton)
                                            .addGap(18, 18, 18)
                                            .addComponent(retiroBoton)))
                                    .addComponent(cobroBoton)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addGap(774, 774, 774)
                        .addComponent(removerProductoBoton)))
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(reiniciarCamposBoton)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                        .addComponent(accionIconoEtiqueta)
                        .addGap(39, 39, 39))))
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(totalVentaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addComponent(tituloFondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(accionIconoEtiqueta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(reiniciarCamposBoton))
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoProductoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadProductoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadProductoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(busquedaCodigoProductoBoton)
                            .addComponent(agregarProductoBoton))
                        .addGap(18, 18, 18)
                        .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removerProductoBoton)
                            .addComponent(abonoBoton)
                            .addComponent(retiroBoton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraDesplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(totalVentaEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(cobroBoton)))
                .addGap(37, 37, 37))
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

        productosVentaActual = new LinkedList<>();

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
        abonoBoton.addActionListener(evento -> realizarAbono());
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
            
            String codigo = codigoProductoCampo.getText();
            double cantidad = Double.parseDouble(cantidadProductoCampo.getText());
            productosVentaActual.add("");
            //TODO: asignar el resultado del metodo a una variable producto y enviarla a negocio
        }
    }

    private void removerProductoVenta() {

        boolean hayUnaFilaSeleccionada = productosVentaActualTabla.getSelectedRow() >= 0;

        if (hayUnaFilaSeleccionada) {

            int indiceFilaSeleccionada = productosVentaActualTabla.getSelectedRow();
            productosVentaActualTablaModelo.eliminarFila(indiceFilaSeleccionada);
            productosVentaActual.remove(indiceFilaSeleccionada);

        } else {

            final String NO_SELECCIONO_FILA_MENSAJE = "¡ No seleccionaste un producto !";

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
        productosVentaActual.clear();
    }

    private void realizarCobro() {

        boolean CORRECTO = true;
        boolean ventaValida = !productosVentaActualTablaModelo.estaVacia();

        if (ventaValida) {

            String pagoCliente = JOptionPane.showInputDialog("Ingresa la cantidad a abonar");
            boolean estadoValidacionPago = validarPagoCliente(pagoCliente);

            if (estadoValidacionPago == CORRECTO) {

                double cantidadPagadaCliente
                        = Double.parseDouble(pagoCliente);
                double importeTotalVenta = Double.parseDouble(totalVentaCampo.getText());

                //TODO: registrar la venta.
                
                mostrarImporteCambio(cantidadPagadaCliente, importeTotalVenta);
                reiniciarDatosVenta();
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

                final String NO_SELECCIONO_CANTIDAD = "¡ Selecciona una cantidad !";

                Informador.mostrarMensajeDeError(NO_SELECCIONO_CANTIDAD);
                return false;
            }

        } else {

            final String NO_SELECCIONO_PRODUCTO = "¡ Selecciona un producto !";

            Informador.mostrarMensajeDeError(NO_SELECCIONO_PRODUCTO);
            return false;

        }
    }

    private void realizarAbono() {

        String abono = JOptionPane.showInputDialog("Ingresa la cantidad a abonar");
        try {

            double cantidadPorAbonar = Double.parseDouble(abono);
            //TODO: avisar al gestor caja

        } catch (NumberFormatException excepcion) {

            final String CANTIDAD_NO_VALIDA_MENSAJE = "Ingresa una cantidad valida";

            Informador.mostrarMensajeDeError(CANTIDAD_NO_VALIDA_MENSAJE);

        }

    }

    private void realizarRetiro() {

        String retiro = JOptionPane.showInputDialog("Ingresa la cantidad a retirar");
        try {

            double cantidadPorRetirar = Double.parseDouble(retiro);
            //TODO: avisar al gestor caja

        } catch (NumberFormatException excepcion) {

            final String CANTIDAD_NO_VALIDA_MENSAJE = "Ingresa una cantidad valida";

            Informador.mostrarMensajeDeError(CANTIDAD_NO_VALIDA_MENSAJE);

        }

    }

    private boolean validarPagoCliente(String pagoCliente) {
        try {

            double cantidadPagadaCliente
                    = Double.parseDouble(pagoCliente);

            double importeTotalVenta = Double.parseDouble(totalVentaCampo.getText());

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

        } catch (NumberFormatException excepcion) {

            final String CANTIDAD_NO_VALIDA_MENSAJE = "Ingresa una cantidad valida";

            Informador.mostrarMensajeDeError(CANTIDAD_NO_VALIDA_MENSAJE);
            return false;
        }
    }

    private void mostrarImporteCambio(double cantidadPagadaCliente, double importeTotalVenta) {
        
        double cambio = importeTotalVenta - cantidadPagadaCliente;
        
        final String CAMBIO_MENSAJE = "Cambio : $ " + cambio;
        
        Informador.mostrarMensajeDeInformacion(CAMBIO_MENSAJE);
    }

}
