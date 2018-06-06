package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.AlgoritmoDeCalidad;
import sun.security.x509.AlgorithmId;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Usabilidad extends JFrame {

	private JPanel contentPane;
	AlgoritmoDeCalidad alg;
	private static Integer EXCELENTE = 10,
			   MUY_BUENO = 8,
			   BUENO = 6,
			   REGULAR = 4,
			   MALO = 2;
	private final ButtonGroup capEntendido = new ButtonGroup();
	private final ButtonGroup capOperado = new ButtonGroup();
	private final ButtonGroup capAtractivo = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void nuevaVista(AlgoritmoDeCalidad algoritmo) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usabilidad frame = new Usabilidad(algoritmo);
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
	public Usabilidad(AlgoritmoDeCalidad algoritmo) {
		setTitle("Usabilidad");
		this.alg = algoritmo;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		establecerDefault();
		
		JLabel lblCapacidadDeSer = new JLabel("Capacidad de ser Entendido:");
		lblCapacidadDeSer.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCapacidadDeSer.setBounds(24, 13, 221, 29);
		contentPane.add(lblCapacidadDeSer);
		
		JTextPane txtpnCapacidadDelProducto = new JTextPane();
		txtpnCapacidadDelProducto.setEditable(false);
		txtpnCapacidadDelProducto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnCapacidadDelProducto.setBackground(SystemColor.activeCaptionBorder);
		txtpnCapacidadDelProducto.setText("\u2022 Capacidad del producto software para ayudar a los usuarios cuando necesiten asistencia.\r\n\r\nCaracter\u00EDsticas a medir: \r\n\u2022 Posee ayuda contextual sobre men\u00FAes y botones de acci\u00F3n\r\n\u2022 Incorporaci\u00F3n de manual de usuario en el sistema con un men\u00FA dedicado.");
		txtpnCapacidadDelProducto.setBounds(24, 55, 299, 151);
		contentPane.add(txtpnCapacidadDelProducto);
		
		JRadioButton rdbtnExcelenteCE = new JRadioButton("Excelente");
		rdbtnExcelenteCE.setSelected(true);
		rdbtnExcelenteCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCapacidadDeSerEntendido(EXCELENTE);
			}
		});
		capEntendido.add(rdbtnExcelenteCE);
		rdbtnExcelenteCE.setBounds(351, 35, 127, 25);
		contentPane.add(rdbtnExcelenteCE);
		
		JRadioButton rdbtnMuyBuenoCE = new JRadioButton("Muy Bueno");
		rdbtnMuyBuenoCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCapacidadDeSerEntendido(MUY_BUENO);
			}
		});
		capEntendido.add(rdbtnMuyBuenoCE);
		rdbtnMuyBuenoCE.setBounds(351, 65, 127, 25);
		contentPane.add(rdbtnMuyBuenoCE);
		
		JRadioButton rdbtnBuenoCE = new JRadioButton("Bueno");
		rdbtnBuenoCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCapacidadDeSerEntendido(BUENO);
			}
		});
		capEntendido.add(rdbtnBuenoCE);
		rdbtnBuenoCE.setBounds(351, 95, 127, 25);
		contentPane.add(rdbtnBuenoCE);
		
		JRadioButton rdbtnRegularCE = new JRadioButton("Regular");
		rdbtnRegularCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCapacidadDeSerEntendido(REGULAR);
			}
		});
		capEntendido.add(rdbtnRegularCE);
		rdbtnRegularCE.setBounds(351, 125, 127, 25);
		contentPane.add(rdbtnRegularCE);
		
		JRadioButton rdbtnMaloCE = new JRadioButton("Malo");
		rdbtnMaloCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCapacidadDeSerEntendido(MALO);
			}
		});
		capEntendido.add(rdbtnMaloCE);
		rdbtnMaloCE.setBounds(351, 155, 127, 25);
		contentPane.add(rdbtnMaloCE);
		
		JLabel lblCapacidadDeSer_1 = new JLabel("Capacidad de ser Operado:");
		lblCapacidadDeSer_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCapacidadDeSer_1.setBounds(24, 219, 221, 29);
		contentPane.add(lblCapacidadDeSer_1);
		
		JTextPane txtpnApacidadDelProducto = new JTextPane();
		txtpnApacidadDelProducto.setEditable(false);
		txtpnApacidadDelProducto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnApacidadDelProducto.setBackground(SystemColor.activeCaptionBorder);
		txtpnApacidadDelProducto.setText("\u2022 Capacidad del producto software para ayudar a los usuarios cuando necesiten asistencia.\r\n\r\n\u2022 Manual de usuario incorporado al sistema como un men\u00FA dedicado");
		txtpnApacidadDelProducto.setBounds(24, 261, 299, 134);
		contentPane.add(txtpnApacidadDelProducto);
		
		JRadioButton rdbtnExcelenteCO = new JRadioButton("Excelente");
		rdbtnExcelenteCO.setSelected(true);
		rdbtnExcelenteCO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCapacidadDeSerOperado(EXCELENTE);
			}
		});
		capOperado.add(rdbtnExcelenteCO);
		rdbtnExcelenteCO.setBounds(351, 237, 127, 25);
		contentPane.add(rdbtnExcelenteCO);
		
		JRadioButton rdbtnMuyBuenoCO = new JRadioButton("Muy Bueno");
		rdbtnMuyBuenoCO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCapacidadDeSerOperado(MUY_BUENO);
			}
		});
		capOperado.add(rdbtnMuyBuenoCO);
		rdbtnMuyBuenoCO.setBounds(351, 263, 127, 25);
		contentPane.add(rdbtnMuyBuenoCO);
		
		JRadioButton rdbtnBuenoCO = new JRadioButton("Bueno");
		rdbtnBuenoCO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCapacidadDeSerOperado(BUENO);
			}
		});
		capOperado.add(rdbtnBuenoCO);
		rdbtnBuenoCO.setBounds(351, 293, 127, 25);
		contentPane.add(rdbtnBuenoCO);
		
		JRadioButton rdbtnRegularCO = new JRadioButton("Regular");
		rdbtnRegularCO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCapacidadDeSerOperado(REGULAR);
			}
		});
		capOperado.add(rdbtnRegularCO);
		rdbtnRegularCO.setBounds(351, 323, 127, 25);
		contentPane.add(rdbtnRegularCO);
		
		JRadioButton rdbtnMaloCO = new JRadioButton("Malo");
		rdbtnMaloCO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCapacidadDeSerOperado(MALO);
			}
		});
		capOperado.add(rdbtnMaloCO);
		rdbtnMaloCO.setBounds(351, 353, 127, 25);
		contentPane.add(rdbtnMaloCO);
		
		JLabel lblCapacidadDeSer_2 = new JLabel("Capacidad de ser Atractivo:");
		lblCapacidadDeSer_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCapacidadDeSer_2.setBounds(24, 423, 221, 29);
		contentPane.add(lblCapacidadDeSer_2);
		
		JTextPane txtpnCapacidadDelProducto_1 = new JTextPane();
		txtpnCapacidadDelProducto_1.setEditable(false);
		txtpnCapacidadDelProducto_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnCapacidadDelProducto_1.setBackground(SystemColor.activeCaptionBorder);
		txtpnCapacidadDelProducto_1.setText("\u2022 Capacidad del producto software de ser utilizado sin asistencia adicional.\r\n");
		txtpnCapacidadDelProducto_1.setBounds(24, 465, 307, 54);
		contentPane.add(txtpnCapacidadDelProducto_1);
		
		JRadioButton rdbtnExcelente = new JRadioButton("Excelente");
		rdbtnExcelente.setSelected(true);
		rdbtnExcelente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCapacidadDeSerAtractivo(EXCELENTE);
			}
		});
		capAtractivo.add(rdbtnExcelente);
		rdbtnExcelente.setBounds(351, 406, 127, 25);
		contentPane.add(rdbtnExcelente);
		
		JRadioButton rdbtnMuyBueno = new JRadioButton("Muy Bueno");
		rdbtnMuyBueno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCapacidadDeSerAtractivo(MUY_BUENO);
			}
		});
		capAtractivo.add(rdbtnMuyBueno);
		rdbtnMuyBueno.setBounds(351, 434, 127, 25);
		contentPane.add(rdbtnMuyBueno);
		
		JRadioButton rdbtnBueno = new JRadioButton("Bueno");
		rdbtnBueno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCapacidadDeSerAtractivo(BUENO);
			}
		});
		capAtractivo.add(rdbtnBueno);
		rdbtnBueno.setBounds(351, 464, 127, 25);
		contentPane.add(rdbtnBueno);
		
		JRadioButton rdbtnRegular = new JRadioButton("Regular");
		rdbtnRegular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCapacidadDeSerAtractivo(REGULAR);
				
			}
		});
		capAtractivo.add(rdbtnRegular);
		rdbtnRegular.setBounds(351, 494, 127, 25);
		contentPane.add(rdbtnRegular);
		
		JRadioButton rdbtnMalo = new JRadioButton("Malo");
		rdbtnMalo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCapacidadDeSerAtractivo(MALO);
			}
		});
		capAtractivo.add(rdbtnMalo);
		rdbtnMalo.setBounds(351, 524, 127, 25);
		contentPane.add(rdbtnMalo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(24, 558, 97, 25);
		contentPane.add(btnSalir);
		
		JButton btnFinalizar = new JButton("Siguiente");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//LLAMAR A PORTABILIDAD
				
				Portabilidad.nuevaVista(alg);
//				System.out.println("cap entendido " + alg.getCapacidadDeSerEntendido() );
//				System.out.println("cap operado " + alg.getCapacidadDeSerOperado() );
//				System.out.println("cap atrac " + alg.getCapacidadDeSerAtractivo() );
//				
				dispose();
			}
		});
		btnFinalizar.setBounds(399, 558, 97, 25);
		contentPane.add(btnFinalizar);
	}
	
	public void establecerDefault() {
		alg.setCapacidadDeSerEntendido(EXCELENTE);
		alg.setCapacidadDeSerOperado(EXCELENTE);
		alg.setCapacidadDeSerAtractivo(EXCELENTE);
	}
	
}
