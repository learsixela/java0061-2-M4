package com.alkemy.f20260210;

public class Main {

	public static void main(String[] args) {
		// crear un objeto
		//instancia de una clase Coche
		//() -> constructor
		Coche micro_electric = new Coche();
		Coche sedan = new Coche();
		
		//creando un objeto, asignando valores a los atributos
		//a traves del metodo constructor
		Coche suv = new Coche("Negro","Nissan","Qashqai","Bencinero");
		
		Coche pickup = new Coche("Great Wall","Poer");
		
		String nombre = new String("Nombre");
		//estado inicial es la asignacion de valores 
		//a los atributos
		
		System.out.println(micro_electric.color);
		System.out.println(suv.color);
		
		// usando el metodo get
		System.out.println(suv.getColor());
	}

}
