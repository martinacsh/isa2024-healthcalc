package mainApp;
import java.awt.EventQueue;

import healthcalc.HealthCalculator;

import healthcalc.gui.*;

public class MainApp {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthCalculator modelo = new HealthCalculator();
					CalcVista vista = new CalcVista();
					Controller controlador = new Controller(modelo, vista);
					vista.registrarControlador(controlador);
					

					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});

	}

}
