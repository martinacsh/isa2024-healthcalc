package healthcalc.Decorator;

import healthcalc.Adapter.HealthHospital;

public class ImperialOutput extends OutputDecorator{
	
	public ImperialOutput(HealthHospital wrappedCalc) {
		
		super(wrappedCalc);
	}
	
	@Override
	public float idealWeightA(char gender, float height) throws Exception {
		
		return wrappedCalc.idealWeightA(gender, height);
	}

	@Override
	public float bmrA(char gender, int age, float height, int weight) throws Exception {
		float bmr = wrappedCalc.bmrA(gender, age, height, weight);
		System.out.print("La persona con altura " + height + "pies " + "y peso " + weight + "libras " + "tiene un bmr de " + bmr);
		System.out.print("The person with a height of " + height + "feet " + "and a weight of " + weight + "pounds " + "has a bmr of " + bmr);
		return bmr;
	}

	

}
