# isa2024-healthcalc
## Health calculator

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


## Practica 4

### Borrador GUI

<img width="252" alt="borradorpr4" src="https://github.com/martinacsh/isa2024-healthcalc/assets/160426861/4f424125-e292-443c-ae63-12849c9e97f3">

### Interfaz gráfica de usuario

<img width="280" alt="InterfazGráfica4" src="https://github.com/martinacsh/isa2024-healthcalc/assets/160426861/6cebbdc5-eeac-4743-a390-72f7765c4324">



