package healthcalc.Adapter;

public interface HealthHospital {
	
	public double idealWeightA(char gender, float height) throws Exception;
	
	public double bmrA(char gender, int age, float height, int weight) throws Exception;

}
