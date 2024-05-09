package healthcalc.Decorator;

import healthcalc.HealthCalc;

public class EuropeanCalculator extends CalculatorDecorator{

	public EuropeanCalculator(HealthCalc wrappedCalc) {
		super(wrappedCalc);
		
	}


	@Override
	public float idealWeight(int height, char gender) throws Exception {
		float iw = 0;
		return iw ;
	}

	@Override
	public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
		float bmr = 0;
		System.out.print("La persona con altura " + height +  "metros " +  "y " + weight +  "kg " + "tiene un BMR de " + bmr);
		System.out.print("The person with a height of " + height +  "metres " +  "y " + weight +  "kg " + "has a bmr of " + bmr);
		return bmr ;
				
	}

}
