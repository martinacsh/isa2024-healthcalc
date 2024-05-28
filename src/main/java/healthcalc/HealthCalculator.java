package healthcalc;


public class HealthCalculator implements HealthCalc{
	
	private static HealthCalculator calc;
	
	private HealthCalculator() {
	}
	
	public static HealthCalculator getCalculator() {
		if (calc == null){
			calc = new HealthCalculator();
		}
		
		return calc;
	}
	
    public float idealWeight(int height, Gender gender) throws Exception {
        float resultado = 0;
        
        if(height <= 0){
            throw new Exception("La altura proporcionada no es válida");
        }
        if(gender == Gender.FEMALE){
            resultado = (height - 100) - ((height - 150) / 2.5f);
        }
        if(gender == Gender.MALE){
            resultado = (height - 100) - ((height - 150) / 4f);
        }
        if(gender != Gender.MALE && gender != Gender.FEMALE){
        throw new Exception("El género proporcionado no es válido");
        }

        if(resultado <= 0){
            throw new Exception("El resultado es negativo. Pruebe con otros datos.");
        }
        return resultado;
    }


public float basalMetabolicRate(float weight, int height, Gender gender, int age) throws Exception {
    float resultado = 0;
    if(age <= 0){
        throw new Exception("La edad proporcionada no es válida");
    }
    if(height <= 0){
        throw new Exception("La altura proporcionada no es válida");
    }
    if(weight <= 0){
        throw new Exception("El peso proporcionado no es válido");

    }
    if(gender != Gender.MALE && gender != Gender.FEMALE){

        throw new Exception("El género proporcionado no es válido");
        }

    if(gender == Gender.MALE){
        resultado = 10f * (weight + 6.25f) * (height - 5) * (age + 5);
    }
    if(gender == Gender.FEMALE){
        resultado = 10 * weight + 6.25f * height - 5 * age - 161;
        if(resultado <= 0){
            throw new Exception("El resultado es negativo. Pruebe con otros datos");

        }

    }

return resultado;
}
}
