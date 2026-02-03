package com.alkemy.f20260202;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Crear mediante bucle la tabla de multiplicar del ?; 1 al 10
		System.out.println("Ingresa numero de la tabla a generar");
		int tabla = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d %n",tabla, i,(tabla*i));
			
		}

		sc.close();
	}

}
