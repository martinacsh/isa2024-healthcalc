package healthcalc;

public class HealthCalculator implements MetabolicMetrics, CardiovascularMetrics {

	private static HealthCalculator calc;

	private HealthCalculator() {
	}

	public static HealthCalculator getCalculator() {
		if (calc == null) {
			calc = new HealthCalculator();
		}

		return calc;
	}

	public double getIdealBodyWeight(Person person) throws Exception {
		float height = person.height();
		Gender gender = person.gender();
		double resultado = 0;

		if (height <= 0) {
			throw new Exception("La altura proporcionada no es válida");
		}
		if (gender == Gender.FEMALE) {
			resultado = (height - 100) - ((height - 150) / 2.5d);
		}
		if (gender == Gender.MALE) {
			resultado = (height - 100) - ((height - 150) / 4d);
		}
		if (gender != Gender.MALE && gender != Gender.FEMALE) {
			throw new Exception("El género proporcionado no es válido");
		}

		if (resultado <= 0) {
			throw new Exception("El resultado es negativo. Pruebe con otros datos.");
		}
		return resultado;
	}

	public double basalMetabolicRate(Person person) throws Exception {

		float weight = person.weight();
		float height = person.height();
		Gender gender = person.gender();
		int age = person.age();
		double resultado = 0;
		if (age <= 0) {
			throw new Exception("La edad proporcionada no es válida");
		}
		if (height <= 0) {
			throw new Exception("La altura proporcionada no es válida");
		}
		if (weight <= 0) {
			throw new Exception("El peso proporcionado no es válido");

		}
		if (gender != Gender.MALE && gender != Gender.FEMALE) {

			throw new Exception("El género proporcionado no es válido");
		}

		if (gender == Gender.MALE) {
			resultado = 10f * (weight + 6.25f) * (height - 5) * (age + 5);
		}
		if (gender == Gender.FEMALE) {
			resultado = 10 * weight + 6.25f * height - 5 * age - 161;
			if (resultado <= 0) {
				throw new Exception("El resultado es negativo. Pruebe con otros datos");

			}

		}

		return resultado;
	}



}
