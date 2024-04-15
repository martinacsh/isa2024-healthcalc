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
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class CalcVista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPanelPrinc;
	private JTextField textFieldWeight;
	private JTextField textFieldBMR;
	
	private JSpinner spinnerHeight;
	private JSpinner spinnerWeight;
	private JSpinner spinnerAge;
	private JRadioButton radioButtonFemale;
	private JRadioButton radioButtonMale;
	private JButton btnIdealWeight;
	private JButton btnCalculateBmr;
	

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
		
		spinnerHeight = new JSpinner();
		spinnerHeight.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		GridBagConstraints gbc_spinnerHeight = new GridBagConstraints();
		gbc_spinnerHeight.anchor = GridBagConstraints.NORTH;
		gbc_spinnerHeight.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerHeight.gridx = 1;
		gbc_spinnerHeight.gridy = 2;
		Argumentspanel.add(spinnerHeight, gbc_spinnerHeight);
		
		spinnerWeight = new JSpinner();
		spinnerWeight.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		GridBagConstraints gbc_spinnerWeight = new GridBagConstraints();
		gbc_spinnerWeight.anchor = GridBagConstraints.NORTH;
		gbc_spinnerWeight.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerWeight.gridx = 2;
		gbc_spinnerWeight.gridy = 2;
		Argumentspanel.add(spinnerWeight, gbc_spinnerWeight);
		
		spinnerAge = new JSpinner();
		spinnerAge.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		GridBagConstraints gbc_spinnerAge = new GridBagConstraints();
		gbc_spinnerAge.anchor = GridBagConstraints.NORTH;
		gbc_spinnerAge.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerAge.gridx = 3;
		gbc_spinnerAge.gridy = 2;
		Argumentspanel.add(spinnerAge, gbc_spinnerAge);
		
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
		
		radioButtonFemale = new JRadioButton("Female");
		radioButtonFemale.setForeground(UIManager.getColor("desktop"));
		radioButtonFemale.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		GridBagConstraints gbc_radioButtonFemale = new GridBagConstraints();
		gbc_radioButtonFemale.insets = new Insets(0, 0, 0, 5);
		gbc_radioButtonFemale.gridx = 1;
		gbc_radioButtonFemale.gridy = 6;
		Argumentspanel.add(radioButtonFemale, gbc_radioButtonFemale);
		
		radioButtonMale = new JRadioButton("Male");
		radioButtonMale.setForeground(UIManager.getColor("desktop"));
		radioButtonMale.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		GridBagConstraints gbc_radioButtonMale = new GridBagConstraints();
		gbc_radioButtonMale.insets = new Insets(0, 0, 0, 5);
		gbc_radioButtonMale.gridx = 3;
		gbc_radioButtonMale.gridy = 6;
		Argumentspanel.add(radioButtonMale, gbc_radioButtonMale);
		
		JPanel Resultspanel = new JPanel();
		Resultspanel.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		contentPanelPrinc.add(Resultspanel, BorderLayout.CENTER);
		GridBagLayout gbl_Resultspanel = new GridBagLayout();
		gbl_Resultspanel.columnWidths = new int[]{151, 49, 0};
		gbl_Resultspanel.rowHeights = new int[]{17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_Resultspanel.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_Resultspanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Resultspanel.setLayout(gbl_Resultspanel);
		
		btnIdealWeight = new JButton("Calculate Ideal Weight");
		btnIdealWeight.setBackground(UIManager.getColor("info"));
		btnIdealWeight.setForeground(UIManager.getColor("desktop"));
		btnIdealWeight.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		GridBagConstraints gbc_btnIdealWeight = new GridBagConstraints();
		gbc_btnIdealWeight.insets = new Insets(0, 0, 5, 5);
		gbc_btnIdealWeight.gridx = 0;
		gbc_btnIdealWeight.gridy = 1;
		Resultspanel.add(btnIdealWeight, gbc_btnIdealWeight);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		GridBagConstraints gbc_textFieldWeight = new GridBagConstraints();
		gbc_textFieldWeight.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldWeight.gridx = 0;
		gbc_textFieldWeight.gridy = 3;
		Resultspanel.add(textFieldWeight, gbc_textFieldWeight);
		textFieldWeight.setColumns(10);
		
		btnCalculateBmr = new JButton("Calculate BMR");
		btnCalculateBmr.setForeground(UIManager.getColor("desktop"));
		btnCalculateBmr.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnCalculateBmr.setBackground(UIManager.getColor("ToolTip.background"));
		GridBagConstraints gbc_btnCalculateBmr = new GridBagConstraints();
		gbc_btnCalculateBmr.insets = new Insets(0, 0, 5, 5);
		gbc_btnCalculateBmr.gridx = 0;
		gbc_btnCalculateBmr.gridy = 6;
		Resultspanel.add(btnCalculateBmr, gbc_btnCalculateBmr);
		
		textFieldBMR = new JTextField();
		textFieldBMR.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		GridBagConstraints gbc_textFieldBMR = new GridBagConstraints();
		gbc_textFieldBMR.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldBMR.gridx = 0;
		gbc_textFieldBMR.gridy = 8;
		Resultspanel.add(textFieldBMR, gbc_textFieldBMR);
		textFieldBMR.setColumns(10);
		
		pack();
		setVisible(true);
	}
	
	
	
	
	public char getGender() {
		if(radioButtonFemale.isSelected()) {
			return 'w';
		} else
		{
			return 'm';
		}
		
	}
	public float getWeight() {
		return ((Double) spinnerWeight.getValue()).floatValue();	

}


	public int getAge() {
		return (Integer) spinnerAge.getValue();	
	}
	public int getHeight() {
		return (Integer) spinnerHeight.getValue();	

	}
	
	
	
	
	public void error(String msg) {
		JOptionPane.showMessageDialog(null, msg, "error", JOptionPane.ERROR_MESSAGE);
	}
	
	public void setIdealWeight(float resultado){
		textFieldWeight.setText(String.valueOf(resultado)+" kg");
	}
	
	public void setBMR(float resultado) {
		textFieldBMR.setText(String.valueOf(resultado)+" calorías por día");
	}
	
	
	public void registrarControlador(ActionListener controlador) {
		btnIdealWeight.addActionListener(controlador);
		btnCalculateBmr.setActionCommand("Calculate ideal weight");
		

		btnCalculateBmr.addActionListener(controlador);
		btnCalculateBmr.setActionCommand("Calculate BMR");
		
		
	}

}
