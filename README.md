# isa2024-healthcalc
##Health calculator

###Tests para metodo idealWeight
    
    1. En caso de que el caracter introducido para definir el género sea distinto de 'm' o 'f', se debe lanzar una excepción que muestre un mensaje explicando el error.
    2. El argumento de la altura debe ser mayor que cero, en caso contrario, el método debe lanzar una excepción que muestre un mensaje explicando el error.

    3. En caso de que ambos parámetros de entrada sean correctos, no se lanzará excepción y se deben obtener resultados por encima de 0.
    4. El valor que devuelva este método debe cumplir IW < h. e
    En caso de que la altura sea mayor o igual a 150 cm, se debe cumplir IW <= (h-100), tanto para hombres comopara mujeres. Ésto no se cumple para alturas a partir de 550 para hombres y 400 para mujeres. Al ser valores que no se dan en un caso real, ésta "excepción" se considera trivial.
    5. Para alturas muy pequeñas, el método no debe devolver valores negativos (la fórmula proporciona éstos resultados si se introducen alturas menores o iguales a 66 en mujeres y 83 en hombres) En su lugar, lanzará una excepción con un mensaje que explique que la altura es demasiado pequeña.
