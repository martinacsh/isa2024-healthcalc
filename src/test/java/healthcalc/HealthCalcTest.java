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
			obj.idealWeight(173, gender);
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
	@CsvSource({ "84, 'm'", "67, 'w'",
			"187, 'm'", "173, 'w'"})
	@DisplayName("idealWeight() argumentos válidos")
	public void test3_IdealWeight_correctArguments(int height, char gender) throws Exception {
		assertDoesNotThrow(() -> {
			float resultado = obj.idealWeight(height, gender);
			assertTrue(resultado > 0);
		});
	}

	@ParameterizedTest
    @CsvSource({ "120, 'm'", "100, 'w'", "190, 'm'", "157, 'w'" })
    @DisplayName("IW menor que altura ")
    public void test_4_idealWeight_lessThanHeight(int height, char gender) {
        double idealWeight = obj.idealWeight(height, gender);
        assertTrue(idealWeight < height);
    }

	@ParameterizedTest
    @CsvSource({ "120, 'm'", "113, 'w'", "89, 'm'", "94, 'w'" })
    @DisplayName("IW menor o igual a height-100 para height<=150 cm")
    public void test5_idealWeight_Above150(int height, char gender) {
        double idealWeight = obj.idealWeight(height, gender);
        assertTrue(idealWeight <= height - 100);
	}
		@ParameterizedTest
		@CsvSource({ "66, 'w'", "2, 'w'",
				"83, 'm'", "50, 'm'" })
		@DisplayName("Alturas límite lanzan excepción")
		public void test6_IdealWeight_heightThreshold(int height, char gender) throws Exception {
			assertThrows(Exception.class, () -> {
				obj.idealWeight(height, gender);
			});
		}





	//Tests basalMetabolicRate
}
