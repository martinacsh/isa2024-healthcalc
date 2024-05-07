package healthcalc.Proxy;

import java.util.List;

import healthcalc.HealthCalc;
import healthcalc.HealthCalculator;

public class Proxy implements HealthCalc, HealthStats{
	private HealthCalculator calc;
	private List<Integer> alturas;
	private List<Float> pesos;
	private List <Integer> edades;
	private List<Float> BMRs;
	private int numF;
	private int numM;
	private int totalPacientes;
	
	
	
	@Override
	public float idealWeight(int height, char gender) throws Exception {
		
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float alturaMedia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float pesoMedio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float edadMedia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float bmrMedio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numSexoF() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numSexoM() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numTotalPacientes() {
		// TODO Auto-generated method stub
		return 0;
	}



}
