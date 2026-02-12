package cl.veterinaria.clases;

public class Conejo implements Mascota{

	@Override
	public String hacerRuido() {
		
		return "yiiiiiii";
	}

	@Override
	public void comer() {
		System.out.println("El conejo come zanahorias");
		
	}

	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		
	}



}
