package healthcalc;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {
	private HealthCalc obj;


	@BeforeEach
	public void init() {
		obj = new HealthCalculator();
	}

	//-------------------Tests idealWeight-------------------------------------------
	
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
			"180, 'm'", "165, 'w'"})
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
    public void test_4_idealWeight_lessThanHeight(int height, char gender) throws Exception {
		 assertDoesNotThrow(() -> {
        float resultado = obj.idealWeight(height, gender);
        assertTrue(resultado < height);
    });
}

	@ParameterizedTest
    @CsvSource({ "120, 'm'", "113, 'w'", "89, 'm'", "94, 'w'" })
    @DisplayName("IW menor o igual a height-100 para height<=150 cm")
    public void test5_idealWeight_above150(int height, char gender) throws Exception {
		assertDoesNotThrow(() -> {
        float resultado = obj.idealWeight(height, gender);
        assertTrue(resultado <= height - 100);
	});
}
		@ParameterizedTest
		@CsvSource({ "66, 'w'", "2, 'w'",
				"83, 'm'", "50, 'm'" })
		@DisplayName("Alturas límite lanzan excepción")
		public void test6_idealWeight_heightThreshold(int height, char gender) throws Exception {
			assertThrows(Exception.class, () -> {
				obj.idealWeight(height, gender);
			});
		}

		//---------------------Tests basalMetabolicRate------------------------------------


		@ParameterizedTest
		@CsvSource({ "'2'", "'*'", "'n'", "'_'", "7" })
		@DisplayName("basalMR() argumento género no válido")
		public void test1_basalMR_gender(char gender) throws Exception {
			assertThrows(Exception.class, () -> {
				obj.basalMetabolicRate(173, 64, gender, 30);
			});
		}

		@ParameterizedTest
	@CsvSource({ "-1, 'm'", "0, 'w'",
			"-20, 'w'", "-1, 'w'", "0, 'm'" })
	@DisplayName("basalMR() argumento altura no válido")
	public void test2_basalMR_height(int height, char gender) throws Exception {
		assertThrows(Exception.class, () -> {
			obj.basalMetabolicRate(157, height, gender, 24);
		});
	}

	@ParameterizedTest
	@CsvSource({ "-3, 'w'", "-1, 'm'",
			"0, 'w'" })
	@DisplayName("basalMR() argumento peso no válido")
	public void test3_basalMR_weight(int weight, char gender) throws Exception {
		assertThrows(Exception.class, () -> {
			obj.basalMetabolicRate(weight, 173, gender, 20);
		});

	}
	@ParameterizedTest
	@CsvSource({ "'w', 0", "'m', -1" })
	@DisplayName("basalMR() argumento edad no válido")
	public void test4_basalMRI_age(char gender, int age) throws Exception {
		assertThrows(Exception.class, () -> {
			obj.basalMetabolicRate(57, 173, gender, age);
		});
	}
	@ParameterizedTest
	@CsvSource({ "57, 173, 'w', 16", "71, 165, 'w', 78",
			"50, 4, 'm', 1", "125, 45, 'w', 60", "1000, 200, 'm', 23" })
	@DisplayName("basalMR() todos los argumentos correctos, no lanza exc")
	public void test5_basalMR_correctArguments(int weight, int height, char gender, int age) throws Exception {
		assertDoesNotThrow(() -> {
			float result = obj.basalMetabolicRate(weight, height, gender, age);
			assertTrue(result > 0);
		});
	}

	@ParameterizedTest
	@CsvSource({ "9, 1, 4", "3, 0, 3" })
	@DisplayName("basalMR resultados negativos mujeres")
	public void test6_basalMR_wNegative(int weight, int height, int age) throws Exception {
		assertThrows(Exception.class, () -> {
			obj.basalMetabolicRate(weight, height, 'w', age);
		});
	}


	@ParameterizedTest
	@CsvSource({ "57, 173, 24", "73, 169, 38" })
	@DisplayName("basalMR() mismos argumentos para distintos géneros, m>w")
	public void test7_basalMR_same_Arguments(int weight, int height, int age) throws Exception {
		assertTrue(obj.basalMetabolicRate(weight, height, 'w', age) < obj.basalMetabolicRate(weight, height, 'm', age));

	}

}
