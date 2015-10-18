package usuario;

import javax.swing.*;

/**
 * Created by MiguelAngel on 17/10/2015.
 */
public class VentanaCaja{
    private JPanel caja;
    private JLabel titulo;
    private JTextField campoTexto;
    private JButton registrarButton;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Caja");
        frame.setContentPane(new VentanaCaja().caja);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
