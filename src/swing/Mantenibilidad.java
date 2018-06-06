package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.AlgoritmoDeCalidad;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Mantenibilidad extends JFrame {

	private JPanel contentPane;
	AlgoritmoDeCalidad alg;
	private static Integer EXCELENTE = 10,
						   MUY_BUENO = 8,
						   BUENO = 6,
						   REGULAR = 4,
						   MALO = 2;
	private final ButtonGroup analizCodigo = new ButtonGroup();
	private final ButtonGroup cambiabilidadCod = new ButtonGroup();
	private final ButtonGroup estabilidadCod = new ButtonGroup();
	


	/**
	 * Launch the application.
	 */
	public static void nuevaVista(AlgoritmoDeCalidad algoritmo) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mantenibilidad frame = new Mantenibilidad(algoritmo);
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
	public Mantenibilidad(AlgoritmoDeCalidad algoritmo) {
		setTitle("Mantenibilidad");
		this.alg = algoritmo;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		establecerDefault();
		
		JLabel lblAnalizabilidaddelcodigo = new JLabel("Analizabilidad Del Codigo:");
		lblAnalizabilidaddelcodigo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAnalizabilidaddelcodigo.setBounds(38, 33, 189, 33);
		contentPane.add(lblAnalizabilidaddelcodigo);
		
		JTextPane txtpnCapacidadDelCdigo = new JTextPane();
		txtpnCapacidadDelCdigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnCapacidadDelCdigo.setBackground(SystemColor.activeCaptionBorder);
		txtpnCapacidadDelCdigo.setEditable(false);
		txtpnCapacidadDelCdigo.setText("\u2022Capacidad del c\u00F3digo para ser analizado\r\n\u2022Analizabilidad del c\u00F3digo teniendo en cuenta el porcentaje de comentarios por m\u00E9todo y en general");
		txtpnCapacidadDelCdigo.setBounds(38, 79, 259, 85);
		contentPane.add(txtpnCapacidadDelCdigo);
		
		JRadioButton rdbtnExcelenteAC = new JRadioButton("Excelente");
		rdbtnExcelenteAC.setSelected(true);
		rdbtnExcelenteAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				alg.setAnalizabilidadDelCodigo(EXCELENTE);
				
			}
		});
		analizCodigo.add(rdbtnExcelenteAC);
		rdbtnExcelenteAC.setBounds(403, 30, 127, 25);
		contentPane.add(rdbtnExcelenteAC);
		
		JRadioButton rdbtnMuyBuenoAC = new JRadioButton("Muy Bueno");
		rdbtnMuyBuenoAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setAnalizabilidadDelCodigo(MUY_BUENO);
			}
		});
		analizCodigo.add(rdbtnMuyBuenoAC);
		rdbtnMuyBuenoAC.setBounds(403, 61, 127, 25);
		contentPane.add(rdbtnMuyBuenoAC);
		
		JRadioButton rdbtnBuenoAC = new JRadioButton("Bueno");
		rdbtnBuenoAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setAnalizabilidadDelCodigo(BUENO);
			}
		});
		analizCodigo.add(rdbtnBuenoAC);
		rdbtnBuenoAC.setBounds(403, 91, 127, 25);
		contentPane.add(rdbtnBuenoAC);
		
		JRadioButton rdbtnRegularAC = new JRadioButton("Regular");
		rdbtnRegularAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setAnalizabilidadDelCodigo(REGULAR);
			}
		});
		analizCodigo.add(rdbtnRegularAC);
		rdbtnRegularAC.setBounds(403, 121, 127, 25);
		contentPane.add(rdbtnRegularAC);
		
		JRadioButton rdbtnMaloAC = new JRadioButton("Malo");
		rdbtnMaloAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setAnalizabilidadDelCodigo(MALO);
			}
		});
		analizCodigo.add(rdbtnMaloAC);
		rdbtnMaloAC.setBounds(403, 151, 127, 25);
		contentPane.add(rdbtnMaloAC);
		
		JLabel lblCambiabilidadDelCodigo = new JLabel("Cambiabilidad Del Codigo:");
		lblCambiabilidadDelCodigo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCambiabilidadDelCodigo.setBounds(38, 202, 189, 25);
		contentPane.add(lblCambiabilidadDelCodigo);
		
		JTextPane txtpnCapacidadDelCdigo_1 = new JTextPane();
		txtpnCapacidadDelCdigo_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnCapacidadDelCdigo_1.setBackground(SystemColor.activeCaptionBorder);
		txtpnCapacidadDelCdigo_1.setEditable(false);
		txtpnCapacidadDelCdigo_1.setText("\u2022Capacidad del c\u00F3digo para ser cambiado\r\n\u2022Analizabilidad del c\u00F3digo teniendo en cuenta la complejidad ciclom\u00E1tica del m\u00E9todo.");
		txtpnCapacidadDelCdigo_1.setBounds(38, 231, 259, 85);
		contentPane.add(txtpnCapacidadDelCdigo_1);
		
		JRadioButton rdbtnExcelenteCC = new JRadioButton("Excelente");
		rdbtnExcelenteCC.setSelected(true);
		rdbtnExcelenteCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCambiabilidadDelCodigo(EXCELENTE);
			}
		});
		cambiabilidadCod.add(rdbtnExcelenteCC);
		rdbtnExcelenteCC.setBounds(403, 202, 127, 25);
		contentPane.add(rdbtnExcelenteCC);
		
		JRadioButton rdbtnMuyBuenoCC = new JRadioButton("Muy Bueno");
		rdbtnMuyBuenoCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCambiabilidadDelCodigo(MUY_BUENO);
			}
		});
		cambiabilidadCod.add(rdbtnMuyBuenoCC);
		rdbtnMuyBuenoCC.setBounds(403, 231, 127, 25);
		contentPane.add(rdbtnMuyBuenoCC);
		
		JRadioButton rdbtnBuenoCC = new JRadioButton("Bueno");
		rdbtnBuenoCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCambiabilidadDelCodigo(BUENO);
			}
		});
		cambiabilidadCod.add(rdbtnBuenoCC);
		rdbtnBuenoCC.setBounds(403, 261, 127, 25);
		contentPane.add(rdbtnBuenoCC);
		
		JRadioButton rdbtnRegularCC = new JRadioButton("Regular");
		rdbtnRegularCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCambiabilidadDelCodigo(REGULAR);
			}
		});
		cambiabilidadCod.add(rdbtnRegularCC);
		rdbtnRegularCC.setBounds(403, 291, 127, 25);
		contentPane.add(rdbtnRegularCC);
		
		JRadioButton rdbtnMaloCC = new JRadioButton("Malo");
		rdbtnMaloCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setCambiabilidadDelCodigo(MALO);
			}
		});
		cambiabilidadCod.add(rdbtnMaloCC);
		rdbtnMaloCC.setBounds(403, 321, 127, 25);
		contentPane.add(rdbtnMaloCC);
		
		JLabel lblEstabilidadDelCodigo = new JLabel("Estabilidad Del Codigo:");
		lblEstabilidadDelCodigo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEstabilidadDelCodigo.setBounds(38, 358, 189, 25);
		contentPane.add(lblEstabilidadDelCodigo);
		
		JTextPane txtpnEstabilidadPromedioDe = new JTextPane();
		txtpnEstabilidadPromedioDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnEstabilidadPromedioDe.setBackground(SystemColor.activeCaptionBorder);
		txtpnEstabilidadPromedioDe.setEditable(false);
		txtpnEstabilidadPromedioDe.setText("\u2022Estabilidad\r\n\u2022Promedio de fallas del sistema por prueba.");
		txtpnEstabilidadPromedioDe.setBounds(38, 396, 259, 77);
		contentPane.add(txtpnEstabilidadPromedioDe);
		
		JRadioButton rdbtnExcelente = new JRadioButton("Excelente");
		rdbtnExcelente.setSelected(true);
		rdbtnExcelente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setEstabilidadDelCodigo(EXCELENTE);
			}
		});
		estabilidadCod.add(rdbtnExcelente);
		rdbtnExcelente.setBounds(403, 369, 127, 25);
		contentPane.add(rdbtnExcelente);
		
		JRadioButton rdbtnMuyBueno = new JRadioButton("Muy Bueno");
		rdbtnMuyBueno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setEstabilidadDelCodigo(MUY_BUENO);
			}
		});
		estabilidadCod.add(rdbtnMuyBueno);
		rdbtnMuyBueno.setBounds(403, 396, 127, 25);
		contentPane.add(rdbtnMuyBueno);
		
		JRadioButton rdbtnBueno = new JRadioButton("Bueno");
		rdbtnBueno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setEstabilidadDelCodigo(BUENO);
			}
		});
		estabilidadCod.add(rdbtnBueno);
		rdbtnBueno.setBounds(403, 421, 127, 25);
		contentPane.add(rdbtnBueno);
		
		JRadioButton rdbtnRegular = new JRadioButton("Regular");
		rdbtnRegular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setEstabilidadDelCodigo(REGULAR);
			}
		});
		estabilidadCod.add(rdbtnRegular);
		rdbtnRegular.setBounds(403, 448, 127, 25);
		contentPane.add(rdbtnRegular);
		
		JRadioButton rdbtnMalo = new JRadioButton("Malo");
		rdbtnMalo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setEstabilidadDelCodigo(MALO);
			}
		});
		estabilidadCod.add(rdbtnMalo);
		rdbtnMalo.setBounds(403, 478, 127, 25);
		contentPane.add(rdbtnMalo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnSalir.setBounds(38, 504, 97, 25);
		contentPane.add(btnSalir);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//llama a vtana usabilidad 
				//alg.mostrarMantenibilidad();
				Usabilidad.nuevaVista(alg);
				dispose();
				
			}
		});
		btnSiguiente.setBounds(433, 504, 97, 25);
		contentPane.add(btnSiguiente);
	}
	
	public void establecerDefault() {
		alg.setAnalizabilidadDelCodigo(EXCELENTE);
		alg.setEstabilidadDelCodigo(EXCELENTE);
		alg.setCambiabilidadDelCodigo(EXCELENTE);
	}
}
