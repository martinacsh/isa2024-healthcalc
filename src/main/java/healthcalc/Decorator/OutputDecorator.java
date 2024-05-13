package healthcalc.Decorator;

import healthcalc.Adapter.HealthHospital;

public class OutputDecorator implements HealthHospital{
	protected HealthHospital wrappedCalc;
	
	public OutputDecorator(HealthHospital wrappedCalc) {
		this.wrappedCalc = wrappedCalc;
	}

	@Override
	public float idealWeightA(char gender, float height) throws Exception {
		wrappedCalc.idealWeightA(gender, height);
		
		return 0;
	}

	@Override
	public float bmrA(char gender, int age, float height, int weight) throws Exception {
		wrappedCalc.bmrA(gender, age, height, weight);
		return 0;
	}

}
