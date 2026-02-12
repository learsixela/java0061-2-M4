package cl.veterinaria.clases;

public class Gato extends Animal{

	public Gato(String nombre, double peso) {
		super(nombre, peso);
		// TODO Auto-generated constructor stub
	}

     @Override
     public void comer() {
    	 super.comer();
    	 System.out.println("yo como poquito");
     }

}
