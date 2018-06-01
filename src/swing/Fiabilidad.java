package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.AlgoritmoDeCalidad;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import java.awt.Dimension;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Fiabilidad extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup tolAFallos = new ButtonGroup();
	private final ButtonGroup recuperacionDeErrores = new ButtonGroup();
	AlgoritmoDeCalidad algoritmo; //= new AlgoritmoDeCalidad();
	private static Integer EXCELENTE = 10,
						   MUY_BUENO = 8,
						   BUENO = 6,
						   REGULAR = 4,
						   MALO = 2;

	/**
	 * Launch the application.
	 */
	public static void nuevaVista(AlgoritmoDeCalidad algoritmo) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fiabilidad frame = new Fiabilidad(algoritmo);
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
	public Fiabilidad(AlgoritmoDeCalidad algo) {
		this.algoritmo = algo;
		setTitle("Fiabilidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 511);
		contentPane = new JPanel();
		contentPane.setToolTipText("asd");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		establecerDefault();
		
		JLabel lblTolFallos = new JLabel("Tolerancia A Fallos:");
		lblTolFallos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTolFallos.setBounds(21, 37, 150, 14);
		contentPane.add(lblTolFallos);
		
		JTextPane txtpnCapacidadDelProducto = new JTextPane();
		txtpnCapacidadDelProducto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnCapacidadDelProducto.setBackground(SystemColor.activeCaptionBorder);
		txtpnCapacidadDelProducto.setEditable(false);
		txtpnCapacidadDelProducto.setText("Capacidad del producto software para mantener la integridad de los datos cuando se producen fallas en el sistema.\r\nCaracter\u00EDsticas a medir: \r\n\u2022 Protecci\u00F3n de los datos necesarios al generarse un error\r\n\u2022 Generaci\u00F3n de log con las actividades que el sistema estaba haciendo antes de fallar.");
		txtpnCapacidadDelProducto.setBounds(21, 63, 304, 149);
		contentPane.add(txtpnCapacidadDelProducto);
		
		JRadioButton rdbtnExcelenteTF = new JRadioButton("Excelente");
		rdbtnExcelenteTF.setSelected(true);
		rdbtnExcelenteTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setToleranciaAFallos(EXCELENTE);
			}
		});
		tolAFallos.add(rdbtnExcelenteTF);
		rdbtnExcelenteTF.setBounds(387, 37, 109, 23);
		contentPane.add(rdbtnExcelenteTF);
		
		JRadioButton rdbtnMuyBuenoTF = new JRadioButton("Muy Bueno");
		rdbtnMuyBuenoTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setToleranciaAFallos(MUY_BUENO);
			}
		});
		tolAFallos.add(rdbtnMuyBuenoTF);
		rdbtnMuyBuenoTF.setBounds(387, 69, 109, 23);
		contentPane.add(rdbtnMuyBuenoTF);
		
		JRadioButton rdbtnBuenoTF = new JRadioButton("Bueno");
		rdbtnBuenoTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setToleranciaAFallos(BUENO);
			}
		});
		tolAFallos.add(rdbtnBuenoTF);
		rdbtnBuenoTF.setBounds(387, 101, 109, 23);
		contentPane.add(rdbtnBuenoTF);
		
		JRadioButton rdbtnRegularTF = new JRadioButton("Regular");
		rdbtnRegularTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setToleranciaAFallos(REGULAR);
			}
		});
		tolAFallos.add(rdbtnRegularTF);
		rdbtnRegularTF.setBounds(387, 133, 109, 23);
		contentPane.add(rdbtnRegularTF);
		
		JRadioButton rdbtnMaloTF = new JRadioButton("Malo");
		rdbtnMaloTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setToleranciaAFallos(MALO);
			}
		});
		tolAFallos.add(rdbtnMaloTF);
		rdbtnMaloTF.setBounds(387, 164, 109, 23);
		contentPane.add(rdbtnMaloTF);
		
		JTextPane txtpnCapacidadDelSistema = new JTextPane();
		txtpnCapacidadDelSistema.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnCapacidadDelSistema.setBackground(SystemColor.activeCaptionBorder);
		txtpnCapacidadDelSistema.setEditable(false);
		txtpnCapacidadDelSistema.setText("Capacidad del sistema de reanudar sus actividades cuando se producen errores cr\u00EDticos.\r\nCaracter\u00EDsticas a medir:\r\n \u2022 Reanudaci\u00F3n de actividades al producirse una falla cr\u00EDtica.\r\n \u2022 Reanudaci\u00F3n del sistema desde el estado en que estaba antes de fallar.");
		txtpnCapacidadDelSistema.setBounds(21, 271, 304, 132);
		contentPane.add(txtpnCapacidadDelSistema);
		
		JLabel lblCapacidadDeRecuperacion = new JLabel("Capacidad de Recuperacion Ante Errores:");
		lblCapacidadDeRecuperacion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCapacidadDeRecuperacion.setBounds(21, 244, 294, 14);
		contentPane.add(lblCapacidadDeRecuperacion);
		
		JRadioButton rdbtnExcelente = new JRadioButton("Excelente");
		rdbtnExcelente.setSelected(true);
		rdbtnExcelente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setCapacidadDeRecuperacionDeErrores(EXCELENTE);
			}
		});
		recuperacionDeErrores.add(rdbtnExcelente);
		rdbtnExcelente.setBounds(387, 257, 109, 23);
		contentPane.add(rdbtnExcelente);
		
		JRadioButton rdbtnMuyBueno = new JRadioButton("Muy Bueno");
		rdbtnMuyBueno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setCapacidadDeRecuperacionDeErrores(MUY_BUENO);
			}
		});
		recuperacionDeErrores.add(rdbtnMuyBueno);
		rdbtnMuyBueno.setBounds(387, 285, 109, 23);
		contentPane.add(rdbtnMuyBueno);
		
		JRadioButton rdbtnBueno = new JRadioButton("Bueno");
		rdbtnBueno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setCapacidadDeRecuperacionDeErrores(BUENO);
			}
		});
		recuperacionDeErrores.add(rdbtnBueno);
		rdbtnBueno.setBounds(387, 311, 109, 23);
		contentPane.add(rdbtnBueno);
		
		JRadioButton rdbtnRegular = new JRadioButton("Regular");
		rdbtnRegular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setCapacidadDeRecuperacionDeErrores(REGULAR);
			}
		});
		recuperacionDeErrores.add(rdbtnRegular);
		rdbtnRegular.setBounds(387, 337, 109, 23);
		contentPane.add(rdbtnRegular);
		
		JRadioButton rdbtnMalo = new JRadioButton("Malo");
		rdbtnMalo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setCapacidadDeRecuperacionDeErrores(MALO);
			}
		});
		recuperacionDeErrores.add(rdbtnMalo);
		rdbtnMalo.setBounds(387, 363, 109, 23);
		contentPane.add(rdbtnMalo);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//algoritmo.mostrarFiabilidad();
				//algoritmo.mostrarEficiencia();
				//algoritmo.mostrarFuncionabilidad();
				
				Mantenibilidad.nuevaVista(algoritmo);
				dispose();
			}
		});
		btnSiguiente.setBounds(420, 427, 89, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(10, 427, 89, 23);
		contentPane.add(btnSalir);
	}
	
	public void establecerDefault() {
		
		algoritmo.setToleranciaAFallos(EXCELENTE);
		algoritmo.setCapacidadDeRecuperacionDeErrores(EXCELENTE);
	}
}
