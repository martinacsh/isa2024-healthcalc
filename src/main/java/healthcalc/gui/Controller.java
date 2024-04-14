package healthcalc.gui;

import healthcalc.HealthCalculator;

import healthcalc.gui.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	private HealthCalculator modelo;
	private CalcVista vista;
	
	public Controller(HealthCalculator modelo, CalcVista vista) {
		this.modelo = modelo;
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		String mensaje = ev.getActionCommand();
		if (mensaje.equals("Calculate Ideal Weight")) {
			
			int height = vista.getHeight();
			char gender = vista.getGender();
			try {
				float result = modelo.idealWeight(height, gender);	
				vista.setIdealWeight(result);
				
			} catch (Exception e) {
				String m = mensaje + ": " + e.getMessage();
				vista.error(m);
			}
			
		}else if(mensaje.equals("Calculate BMR")) {
			int height = vista.getHeight();
			char gender = vista.getGender();
			int age = vista.getAge();
			float weight = vista.getWeight();
			try {
				float resultado = modelo.basalMetabolicRate(weight, height, gender, age);	
				vista.setBMR(resultado);
				
			} catch (Exception e) {
				
				String m = mensaje + ": " + e.getMessage();
				vista.error(m);
			}
		}
		
	}
		
	}

	
