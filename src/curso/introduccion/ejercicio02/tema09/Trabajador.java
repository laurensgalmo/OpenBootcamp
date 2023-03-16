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

public class Trabajador extends Persona {

	// Atributos

	private double salario;

	// Constructor

	public Trabajador(int edad, String nombre, int telefono, double salario) {
		super(edad, nombre, telefono);
		this.salario = salario;
	}

	// Getters y Setters

	public double getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	// toString

	@Override
	public String toString() {
		return "Trabajador [salario=" + salario + "]" + " " + super.toString();
	}
}
