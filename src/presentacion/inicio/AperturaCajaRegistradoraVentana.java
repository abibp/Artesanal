package presentacion.inicio;

import negocio.administracion.Cajero;
import presentacion.MenuPrincipalVentana;
import presentacion.utileria.RestriccionNumeroDecimalCampo;
import presentacion.utileria.Informador;

/**
 *
 * @author PIX
 */
public class AperturaCajaRegistradoraVentana extends javax.swing.JFrame {

    public AperturaCajaRegistradoraVentana() {
        initComponents();
        configurarComponentes();
        configurarEvento();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new org.edisoncor.gui.panel.PanelImage();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        dineroInicialCajaCampo = new javax.swing.JTextField();
        iniciarSistemaBoton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tituloPanel = new org.edisoncor.gui.label.LabelMetric();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/madera_fondo.jpg"))); // NOI18N

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/heladeria_intro.png"))); // NOI18N

        dineroInicialCajaCampo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        dineroInicialCajaCampo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        iniciarSistemaBoton.setBackground(new java.awt.Color(153, 0, 0));
        iniciarSistemaBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        iniciarSistemaBoton.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSistemaBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/iniciar_ventas.png"))); // NOI18N
        iniciarSistemaBoton.setText("Iniciar");

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                        .addComponent(iniciarSistemaBoton)
                        .addGap(211, 211, 211))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                        .addComponent(dineroInicialCajaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(dineroInicialCajaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iniciarSistemaBoton)
                .addGap(30, 30, 30))
        );

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        tituloPanel.setText("¿Con cuanto dinero estas abriendo Caja?");
        tituloPanel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JTextField dineroInicialCajaCampo;
    private org.edisoncor.gui.panel.PanelImage fondoPanel;
    private javax.swing.JButton iniciarSistemaBoton;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.label.LabelMetric tituloPanel;
    // End of variables declaration//GEN-END:variables

    private void configurarComponentes() {
        RestriccionNumeroDecimalCampo validadorDecimal = new RestriccionNumeroDecimalCampo();
        dineroInicialCajaCampo.addKeyListener(validadorDecimal);        
    }

    private void configurarEvento() {
        iniciarSistemaBoton.addActionListener(evento -> iniciarMenuPrincipal());
    }

    private void iniciarMenuPrincipal() {
        
        final boolean EXITOSO = true;
        boolean estadoValidacion = validarCampo();
        
        if(estadoValidacion == EXITOSO){

            double dineroInicialCaja = Double.parseDouble(
                    dineroInicialCajaCampo.getText());
            Cajero cajeroActual = Cajero.obtenerInstancia();
            cajeroActual.abrir(dineroInicialCaja);
            
            MenuPrincipalVentana menuPrincipal = new MenuPrincipalVentana();
            menuPrincipal.setVisible(true);
            dispose();
            
        }else{
            
            final String MENSAJE_CAMPO_VACIO = "¡Establece una cantidad inicial!";
            Informador.mostrarMensajeDeError(MENSAJE_CAMPO_VACIO);
        
        }
        
    }

    private boolean validarCampo() {
        
        boolean esVacioCampo = dineroInicialCajaCampo.getText().isEmpty();
        
        return !esVacioCampo;
    }
}
