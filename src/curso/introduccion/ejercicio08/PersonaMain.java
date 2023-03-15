package curso.introduccion.ejercicio08;

/**
 * Para practicar la encapsulación:
 * 
 * Crear clase Persona.
 * 
 * Crear variables privadas edad, nombre y telefono de la clase Persona.
 * 
 * Crear gets y sets de cada propiedad.
 * 
 * Crear un objeto persona en el main.
 * 
 * Utiliza los gets y sets para darle valores a las propiedades edad, nombre y
 * telefono, por último muéstralas por consola.
 * 
 * @author Laura
 *
 */

public class PersonaMain {

	public static void main(String[] args) {

		Persona persona = new Persona(); // Instancia del objeto

		persona.setEdad(23); // Añado edad con setter
		persona.setNombre("Laura"); // Añado nombre con setter
		persona.setTelefono(655655655); // Añado telefono con setter

		System.out.println(persona.toString()); // Creo un toString para mostrar la información
	}
}
