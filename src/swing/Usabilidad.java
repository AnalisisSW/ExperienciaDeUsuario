package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.AlgoritmoDeCalidad;
import sun.security.x509.AlgorithmId;

public class Usabilidad extends JFrame {

	private JPanel contentPane;
	AlgoritmoDeCalidad alg;

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
		this.alg = algoritmo;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

}
