package presentacion.dialogos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import negocio.administracion.GestorProductos;
import negocio.entidades.Producto;
import negocio.entidades.Proveedor;
import negocio.excepciones.ExcepcionElementoNoEncontrado;
import negocio.excepciones.ExcepcionElementoYaExistente;
import negocio.excepciones.ExcepcionListaVacia;
import presentacion.utileria.ModeloPersonalizadoTabla;

/**
 *
 * @author PIX
 */
public class AutocompletadoCodigoProductoDialogo extends javax.swing.JDialog {

    private JTextField campoPorLlenar_;
    private ModeloPersonalizadoTabla productosTablaModelo_;
    
    public AutocompletadoCodigoProductoDialogo(java.awt.Frame parent, boolean modal) throws ExcepcionListaVacia, ExcepcionElementoYaExistente {
        super(parent, modal);
        initComponents();
      configurarComponentes();
    }

    public void establecerCampoPorAutocompletar(JTextField campoPorLlenar) {
        this.campoPorLlenar_ = campoPorLlenar;
    }
    
    public void mostrarEnPantalla(){
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new org.edisoncor.gui.panel.PanelImage();
        tituloFondoPanel = new org.edisoncor.gui.panel.PanelImage();
        clavoIzquierdoIconoEtiqueta = new javax.swing.JLabel();
        clavoDerechoIconoEtiqueta = new javax.swing.JLabel();
        tituloPanel = new org.edisoncor.gui.label.LabelMetric();
        insumosUsadosEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        barraDesplazamientoTabla = new javax.swing.JScrollPane();
        productosTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/madera_fondo.jpg"))); // NOI18N

        tituloFondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/titulo.jpg"))); // NOI18N

        clavoIzquierdoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        clavoDerechoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        tituloPanel.setText("Productos Disponibles");
        tituloPanel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        insumosUsadosEtiqueta.setText("Da doble click sobre un producto para seleccionarlo");
        insumosUsadosEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout tituloFondoPanelLayout = new javax.swing.GroupLayout(tituloFondoPanel);
        tituloFondoPanel.setLayout(tituloFondoPanelLayout);
        tituloFondoPanelLayout.setHorizontalGroup(
            tituloFondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloFondoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clavoIzquierdoIconoEtiqueta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(clavoDerechoIconoEtiqueta)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloFondoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insumosUsadosEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        tituloFondoPanelLayout.setVerticalGroup(
            tituloFondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloFondoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tituloFondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clavoIzquierdoIconoEtiqueta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clavoDerechoIconoEtiqueta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insumosUsadosEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        productosTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        barraDesplazamientoTabla.setViewportView(productosTabla);

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(barraDesplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tituloFondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addComponent(tituloFondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barraDesplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane barraDesplazamientoTabla;
    private javax.swing.JLabel clavoDerechoIconoEtiqueta;
    private javax.swing.JLabel clavoIzquierdoIconoEtiqueta;
    private org.edisoncor.gui.panel.PanelImage fondoPanel;
    private org.edisoncor.gui.label.LabelMetric insumosUsadosEtiqueta;
    private javax.swing.JTable productosTabla;
    private org.edisoncor.gui.panel.PanelImage tituloFondoPanel;
    private org.edisoncor.gui.label.LabelMetric tituloPanel;
    // End of variables declaration//GEN-END:variables


    private void configurarComponentes() throws ExcepcionListaVacia, ExcepcionElementoYaExistente {

        String[] cabeceraTabla = {"ID producto", "Nombre", "Costo", "Precio","Existencia"};
        productosTablaModelo_ = new ModeloPersonalizadoTabla(cabeceraTabla);
        productosTabla.setModel(productosTablaModelo_);
        llenarTabla();
        agregarEventoTabla();
    }

    private void llenarTabla() throws ExcepcionListaVacia, ExcepcionElementoYaExistente {
        try {
            List<Producto> productos = GestorProductos.obtenerInstancia().obtenerLista();
            for(Producto actual : productos){
                agregarFilaTabla(actual);
            } 
        } catch (ExcepcionElementoNoEncontrado ex) {
            Logger.getLogger(AutocompletadoCodigoProductoDialogo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void agregarEventoTabla() {

        final int DOBLE_CLICK = 2;

        MouseAdapter manejadorAccionesClick = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent eventoClick) {
                if (eventoClick.getClickCount() == DOBLE_CLICK) {
                    autocompletarCodigoProducto();
                }
            }
        };
        
        this.productosTabla.addMouseListener(manejadorAccionesClick);
    }

    private void autocompletarCodigoProducto() {

        if (esFilaValida()) {
            final int INDICE_COLUMNA_ID = 0;
            int indiceFila = productosTabla.getSelectedRow();

            String valorID = productosTablaModelo_.
                    getValueAt(indiceFila, INDICE_COLUMNA_ID).toString();

            campoPorLlenar_.setText(valorID);
            cerrarVentana();
        }

    }

    private boolean esFilaValida() {

        final int NO_ENCONTRADO = -1;
        int indiceFila = productosTabla.getSelectedRow();

        return indiceFila != NO_ENCONTRADO;
    }

    private void cerrarVentana() {
        this.dispose();
    }

    private void agregarFilaTabla(Producto actual) {
        
        ArrayList fila = new ArrayList();
        
        fila.add(actual.obtenerID());
        fila.add(actual.obtenerNombre());
        fila.add(actual.obtenerCosto());
        fila.add(actual.obtenerPrecio());
        fila.add(actual.obtenerExistencia());
        
        productosTablaModelo_.agregarFila(fila);
        
    
    }

}
