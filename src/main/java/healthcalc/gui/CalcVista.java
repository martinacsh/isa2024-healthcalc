package healthcalc.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CalcVista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPanelPrinc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcVista frame = new CalcVista();
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
	public CalcVista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPanelPrinc = new JPanel();
		contentPanelPrinc.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanelPrinc);
		contentPanelPrinc.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPanelPrinc.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
	}

}
