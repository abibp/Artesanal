/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import javax.swing.*;


/**
 *
 * @author Astrid Briceño
 */
public class caja {
    static JFrame ventanaPrincipal = new JFrame();
    
    public static void main(String[] args) {
        //JFrame ventanaPrincipal = new JFrame();
        JPanel panelPrueba = new JPanel();
        JLabel dineroCajaLabel = new JLabel("Efectivo en caja");
        
        JTextField dineroCajaCampoTexto = new JTextField();
        JButton dineroCajaBoton  = new JButton("Registrar");
        
        panelPrueba.add(dineroCajaLabel);
        panelPrueba.add(dineroCajaCampoTexto);
        panelPrueba.add(dineroCajaBoton);
        
        ventanaPrincipal.add(panelPrueba);
        
        ventanaPrincipal.pack();
        ventanaPrincipal.setVisible(true);
        
        
    }
    
}
