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
	private CardiovascularMetrics cardio;

	@BeforeEach
	public void init() {
		HealthCalculator obj = HealthCalculator.getCalculator();
		HealthCalculator cardio = HealthCalculator.getCalculator();
	}
	

	// -------------------Tests
	// idealWeight-------------------------------------------

	@ParameterizedTest
	@CsvSource({ "'2'", "'*'", "'n'", "'_'", "7" })
	@DisplayName("getIdealBodyWeight() argumento género no válido")
	public void test1_idealWeight_gender(Gender gender) throws Exception {
		assertThrows(Exception.class, () -> {
			cardio.getIdealBodyWeight(new PersonDat(173, gender));
		});
	}

	@ParameterizedTest
	@CsvSource({ "-1, 'm'", "0, 'w'", "-20, 'w'", "-1, 'w'", "0, 'm'" })
	@DisplayName("getIdealBodyWeight() argumento altura no válido")
	public void test2_idealWeight_height(int height, Gender gender) throws Exception {
		assertThrows(Exception.class, () -> {
			cardio.getIdealBodyWeight(new PersonDat(height, gender));
		});
	}

	@ParameterizedTest
	@CsvSource({ "84, 'm'", "67, 'w'", "187, 'm'", "173, 'w'" })
	@DisplayName("getIdealBodyWeight() argumentos válidos")
	public void test3_IdealWeight_correctArguments(float height, Gender gender) throws Exception {
		assertDoesNotThrow(() -> {
			double resultado = cardio.getIdealBodyWeight(new PersonDat(height, gender));
			assertTrue(resultado > 0);
		});
	}

	@ParameterizedTest
	@CsvSource({ "120, 'm'", "100, 'w'", "190, 'm'", "157, 'w'" })
	@DisplayName("IW menor que altura ")
	public void test_4_idealWeight_lessThanHeight(float height, Gender gender) throws Exception {
		assertDoesNotThrow(() -> {
			double resultado = cardio.getIdealBodyWeight(new PersonDat(height, gender));
			assertTrue(resultado < height);
		});
	}

	@ParameterizedTest
	@CsvSource({ "120, 'm'", "113, 'w'", "89, 'm'", "94, 'w'" })
	@DisplayName("IW menor o igual a height-100 para height<=150 cm")
	public void test5_idealWeight_above150(float height, Gender gender) throws Exception {
		assertDoesNotThrow(() -> {
			double resultado = cardio.getIdealBodyWeight(new PersonDat(height, gender));
			assertTrue(resultado <= height - 100);
		});
	}

	@ParameterizedTest
	@CsvSource({ "66, 'w'", "2, 'w'", "83, 'm'", "50, 'm'" })
	@DisplayName("Alturas límite lanzan excepción")
	public void test6_idealWeight_heightThreshold(float height, Gender gender) throws Exception {
		assertThrows(Exception.class, () -> {
			cardio.getIdealBodyWeight(new PersonDat(height, gender));
		});
	}

	// ---------------------Tests
	// basalMetabolicRate------------------------------------

	@ParameterizedTest
	@CsvSource({ "'2'", "'*'", "'n'", "'_'", "7" })
	@DisplayName("basalMR() argumento género no válido")
	public void test1_basalMR_gender(Gender gender) throws Exception {
		assertThrows(Exception.class, () -> {
			obj.basalMetabolicRate(new PersonDat(173, gender, 57, 24));
		});
	}

	@ParameterizedTest
	@CsvSource({ "-1, 'm'", "0, 'w'", "-20, 'w'", "-1, 'w'", "0, 'm'" })
	@DisplayName("basalMR() argumento altura no válido")
	public void test2_basalMR_height(float height, Gender gender) throws Exception {
		assertThrows(Exception.class, () -> {
			obj.basalMetabolicRate(new PersonDat(height, gender, 57, 24));
		});
	}

	@ParameterizedTest
	@CsvSource({ "-3, 'w'", "-1, 'm'", "0, 'w'" })
	@DisplayName("basalMR() argumento peso no válido")
	public void test3_basalMR_weight(float weight, Gender gender) throws Exception {
		assertThrows(Exception.class, () -> {
			obj.basalMetabolicRate(new PersonDat(173, gender, weight, 24));
		});

	}

	@ParameterizedTest
	@CsvSource({ "-35, 'w'", "-7, 'm'" })
	@DisplayName("basalMR() argumento edad no válido")
	public void test4_basalMRI_age(Gender gender, int age) throws Exception {
		assertThrows(Exception.class, () -> {
			obj.basalMetabolicRate(new PersonDat(173, gender, 57, age));
		});
	}

	@ParameterizedTest
	@CsvSource({ "173, 'w', , 13", "165, 'w', 89, 78", "50, 'm', 4, 1", "125, 'w', 45, 60", "1000, 'm', 343, 23" })
	@DisplayName("basalMR() todos los argumentos correctos, no lanza exc")
	public void test5_basalMR_correctArguments(float weight, float height, Gender gender, int age) throws Exception {
		assertDoesNotThrow(() -> {
			float result = obj.basalMetabolicRate(new PersonDat(height, gender, weight, age));
			assertTrue(result > 0);
		});
	}

	@ParameterizedTest
	@CsvSource({ "9, 1, 4", "3, 0, 3" })
	@DisplayName("basalMR resultados negativos mujeres")
	public void test6_basalMR_wNegative(float weight, float height, int age) throws Exception {
		assertThrows(Exception.class, () -> {
			obj.basalMetabolicRate(new PersonDat(height, Gender.FEMALE, height, age));
		});
	}

	@ParameterizedTest
	@CsvSource({ "57, 173, 24", "73, 169, 38" })
	@DisplayName("basalMR() mismos argumentos para distintos géneros, m>w")
	public void test7_basalMR_same_Arguments(float weight, float height, int age) throws Exception {
		assertTrue(obj.basalMetabolicRate(new PersonDat(173, Gender.FEMALE, 57, age)) < obj
				.basalMetabolicRate(new PersonDat(173, Gender.MALE, 57, age)));

	}

}
