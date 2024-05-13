package healthcalc.Decorator;

import healthcalc.Adapter.HealthHospital;

public class ImperialOutput extends OutputDecorator{
	
	public ImperialOutput(HealthHospital wrappedCalc) {
		
		super(wrappedCalc);
	}


	protected void output(float height, int weight, double bmr) {
		System.out.print("La persona con altura " + height + "pies " + "y peso " + weight + "libras " + "tiene un bmr de " + bmr);
		System.out.print("The person with a height of " + height + "feet " + "and a weight of " + weight + "pounds " + "has a bmr of " + bmr);
		
	}

	

}
