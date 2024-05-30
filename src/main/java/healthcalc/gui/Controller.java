package healthcalc.gui;

import healthcalc.HealthCalculator;
import healthcalc.Person;
import healthcalc.PersonDat;
import healthcalc.Gender;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	private HealthCalculator modelo;
	private VistaCalc vista;

	public Controller(HealthCalculator modelo, VistaCalc vista) {
		this.modelo = modelo;
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent ev) {

		String mensaje = ev.getActionCommand();
		if (mensaje.equals("Calculate Ideal Weight")) {

			float height = vista.getHeight();
			Gender gender = vista.getGender();
			Person person = new PersonDat(height, gender);
			try {
				double result = modelo.getIdealBodyWeight(person);
				vista.setIdealWeight(result);

			} catch (Exception e) {
				String m = mensaje + ": " + e.getMessage();
				vista.error(m);
			}

		} else if (mensaje.equals("Calculate BMR")) {
			float height = vista.getHeight();
			Gender gender = vista.getGender();
			int age = vista.getAge();
			float weight = vista.getWeight();
			Person person = new PersonDat(height, gender, weight, age);
			try {
				double resultado = modelo.basalMetabolicRate(person);
				vista.setBMR(resultado);

			} catch (Exception e) {

				String m = mensaje + ": " + e.getMessage();
				vista.error(m);
			}
		}

	}

}
