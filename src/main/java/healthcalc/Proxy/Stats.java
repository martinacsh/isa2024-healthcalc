package healthcalc.Proxy;

import java.util.List;

public class Stats {
	
	public float get_alturaMedia(List<Integer> alturas) {
		int cont = 0;
		int total = 0;
		for(int altura : alturas) {
			total += altura;
			cont += 1;
		}
		float media = total/cont;
		return media;
	}
	
	public float get_pesoMedio(List<Integer> pesos) {
		int cont = 0;
		int total = 0;
		for(int peso : pesos) {
			total += peso;
			cont += 1;
		}
		float media = total/cont;
		return media;
	}

	
	public float get_edadMedia(List<Integer> edades) {
		int cont = 0;
		int total = 0;
		for(int edad : edades) {
			total += edad;
			cont += 1;
		}
		float media = total/cont;
		return media;
	}

	
	public float bmrMedio(List<Float> BMRs) {
		int cont = 0;
		int total = 0;
		for(float bmr : BMRs) {
			total += bmr;
			cont += 1;
		}
		float media = total/cont;
		return media;
	}

}
