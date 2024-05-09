package healthcalc.Decorator;

import healthcalc.HealthCalc;

public class AmericanCalculator extends CalculatorDecorator{

	public AmericanCalculator(HealthCalc wrapppedCalc) {
		super(wrapppedCalc);
	}
	
	@Override
	public float idealWeight(int height, char gender) {
		

		return 0;
	}
	@Override
	public float basalMetabolicRate(float weight, int height, char gender, int age)throws Exception {
		float feet = (float) (height/30.48);
		float lbs = (float) (weight/0.453592);

		return 0;
	}
	
	

}
