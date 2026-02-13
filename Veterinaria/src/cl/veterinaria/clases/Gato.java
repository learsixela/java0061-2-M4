package cl.veterinaria.clases;

public class Gato extends Animal{
	//atributos
	private String raza;
	//constructores
	public Gato(String nombre, double peso) {
		super(nombre, peso);
	}

	public Gato(String nombre, double peso, String raza) {
		super(nombre, peso);
		this.raza = raza;
	}
	//metodos
	@Override
	public void comer() {
		super.comer();
		System.out.println("yo como poquito");
	}
	//g&s
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public void hacerRuido() {
		// TODO Auto-generated method stub

	} 


}
