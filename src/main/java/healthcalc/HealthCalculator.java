package healthcalc;

public class HealthCalculator implements HealthCalc{
    public float idealWeight(int height, char gender) throws Exception {
    	 float result;
         if (height <= 0) {
             throw new Exception("La altura proporcionada no es válida");
         }
         switch (gender) {
             case 'm':
                 result = (height - 100) - ((height - 150) / 4f);
                 break;
             case 'w':
                 result = (height - 100) - ((height - 150) / 2.5f);
                 break;
             default:
                 throw new Exception("El género proporcionado no es válido");
         }
         if (result < 0) {
             throw new Exception("El resultado es negativo. Pruebe con otros datos");
         }
         return result;
    }

//age height weight
public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
	 if (height <= 0) {
         throw new Exception("La altura proporcionada no es válida");
     }
     if (weight <= 0) {
         throw new Exception("El peso proporcionado no es válido");
     }

     if (age < 0) {
         throw new Exception("La edad proporcionada no es válida");
     }

     switch (gender) {
         case 'm':
             return 10 * weight + 6.25f * height - 5 * age + 5;
         case 'w':
             float result = 10 * weight + 6.25f * height - 5 * age - 161;
             if (result < 0) {
                 throw new Exception(
                         "El resultado es negativo. Pruebe con otros datos");
             } else {
                 return result;
             }
         default:
             throw new Exception("El género proporcionado no es válido");
     }

 }
}
