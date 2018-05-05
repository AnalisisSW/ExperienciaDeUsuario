package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

public class FramePrincipal extends JFrame {

	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal frame = new FramePrincipal();
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
	public FramePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		
		
		JRadioButton rdbtnBueno = new JRadioButton("Buena");
		rdbtnBueno.setBounds(20, 59, 55, 23);
		panel.add(rdbtnBueno);
		
		
		
		
		
		
		
		JLabel lblEntendibilidad = new JLabel("FUNCIONABILIDAD");
		lblEntendibilidad.setBounds(107, 10, 160, 23);
		lblEntendibilidad.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		panel.add(lblEntendibilidad);
		
		JRadioButton rdbtnRegular = new JRadioButton("Regular");
		rdbtnRegular.setBounds(22, 100, 63, 23);
		panel.add(rdbtnRegular);
		
		JRadioButton rdbtnMala = new JRadioButton("Mala");
		rdbtnMala.setBounds(20, 144, 47, 23);
		panel.add(rdbtnMala);
		
		setContentPane(panel);
		
		JLabel lblNewLabel = new JLabel("<html>\r\n\r\n\tSEGURIDAD DE ACCESO: Capacidad del software para asegurar la integridad de los datos <br>"
				+ "y la confidencialidad de estos.<br><br>EXACTITUD DE RESULTADOS: Capacidad del software para proporcionar los resultados con<br>"
				+ " el grado necesario de precision.</html>");
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setBounds(146, 63, 226, 113);
		panel.add(lblNewLabel);
		
	}
	
	
	
	

}
