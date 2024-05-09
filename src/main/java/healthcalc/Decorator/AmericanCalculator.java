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
		float bmr = 0;
		System.out.print("La persona con altura " + height +  "pies " +  "y " + weight +  "libras " + "tiene un BMR de " + bmr);
		System.out.print("The person with a height of " + height +  "feet " +  "y " + weight +  "pounds " + "has a bmr of " + bmr);

		return bmr;
	}
	
	

}
