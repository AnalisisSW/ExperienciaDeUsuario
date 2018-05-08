package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.media.sound.ModelStandardTransform;

import main.AlgoritmoDeCalidad;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eficiencia extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup utilizacionRecursos = new ButtonGroup();
	private final ButtonGroup comportamientoEnTiempo = new ButtonGroup();
	AlgoritmoDeCalidad algoritmo = new AlgoritmoDeCalidad();
	private static Integer EXCELENTE = 10,
						   MUY_BUENO = 8,
						   BUENO = 6,
						   REGULAR = 4,
						   MALO = 2;
						   

	/**
	 * Launch the application.
	 */
	public static void nuevaVista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eficiencia frame = new Eficiencia();
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
	public Eficiencia() {
		setTitle("Eficiencia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		establecerDefault();
		
		
		JLabel lblUtilizacionDeRecursos = new JLabel("Utilizacion De Recursos:");
		lblUtilizacionDeRecursos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUtilizacionDeRecursos.setBounds(27, 28, 178, 40);
		contentPane.add(lblUtilizacionDeRecursos);
		
		JTextPane txtpnEficienciaDelProducto = new JTextPane();
		txtpnEficienciaDelProducto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnEficienciaDelProducto.setBackground(SystemColor.activeCaptionBorder);
		txtpnEficienciaDelProducto.setEditable(false);
		txtpnEficienciaDelProducto.setText("Eficiencia del producto software de acuerdo al porcentaje de uso de procesador que realice.");
		txtpnEficienciaDelProducto.setBounds(24, 81, 230, 80);
		contentPane.add(txtpnEficienciaDelProducto);
		
		JRadioButton rdbtnExcelenteUR = new JRadioButton("Excelente");
		rdbtnExcelenteUR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				algoritmo.setUtilizacionDeRecursos(EXCELENTE);
			}
		});
		utilizacionRecursos.add(rdbtnExcelenteUR);
		rdbtnExcelenteUR.setSelected(true);
		rdbtnExcelenteUR.setBounds(336, 56, 127, 25);
		contentPane.add(rdbtnExcelenteUR);
		
		
		JRadioButton rdbtnMuyBuenoUR = new JRadioButton("Muy Bueno");
		rdbtnMuyBuenoUR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setUtilizacionDeRecursos(MUY_BUENO);
			}
		});
		utilizacionRecursos.add(rdbtnMuyBuenoUR);
		rdbtnMuyBuenoUR.setBounds(336, 81, 127, 25);
		contentPane.add(rdbtnMuyBuenoUR);
		
		
		JRadioButton rdbtnBuenoUR = new JRadioButton("Bueno");
		rdbtnBuenoUR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setUtilizacionDeRecursos(BUENO);
			}
		});
		utilizacionRecursos.add(rdbtnBuenoUR);
		rdbtnBuenoUR.setBounds(336, 110, 127, 25);
		contentPane.add(rdbtnBuenoUR);
		
		
		JRadioButton rdbtnRegularUR = new JRadioButton("Regular");
		rdbtnRegularUR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setUtilizacionDeRecursos(REGULAR);
			}
		});
		utilizacionRecursos.add(rdbtnRegularUR);
		rdbtnRegularUR.setBounds(336, 140, 127, 25);
		contentPane.add(rdbtnRegularUR);
		
		
		JRadioButton rdbtnMaloUR = new JRadioButton("Malo");
		rdbtnMaloUR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setUtilizacionDeRecursos(MALO);
			}
		});
		utilizacionRecursos.add(rdbtnMaloUR);
		rdbtnMaloUR.setBounds(336, 170, 127, 25);
		contentPane.add(rdbtnMaloUR);
		
		JLabel lblComportamientoEnEl = new JLabel("Comportamiento En El Tiempo:");
		lblComportamientoEnEl.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblComportamientoEnEl.setBounds(27, 262, 227, 16);
		contentPane.add(lblComportamientoEnEl);
		
		JTextPane txtpnTiempoQueEst = new JTextPane();
		txtpnTiempoQueEst.setBackground(SystemColor.activeCaptionBorder);
		txtpnTiempoQueEst.setText("Tiempo que est\u00E1 el producto software sin informarle al usuario del estado en que se encuentra la solicitud que realiz\u00F3.");
		txtpnTiempoQueEst.setBounds(27, 313, 227, 89);
		contentPane.add(txtpnTiempoQueEst);
		
		
		JRadioButton rdbtnExcelenteCT = new JRadioButton("Excelente");
		rdbtnExcelenteCT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setComportamientoEnElTiempo(EXCELENTE);
			}
		});
		comportamientoEnTiempo.add(rdbtnExcelenteCT);
		rdbtnExcelenteCT.setSelected(true);
		rdbtnExcelenteCT.setBounds(336, 263, 127, 25);
		contentPane.add(rdbtnExcelenteCT);
		
		
		JRadioButton rdbtnMuyBuenoCT = new JRadioButton("Muy Bueno");
		rdbtnMuyBuenoCT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setComportamientoEnElTiempo(MUY_BUENO);
			}
		});
		comportamientoEnTiempo.add(rdbtnMuyBuenoCT);
		rdbtnMuyBuenoCT.setBounds(336, 288, 127, 25);
		contentPane.add(rdbtnMuyBuenoCT);
		
		JRadioButton rdbtnBuenoCT = new JRadioButton("Bueno");
		rdbtnBuenoCT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setComportamientoEnElTiempo(BUENO);
			}
		});
		comportamientoEnTiempo.add(rdbtnBuenoCT);
		rdbtnBuenoCT.setBounds(336, 317, 127, 25);
		contentPane.add(rdbtnBuenoCT);
		
		JRadioButton rdbtnRegularCT = new JRadioButton("Regular");
		rdbtnRegularCT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setComportamientoEnElTiempo(REGULAR);
			}
		});
		comportamientoEnTiempo.add(rdbtnRegularCT);
		rdbtnRegularCT.setBounds(336, 347, 127, 25);
		contentPane.add(rdbtnRegularCT);
		
		JRadioButton rdbtnMaloCT = new JRadioButton("Malo");
		rdbtnMaloCT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.setComportamientoEnElTiempo(MALO);
			}
		});
		comportamientoEnTiempo.add(rdbtnMaloCT);
		rdbtnMaloCT.setBounds(336, 377, 127, 25);
		contentPane.add(rdbtnMaloCT);
		
		JButton btnCancelar = new JButton("Salir");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancelar.setBounds(44, 442, 97, 25);
		contentPane.add(btnCancelar);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				algoritmo.mostrarEficiencia();
			}
		});
		btnSiguiente.setBounds(456, 442, 97, 25);
		contentPane.add(btnSiguiente);
	}
	
	public void establecerDefault() {
		algoritmo.setUtilizacionDeRecursos(EXCELENTE);
		algoritmo.setComportamientoEnElTiempo(EXCELENTE);
	}
}
