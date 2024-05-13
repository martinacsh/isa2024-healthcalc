package healthcalc.Decorator;

import healthcalc.Adapter.HealthHospital;

public class ISOutput extends OutputDecorator{
	
	public ISOutput(HealthHospital wrappedCalc) {
		super(wrappedCalc);
	}

	@Override
	public float idealWeightA(char gender, float height) throws Exception {
		
		return wrappedCalc.idealWeightA(gender, height);
	}

	@Override
	public float bmrA(char gender, int age, float height, int weight) throws Exception {
		float bmr = wrappedCalc.bmrA(gender, age, height, weight);
		System.out.print("La persona con altura " + height + " m " + "y peso " + weight + "kg " + "tiene un bmr de " + bmr);
		System.out.print("The person with a height of " + height + "m " + "and a weight of " + weight + "kg " + "has a bmr of " + bmr);
		return bmr;
	}

}
