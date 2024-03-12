package healthcalc;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

	@Test
	@DisplayName("Esto es un test de ejemplo.")
	public void bmi() {
		assertEquals(true, true);
	}
	//Tests idealWeight
	
	@ParameterizedTest
	@CsvSource({ "'2'", "'*'", "'n'", "'_'", "7" })
	@DisplayName("idealWeight() argumento género no válido")
	public void test1_idealWeight_gender(char gender) throws Exception {
		assertThrows(Exception.class, () -> {
			obj.idealWeight(160, gender);
		});
	}


	@ParameterizedTest
	@CsvSource({ "-1, 'm'", "0, 'w'",
			"-20, 'w'", "-1, 'w'", "0, 'm'" })
	@DisplayName("idealWeight() argumento altura no válido")
	public void test2_idealWeight_height(int height, char gender) throws Exception {
		assertThrows(Exception.class, () -> {
			obj.idealWeight(height, gender);
		});
	}

	@ParameterizedTest
	@CsvSource({ "180, 'm'", "165, 'w'",
			"84, 'm'", "67, 'w'", "1000, 'm'" })
	@DisplayName("idealWeight() argumentos válidos")
	public void test3_IdealWeight_correctArguments(int height, char gender) throws Exception {
		assertDoesNotThrow(() -> {
			float resultado = obj.idealWeight(height, gender);
			assertTrue(resultado > 0);
		});
	}





	//Tests basalMetabolicRate
}
