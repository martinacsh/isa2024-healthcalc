# isa2024-healthcalc
## Health calculator

### Tests metodo idealWeight
    
1.En caso de que el caracter introducido para definir el género sea distinto de 'm' o 'f', se debe  lanzar una excepción que muestre un mensaje explicando el error.  
2.El argumento de la altura debe ser mayor que cero, en caso contrario, el método debe lanzar una  excepción que muestre un mensaje explicando el error.  

3.En caso de que ambos parámetros de entrada sean correctos, no se lanzará excepción y se deben obtener  resultados por encima de 0.

4.El valor que devuelva este método debe cumplir IW < h. En caso de que la altura sea mayor o igual a  150 cm, se debe cumplir IW <= (h-100), tanto para hombres comopara mujeres. Ésto no se cumple para  alturas a partir de 550 para hombres y 400 para mujeres. Al ser valores que no se dan en un caso real,  ésta "excepción" se considera trivial.
    
5. Para alturas muy pequeñas, el método no debe devolver valores negativos (la fórmula proporciona éstos  resultados si se introducen alturas menores o iguales a 67 en mujeres y 84 en hombres) En su  lugar, lanzará una excepción con un mensaje que explique que la altura es demasiado pequeña.

### Tests metodo basalMetabolicRate

1.La edad debe ser mayor a 0. En caso contrario, se lanzará una excepción que muestre un mensaje  explicando el error.

2.En caso de que el caracter introducido para definir el género sea distinto de 'm' o 'f', se debe  lanzar una excepción que muestre un mensaje explicando el error.

3.La altura debe ser mayor que 0, En caso contrario, se lanzará una excepción que muestre un mensaje  explicando el error.

4.El peso debe ser mayor que 0, En caso contrario, se lanzará una excepción que muestre un mensaje  explicando el error.

5.Si todos los parámetros tienen valores correctos, no debe saltar ninguna excepción y el valor  devuelto por el método debe ser mayor que 0. Para valores muy pequeños en mujeres, es posible que la  fórmula resulte en un valor negativo, en dicho caso, se lanzará una excepción.

6.El valor devuelto por este método será siempre menor para mujeres, en caso de que todos los  argumentos a excepción del género sean equivalentes respectivamente.

<img width="242" alt="registro_commits" src="https://github.com/martinacsh/isa2024-healthcalc/assets/160426861/3d57b48e-1a12-45b4-ad1c-13e962c53777">


## Práctica 4

### Borrador GUI

<img width="252" alt="borradorpr4" src="https://github.com/martinacsh/isa2024-healthcalc/assets/160426861/4f424125-e292-443c-ae63-12849c9e97f3">

### Interfaz gráfica de usuario

<img width="463" alt="InterfazGráfica4" src="https://github.com/martinacsh/isa2024-healthcalc/assets/160426861/2474ab2f-6a7d-4ff2-826a-0adfc6bb7c64">


## Practica 6 : Patrones de Diseño

### Apartado 2 - Patrón Singleton

<img width="599" alt="Singleton" src="https://github.com/martinacsh/isa2024-healthcalc/assets/160426861/168dafde-95ce-4596-89cf-21232d6489c8">


### Apartado 3a - Patrón Adapter

<img width="620" alt="AdapterA" src="https://github.com/martinacsh/isa2024-healthcalc/assets/160426861/b043a40b-aaf6-4ffd-99b8-2f558d28c1cb">

### Apartado 3b - Patrón Proxy

<img width="507" alt="ProxyB" src="https://github.com/martinacsh/isa2024-healthcalc/assets/160426861/72a76389-a039-485f-acec-97e2995e5b22">

## Práctica 7

### Enum Gender

#### Bad smell: Tipo de variable gender ineficiente.
- Refactoring aplicado: Modificación del tipo de dato de la variable gender.
- Tipo: Refactoring de atributo.

#### Descripción de cambios:
Se crea una clase enumerada en el paquete helthcalc con dos componentes, male y female, que representarán
los dos géneros posibles a introducir como parámetro en la calculadora. Sustituirá al tipo char de la 
variable gender, siendo Gender el nuevo tipo enumerado.

