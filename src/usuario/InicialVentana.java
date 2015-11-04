package usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import org.edisoncor.gui.button.ButtonAction;
import org.edisoncor.gui.label.LabelMetric;
import org.edisoncor.gui.label.LabelRect;
import org.edisoncor.gui.panel.Panel;
import org.edisoncor.gui.panel.PanelCurves;
import org.edisoncor.gui.textField.TextField;

/**
 *
 * @author PIX
 * corregir numeros maxicos esafdhfhf
 */
public class InicialVentana implements ActionListener{
    
    private JFrame ventana;
    private ButtonAction registrarCajaBoton;
    private LabelMetric dineroEnCajaInstruccionLabel;
    private LabelRect simboloPesoCantidadLabel;
    private Panel panelContenedor;
    private PanelCurves adornoPanelContenedor;
    private TextField dineroEnCajaCampo;
    
    
    public void mostrarEnPantalla(){
        
        inicializarComponentesVentana();
        
        adornoPanelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dineroEnCajaCampo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        
        adornoPanelContenedor.add(dineroEnCajaCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 220, 60));

        simboloPesoCantidadLabel.setForeground(new java.awt.Color(0, 153, 51));
        simboloPesoCantidadLabel.setText("$");
        simboloPesoCantidadLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        adornoPanelContenedor.add(simboloPesoCantidadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 60));

        dineroEnCajaInstruccionLabel.setText("¿Efectivo inicial en caja?");
        dineroEnCajaInstruccionLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        adornoPanelContenedor.add(dineroEnCajaInstruccionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 290, 50));

        registrarCajaBoton.setText("Registrar");
        adornoPanelContenedor.add(registrarCajaBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(adornoPanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(adornoPanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        
        registrarCajaBoton.addActionListener(this);
        dineroEnCajaCampo.addKeyListener(new FiltroNumericoCampo());
        ventana = new JFrame();
        ventana.setContentPane(panelContenedor);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setVisible(true);
    }
    
    public static void main(String[] args) {
        new InicialVentana().mostrarEnPantalla();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new PrincipalVentanaContenedora();
        ventana.dispose();
    }
    
    private void inicializarComponentesVentana(){
        panelContenedor = new org.edisoncor.gui.panel.Panel();
        adornoPanelContenedor = new org.edisoncor.gui.panel.PanelCurves();
        dineroEnCajaCampo = new org.edisoncor.gui.textField.TextField();
        simboloPesoCantidadLabel = new org.edisoncor.gui.label.LabelRect();
        dineroEnCajaInstruccionLabel = new org.edisoncor.gui.label.LabelMetric();
        registrarCajaBoton = new org.edisoncor.gui.button.ButtonAction();
    }
}
