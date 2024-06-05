# isa2024-healthcalc
## Práctica 1: Health calculator

### Tests metodo idealWeight
    
1. En caso de que el caracter introducido para definir el género sea distinto de 'm' o 'f', se debe  lanzar una excepción que muestre un mensaje explicando el error.  
2. El argumento de la altura debe ser mayor que cero, en caso contrario, el método debe lanzar una  excepción que muestre un mensaje explicando el error.  

3. En caso de que ambos parámetros de entrada sean correctos, no se lanzará excepción y se deben obtener  resultados por encima de 0.

4. El valor que devuelva este método debe cumplir IW < h. En caso de que la altura sea mayor o igual a  150 cm, se debe cumplir IW <= (h-100), tanto para hombres comopara mujeres. Ésto no se cumple para  alturas a partir de 550 para hombres y 400 para mujeres. Al ser valores que no se dan en un caso real,  ésta "excepción" se considera trivial.
    
5. Para alturas muy pequeñas, el método no debe devolver valores negativos (la fórmula proporciona éstos  resultados si se introducen alturas menores o iguales a 67 en mujeres y 84 en hombres) En su  lugar, lanzará una excepción con un mensaje que explique que la altura es demasiado pequeña.

### Tests metodo basalMetabolicRate

1. La edad debe ser mayor a 0. En caso contrario, se lanzará una excepción que muestre un mensaje  explicando el error.

2. En caso de que el caracter introducido para definir el género sea distinto de 'm' o 'f', se debe  lanzar una excepción que muestre un mensaje explicando el error.

3. La altura debe ser mayor que 0, En caso contrario, se lanzará una excepción que muestre un mensaje  explicando el error.

4. El peso debe ser mayor que 0, En caso contrario, se lanzará una excepción que muestre un mensaje  explicando el error.

5. Si todos los parámetros tienen valores correctos, no debe saltar ninguna excepción y el valor  devuelto por el método debe ser mayor que 0. Para valores muy pequeños en mujeres, es posible que la  fórmula resulte en un valor negativo, en dicho caso, se lanzará una excepción.

6. El valor devuelto por este método será siempre menor para mujeres, en caso de que todos los  argumentos a excepción del género sean equivalentes respectivamente.

<img width="242" alt="registro_commits" src="https://github.com/martinacsh/isa2024-healthcalc/assets/160426861/3d57b48e-1a12-45b4-ad1c-13e962c53777">

![Registro commits]("C:\Users\marti\OneDrive\Documentos\Git\isa2024-healthcalc\registro_commits.png")


## Práctica 3: Cucumber + Maven

### User Story: Calculate Ideal Weight

As a user of a health calculator  
I want to obtain the ideal weight in accordance with the provided arguments  
So that I can know the ideal weight that was calculated.

#### Accepting Criteria

##### Scenario Outline: Invalid gender
Given I use a health calculator  
When I calculate the ideal weight with an incorrect gender  
Then the program throws an exception

##### Scenario Outline: Invalid height
Given I use a health calculator  
When I calculate the ideal weight with an incorrect height  
Then the program throws an exception

##### Scenario Outline: Negative output
Given I have an health calculator  
When I calculate the ideal weight for certain values height and gender, and the output is negative  
Then the program throws an exception

##### Scenario Outline: valid arguments
Given I have an health calculator  
When I calculate the ideal weight for a certain height and gender  
Then the program provides an appropiate output

### User Story: Calculate basalMetabolicRate

As a user of a health calculator  
I want to obtain the basal metabolic rate in accordance with the provided arguments  
So that I can know the basal metabolic rate that was calculated.

#### Accepting Criteria

##### Scenario: Invalid gender
Given I use a health calculator  
When I calculate the basal metabolic rate with an incorrect gender  
Then the program throws an exception

##### Scenario: Invalid height
Given I use a health calculator  
When I calculate the basal metabolic rate with an incorrect height  
Then the program throws an exception

##### Scenario: Invalid weight
Given I use a health calculator  
When I calculate the basal metabolic rate with an incorrect weight  
Then the program throws an exception

##### Scenario Outline: Invalid Age
Given I use a health calculator  
When I calculate the basal metabolic rate for an age with negative value  
Then the system throws an exception

##### Scenario Outline: valid arguments
Given I have an health calculator  
When I calculate the basal metabolic rate for certain values of height, gender, age and weight  
Then the program provides an appropriate output

 
##### Scenario Outline: valid arguments
Given I have an health calculator
When I calculate the basal metabolic rate for certain values of height, gender, age and weight
Then the program provides an appropiate output
