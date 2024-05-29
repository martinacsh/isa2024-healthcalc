package healthcalc;

public class PersonDat implements Person {

	private float height;
	private Gender gender;
	private float weight;
	private int age;

	@Override
	public float height() {

		return height;
	}

	@Override
	public Gender gender() {

		return gender;
	}

	@Override
	public float weight() {

		return weight;
	}

	@Override
	public int age() {

		return age;
	}

	public PersonDat(float height, Gender gender) {
		this.height = height;
		this.gender = gender;
		weight = 1;
		age = 0;
	}

	public PersonDat(float height, Gender gender, float weight, int age) {
		this.height = height;
		this.gender = gender;
		this.weight = weight;

		this.age = age;

	}

}
