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
import java.awt.Color;

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
		setTitle("Reporte Final");
		this.algoritmo = algo;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFuncionabilidad = new JLabel("Funcionabilidad:");
		lblFuncionabilidad.setBounds(12, 34, 133, 20);
		lblFuncionabilidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblFuncionabilidad);
		
		JTextPane textPaneFuncionabilidad = new JTextPane();
		textPaneFuncionabilidad.setBackground(Color.BLACK);
		textPaneFuncionabilidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPaneFuncionabilidad.setEditable(false);
		textPaneFuncionabilidad.setBounds(172, 34, 127, 22);
		contentPane.add(textPaneFuncionabilidad);
		
		JLabel lblEficiencia = new JLabel("Eficiencia:");
		lblEficiencia.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEficiencia.setBounds(12, 77, 163, 16);
		contentPane.add(lblEficiencia);
		
		JLabel lblFiabilidad = new JLabel("Fiabilidad:");
		lblFiabilidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFiabilidad.setBounds(12, 127, 163, 16);
		contentPane.add(lblFiabilidad);
		
		JLabel lblMantenibilidad = new JLabel("Mantenibilidad:");
		lblMantenibilidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMantenibilidad.setBounds(12, 175, 163, 20);
		contentPane.add(lblMantenibilidad);
		
		JLabel lblUsabilidad = new JLabel("Usabilidad:");
		lblUsabilidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsabilidad.setBounds(12, 231, 163, 20);
		contentPane.add(lblUsabilidad);
		
		JLabel lblPortabilidad = new JLabel("Portabilidad:");
		lblPortabilidad.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPortabilidad.setBounds(12, 281, 163, 32);
		contentPane.add(lblPortabilidad);
		
		JLabel lblResultadoFinal = new JLabel("Resultado Final:");
		lblResultadoFinal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResultadoFinal.setBounds(12, 384, 133, 16);
		contentPane.add(lblResultadoFinal);
		
		JTextPane textPaneEficiencia = new JTextPane();
		textPaneEficiencia.setBackground(Color.BLACK);
		textPaneEficiencia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPaneEficiencia.setEditable(false);
		textPaneEficiencia.setBounds(172, 77, 127, 20);
		contentPane.add(textPaneEficiencia);
		
		JTextPane textPaneFiabilidad = new JTextPane();
		textPaneFiabilidad.setBackground(Color.BLACK);
		textPaneFiabilidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPaneFiabilidad.setEditable(false);
		textPaneFiabilidad.setBounds(172, 121, 127, 22);
		contentPane.add(textPaneFiabilidad);
		
		JTextPane textPaneMantenibilidad = new JTextPane();
		textPaneMantenibilidad.setBackground(Color.BLACK);
		textPaneMantenibilidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPaneMantenibilidad.setEditable(false);
		textPaneMantenibilidad.setBounds(172, 175, 127, 20);
		contentPane.add(textPaneMantenibilidad);
		
		JTextPane textPaneUsabilidad = new JTextPane();
		textPaneUsabilidad.setBackground(Color.BLACK);
		textPaneUsabilidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPaneUsabilidad.setEditable(false);
		textPaneUsabilidad.setBounds(172, 231, 127, 20);
		contentPane.add(textPaneUsabilidad);
		
		JTextPane textPanePortabilidad = new JTextPane();
		textPanePortabilidad.setBackground(Color.BLACK);
		textPanePortabilidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPanePortabilidad.setEditable(false);
		textPanePortabilidad.setBounds(172, 281, 127, 20);
		contentPane.add(textPanePortabilidad);
		
		JTextPane textPaneResFinal = new JTextPane();
		textPaneResFinal.setBackground(Color.GRAY);
		textPaneResFinal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPaneResFinal.setEditable(false);
		textPaneResFinal.setBounds(172, 384, 127, 22);
		contentPane.add(textPaneResFinal);
		
		
		
		String resFinal = AlgoritmoDeCalidad.calculoDeExperiencia(algoritmo);
		if(resFinal == "EXCELENTE" || resFinal == "MUY BUENA" || resFinal == "BUENA") {
			textPaneResFinal.setForeground(Color.GREEN);
		}
		if (resFinal == "REGULAR") {
			textPaneResFinal.setForeground(Color.YELLOW);
		}
		if (resFinal == "MALA") {
			textPaneResFinal.setForeground(Color.RED);
		}
		//Seteo texto del resultado FINAL
		textPaneResFinal.setText(resFinal);
		
		//Seteo los textos con los valores de cada PASO FUNCIONALIDAD
		String resPasoFunc = AlgoritmoDeCalidad.calculoExpFuncionabilidad(algoritmo.getSeguridadDeAcceso(), algoritmo.getExactitudDeResultados());
		if(resPasoFunc == "EXCELENTE" || resFinal == "MUY BUENA" || resFinal == "BUENA") {
			textPaneFuncionabilidad.setForeground(Color.GREEN);
		}
		if (resPasoFunc == "REGULAR") {
			textPaneFuncionabilidad.setForeground(Color.YELLOW);
		}
		if (resPasoFunc == "MALA") {
			textPaneFuncionabilidad.setForeground(Color.RED);
		}		
		
		textPaneFuncionabilidad.setText(resPasoFunc);
		
		
		String resPasoEfi = AlgoritmoDeCalidad.calculoExpEficiencia(algoritmo.getUtilizacionDeRecursos(), algoritmo.getComportamientoEnElTiempo());
		if(resPasoEfi == "EXCELENTE" || resPasoEfi == "MUY BUENA" || resPasoEfi == "BUENA") {
			textPaneEficiencia.setForeground(Color.GREEN);
		}
		if (resPasoEfi == "REGULAR") {
			textPaneEficiencia.setForeground(Color.YELLOW);
		}
		if (resPasoEfi == "MALA") {
			textPaneEficiencia.setForeground(Color.RED);
		}
		textPaneEficiencia.setText(resPasoEfi);
		
		
		String resPasoFia = AlgoritmoDeCalidad.calculoExpFiabilidad(algoritmo.getToleranciaAFallos(), algoritmo.getCapacidadDeRecuperacionDeErrores());
		if(resPasoFia == "EXCELENTE" || resPasoFia == "MUY BUENA" || resPasoFia == "BUENA") {
			textPaneFiabilidad.setForeground(Color.GREEN);
		}
		if (resPasoFia == "REGULAR") {
			textPaneFiabilidad.setForeground(Color.YELLOW);
		}
		if (resPasoFia == "MALA") {
			textPaneFiabilidad.setForeground(Color.RED);
		}
		textPaneFiabilidad.setText(resPasoFia);
		
		
		String resPasoMantenib = AlgoritmoDeCalidad.calculoExpMantenibilidad(algoritmo.getAnalizabilidadDelCodigo(), algoritmo.getCambiabilidadDelCodigo(), algoritmo.getEstabilidadDelCodigo());
		if(resPasoMantenib == "EXCELENTE" || resPasoMantenib == "MUY BUENA" || resPasoMantenib == "BUENA") {
			textPaneMantenibilidad.setForeground(Color.GREEN);
		}
		if (resPasoMantenib == "REGULAR") {
			textPaneMantenibilidad.setForeground(Color.YELLOW);
		}
		if (resPasoMantenib == "MALA") {
			textPaneMantenibilidad.setForeground(Color.RED);
		}
		textPaneMantenibilidad.setText(resPasoMantenib);
		
		
		
		String resPasoUsab = AlgoritmoDeCalidad.calculoExpUsabilidad(algoritmo.getCapacidadDeSerEntendido(), algoritmo.getCapacidadDeSerOperado(), algoritmo.getCapacidadDeSerAtractivo());
		if(resPasoUsab == "EXCELENTE" || resPasoUsab == "MUY BUENA" || resPasoUsab == "BUENA") {
			textPaneUsabilidad.setForeground(Color.GREEN);
		}
		if (resPasoUsab == "REGULAR") {
			textPaneUsabilidad.setForeground(Color.YELLOW);
		}
		if (resPasoUsab == "MALA") {
			textPaneUsabilidad.setForeground(Color.RED);
		}
		textPaneUsabilidad.setText(resPasoUsab);
		
		
		String resPasoPorta = AlgoritmoDeCalidad.calculoExpPortabilidad(algoritmo.getAdaptabilidad(), algoritmo.getInstalabilidad());
		if(resPasoPorta == "EXCELENTE" || resPasoPorta == "MUY BUENA" || resPasoPorta == "BUENA") {
			textPanePortabilidad.setForeground(Color.GREEN);
		}
		if (resPasoPorta == "REGULAR") {
			textPanePortabilidad.setForeground(Color.YELLOW);
		}
		if (resPasoPorta == "MALA") {
			textPanePortabilidad.setForeground(Color.RED);
		}
		textPanePortabilidad.setText(resPasoPorta);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(109, 439, 97, 25);
		contentPane.add(btnSalir);
		
	}
}
