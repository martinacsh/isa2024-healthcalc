package healthcalc.Decorator;

import healthcalc.Adapter.HealthHospital;

public class AmericanCalculator extends CalculatorDecorator {

	public AmericanCalculator(HealthHospital wrappedCalc) {
		super(wrappedCalc);

	}

	@Override
	public float idealWeightA(char gender, float height) throws Exception {
		float alturaMetros = (float) (height * 0.3048);
		return wrappedCalculator.idealWeightA(gender, alturaMetros);
	}

	@Override
	public float bmrA(char gender, int age, float height, int weight) throws Exception {
		float alturaMetros = (float) (height * 0.3048);
		int pesoLibras = (int) (weight * 453.592);
		return wrappedCalculator.bmrA(gender, age, alturaMetros, pesoLibras);

	}

}
