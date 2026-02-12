package cl.veterinaria;

import cl.veterinaria.clases.Animal;
import cl.veterinaria.clases.Gato;
import cl.veterinaria.clases.Perro;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal("Bulls",700.00);
		animal.comer();
		
		Perro perro = new Perro("Ayun", 20, "Bulldog");
		perro.comer();
		
		Gato gato = new Gato("Felix",7);
		gato.comer();
	}
}
