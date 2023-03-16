package curso.introduccion.ejercicio01.tema04;

/**
 * Ejercicios de Introduccion con OpenBootcamp
 * 
 * @author Laura
 *
 */

public class ejercicio04 {

	public static void main(String[] args) {

		/**
		 * Usando un if, crear una condición que compare si la variable numeroIf es
		 * positivo, negativo, o 0.
		 */

		System.out.println("PRIMERA PARTE: CONDICIONAL IF");

		int numeroIf = -1;

		if (numeroIf > 0) {
			System.out.println("La variable numeroIf es positiva");
		} else if (numeroIf < 0) {
			System.out.println("La variable numeroIf es negativa");
		} else if (numeroIf == 0) {
			System.out.println("La variable numeroIf vale 0");
		}

		/**
		 * Crea un bucle While, este bucle tendrá que tener como condición que la
		 * variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
		 * bucle deberá:
		 * 
		 * -1- Incrementar el valor de la variable en uno cada vez que se ejecute.
		 * 
		 * -2- Mostrarlo por pantalla cada vez que se ejecute.
		 */

		System.out.println("SEGUNDA PARTE: BUCLE WHILE");

		int numeroWhile = 1;

		while (numeroWhile < 3) {
			numeroWhile++;
			System.out.println(numeroWhile);
		}

		/**
		 * Para el bucle Do While, deberás crear la misma estructura que en el While,
		 * pero solo se debe ejecutar una vez.
		 */

		System.out.println("TERCERA PARTE: BUCLE DO WHILE");

		int numeroDoWhile = 1;

		do {
			numeroDoWhile++;
		} while (numeroDoWhile < 3);
		System.out.println(numeroDoWhile);

		/**
		 * Para el bucle For, crea una variable numeroFor, esta variable tendrá como
		 * valor 0 y su condición será que la variable sea igual o menor que 3, se irá
		 * incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por
		 * pantalla.
		 */

		System.out.println("TERCERA PARTE: BUCLE FOR");

		for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println(numeroFor);
		}

		/**
		 * Por último, para el Switch, deberás crear la variable estacion, y distintos
		 * case para las cuatro estaciones del año. Dependiendo del valor de la variable
		 * estacion se deberá mandar un mensaje por consola informando de la estación en
		 * la que está. También habrá que poner un default para cuando el valor de la
		 * variable no sea una estación.
		 */

		System.out.println("CUARTA PARTE: SWITCH CASE");

		String estacion = "Primavera";

		switch (estacion) {

		case "Primavera":
			System.out.println("Es primavera");
			break;
		case "Verano":
			System.out.println("Es verano");
			break;
		case "Otoño":
			System.out.println("Es otoño");
			break;
		case "Invierno":
			System.out.println("Es invierno");
			break;
		default:
			System.out.println("ERROR: NO ES UNA ESTACIÓN");
		}
	}
}
