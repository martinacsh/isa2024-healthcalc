package healthcalc.Decorator;

import healthcalc.Adapter.HealthHospital;

public class EuropeanCalculator extends CalculatorDecorator{

	public EuropeanCalculator(HealthHospital wrappedCalc) {
		super(wrappedCalc);
		
	}


				
	}


