package com.alkemy.f20260212;

public class Main {

	public static void main(String[] args) {
		// crear objeto a partir de la clase Padre
		Coche coche = new Coche("Negro","Nissan","Qashqai","Bencinero");
		coche.encender();
		System.out.println(coche.getMarca());


		//crear objeto a partir de la clase hija
		CocheElectrico tesla = new CocheElectrico("Gris","Tesla","Modelo 1","Electrico");
		tesla.encender();//metodo heredado
		//tesla.marca = "Tesla";
		//System.out.println(tesla.marca);
		System.out.println(tesla.getMarca());
		System.out.println(tesla.getModelo());
		tesla.setKmAutonomia(500);
		System.out.println(tesla.getKmAutonomia());
	}

}
