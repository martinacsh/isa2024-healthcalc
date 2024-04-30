package healthcalc;

public class HealthCalculator implements HealthCalc{
	 public float idealWeight(int height, char gender) throws Exception {
	        float resultado = 0;
	        
	        
	        if(height <= 0){
	            throw new Exception("La altura proporcionada no es válida");
	        }
	        
	        if(gender != 'm' && gender != 'w'){
		        throw new Exception("El género proporcionado no es válido");
		        }
	        if(gender == 'w'){
	            resultado = (height - 100) - ((height - 150) / 2.5f);
	        }
	        if(gender == 'm'){
	            resultado = (height - 100) - ((height - 150) / 4f);
	        }
	        

	        if(resultado <= 0){
	            throw new Exception("El resultado es negativo. Pruebe con otros datos.");
	        }
	        return resultado;
	    }

	//age height weight
	public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
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
	    if(gender != 'm' && gender != 'w'){

	        throw new Exception("El género proporcionado no es válido");
	        }

	    if(gender == 'm'){
	    	resultado = 10 * weight + 6.25f * height - 5 * age + 5;
	    }
	    if(gender == 'w'){
	        resultado = 10 * weight + 6.25f * height - 5 * age - 161;
	        if(resultado <= 0){
	            throw new Exception("El resultado es negativo. Pruebe con otros datos");

	        }

	    }

	return resultado;
	}
}
