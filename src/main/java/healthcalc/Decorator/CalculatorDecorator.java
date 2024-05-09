package healthcalc.Decorator;

import healthcalc.HealthCalc;

public class CalculatorDecorator implements HealthCalc {
	HealthCalc wrappedCalculator;

	public CalculatorDecorator(HealthCalc wrappedCalc) {
		wrappedCalculator = wrappedCalc;
	}

	@Override
	public float idealWeight(int height, char gender) throws Exception {
		return wrappedCalculator.idealWeight(height, gender);
	}

	@Override
	public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
		return wrappedCalculator.basalMetabolicRate(weight, height, gender, age);
				
	}

}
