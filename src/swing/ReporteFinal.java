package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.AlgoritmoDeCalidad;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReporteFinal extends JFrame {

	private JPanel contentPane;
	AlgoritmoDeCalidad algoritmo;

	/**
	 * Launch the application.
	 */
	public static void nuevaVista(AlgoritmoDeCalidad algoritmo) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReporteFinal frame = new ReporteFinal(algoritmo);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReporteFinal(AlgoritmoDeCalidad algo) {
		this.algoritmo = algo;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFuncionabilidad = new JLabel("Funcionabilidad:");
		lblFuncionabilidad.setBounds(12, 34, 133, 20);
		lblFuncionabilidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblFuncionabilidad);
		
		JTextPane textPaneFuncionabilidad = new JTextPane();
		textPaneFuncionabilidad.setEditable(false);
		textPaneFuncionabilidad.setBounds(172, 34, 127, 22);
		contentPane.add(textPaneFuncionabilidad);
		
		JLabel lblEficiencia = new JLabel("Eficiencia");
		lblEficiencia.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEficiencia.setBounds(12, 77, 163, 16);
		contentPane.add(lblEficiencia);
		
		JLabel lblFiabilidad = new JLabel("Fiabilidad");
		lblFiabilidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFiabilidad.setBounds(12, 127, 163, 16);
		contentPane.add(lblFiabilidad);
		
		JLabel lblMantenibilidad = new JLabel("Mantenibilidad");
		lblMantenibilidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMantenibilidad.setBounds(12, 175, 163, 20);
		contentPane.add(lblMantenibilidad);
		
		JLabel lblUsabilidad = new JLabel("Usabilidad");
		lblUsabilidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsabilidad.setBounds(12, 231, 163, 20);
		contentPane.add(lblUsabilidad);
		
		JLabel lblPortabilidad = new JLabel("Portabilidad");
		lblPortabilidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPortabilidad.setBounds(12, 281, 163, 32);
		contentPane.add(lblPortabilidad);
		
		JLabel lblResultadoFinal = new JLabel("Resultado Final:");
		lblResultadoFinal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResultadoFinal.setBounds(12, 384, 133, 16);
		contentPane.add(lblResultadoFinal);
		
		JTextPane textPaneEficiencia = new JTextPane();
		textPaneEficiencia.setEditable(false);
		textPaneEficiencia.setBounds(172, 77, 127, 20);
		contentPane.add(textPaneEficiencia);
		
		JTextPane textPaneFiabilidad = new JTextPane();
		textPaneFiabilidad.setEditable(false);
		textPaneFiabilidad.setBounds(172, 121, 127, 22);
		contentPane.add(textPaneFiabilidad);
		
		JTextPane textPaneMantenibilidad = new JTextPane();
		textPaneMantenibilidad.setEditable(false);
		textPaneMantenibilidad.setBounds(172, 175, 133, 20);
		contentPane.add(textPaneMantenibilidad);
		
		JTextPane textPaneUsabilidad = new JTextPane();
		textPaneUsabilidad.setEditable(false);
		textPaneUsabilidad.setBounds(172, 231, 133, 20);
		contentPane.add(textPaneUsabilidad);
		
		JTextPane textPanePortabilidad = new JTextPane();
		textPanePortabilidad.setEditable(false);
		textPanePortabilidad.setBounds(169, 281, 136, 20);
		contentPane.add(textPanePortabilidad);
		
		JTextPane textPaneResFinal = new JTextPane();
		textPaneResFinal.setEditable(false);
		textPaneResFinal.setBounds(172, 378, 133, 22);
		contentPane.add(textPaneResFinal);
		
		//Seteo los textos con los valores de cada PASO 
		
		String resFinal = AlgoritmoDeCalidad.calculoDeExperiencia(algoritmo);
		textPaneResFinal.setText(resFinal);
		
		textPaneFuncionabilidad.setText(AlgoritmoDeCalidad.calculoExpFuncionabilidad(algoritmo.getSeguridadDeAcceso(), algoritmo.getExactitudDeResultados()));
		textPaneEficiencia.setText( AlgoritmoDeCalidad.calculoExpEficiencia(algoritmo.getUtilizacionDeRecursos(), algoritmo.getComportamientoEnElTiempo()));
		textPaneFiabilidad.setText(AlgoritmoDeCalidad.calculoExpFiabilidad(algoritmo.getToleranciaAFallos(), algoritmo.getCapacidadDeRecuperacionDeErrores()));
		textPaneMantenibilidad.setText(AlgoritmoDeCalidad.calculoExpMantenibilidad(algoritmo.getAnalizabilidadDelCodigo(), algoritmo.getCambiabilidadDelCodigo(), algoritmo.getEstabilidadDelCodigo()));
		textPaneUsabilidad.setText(AlgoritmoDeCalidad.calculoExpUsabilidad(algoritmo.getCapacidadDeSerEntendido(), algoritmo.getCapacidadDeSerOperado(), algoritmo.getCapacidadDeSerAtractivo()));
		textPanePortabilidad.setText(AlgoritmoDeCalidad.calculoExpPortabilidad(algoritmo.getAdaptabilidad(), algoritmo.getInstalabilidad()));
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(37, 438, 97, 25);
		contentPane.add(btnSalir);
		
	}
}
