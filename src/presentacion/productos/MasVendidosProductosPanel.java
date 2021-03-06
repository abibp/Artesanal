package presentacion.productos;

import presentacion.utileria.ModeloPersonalizadoTabla;

/**
 *
 * @author PIX
 */
public class MasVendidosProductosPanel extends javax.swing.JPanel{

    private ModeloPersonalizadoTabla productosFrecuentesTablaModelo;

    public MasVendidosProductosPanel() {
        initComponents();
        configurarComponentes();
        configurarEvento();
        mostrarInformacionTodosLosProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new org.edisoncor.gui.panel.PanelImage();
        tituloFondoPanel = new org.edisoncor.gui.panel.PanelImage();
        clavoIzquierdoIconoEtiqueta = new javax.swing.JLabel();
        clavoDerechoIconoEtiqueta = new javax.swing.JLabel();
        tituloPanel = new org.edisoncor.gui.label.LabelMetric();
        barraDesplazamientoTabla = new javax.swing.JScrollPane();
        productosInventarioTabla = new javax.swing.JTable();
        accionIconoEtiqueta = new javax.swing.JLabel();
        buscarProductosBoton = new javax.swing.JButton();
        criteriosListaDesplegable = new javax.swing.JComboBox();

        fondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/madera_fondo.jpg"))); // NOI18N

        tituloFondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/titulo.jpg"))); // NOI18N

        clavoIzquierdoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        clavoDerechoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        tituloPanel.setText("Productos Mas Vendidos");
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
                .addGap(303, 303, 303)
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

        productosInventarioTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        barraDesplazamientoTabla.setViewportView(productosInventarioTabla);

        accionIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/mas_vendidos_main.png"))); // NOI18N

        buscarProductosBoton.setBackground(new java.awt.Color(102, 0, 0));
        buscarProductosBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buscarProductosBoton.setForeground(new java.awt.Color(255, 255, 255));
        buscarProductosBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/buscar.png"))); // NOI18N
        buscarProductosBoton.setText("Buscar");

        criteriosListaDesplegable.setBackground(new java.awt.Color(153, 0, 0));
        criteriosListaDesplegable.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        criteriosListaDesplegable.setForeground(new java.awt.Color(255, 255, 255));
        criteriosListaDesplegable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Este Dia", "Esta Semana", "Este Mes", "Este Año" }));

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloFondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addComponent(criteriosListaDesplegable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(buscarProductosBoton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(barraDesplazamientoTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accionIconoEtiqueta)
                .addGap(151, 151, 151))
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addComponent(tituloFondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fondoPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(accionIconoEtiqueta))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fondoPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(criteriosListaDesplegable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarProductosBoton))
                        .addGap(23, 23, 23)
                        .addComponent(barraDesplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accionIconoEtiqueta;
    private javax.swing.JScrollPane barraDesplazamientoTabla;
    private javax.swing.JButton buscarProductosBoton;
    private javax.swing.JLabel clavoDerechoIconoEtiqueta;
    private javax.swing.JLabel clavoIzquierdoIconoEtiqueta;
    private javax.swing.JComboBox criteriosListaDesplegable;
    private org.edisoncor.gui.panel.PanelImage fondoPanel;
    private javax.swing.JTable productosInventarioTabla;
    private org.edisoncor.gui.panel.PanelImage tituloFondoPanel;
    private org.edisoncor.gui.label.LabelMetric tituloPanel;
    // End of variables declaration//GEN-END:variables

    private void configurarComponentes() {

        String[] cabeceraTabla = {"ID Producto","Nombre","Precio","Costo", "Cantidad","Cantidad Minima","Estado","Cantidad Veces Vendido"};
        productosFrecuentesTablaModelo = new ModeloPersonalizadoTabla(cabeceraTabla);
        productosInventarioTabla.setModel(productosFrecuentesTablaModelo);

    }


    private void configurarEvento() {

        buscarProductosBoton.addActionListener(evento -> buscarProductos());

    }

    private void mostrarInformacionTodosLosProductos() {
        
        productosFrecuentesTablaModelo.reiniciarTabla();
        //TODO: pedir informacion al gestor productos
    }

    private void buscarProductos() {
        productosFrecuentesTablaModelo.reiniciarTabla();
        String criterioBusqueda = criteriosListaDesplegable.getSelectedItem().toString();
         //TODO: recibir una lista de productos y actualizar la tabla
        
    }

}
