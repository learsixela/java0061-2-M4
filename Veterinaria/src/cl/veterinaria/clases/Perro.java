package cl.veterinaria.clases;

/**
 * Subclase de la clase padre Animal
 */
public class Perro extends Animal{

	private String raza;

	public Perro(String nombre, double peso, String raza) {
		super(nombre, peso);
		this.raza = raza;
	}

	@Override
	public void comer() {
		super.comer();
		System.out.println("Ya estoy comiento otra vez");
	}






}
