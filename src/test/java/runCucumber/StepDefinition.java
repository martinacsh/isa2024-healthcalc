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
	
	
	@Given("I use a health calculator")
	public void i_use_a_health_calculator() {
	    calculator = new HealthCalculator();
	}

	@When("I calculate the ideal weight with an incorrect gender <g>")
	public void i_calculate_the_ideal_weight_with_an_incorrect_gender_g(String g) {
		try {
			calculator.idealWeight(173, g.toCharArray()[0]);
		}catch(Exception e) {
			exception= true;
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
		}catch(Exception e) {
			exception= true;
		}
	}



	@When("I calculate the ideal weight for height {int} and gender {string} and the output is negative")
	public void i_calculate_the_ideal_weight_for_height_and_gender_and_the_output_is_negative(Integer n, String g) {
		try {
			calculator.idealWeight(n, g.toCharArray()[0]);
		}catch(Exception e) {
			exception= true;
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
	
	//-----------------------------------------------------
	
	
	
	

}
