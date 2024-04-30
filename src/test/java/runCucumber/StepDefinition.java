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

	//IdealWeight
	
	@Given("I use a health calculator")
	public void i_use_a_health_calculator() {
		calculator = new HealthCalculator();
	    throw new io.cucumber.java.PendingException();
	}
/*
	@When("I calculate the ideal weight with an incorrect gender {int}")
	public void i_calculate_the_ideal_weight_with_an_incorrect_gender(Integer int1) {
		try {
			calculator.idealWeight(173, int1);
		} catch (Exception e) {
			exception = true;
		}
	    
	}
*/

	@Then("the program throws an exception")
	public void the_program_throws_an_exception() {
		assertTrue(exception);
	}
/*
	@When("I calculate the ideal weight with an incorrect gender a")
	public void i_calculate_the_ideal_weight_with_an_incorrect_gender_a() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
*/
	@When("I calculate the ideal weight with an incorrect gender {string}")
	public void i_calculate_the_ideal_weight_with_an_incorrect_gender(String string) {
		try {
			calculator.idealWeight(173, string.toCharArray()[0]);
		} catch (Exception e) {
			exception = true;
		}
	}

	@When("I calculate the ideal weight with an incorrect height {int}")
	public void i_calculate_the_ideal_weight_with_an_incorrect_height(Integer int1) {
		try {
			calculator.idealWeight(int1, 'm');
		} catch (Exception e) {
			exception = true;
		}
	}

	@When("I calculate the ideal weight with an incorrect height {string}")
	public void i_calculate_the_ideal_weight_with_an_incorrect_height(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I calculate the ideal weight for height {int} and gender {string} and the output is negative")
	public void i_calculate_the_ideal_weight_for_height_and_gender_and_the_output_is_negative(Integer int1, String string) {
		try {
			calculator.idealWeight(int1, string.toCharArray()[0]);
		} catch (Exception e) {
			exception = true;
		}
	}

	@When("I calculate the ideal weight for height {int} and gender {string}")
	public void i_calculate_the_ideal_weight_for_height_and_gender(Integer int1, String string) throws Exception {
		result = calculator.idealWeight(int1, string.toCharArray()[0]);
	}

	@Then("the program provides an appropiate output {string}")
	public void the_program_provides_an_appropiate_output(String string) {
		assertEquals(Float.parseFloat(string), result);
	}
	
	//BasalMR----------------------------------------------------------------------------------------------

}
