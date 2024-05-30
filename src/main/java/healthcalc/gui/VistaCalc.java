package healthcalc.gui;

import java.awt.EventQueue;
import healthcalc.Gender;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class VistaCalc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JRadioButton radioButtonFemale;
	private JRadioButton radioButtonMale;
	private ButtonGroup buttonGroup = new ButtonGroup();
	
	private JSpinner WeightSpinner;
	private JSpinner HeightSpinner;
	private JSpinner AgeSpinner;
	private JButton btnIdealWeight;
	private JButton btnBMR;
	private JTextField weightTextField;
	private JTextField textFieldBMR;



	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaCalc frame = new VistaCalc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public VistaCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel Titlepanel = new JPanel();
		contentPane.add(Titlepanel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Health Calculator");
		lblNewLabel.setBackground(UIManager.getColor("activeCaption"));
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Titlepanel.add(lblNewLabel);
		
		JPanel ArgumentsPanel = new JPanel();
		contentPane.add(ArgumentsPanel, BorderLayout.WEST);
		GridBagLayout gbl_ArgumentsPanel = new GridBagLayout();
		gbl_ArgumentsPanel.columnWidths = new int[]{34, 71, 34, 71, 34, 71, 0};
		gbl_ArgumentsPanel.rowHeights = new int[]{22, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_ArgumentsPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_ArgumentsPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		ArgumentsPanel.setLayout(gbl_ArgumentsPanel);
		
		HeightSpinner = new JSpinner();
		HeightSpinner.setFont(new Font("Tahoma", Font.PLAIN, 13));
		HeightSpinner.setModel(new SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
		GridBagConstraints gbc_HeightSpinner = new GridBagConstraints();
		gbc_HeightSpinner.fill = GridBagConstraints.HORIZONTAL;
		gbc_HeightSpinner.anchor = GridBagConstraints.NORTH;
		gbc_HeightSpinner.insets = new Insets(0, 0, 5, 5);
		gbc_HeightSpinner.gridx = 1;
		gbc_HeightSpinner.gridy = 2;
		ArgumentsPanel.add(HeightSpinner, gbc_HeightSpinner);
		
		WeightSpinner = new JSpinner();
		WeightSpinner.setModel(new SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
		WeightSpinner.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_WeightSpinner = new GridBagConstraints();
		gbc_WeightSpinner.fill = GridBagConstraints.HORIZONTAL;
		gbc_WeightSpinner.anchor = GridBagConstraints.NORTH;
		gbc_WeightSpinner.insets = new Insets(0, 0, 5, 5);
		gbc_WeightSpinner.gridx = 3;
		gbc_WeightSpinner.gridy = 2;
		ArgumentsPanel.add(WeightSpinner, gbc_WeightSpinner);
		
		AgeSpinner = new JSpinner();
		AgeSpinner.setModel(new SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
		AgeSpinner.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_AgeSpinner = new GridBagConstraints();
		gbc_AgeSpinner.fill = GridBagConstraints.HORIZONTAL;
		gbc_AgeSpinner.anchor = GridBagConstraints.NORTH;
		gbc_AgeSpinner.insets = new Insets(0, 0, 5, 0);
		gbc_AgeSpinner.gridx = 5;
		gbc_AgeSpinner.gridy = 2;
		ArgumentsPanel.add(AgeSpinner, gbc_AgeSpinner);
		
		JLabel lblNewLabel_1 = new JLabel("Height (cm)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		ArgumentsPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Weight (kg)");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_2.gridx = 3;
		gbc_lblNewLabel_1_2.gridy = 3;
		ArgumentsPanel.add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Age");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1_1.gridx = 5;
		gbc_lblNewLabel_1_1.gridy = 3;
		ArgumentsPanel.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Gender");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_1_3 = new GridBagConstraints();
		gbc_lblNewLabel_1_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_3.gridx = 3;
		gbc_lblNewLabel_1_3.gridy = 7;
		ArgumentsPanel.add(lblNewLabel_1_3, gbc_lblNewLabel_1_3);
		
		JPanel ResultsPanel = new JPanel();
		contentPane.add(ResultsPanel, BorderLayout.CENTER);
		GridBagLayout gbl_ResultsPanel = new GridBagLayout();
		gbl_ResultsPanel.columnWidths = new int[]{33, 89, 96, 0};
		gbl_ResultsPanel.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_ResultsPanel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_ResultsPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		ResultsPanel.setLayout(gbl_ResultsPanel);
		
		JLabel lblNewLabel_1_4 = new JLabel("CALCULATE");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		GridBagConstraints gbc_lblNewLabel_1_4 = new GridBagConstraints();
		gbc_lblNewLabel_1_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_4.gridx = 1;
		gbc_lblNewLabel_1_4.gridy = 1;
		ResultsPanel.add(lblNewLabel_1_4, gbc_lblNewLabel_1_4);
		
		btnIdealWeight = new JButton("IdealWeight");
		btnIdealWeight.setVerticalAlignment(SwingConstants.TOP);
		btnIdealWeight.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		GridBagConstraints gbc_btnIdealWeight = new GridBagConstraints();
		gbc_btnIdealWeight.fill = GridBagConstraints.BOTH;
		gbc_btnIdealWeight.insets = new Insets(0, 0, 5, 5);
		gbc_btnIdealWeight.gridx = 1;
		gbc_btnIdealWeight.gridy = 3;
		ResultsPanel.add(btnIdealWeight, gbc_btnIdealWeight);
		
		weightTextField = new JTextField();
		weightTextField.setEditable(false);
		GridBagConstraints gbc_weightTextField_1 = new GridBagConstraints();
		gbc_weightTextField_1.insets = new Insets(0, 0, 5, 5);
		gbc_weightTextField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_weightTextField_1.gridx = 1;
		gbc_weightTextField_1.gridy = 5;
		ResultsPanel.add(weightTextField, gbc_weightTextField_1);
		weightTextField.setColumns(10);
		
		btnBMR = new JButton("BMR");
		btnBMR.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		GridBagConstraints gbc_btnBMR = new GridBagConstraints();
		gbc_btnBMR.fill = GridBagConstraints.BOTH;
		gbc_btnBMR.insets = new Insets(0, 0, 5, 5);
		gbc_btnBMR.gridx = 1;
		gbc_btnBMR.gridy = 7;
		ResultsPanel.add(btnBMR, gbc_btnBMR);
		
		textFieldBMR = new JTextField();
		textFieldBMR.setEditable(false);
		GridBagConstraints gbc_bMRtextField_1 = new GridBagConstraints();
		gbc_bMRtextField_1.insets = new Insets(0, 0, 0, 5);
		gbc_bMRtextField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_bMRtextField_1.gridx = 1;
		gbc_bMRtextField_1.gridy = 9;
		ResultsPanel.add(textFieldBMR, gbc_bMRtextField_1);
		textFieldBMR.setColumns(10);
		
		
		
		
		radioButtonFemale = new JRadioButton("w");
		radioButtonFemale.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		radioButtonFemale.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_radioButtonFemale_1 = new GridBagConstraints();
		gbc_radioButtonFemale_1.insets = new Insets(0, 0, 0, 5);
		gbc_radioButtonFemale_1.gridx = 2;
		gbc_radioButtonFemale_1.gridy = 8;
		ArgumentsPanel.add(radioButtonFemale, gbc_radioButtonFemale_1);
		
		
		buttonGroup.add(radioButtonFemale);
		
		radioButtonMale = new JRadioButton("m");
		radioButtonMale.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		radioButtonMale.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_radioButtonMale_1 = new GridBagConstraints();
		gbc_radioButtonMale_1.insets = new Insets(0, 0, 0, 5);
		gbc_radioButtonMale_1.gridx = 4;
		gbc_radioButtonMale_1.gridy = 8;
		ArgumentsPanel.add(radioButtonMale, gbc_radioButtonMale_1);
		buttonGroup.add(radioButtonMale);
		
		pack();
		setVisible(true);

	}
	
	public Gender getGender() {
		if(radioButtonFemale.isSelected()) {
			return Gender.FEMALE;
		} else
		{
			return Gender.MALE;
		}
		
	}
	public float getWeight() {
		return ((Double) WeightSpinner.getValue()).floatValue();	

}


	public int getAge() {
		return (Integer) AgeSpinner.getValue();	
	}
	public int getHeight() {
		return (Integer) HeightSpinner.getValue();	

	}
	
	
	
	
	public void error(String msg) {
		JOptionPane.showMessageDialog(null, msg, "error", JOptionPane.ERROR_MESSAGE);
	}
	
	public void setIdealWeight(double resultado){
		weightTextField.setText(String.valueOf(resultado)+" kg");
	}
	
	public void setBMR(float resultado) {
		textFieldBMR.setText(String.valueOf(resultado)+" calorías por día");
	}
	
	
	public void registrarControlador(ActionListener controlador) {
		btnIdealWeight.addActionListener(controlador);
		btnIdealWeight.setActionCommand("Calculate ideal weight");
		

		btnBMR.addActionListener(controlador);
		btnBMR.setActionCommand("Calculate BMR");
		
		
	}
	

}
