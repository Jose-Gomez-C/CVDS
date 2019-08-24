# Clases de Equivalencia

1. Verifica la edad de los votantes:
    * Verifica si es menor de edad.
	* Verifica si la edad es mayor a 18.
	###### Elementos de frontera:
	1. Edad = 17 años.
	2. Edad = 18 años.
	3. Edad = 19 años.
	4. Edad = 69 años.
	

2. Verifica el estado del votante:
    * Verifica si esta muerto.
	* Verifica si esta vivo.
	###### Elementos de frontera:
	* alive = true
	* alive = false
	

3. Verifica si la edad del votante es coherente:
    * Si la edad es menor a 0 o mayor a 150.
	###### Elementos de frontera:
	1. Edad = -1 años.
	2. Edad = 151 años.
	


4. Verifica que no puedan haber votantes duplicados:
    * Si una persona intenta registrarse 2 veces
	###### Elementos de frontera:
	1. Id = 145152123
	2. Id = 145152123
	

#### Retomamos una época antigua donde las mujeres no podían votar
5. Verifica el género del votante:
    * Verifica que si es mujer no puede votar:
	###### Elementos de frontera:
	1. gender = FEMALE.
	