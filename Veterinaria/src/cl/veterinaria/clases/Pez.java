package cl.veterinaria.clases;

public class Pez implements Mascota{

	@Override
	public String hacerRuido() {
		return "Gluuup";
	}

	@Override
	public void comer() {
		System.out.println("El pez come algas");
		
	}

	@Override
	public void moverse() {
		System.out.println("El pez nada");
		
	}

}
