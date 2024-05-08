package healthcalc.Proxy;

import java.util.List;

import healthcalc.HealthCalc;
import healthcalc.HealthCalculator;

public class Proxy implements HealthCalc, HealthStats {
	private HealthCalculator calc;
	private List<Integer> alturas;
	private List<Float> pesos;
	private List<Integer> edades;
	private List<Float> BMRs;
	private int numF;
	private int numM;
	private Stats stats;

	@Override
	public float idealWeight(int height, char gender) throws Exception {
		alturas.add(height);

		if (gender == 'f') {
			numF++;
		} else {
			numM++;
		}

		return calc.idealWeight(height, gender);
	}

	@Override
	public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
		alturas.add(height);
		pesos.add(weight);
		edades.add(age);

		if (gender == 'f') {
			numF++;
		} else {
			numM++;
		}
		float bmr = calc.basalMetabolicRate(weight, height, gender, age);
		// bmr.add(BMRs);
		return bmr;
	}

	@Override
	public float alturaMedia() {

		float media = stats.get_alturaMedia(alturas);
		return media;
	}

	@Override
	public float pesoMedio() {
		float media = stats.get_pesoMedio(pesos);
		return media;
	}

	@Override
	public float edadMedia() {
		float media = stats.get_edadMedia(edades);
		return media;
	}

	@Override
	public float bmrMedio() {
		float media = stats.get_bmrMedio(BMRs);
		return media;
	}

	@Override
	public int numSexoF() {
		return numF;
	}

	@Override
	public int numSexoM() {
		return numM;
	}

	@Override
	public int numTotalPacientes() {
		return numF + numM;
	}

}
