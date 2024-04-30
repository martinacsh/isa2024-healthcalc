package mainApp;
import java.awt.EventQueue;
import healthcalc.gui.*;

import healthcalc.HealthCalculator;


public class MainApp {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthCalculator modelo = HealthCalculator.getCalculator();
					VistaCalc vista = new VistaCalc();
					Controller controlador = new Controller(modelo, vista);
					vista.registrarControlador(controlador);
					

					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});

	}

}
