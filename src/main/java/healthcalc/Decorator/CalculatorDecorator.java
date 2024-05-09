package healthcalc.Decorator;

import healthcalc.HealthCalc;

public class CalculatorDecorator implements HealthCalc{
	HealthCalc wrappedCalculator;
	
	public CalculatorDecorator(HealthCalc wrappedCalc) {
		wrappedCalculator = wrappedCalc;
	}

	@Override
	public float idealWeight(int height, char gender) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
