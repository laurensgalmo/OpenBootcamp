package curso.introduccion.ejercicio02.tema09;

/**
 * Crea una clase Persona con las siguientes variables:
 * 
 * La edad
 * 
 * El nombre
 * 
 * El teléfono
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

public class Cliente extends Persona {

	// Atributo

	private double credito;

	public Cliente(int edad, String nombre, int telefono, double credito) {
		super(edad, nombre, telefono);
		this.credito = credito;
	}

	// Getters y Setters

	public double getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	// toString

	@Override
	public String toString() {
		return "Cliente [credito=" + credito + "]" + " " + super.toString();
	}
}
