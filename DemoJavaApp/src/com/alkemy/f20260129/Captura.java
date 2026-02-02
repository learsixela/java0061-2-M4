package com.alkemy.f20260129;

import java.util.Scanner;

public class Captura {

	public static void main(String[] args) {
		// capturar informacion ingresada por consola Scanner
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Ingresa tu nombre:");
		String nombre = scanner.nextLine();//capturar un string

		System.out.printf("Hola %s",nombre);// imprime el contenido de la variable
		//System.out.println("Hola "+ nombre);
		
		scanner.close();
	}
}
