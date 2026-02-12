package cl.veterinaria.clases;
/**
 * Clase Padre
 */
public class Animal {
	private String nombre;
	private double peso;
	
	public Animal(String nombre, double peso) {
		this.nombre = nombre;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void comer() {
		System.out.println("esta comiendo el "+ nombre);
	}
}
