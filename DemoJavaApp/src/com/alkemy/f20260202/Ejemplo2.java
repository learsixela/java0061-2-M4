package com.alkemy.f20260202;

public class Ejemplo2 {

	public static void main(String[] args) {
		// las tablas de  multiplicar (for de for)(for anidado)
		
		for (int i = 1; i <=10 ; i++) { // i = 1
			System.out.println("**************");
			for (int j = 1; j <= 10; j++) { // j = 1
				// i x j = 10
				System.out.printf("%d x %d = %d %n",i,j,(i*j));
			}
			System.out.println();
		}

	}

}
