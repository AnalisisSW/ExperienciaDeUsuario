package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.prism.paint.Color;

import main.AlgoritmoDeCalidad;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Portabilidad extends JFrame {

	private JPanel contentPane;
	AlgoritmoDeCalidad alg;
	private static Integer EXCELENTE = 10,
			   MUY_BUENO = 8,
			   BUENO = 6,
			   REGULAR = 4,
			   MALO = 2;
	private final ButtonGroup adaptabilidad = new ButtonGroup();
	private final ButtonGroup instalabilidad = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void nuevaVista(AlgoritmoDeCalidad algoritmo) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portabilidad frame = new Portabilidad(algoritmo);
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
	public Portabilidad(AlgoritmoDeCalidad algoritmo) {
		setTitle("Portabilidad");
		this.alg = algoritmo;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		establecerDefault();
		
		
		JLabel lblAdaptabilidad = new JLabel("Adaptabilidad:");
		lblAdaptabilidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdaptabilidad.setBounds(27, 37, 176, 21);
		contentPane.add(lblAdaptabilidad);
		
		JTextPane txtpnCapacidadDelProducto = new JTextPane();
		txtpnCapacidadDelProducto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnCapacidadDelProducto.setBackground(SystemColor.activeCaptionBorder);
		txtpnCapacidadDelProducto.setEditable(false);
		txtpnCapacidadDelProducto.setText("\u2022 Capacidad del producto software de adaptarse a diferentes sistemas operativos sin cambiar su estructura interna");
		txtpnCapacidadDelProducto.setBounds(27, 69, 320, 70);
		contentPane.add(txtpnCapacidadDelProducto);
		
		JRadioButton rdbtnExcelenteAd = new JRadioButton("Excelente");
		rdbtnExcelenteAd.setSelected(true);
		rdbtnExcelenteAd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setAdaptabilidad(EXCELENTE);
			}
		});
		adaptabilidad.add(rdbtnExcelenteAd);
		rdbtnExcelenteAd.setBounds(382, 24, 109, 23);
		contentPane.add(rdbtnExcelenteAd);
		
		JRadioButton rdbtnMuyBuenoAd = new JRadioButton("Muy Bueno");
		rdbtnMuyBuenoAd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setAdaptabilidad(MUY_BUENO);
			}
		});
		adaptabilidad.add(rdbtnMuyBuenoAd);
		rdbtnMuyBuenoAd.setBounds(382, 50, 109, 23);
		contentPane.add(rdbtnMuyBuenoAd);
		
		JRadioButton rdbtnBuenoAd = new JRadioButton("Bueno");
		rdbtnBuenoAd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setAdaptabilidad(BUENO);
			}
		});
		adaptabilidad.add(rdbtnBuenoAd);
		rdbtnBuenoAd.setBounds(382, 76, 109, 23);
		contentPane.add(rdbtnBuenoAd);
		
		JRadioButton rdbtnRegularAd = new JRadioButton("Regular");
		rdbtnRegularAd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setAdaptabilidad(REGULAR);
			}
		});
		adaptabilidad.add(rdbtnRegularAd);
		rdbtnRegularAd.setBounds(382, 102, 109, 23);
		contentPane.add(rdbtnRegularAd);
		
		JRadioButton rdbtnMaloAd = new JRadioButton("Malo");
		rdbtnMaloAd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setAdaptabilidad(MALO);
			}
		});
		adaptabilidad.add(rdbtnMaloAd);
		rdbtnMaloAd.setBounds(382, 128, 109, 23);
		contentPane.add(rdbtnMaloAd);
		
		JLabel lblInstalabilidad = new JLabel("Instalabilidad:");
		lblInstalabilidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblInstalabilidad.setBounds(27, 198, 116, 21);
		contentPane.add(lblInstalabilidad);
		
		JTextPane txtpnCapacidadDelProducto_1 = new JTextPane();
		txtpnCapacidadDelProducto_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnCapacidadDelProducto_1.setBackground(SystemColor.activeCaptionBorder);
		txtpnCapacidadDelProducto_1.setEditable(false);
		txtpnCapacidadDelProducto_1.setText("\u2022 Capacidad del producto software de poder ser instalado en una cantidad m\u00EDnima de pasos.");
		txtpnCapacidadDelProducto_1.setBounds(27, 231, 320, 70);
		contentPane.add(txtpnCapacidadDelProducto_1);
		
		JRadioButton rdbtnExcelente = new JRadioButton("Excelente");
		rdbtnExcelente.setSelected(true);
		rdbtnExcelente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setInstalabilidad(EXCELENTE);
			}
		});
		instalabilidad.add(rdbtnExcelente);
		rdbtnExcelente.setBounds(382, 198, 109, 23);
		contentPane.add(rdbtnExcelente);
		
		JRadioButton rdbtnMuyBueno = new JRadioButton("Muy Bueno");
		rdbtnMuyBueno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setInstalabilidad(MUY_BUENO);
			}
		});
		instalabilidad.add(rdbtnMuyBueno);
		rdbtnMuyBueno.setBounds(382, 224, 109, 23);
		contentPane.add(rdbtnMuyBueno);
		
		JRadioButton rdbtnBueno = new JRadioButton("Bueno");
		rdbtnBueno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setInstalabilidad(BUENO);
			}
		});
		instalabilidad.add(rdbtnBueno);
		rdbtnBueno.setBounds(382, 250, 109, 23);
		contentPane.add(rdbtnBueno);
		
		JRadioButton rdbtnRegular = new JRadioButton("Regular ");
		rdbtnRegular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setInstalabilidad(REGULAR);
			}
		});
		instalabilidad.add(rdbtnRegular);
		rdbtnRegular.setBounds(382, 276, 109, 23);
		contentPane.add(rdbtnRegular);
		
		JRadioButton rdbtnMalo = new JRadioButton("Malo");
		rdbtnMalo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg.setInstalabilidad(MALO);
			}
		});
		instalabilidad.add(rdbtnMalo);
		rdbtnMalo.setBounds(382, 302, 109, 23);
		contentPane.add(rdbtnMalo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(30, 408, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				String resultado = AlgoritmoDeCalidad.calculoDeExperiencia(algoritmo);
				 

				 
				switch (resultado) {
				case "BUENA": JOptionPane.showMessageDialog(null, "Resultado obtenido: BUENA ", "Estadistica", JOptionPane.INFORMATION_MESSAGE ); 
					break;
				case "REGULAR": JOptionPane.showMessageDialog(null, "Resultado obtenido: REGULAR ", "Estadistica", JOptionPane.INFORMATION_MESSAGE ); 
					break;
				case "MALA": JOptionPane.showMessageDialog(null, "Resultado obtenido: MALO ", "Estadistica", JOptionPane.INFORMATION_MESSAGE ); 
					break;
				}
				
				*/
				
				ReporteFinal.nuevaVista(alg);
				dispose();
			}
		});
		btnFinalizar.setBounds(371, 408, 89, 23);
		contentPane.add(btnFinalizar);
	}
	
	public void establecerDefault() {
		alg.setAdaptabilidad(EXCELENTE);
		alg.setInstalabilidad(EXCELENTE);

	}
}
