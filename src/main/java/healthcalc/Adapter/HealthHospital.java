package healthcalc.Adapter;

public interface HealthHospital {
	
	public float idealWeightA(char gender, float height) throws Exception;
	
	public float bmrA(char gender, int age, float height, int weight) throws Exception;

}
