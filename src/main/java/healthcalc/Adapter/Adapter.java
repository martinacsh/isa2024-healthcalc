package healthcalc.Adapter;

import healthcalc.HealthCalculator;

public class Adapter implements HealthHospital {
	private HealthCalculator adaptedCalculator;

	public float idealWeightA(char gender, float height) throws Exception {
		height *= 100;
		int alturaEnCent = (int) height;

		return adaptedCalculator.idealWeight(alturaEnCent, gender);
	}

	public float bmrA(char gender, int age, float height, int weight) throws Exception {
		height *= 100;
		int alturaEnCent = (int) height;
		
		float pesoEnKg = (float) weight;
		pesoEnKg /= 1000;

		return adaptedCalculator.basalMetabolicRate(pesoEnKg, alturaEnCent, gender, age);
	}

}
