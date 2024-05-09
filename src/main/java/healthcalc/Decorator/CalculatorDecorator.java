package healthcalc.Decorator;

import healthcalc.Adapter.HealthHospital;

public class CalculatorDecorator implements HealthHospital {
	 protected HealthHospital wrappedCalculator;

	public CalculatorDecorator(HealthHospital wrappedCalc) {
		wrappedCalculator = wrappedCalc;
	}

	@Override
	public float idealWeightA(char gender, float height) throws Exception {
		return wrappedCalculator.idealWeightA(gender, height);
	}

	@Override
	public float bmrA(char gender, int age, float height, int weight) throws Exception {
		return wrappedCalculator.bmrA(gender, age, height, weight);
				
	}

}
