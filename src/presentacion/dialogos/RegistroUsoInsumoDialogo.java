package presentacion.dialogos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.administracion.GestorInsumos;
import negocio.entidades.Insumo;
import negocio.excepciones.ExcepcionElementoNoEncontrado;
import presentacion.utileria.RestriccionNumeroDecimalCampo;
import presentacion.utileria.Informador;
import presentacion.utileria.ModeloPersonalizadoTabla;

/**
 *
 * @author PIX
 */
public class RegistroUsoInsumoDialogo extends javax.swing.JDialog {

    private ModeloPersonalizadoTabla usoInsumosTablaModelo_;
    private ModeloPersonalizadoTabla insumosDisponiblesTablaModelo_;

    public RegistroUsoInsumoDialogo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        configurarComponentes();
    }
    
    public void establecerTablaPorAcompletar(ModeloPersonalizadoTabla usoInsumosTablaModelo){
        this.usoInsumosTablaModelo_ = usoInsumosTablaModelo;
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
        agregarUsoInsumoBoton = new javax.swing.JButton();
        barraDesplazamientoTabla = new javax.swing.JScrollPane();
        insumosDisponiblesTabla = new javax.swing.JTable();
        nombreInsumoCampo = new javax.swing.JTextField();
        nombreInsumoEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        cantidadUsoCampo = new javax.swing.JTextField();
        cantidadInsumoEtiqueta = new org.edisoncor.gui.label.LabelMetric();
        idInsumoCampo = new javax.swing.JTextField();
        idEtiqueta = new org.edisoncor.gui.label.LabelMetric();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/madera_fondo.jpg"))); // NOI18N

        tituloFondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/titulo.jpg"))); // NOI18N

        clavoIzquierdoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        clavoDerechoIconoEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/clavo.png"))); // NOI18N

        tituloPanel.setText("Insumos Disponibles");
        tituloPanel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        insumosUsadosEtiqueta.setText("Da doble click sobre un insumo para seleccionarlo");
        insumosUsadosEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout tituloFondoPanelLayout = new javax.swing.GroupLayout(tituloFondoPanel);
        tituloFondoPanel.setLayout(tituloFondoPanelLayout);
        tituloFondoPanelLayout.setHorizontalGroup(
            tituloFondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloFondoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tituloFondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tituloFondoPanelLayout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(insumosUsadosEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(tituloFondoPanelLayout.createSequentialGroup()
                        .addComponent(clavoIzquierdoIconoEtiqueta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(clavoDerechoIconoEtiqueta)
                        .addGap(22, 22, 22))))
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

        agregarUsoInsumoBoton.setBackground(new java.awt.Color(153, 0, 0));
        agregarUsoInsumoBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        agregarUsoInsumoBoton.setForeground(new java.awt.Color(255, 255, 255));
        agregarUsoInsumoBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/registrar.png"))); // NOI18N
        agregarUsoInsumoBoton.setText("Registrar");

        insumosDisponiblesTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        barraDesplazamientoTabla.setViewportView(insumosDisponiblesTabla);

        nombreInsumoCampo.setEditable(false);
        nombreInsumoCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        nombreInsumoEtiqueta.setText("Nombre :");
        nombreInsumoEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        cantidadUsoCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        cantidadInsumoEtiqueta.setText("Cantidad :");
        cantidadInsumoEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        idInsumoCampo.setEditable(false);
        idInsumoCampo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        idEtiqueta.setText("ID :");
        idEtiqueta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraDesplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idInsumoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fondoPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(idEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoPanelLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(nombreInsumoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(cantidadInsumoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(agregarUsoInsumoBoton)
                                    .addComponent(nombreInsumoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(cantidadUsoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addComponent(tituloFondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addComponent(tituloFondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barraDesplazamientoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreInsumoEtiqueta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(idEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cantidadInsumoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidadUsoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreInsumoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(idInsumoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(agregarUsoInsumoBoton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarUsoInsumoBoton;
    private javax.swing.JScrollPane barraDesplazamientoTabla;
    private org.edisoncor.gui.label.LabelMetric cantidadInsumoEtiqueta;
    private javax.swing.JTextField cantidadUsoCampo;
    private javax.swing.JLabel clavoDerechoIconoEtiqueta;
    private javax.swing.JLabel clavoIzquierdoIconoEtiqueta;
    private org.edisoncor.gui.panel.PanelImage fondoPanel;
    private org.edisoncor.gui.label.LabelMetric idEtiqueta;
    private javax.swing.JTextField idInsumoCampo;
    private javax.swing.JTable insumosDisponiblesTabla;
    private org.edisoncor.gui.label.LabelMetric insumosUsadosEtiqueta;
    private javax.swing.JTextField nombreInsumoCampo;
    private org.edisoncor.gui.label.LabelMetric nombreInsumoEtiqueta;
    private org.edisoncor.gui.panel.PanelImage tituloFondoPanel;
    private org.edisoncor.gui.label.LabelMetric tituloPanel;
    // End of variables declaration//GEN-END:variables

    private void configurarComponentes() {

        cantidadUsoCampo.addKeyListener(new RestriccionNumeroDecimalCampo());
        cantidadUsoCampo.setTransferHandler(null);

        agregarUsoInsumoBoton.addActionListener(evento -> registrarUsoInsumo());

        String[] cabeceraTabla = {"ID insumo", "Nombre", "Costo", "Existencia", "Unidad Medida"};
        insumosDisponiblesTablaModelo_ = new ModeloPersonalizadoTabla(cabeceraTabla);
        insumosDisponiblesTabla.setModel(insumosDisponiblesTablaModelo_);
        llenarTabla();
        agregarEventoTabla();
    }

    private void llenarTabla() {
        try {
            ArrayList<Insumo> insumos = GestorInsumos.obtenerInstancia().obtenerLista();
            for(Insumo actual : insumos){
                agregarFilaTabla(actual);
            }  
        } catch (ExcepcionElementoNoEncontrado ex) {
            Logger.getLogger(RegistroUsoInsumoDialogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void agregarEventoTabla() {

        final int DOBLE_CLICK = 2;

        this.insumosDisponiblesTabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent eventoClick) {
                if (eventoClick.getClickCount() == DOBLE_CLICK) {
                    autocompletarInformacionInsumo();
                }
            }

        });
    }

    private void autocompletarInformacionInsumo() {

        boolean esFilaValida = insumosDisponiblesTabla.getSelectedRow() >= 0;

        if (esFilaValida) {

            String nombreInsumo = obtenerNombreInsumoSeleccionado();
            nombreInsumoCampo.setText(nombreInsumo);

            String IDInsumo = obtenerIDInsumoSeleccionado();
            idInsumoCampo.setText(IDInsumo);

        }
    }

    private String obtenerNombreInsumoSeleccionado() {

        final int INDICE_NOMBRE_COLUMNA = 1;
        int filaSeleccionada = insumosDisponiblesTabla.getSelectedRow();

        Object celdaNombre = insumosDisponiblesTabla.getValueAt(
                filaSeleccionada, INDICE_NOMBRE_COLUMNA);

        return celdaNombre.toString();

    }

    private String obtenerIDInsumoSeleccionado() {

        final int INDICE_ID_COLUMNA = 0;
        int filaSeleccionada = insumosDisponiblesTabla.getSelectedRow();

        Object celdaNombre = insumosDisponiblesTabla.getValueAt(
                filaSeleccionada, INDICE_ID_COLUMNA);

        return celdaNombre.toString();

    }

    private boolean estanCompletosCampos() {
        String nombreInsumo = nombreInsumoCampo.getText();
        String cantidadUsada = cantidadUsoCampo.getText();

        return !nombreInsumo.isEmpty() && !cantidadUsada.isEmpty();

    }

    private void registrarUsoInsumo() {

        if (estanCompletosCampos()) {

            agregarFilaUsoInsumo();
            dispose();

        } else {

            final String MENSAJE_CAMPOS_INCOMPLETOS = "¡Rellena todos los campos!";
            Informador.mostrarMensajeDeError(MENSAJE_CAMPOS_INCOMPLETOS);
            
        }
    }

    private void agregarFilaUsoInsumo() {
        
        String cantidadUsadaInsumo = cantidadUsoCampo.getText();
        String nombreInsumo = nombreInsumoCampo.getText();
        String IDInsumo = idInsumoCampo.getText();

        ArrayList fila = new ArrayList();
        
        fila.add(IDInsumo);
        fila.add(nombreInsumo);
        fila.add(cantidadUsadaInsumo);
        
        this.usoInsumosTablaModelo_.agregarFila(fila);
    }

     private void agregarFilaTabla(Insumo actual) {
        
        ArrayList fila = new ArrayList();
        fila.add(actual.obtenerID());
        fila.add(actual.obtenerNombre());
        fila.add(actual.obtenerCosto());
        fila.add(actual.obtenerExistencia());
        fila.add(actual.obtenerUnidadMedida());
        insumosDisponiblesTablaModelo_.agregarFila(fila);
        
    }
}
