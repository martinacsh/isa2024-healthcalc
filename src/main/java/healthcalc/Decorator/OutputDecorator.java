package healthcalc.Decorator;

import healthcalc.Adapter.HealthHospital;

public abstract class OutputDecorator implements HealthHospital{
	protected HealthHospital wrappedCalc;
	
	public OutputDecorator(HealthHospital wrappedCalc) {
		this.wrappedCalc = wrappedCalc;
	}

	@Override
	public double idealWeightA(char gender, float height) throws Exception {
		
		return wrappedCalc.idealWeightA(gender, height);
	}

	@Override
	public float bmrA(char gender, int age, float height, int weight) throws Exception {
		float bmr = wrappedCalc.bmrA(gender, age, height, weight);
		output(height, weight, bmr);
		return bmr;
	}
	
	protected abstract void output(float height, int weight, double bmr);
    
	}


