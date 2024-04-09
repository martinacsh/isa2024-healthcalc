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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
