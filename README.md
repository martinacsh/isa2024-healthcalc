# isa2024-healthcalc

## Health calculator

### Práctica 1

#### Tests metodo idealWeight
    
    1. En caso de que el caracter introducido para definir el género sea distinto de 'm' o 'f', se debe  lanzar una excepción que muestre un mensaje explicando el error.  
    2. El argumento de la altura debe ser mayor que cero, en caso contrario, el método debe lanzar una  excepción que muestre un mensaje explicando el error.  

    3. En caso de que ambos parámetros de entrada sean correctos, no se lanzará excepción y se deben obtener  resultados por encima de 0.

    4. El valor que devuelva este método debe cumplir IW < h. En caso de que la altura sea mayor o igual a  150 cm, se debe cumplir IW <= (h-100), tanto para hombres comopara mujeres. Ésto no se cumple para  alturas a partir de 550 para hombres y 400 para mujeres. Al ser valores que no se dan en un caso real,  ésta "excepción" se considera trivial.
    
    5. Para alturas muy pequeñas, el método no debe devolver valores negativos (la fórmula proporciona éstos  resultados si se introducen alturas menores o iguales a 67 en mujeres y 84 en hombres) En su  lugar, lanzará una excepción con un mensaje que explique que la altura es demasiado pequeña.

#### Tests metodo basalMetabolicRate

    1. La edad debe ser mayor a 0. En caso contrario, se lanzará una excepción que muestre un mensaje  explicando el error.

    2. En caso de que el caracter introducido para definir el género sea distinto de 'm' o 'f', se debe  lanzar una excepción que muestre un mensaje explicando el error.

    3. La altura debe ser mayor que 0, En caso contrario, se lanzará una excepción que muestre un mensaje  explicando el error.

    4. El peso debe ser mayor que 0, En caso contrario, se lanzará una excepción que muestre un mensaje  explicando el error.

    5. Si todos los parámetros tienen valores correctos, no debe saltar ninguna excepción y el valor  devuelto por el método debe ser mayor que 0. Para valores muy pequeños         en mujeres, es posible que la  fórmula resulte en un valor negativo, en dicho caso, se lanzará una excepción.

    6. El valor devuelto por este método será siempre menor para mujeres, en caso de que todos los  argumentos a excepción del género sean equivalentes respectivamente.

![Registro commits]("C:\Users\marti\Downloads\registro_commits.png")


### Práctica 2
## Especificación de caso de uso para la calculadora de salud
- Nombre: Cálculo del peso ideal
- Actor principal: Usuario de calculadora
- Stakeholder: Usuario
- Intereses: Hallar su peso ideal
- Alcance: Este caso de uso se centra en proporcionar al usuario la capacidad de calcular su peso ideal     mediante  utilizando la calculadora de salud.
- Nivel de abstracción: Alto nivel, centrado en la funcionalidad apartando los detalles de   
implementación
- Precondiciones: Los datos proporcionados por el usuario deben ser válidos
- Trigger: El usuario selecciona el método idealWeight()
- Escenario principal:
    1. El usuario inicia el funcionamiento de la calculadora
    2. El programa muestra al usuario los distintos parámetros que puede calcular
    3. El usuario elige el método que calcula el peso ideal
    4. El programa pide al usuario los parámetros necesarios para realizar los cálculos
    5. El usuario proporciona sus datos
    6. El programa comprueba que los valores sean válidos y realiza los cálculos
    7. El programa comprueba que las soluciones obtenidas son coherentes
    8. El programa muestra los resultados por pantalla

- Extensiones:
    · Los datos introducidos no son correctos: El sistema detectará los inputs erróneos, informará  
    al usuario del problema y le pedirá que los vuelva a introducir.

    · El resultado generado no es válido: El sistema gestionará las excepciones generadas por los  
    resultados negativos informando del problema al usuario.


## Diagrama
![image](https://github.com/martinacsh/isa2024-healthcalc/assets/160426861/ad3d893e-617c-4b11-8ced-f038c76264ed)

