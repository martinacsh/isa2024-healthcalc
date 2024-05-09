package healthcalc.Decorator;

import healthcalc.Adapter.HealthHospital;

public class AmericanCalculator extends CalculatorDecorator{

	public AmericanCalculator(HealthHospital wrappedCalc) {
		super(wrappedCalc);

	}


	@Override
	public float idealWeightA(char gender, float height) throws Exception {
		return 0;
	}

	@Override
	public float bmrA(char gender, int age, float height, int weight) throws Exception {
		return 0;
				
	}
	

}