#### Esquema de cambios:
1. Creación de Gender en healthcalc.
2. Sustitución de char por Gender en 5 clases.
3. Reemplazo de 'w' por Gender.FEMALE en los métodos idealWeight y bmr.
4. Reemplazo de 'm' por Gender.MALE en los métodos idealWeight y bmr.
5. Añadir import healthcalc.Gender; en VistaCalc, Controller, Adapter y Proxy.
6. Crear un método en Adapter para determinar el valor de Gender.
7. Añadir a los métodos idealWeight y basalMetabolicRate: getGender(gender) para que el tipo de los datos sea correcto.


### Interfaz Persona

#### Bad smell: funciones que reciben demasiados parámetros
- Refactoring aplicado: Reemplazar los parámetros por un objeto.
- Tipo: Refactoring de clase.

#### Descripción de cambios:
Se crea en el paquete healthcalc una interfaz Person y una clase PersonDat donde se guardarán los argumentos utilizados en 
idealweight y basalMetabolicRate como atributos. Además, en esta clase se crea un constructor para cada
uno de estos métodos. Cada método que los llame deberá también ser modificado para que los tipos de los parámetros
cuadren.

#### Esquema de cambios:
1. Creación de la interfaz Person y la clase PersonDat.
2. Sustitución de los parámetros por su correspondiente objeto tipo Person en los métodos idealWeight y 
   basalMetabolicRate en toda clase que aparezcan.
3. En la clase HealthCalculator, ahora los métodos reciben un objeto person del que se extraen los parámetros a utilizar
   para los cálculos.
4. En la interfaz HealthCalc, se definen los métodos de forma que reciban un objeto person como parámetro.
5. En la clase Adapter y Controller, crear un objeto person con los parámetros recibidos en cada método para poder pasárselo
   al idealWeight y bmr originales.
6. Adición de import healthcalc.Person y healthcalc.PersonDat a Adapter y Controller.
7. En la clase Proxy, se cambiarán los atributos de forma que las medias puedan calcularse correctamente y así evitar
   tener que modificar de más el resto del código. Se eliminará la clase Stats, pues con los cambios realizados,
   su existencia queda obsoleta. También se eliminará el import innecesario para List.
8. Modificación de los tests para que los tipos de los parámetros coincidan.



### Cardiovascular Metrics

#### Bad Smell: Interfaz con demasiadas responsabilidades.
- Refactoring aplicado: Segregación de interfaces.
- Tipo: Refactorización de clase.

#### Descripción de cambios:
Se crea la interfaz CardiovascularMetrics con el método getIdealBodyWheigh. Éste sustituirá a IdealWeight en la implementación
HealthCalculator, que implementará la nueva interfaz. Toda clase que utilice este método tendrá que ser modificada con su nuevo
nombre. También se cambiarán los float a double, ya que getIdealBodyWeight devuelve un double.

#### Esquema de cambios:
1. Creación de la interfaz CardioVascularMetrics.
2. Healthcalculator implements CardiovascularMetrics.
3. Reemplazo de idealWeight por getIdealBodyWeight en:
   - HealthCalculator
   - Adapter
   - Controller
   - Proxy
   - HealthCalcTest
4. Proxy implements CardiovascularMetrics.
5. Cambiar el tipo del resultado a double en toda clase que se utilice getIdealBodyWeight, 
   también en la interfaz HealthHospital y en la clase VistaCalc.
6. En HealthCalcTest, añadir un atributo tipo CardiovascularMetrics para poder aplicar el método idealBodyWeight, 
   cambiar los float a double.


### Metabolic Metrics

#### Bad Smell: Interfaz con demasiadas responsabilidades.
- Refactoring aplicado: Segregación de interfaces.
- Tipo: Refactorización de clase.

#### Descripción de cambios:
Mediante la herramienta refactor que nos ofrece eclipse, se renombra la interfaz HealthCalc, que pasa a llamarse 
MetabolicMetrics. Tendrá el método basalMetabolicRate, el mismo nombre de antes, la única diferencia es que devolverá un 
double. Éste sustituirá a basalMetabolicRate():float en la implementación HealthCalculator, que implementará la nueva 
interfaz. Toda clase que utilice este método tendrá que ser modificada con su nuevo tipo, el nombre es el mismo.

#### Esquema de cambios:
1. Renombrar la interfaz HealthCalc, que pasará a ser Healthcalculator.
2. En los HealthCalcTest, cambiar el tipo del atributo obj a MetabolicMetrics.
   También cambiar los float a double.
3. Sustituir los float necesarios a double en:
   - Controller
   - VistaCalc (setBMR())
   - HealthHospital
   - Adapter
   - CalculatorDecorator
   - También en los tests.

