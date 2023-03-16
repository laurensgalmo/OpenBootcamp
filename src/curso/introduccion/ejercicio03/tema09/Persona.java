package curso.introduccion.ejercicio03.tema09;

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

public class Persona {

	// Atributos

	private int edad;
	private String nombre;
	private int telefono;

	// Getters y Setters

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	// toString

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}
}
