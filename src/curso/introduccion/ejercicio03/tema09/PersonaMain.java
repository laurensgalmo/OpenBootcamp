package curso.introduccion.ejercicio03.tema09;

/**
 * PARTE 1:
 * 
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
 * PARTE 2:
 * 
 * Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
 * esta nueva clase tendrá la variable credito solo para esa clase.
 * 
 * Crea ahora un objeto de la clase Cliente que debe tener como propiedades la
 * edad, el telefono, el nombre y el credito, tienes que darles valor y
 * mostrarlas por pantalla.
 * 
 * Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de
 * Persona, y con una variable salario que solo tenga la clase Trabajador.
 * 
 * @author Laura
 *
 */

public class PersonaMain {

	public static void main(String[] args) {

		Persona persona = new Persona(); // Instancia del objeto
		Cliente cliente = new Cliente();
		Trabajador trabajador = new Trabajador();

		persona.setEdad(23); // Añado edad con setter
		persona.setNombre("Laura"); // Añado nombre con setter
		persona.setTelefono(655655655); // Añado telefono con setter

		cliente.setEdad(26); // Añado edad con setter
		cliente.setNombre("David"); // Añado nombre con setter
		cliente.setTelefono(644644644); // Añado telefono con setter
		cliente.setCredito(23.0); // Añado credito con setter

		trabajador.setEdad(40); // Añado edad con setter
		trabajador.setNombre("Maria"); // Añado nombre con setter
		trabajador.setTelefono(633633633); // Añado telefono con setter
		trabajador.setSalario(1200.50); // Añado salario con setter

		System.out.println(persona.toString()); // Creo un toString para mostrar la información
		System.out.println(cliente.toString()); // Creo un toString para mostrar la información
		System.out.println(trabajador.toString()); // Creo un toString para mostrar la información
	}
}
