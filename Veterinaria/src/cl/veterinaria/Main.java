package cl.veterinaria;

import cl.veterinaria.clases.Animal;
import cl.veterinaria.clases.Conejo;
import cl.veterinaria.clases.Gato;
import cl.veterinaria.clases.Mascota;
import cl.veterinaria.clases.Perro;
import cl.veterinaria.clases.Pez;

public class Main {
	public static void main(String[] args) {
		//Animal animal = new Animal("Bulls",700.00);
		//animal.comer();
		
		Perro perro = new Perro("Ayun", 20, "Bulldog");
		perro.comer();
		System.out.println(perro);
		System.out.println("---------");
		Gato gato = new Gato("Felix",7);
		gato.comer();
		System.out.println(gato);
		System.out.println();
		
		System.out.println("**** Polimorfismo *****");
		/*Polimorfismo*/
		Mascota[] mascotas = new Mascota[] {
			new Conejo(),
			new Pez()
		};
		// recorrer Array
		for (Mascota mascota : mascotas) {
			System.out.println(mascota.hacerRuido());
			mascota.comer();
			mascota.moverse();
		}
		
		//Polimorfismo DownCasting
		Mascota  conejin = new Conejo();
		conejin.comer();
		//conejin.dormir();
		//DownCasting
		Conejo wonejo = (Conejo) conejin;
		wonejo.dormir();
		
		Pez pescadito = (Pez) conejin; //castException
		
		/* InstanceOf*/
		if(conejin instanceof Pez pez) {
			pescadito.hacerRuido();
		} else {
			System.out.println("No es un pez");
		}
		
		
	}
}
