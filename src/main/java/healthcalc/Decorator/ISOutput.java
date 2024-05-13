package healthcalc.Decorator;

import healthcalc.Adapter.HealthHospital;

public class ISOutput extends OutputDecorator{
	
	public ISOutput(HealthHospital wrappedCalc) {
		super(wrappedCalc);
	}

	protected void mensaje(float height, int weight, double bmr) {
		System.out.print("La persona con altura " + height + " m " + "y peso " + weight + "kg " + "tiene un bmr de " + bmr);
		System.out.print("The person with a height of " + height + "m " + "and a weight of " + weight + "kg " + "has a bmr of " + bmr);
		
	}

}
