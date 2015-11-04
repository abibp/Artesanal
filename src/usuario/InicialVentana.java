package usuario;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.edisoncor.gui.button.ButtonAction;
import org.edisoncor.gui.label.LabelMetric;
import org.edisoncor.gui.label.LabelRect;
import org.edisoncor.gui.panel.Panel;
import org.edisoncor.gui.panel.PanelCurves;
import org.edisoncor.gui.textField.TextField;

/**
 *
 * @author PIX
 */
public class InicialVentana implements ActionListener {

    private JFrame ventanaInicial;
    private ButtonAction registrarCajaBoton;
    private LabelMetric dineroEnCajaInstruccionLabel;
    private LabelRect simboloPesoCantidadLabel;
    private Panel fondoPanelContenedor;
    private PanelCurves formularioPanel;
    private TextField dineroEnCajaCampo;
    private final String NOMBRE_FUENTE_LETRA = "Arial";
    private final int LETRA_SIN_DECORACION_CLAVE = 1;

    public InicialVentana() {

        inicializarComponentes();
        configurarComponentes();
        establecerDistribucionComponentes();

    }

    public void mostrarEnPantalla() {

        Component NINGUN_COMPONENTE = null;
        boolean SI = true;
        boolean NO = false;
        String TITULO_VENTANA = "Bienvenido";

        ventanaInicial = new JFrame(TITULO_VENTANA);
        ventanaInicial.setContentPane(fondoPanelContenedor);
        ventanaInicial.pack();
        ventanaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaInicial.setLocationRelativeTo(NINGUN_COMPONENTE);
        ventanaInicial.setResizable(NO);
        ventanaInicial.setVisible(SI);

    }

    @Override
    public void actionPerformed(ActionEvent accionEvento) {

        if (!elCampoEstaVacio() && esNumeroPositivo()) {

            mostrarVentanaPrincipal();

        } else {

            final String TEXTO_ALERTA = "Ingresa una cantidad";
            Informador.mostrarMensajeDeInformacion(TEXTO_ALERTA);

        }

    }

    private void mostrarVentanaPrincipal() {

        String numeroEnTexto = dineroEnCajaCampo.getText();
        double dineroInicialCaja = Double.parseDouble(numeroEnTexto);
        PrincipalVentana ventanaPrincipal
                = new PrincipalVentana(dineroInicialCaja);
        ventanaPrincipal.mostrarEnPantalla();
        ventanaInicial.dispose();

    }

    private boolean elCampoEstaVacio() {
        return dineroEnCajaCampo.getText().length() == 0;
    }

    private boolean esNumeroPositivo() {
        String numeroEnTexto = dineroEnCajaCampo.getText();
        boolean FALLO = false;
        try {

            return Double.parseDouble(numeroEnTexto) > 0;

        } catch (NumberFormatException errorDeConversion) {
            return FALLO;
        }
    }

    private void establecerDistribucionComponentes() {

        BoxLayout distribucionApiladaVertical
                = new BoxLayout(formularioPanel, BoxLayout.Y_AXIS);
        formularioPanel.setLayout(distribucionApiladaVertical);
        EmptyBorder ESPACIO_INTERNO_FORMULARIO = new EmptyBorder(5, 5, 5, 5);
        formularioPanel.setBorder(ESPACIO_INTERNO_FORMULARIO);

        JPanel filaComponentes = new JPanel();
        BoxLayout distribucionApiladaHorizontal
                = new BoxLayout(filaComponentes, BoxLayout.X_AXIS);
        filaComponentes.setLayout(distribucionApiladaHorizontal);
        EmptyBorder ESPACIO_INTERNO_FILA = new EmptyBorder(5, 0, 5, 0);
        filaComponentes.setBorder(ESPACIO_INTERNO_FILA);
        filaComponentes.add(simboloPesoCantidadLabel);
        filaComponentes.add(dineroEnCajaCampo);

        formularioPanel.add(dineroEnCajaInstruccionLabel);
        formularioPanel.add(filaComponentes);
        formularioPanel.add(registrarCajaBoton);
        fondoPanelContenedor.add(formularioPanel);
    }

    private void inicializarComponentes() {

        fondoPanelContenedor = new Panel();
        formularioPanel = new PanelCurves();
        dineroEnCajaCampo = new TextField();
        simboloPesoCantidadLabel = new LabelRect();
        dineroEnCajaInstruccionLabel = new LabelMetric();
        registrarCajaBoton = new ButtonAction();

    }

    private void configurarComponentes() {

        configurarEtiquetas();
        configurarCampos();
        configurarBotones();

    }

    private void configurarBotones() {

        String REGISTRO_TEXTO_BOTON = "Registrar";
        registrarCajaBoton.setText(REGISTRO_TEXTO_BOTON);

        ActionListener controladorEventoBoton = this;
        registrarCajaBoton.addActionListener(controladorEventoBoton);

    }

    private void configurarEtiquetas() {

        int DIMENSION_LETRA_ETIQUETA = 24;

        Font dineroEnCajaFuenteTextoEtiqueta = new Font(
                NOMBRE_FUENTE_LETRA,
                LETRA_SIN_DECORACION_CLAVE,
                DIMENSION_LETRA_ETIQUETA
        );
        dineroEnCajaInstruccionLabel.setFont(dineroEnCajaFuenteTextoEtiqueta);
        String DINERO_INICIAL_TEXTO_ETIQUETA = "¿Efectivo inicial en Caja?";
        dineroEnCajaInstruccionLabel.setText(DINERO_INICIAL_TEXTO_ETIQUETA);

        Color GRIS_PLATEADO = new Color(0, 153, 51);
        simboloPesoCantidadLabel.setForeground(GRIS_PLATEADO);

        String SIMBOLO_PESO_TEXTO = "$";
        simboloPesoCantidadLabel.setText(SIMBOLO_PESO_TEXTO);

        int DIMENSION_LETRA_ETIQUETA_GRANDE = 48;
        Font simboloPesoFuenteTextoEtiqueta = new Font(
                NOMBRE_FUENTE_LETRA,
                LETRA_SIN_DECORACION_CLAVE,
                DIMENSION_LETRA_ETIQUETA_GRANDE
        );
        simboloPesoCantidadLabel.setFont(simboloPesoFuenteTextoEtiqueta);
    }


    private void configurarCampos() {

        int DIMENSION_LETRA_CAMPO = 48;

        Font dineroEnCajaFuenteTextoCampo = new Font(
                NOMBRE_FUENTE_LETRA,
                LETRA_SIN_DECORACION_CLAVE,
                DIMENSION_LETRA_CAMPO
        );
        dineroEnCajaCampo.setFont(dineroEnCajaFuenteTextoCampo);

        FiltroNumericoCampo controladorEventosTeclado = new FiltroNumericoCampo();
        dineroEnCajaCampo.addKeyListener(controladorEventosTeclado);
    }

}
