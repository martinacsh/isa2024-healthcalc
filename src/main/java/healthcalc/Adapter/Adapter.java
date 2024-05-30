package healthcalc.Adapter;

import healthcalc.Gender;
import healthcalc.HealthCalculator;
import healthcalc.Person;
import healthcalc.PersonDat;

public class Adapter implements HealthHospital {
	private HealthCalculator adaptedCalculator;

	public double idealWeightA(char gender, float height) throws Exception {

		Person person = new PersonDat((height * 100), getGender(gender));

		return adaptedCalculator.getIdealBodyWeight(person);
	}

	public double bmrA(char gender, int age, float height, int weight) throws Exception {

		float pesoEnKg = (float) weight;
		pesoEnKg /= 1000f;
		
		Person person = new PersonDat((height * 100), getGender(gender), pesoEnKg, age);

		return adaptedCalculator.basalMetabolicRate(person);
	}

	private Gender getGender(char g) {
		Gender gender;
		if (g != 'w' && g != 'm') {
			throw new IllegalArgumentException("Género inválido: " + g);
		}
		if (g == 'w') {
			gender = Gender.FEMALE;
		} else {
			gender = Gender.MALE;
		}
		return gender;

	}

}
