package runCucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import healthcalc.HealthCalculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	private HealthCalculator calculator;
	private float result;
	private boolean exception;

	// IdealWeight

	@Given("I use a health calculator")
	public void i_use_a_health_calculator() {
		calculator = new HealthCalculator();
	}

	@When("I calculate the ideal weight with an incorrect gender <g>")
	public void i_calculate_the_ideal_weight_with_an_incorrect_gender_g(String g) {
		try {
			calculator.idealWeight(173, g.toCharArray()[0]);
		} catch (Exception e) {
			exception = true;
		}

	}

	@Then("the program throws an exception")
	public void the_program_throws_an_exception() {
		assertTrue(exception);
	}

	@When("I calculate the ideal weight with an incorrect height <h>")
	public void i_calculate_the_ideal_weight_with_an_incorrect_height_h(Integer n) {
		try {
			calculator.idealWeight(n, 'm');
		} catch (Exception e) {
			exception = true;
		}
	}

	@When("I calculate the ideal weight for height {int} and gender {string} and the output is negative")
	public void i_calculate_the_ideal_weight_for_height_and_gender_and_the_output_is_negative(Integer n, String g) {
		try {
			calculator.idealWeight(n, g.toCharArray()[0]);
		} catch (Exception e) {
			exception = true;
		}
	}

	@When("I calculate the ideal weight for height {int} and gender {string}")
	public void i_calculate_the_ideal_weight_for_height_and_gender(Integer n, String g) throws Exception {
		result = calculator.idealWeight(n, g.toCharArray()[0]);
	}

	@Then("the program provides an appropiate output {string}")
	public void the_program_provides_an_appropiate_output(String s) {
		assertEquals(Float.parseFloat(s), result);
	}

	// -----------------------------------------------------

	// BasalMR

	@When("I calculate the basal metabolic rate with an incorrect gender <g>")
	public void i_calculate_the_basal_metabolic_rate_with_an_incorrect_gender_g(String g) {
		try {
			calculator.basalMetabolicRate(60, 173, g.toCharArray()[0], 21);
		} catch (Exception e) {
			exception = true;
		}
	}

	@When("I calculate the basal metabolic rate with an incorrect height <h>")
	public void i_calculate_the_basal_metabolic_rate_with_an_incorrect_height_h(Integer n) {
		try {
			calculator.basalMetabolicRate(80, n, 'm', 19);
		} catch (Exception e) {
			exception = true;
		}
	}

	@When("I calculate the basal metabolic rate with an incorrect weight <w>")
	public void i_calculate_the_basal_metabolic_rate_with_an_incorrect_weight_w(Integer n) {
		try {
			calculator.basalMetabolicRate(n, 169, 'w', 30);
		} catch (Exception e) {
			exception = true;
		}
	}

	@When("I calculate the basal metabolic rate for an age with negative value <a>")
	public void i_calculate_the_basal_metabolic_rate_for_an_age_with_negative_value_a(Integer n) {
		try {
			calculator.basalMetabolicRate(50, 160, 'w', n);
		}catch(Exception e) {
			exception= true;
		}
	}

	@Then("the system throws an excep")
	public void the_system_throws_an_excep() {
		assertTrue(exception);
	}

	@When("I calculate the basal metabolic rate for height {int} gender {string} age {int} and weight {int}")
	public void i_calculate_the_basal_metabolic_rate_for_height_gender_age_and_weight(Integer n1, String s,
			Integer n2, Integer n3) throws Exception{
		result = calculator.basalMetabolicRate(n1, n2, s.toCharArray()[0], n3);
	}
	
	@Then("the program provides an appropiate result {string}")
	public void the_program_provides_an_appropiate_result(String s) {
		assertEquals(Float.parseFloat(s), result);
	}

}
