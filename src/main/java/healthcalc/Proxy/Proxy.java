package healthcalc.Proxy;


import healthcalc.CardiovascularMetrics;
import healthcalc.Gender;

import healthcalc.MetabolicMetrics;
import healthcalc.HealthCalculator;
import healthcalc.Person;


public class Proxy implements CardiovascularMetrics, MetabolicMetrics, HealthStats {
	private HealthCalculator calc;
	private float alturas;
	private int pesos;
	private int edades;
	private float BMRs;
	private int numF;
	private int numM;

	@Override
	public double getIdealBodyWeight(Person person) throws Exception {
		float height = person.height();
		alturas += height;
		Gender gender = person.gender();

		if (gender == Gender.FEMALE) {
			numF++;
		} else {
			numM++;
		}

		return calc.getIdealBodyWeight(person);
	}

	@Override
	public double basalMetabolicRate(Person person) throws Exception {
		float height = person.height();
		Gender gender = person.gender();
		float weight = person.weight();
		int age = person.age();

		alturas += height;
		pesos += weight;
		edades += age;

		if (gender == Gender.FEMALE) {
			numF++;
		} else {
			numM++;
		}

		double bmr = calc.basalMetabolicRate(person);
		BMRs += bmr;
		return bmr;
	}

	@Override
	public float alturaMedia() {

		float media = alturas / numTotalPacientes();
		return media;
	}

	@Override
	public float pesoMedio() {
		float media = pesos / numTotalPacientes();
		return media;
	}

	@Override
	public float edadMedia() {
		float media = edades / numTotalPacientes();
		return media;
	}

	@Override
	public float bmrMedio() {
		float media = BMRs / numTotalPacientes();
		return media;
	}

	@Override
	public int numSexoF() {
		return numF;
	}

	@Override
	public int numSexoM() {
		return numM;
	}

	@Override
	public int numTotalPacientes() {
		return numF + numM;
	}

}
