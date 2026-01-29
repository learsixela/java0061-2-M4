package com.alkemy.f20260129;

public class Main {

	public static void main(String[] args) {
		// Variables
		
		//Tipos de variables primitivos (se escriben en minuscula)
		//enteros 
		/*
			byte (8 bits) -128 al 127, 
			short(16 bits), 32mil
			int (32 bits)  2MM
			long (64 bits)
		*/
		int edad = 3;// crear variable entera
		long sueldo = 10000000000L;
		
		//decimales o punto flotante
		/*
		 * float (32 bits)  2MM
		 * double
		 */
		float altura = 1.8464654F;
		float altura2 = (float) 1.55;//castear o casteo o convertir
		double peso = 85.7;
		
		//otros
		boolean acepta = true; //false
		char letra = 'A';// se asignan con comilla simple ''
		
		//Tipos de variables OBJETOS (referencia)
		String apellido = "Quezada";
		Integer edad2 = 3;
		Float altura3 = 1.30f;
		
		System.out.println("int edad: " + edad);
		System.out.println(sueldo);
		System.out.println(altura);
		
		Integer nota = 5;
		String nota_string = nota+"";//casteo sucio convertir numero a String
		String nota_string2 = nota.toString();
		//como transformar un numero string a tipo numerico
		Float nota_float = Float.parseFloat(nota_string2);
		System.out.println(nota_float);
		
		
		
	}

}
