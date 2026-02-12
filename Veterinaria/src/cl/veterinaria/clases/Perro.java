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

//g&s
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		String mensaje = "Mi Perro se llama " +super.getNombre()+
				", su raza es: "+ raza + " y pesa: " + super.getPeso() +" kilos.";
		return mensaje;
	}

	@Override
	public void hacerRuido() {
		// TODO Auto-generated method stub
		
	}
 






}
