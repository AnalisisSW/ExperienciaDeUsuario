package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.AlgoritmoDeCalidad;

import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Funcionabilidad extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup segAcceso = new ButtonGroup();
	private final ButtonGroup exactitudResultado = new ButtonGroup();
	AlgoritmoDeCalidad algoritmo = new AlgoritmoDeCalidad();
	private static Integer EXCELENTE = 10,
						   MUY_BUENO = 8,
						   BUENO = 6,
						   REGULAR = 4,
						   MALO = 2;
						   
						   
	
	



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionabilidad frame = new Funcionabilidad();
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
	public Funcionabilidad() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Funcionabilidad");
		setBounds(100, 100, 608, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		establecerDefault(); //Establezco valores default (Excelente)
		
		JTextPane txtpnSeguridadDeAcceso = new JTextPane();
		txtpnSeguridadDeAcceso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnSeguridadDeAcceso.setText("Capacidad del producto software para asegurar la integridad de los datos y la confidencialidad de \u00E9stos - Caracter\u00EDsticas a medir: Encriptaci\u00F3n de datos e inicio de sesi\u00F3n de usuarios");
		txtpnSeguridadDeAcceso.setBounds(10, 89, 306, 116);
		contentPane.add(txtpnSeguridadDeAcceso);
		
		JLabel lblSeguridadDeAcceso = new JLabel("Seguridad De Acceso:");
		lblSeguridadDeAcceso.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSeguridadDeAcceso.setBounds(10, 45, 160, 31);
		contentPane.add(lblSeguridadDeAcceso);
		
		JRadioButton rdbtnExcelenteSA = new JRadioButton("Excelente");
		rdbtnExcelenteSA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				algoritmo.setSeguridadDeAcceso(EXCELENTE);
			}
		});
		rdbtnExcelenteSA.setSelected(true);
		segAcceso.add(rdbtnExcelenteSA);
		rdbtnExcelenteSA.setBounds(359, 65, 87, 23);
		contentPane.add(rdbtnExcelenteSA);
		
		
		JRadioButton rdbtnMuyBuenoSA = new JRadioButton("Muy Bueno");
		rdbtnMuyBuenoSA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				algoritmo.setSeguridadDeAcceso(MUY_BUENO);
			}
		});
		segAcceso.add(rdbtnMuyBuenoSA);
		rdbtnMuyBuenoSA.setBounds(359, 91, 102, 23);
		contentPane.add(rdbtnMuyBuenoSA);
		
		JRadioButton rdbtnBuenoSA = new JRadioButton("Bueno");
		rdbtnBuenoSA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				algoritmo.setSeguridadDeAcceso(BUENO);
			}
		});
		segAcceso.add(rdbtnBuenoSA);
		rdbtnBuenoSA.setBounds(359, 117, 87, 23);
		contentPane.add(rdbtnBuenoSA);
		
		
		JRadioButton rdbtnRegularSA = new JRadioButton("Regular");
		rdbtnRegularSA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				algoritmo.setSeguridadDeAcceso(REGULAR);
			}
		});
		segAcceso.add(rdbtnRegularSA);
		rdbtnRegularSA.setBounds(359, 143, 87, 23);
		contentPane.add(rdbtnRegularSA);
		
		
		JRadioButton rdbtnMaloSA = new JRadioButton("Malo");
		rdbtnMaloSA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				algoritmo.setSeguridadDeAcceso(MALO);
			}
		});
		segAcceso.add(rdbtnMaloSA);
		rdbtnMaloSA.setBounds(359, 171, 87, 23);
		contentPane.add(rdbtnMaloSA);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				algoritmo.mostrarFuncionabilidad();				
				Eficiencia.nuevaVista(algoritmo);
				dispose();
				
			}
		});
		btnSiguiente.setBounds(361, 442, 139, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(56, 442, 138, 23);
		contentPane.add(btnSalir);
	
		JTextPane txtpnCapacidadDelProducto = new JTextPane();
		txtpnCapacidadDelProducto.setText("Capacidad del producto software para proporcionar los resultados con el grado necesario de precisi\u00F3n.");
		txtpnCapacidadDelProducto.setBounds(10, 294, 306, 92);
		contentPane.add(txtpnCapacidadDelProducto);
		
		JLabel lblExactitudDeResultado = new JLabel("Exactitud De Resultado:");
		lblExactitudDeResultado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblExactitudDeResultado.setBounds(10, 258, 160, 23);
		contentPane.add(lblExactitudDeResultado);
		
		JRadioButton rdbtnExcelenteER = new JRadioButton("Excelente");
		rdbtnExcelenteER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setExactitudDeResultados(EXCELENTE);
			}
		});

		exactitudResultado.add(rdbtnExcelenteER);
		rdbtnExcelenteER.setSelected(true);
		rdbtnExcelenteER.setBounds(359, 258, 87, 23);
		contentPane.add(rdbtnExcelenteER);
		
		
		JRadioButton rdbtnMuyBuenoER = new JRadioButton("Muy Bueno");
		rdbtnMuyBuenoER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setExactitudDeResultados(MUY_BUENO);
			}
		});
		exactitudResultado.add(rdbtnMuyBuenoER);
		rdbtnMuyBuenoER.setBounds(359, 284, 102, 23);
		contentPane.add(rdbtnMuyBuenoER);
		
		
		JRadioButton rdbtnBuenoER = new JRadioButton("Bueno");
		rdbtnBuenoER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setExactitudDeResultados(BUENO);
			}
		});
		exactitudResultado.add(rdbtnBuenoER);
		rdbtnBuenoER.setBounds(359, 310, 87, 23);
		contentPane.add(rdbtnBuenoER);
		
		JRadioButton rdbtnRegularER = new JRadioButton("Regular");
		rdbtnRegularER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setExactitudDeResultados(REGULAR);
			}
		});
		exactitudResultado.add(rdbtnRegularER);
		rdbtnRegularER.setBounds(359, 336, 87, 23);
		contentPane.add(rdbtnRegularER);
		
		
		JRadioButton rdbtnMaloER = new JRadioButton("Malo");
		rdbtnMaloER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setExactitudDeResultados(MALO);
			}
		});
		exactitudResultado.add(rdbtnMaloER);
		rdbtnMaloER.setBounds(359, 364, 87, 23);
		contentPane.add(rdbtnMaloER);
		

		
	}
	
	public void establecerDefault() {
		algoritmo.setSeguridadDeAcceso(EXCELENTE);
		algoritmo.setExactitudDeResultados(EXCELENTE);
	}
}
