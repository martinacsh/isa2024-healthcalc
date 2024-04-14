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
		
		String event = ev.getActionCommand();
		if (event.equals("Calcular Peso Ideal")) {
			
			int altura = vista.getAltura();
			char genero= vista.getGenero();
			try {
				float resultado = modelo.idealWeight(altura, genero);	
				vista.setResultPI(resultado);
			} catch (Exception error) {
				String msg= event+": "+error.getMessage();
				vista.error(msg);
			}
			
		}else if(event.equals("Calcular BMR")) {
			int altura = vista.getAltura();
			char genero= vista.getGenero();
			int edad= vista.getEdad();
			float peso= vista.getPeso();
			try {
				float resultado = modelo.basalMetabolicRate(peso, altura, genero, edad);	
				vista.setResultBMR(resultado);
			} catch (Exception error) {
				String msg= event+": "+error.getMessage();
				vista.error(msg);
			}
		}
		
	}

	
	
	
	
}
