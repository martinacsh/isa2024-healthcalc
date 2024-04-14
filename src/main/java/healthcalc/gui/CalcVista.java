package healthcalc.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;

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
		setBounds(100, 100, 534, 363);
		contentPanelPrinc = new JPanel();
		contentPanelPrinc.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanelPrinc);
		contentPanelPrinc.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBorder(null);
		panelTitle.setBackground(UIManager.getColor("inactiveCaption"));
		contentPanelPrinc.add(panelTitle, BorderLayout.NORTH);
		panelTitle.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Health Calculator");
		lblNewLabel.setBackground(UIManager.getColor("activeCaption"));
		lblNewLabel.setForeground(UIManager.getColor("desktop"));
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelTitle.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panelSouth = new JPanel();
		contentPanelPrinc.add(panelSouth, BorderLayout.SOUTH);
		
		JPanel Argumentspanel = new JPanel();
		Argumentspanel.setBackground(UIManager.getColor("ToolBar.light"));
		Argumentspanel.setBorder(null);
		contentPanelPrinc.add(Argumentspanel, BorderLayout.WEST);
		GridBagLayout gbl_Argumentspanel = new GridBagLayout();
		gbl_Argumentspanel.columnWidths = new int[]{30, 49, 30, 49, 30, 49, 0};
		gbl_Argumentspanel.rowHeights = new int[]{20, 0, 0, 0, 0, 0, 0, 0};
		gbl_Argumentspanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Argumentspanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Argumentspanel.setLayout(gbl_Argumentspanel);
		
		JSpinner spinner_2_1 = new JSpinner();
		spinner_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		GridBagConstraints gbc_spinner_2_1 = new GridBagConstraints();
		gbc_spinner_2_1.anchor = GridBagConstraints.NORTH;
		gbc_spinner_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_2_1.gridx = 1;
		gbc_spinner_2_1.gridy = 2;
		Argumentspanel.add(spinner_2_1, gbc_spinner_2_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		GridBagConstraints gbc_spinner_2 = new GridBagConstraints();
		gbc_spinner_2.anchor = GridBagConstraints.NORTH;
		gbc_spinner_2.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_2.gridx = 2;
		gbc_spinner_2.gridy = 2;
		Argumentspanel.add(spinner_2, gbc_spinner_2);
		
		JSpinner spinner_2_2 = new JSpinner();
		spinner_2_2.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		GridBagConstraints gbc_spinner_2_2 = new GridBagConstraints();
		gbc_spinner_2_2.anchor = GridBagConstraints.NORTH;
		gbc_spinner_2_2.insets = new Insets(0, 0, 5, 5);
		gbc_spinner_2_2.gridx = 3;
		gbc_spinner_2_2.gridy = 2;
		Argumentspanel.add(spinner_2_2, gbc_spinner_2_2);
		
		JLabel lblNewLabel_1 = new JLabel("Height");
		lblNewLabel_1.setForeground(UIManager.getColor("desktop"));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		Argumentspanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Weight");
		lblNewLabel_2.setForeground(UIManager.getColor("desktop"));
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 3;
		Argumentspanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Age");
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel_2_1.setForeground(UIManager.getColor("desktop"));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1.gridx = 3;
		gbc_lblNewLabel_2_1.gridy = 3;
		Argumentspanel.add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gender");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(UIManager.getColor("desktop"));
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 2;
		gbc_lblNewLabel_1_1.gridy = 5;
		Argumentspanel.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		JRadioButton RadioButtonFemale = new JRadioButton("Female");
		RadioButtonFemale.setForeground(UIManager.getColor("desktop"));
		RadioButtonFemale.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		GridBagConstraints gbc_RadioButtonFemale = new GridBagConstraints();
		gbc_RadioButtonFemale.insets = new Insets(0, 0, 0, 5);
		gbc_RadioButtonFemale.gridx = 1;
		gbc_RadioButtonFemale.gridy = 6;
		Argumentspanel.add(RadioButtonFemale, gbc_RadioButtonFemale);
		
		JRadioButton RadioButtonMale = new JRadioButton("Male");
		RadioButtonMale.setForeground(UIManager.getColor("desktop"));
		RadioButtonMale.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		GridBagConstraints gbc_RadioButtonMale = new GridBagConstraints();
		gbc_RadioButtonMale.insets = new Insets(0, 0, 0, 5);
		gbc_RadioButtonMale.gridx = 3;
		gbc_RadioButtonMale.gridy = 6;
		Argumentspanel.add(RadioButtonMale, gbc_RadioButtonMale);
		
		JPanel Resultspanel = new JPanel();
		Resultspanel.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		contentPanelPrinc.add(Resultspanel, BorderLayout.CENTER);
		GridBagLayout gbl_Resultspanel = new GridBagLayout();
		gbl_Resultspanel.columnWidths = new int[]{151, 49, 0};
		gbl_Resultspanel.rowHeights = new int[]{17, 0, 0, 0, 0};
		gbl_Resultspanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_Resultspanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Resultspanel.setLayout(gbl_Resultspanel);
		
		JLabel lblNewLabel_3 = new JLabel("Calculate Ideal Weight");
		lblNewLabel_3.setForeground(UIManager.getColor("desktop"));
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 0;
		Resultspanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Calculate BMR");
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 3;
		Resultspanel.add(lblNewLabel_4, gbc_lblNewLabel_4);
	}

}
