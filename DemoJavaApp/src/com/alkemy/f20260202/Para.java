package com.alkemy.f20260202;

import java.util.Scanner;

public class Para {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Para o For
		//variable de inicio; condicion de termino; incremento/decremento
		/*for (int i = 0; i < 10 ; i++) {// i = 10 ; 10 < 10; 
			System.out.println("valor de i "+ i);
		}
		System.out.println("fin del for");
		 */
		
		int suma = 0;
	
		System.out.println("Ingrese el limite");
		int limite = sc.nextInt();
		
		for (int i = 1; suma < limite; i++) {
			System.out.printf("Ingresa el %d numero%n", i);
			int numero = sc.nextInt();
			suma = suma + numero;
		}
		System.out.printf("el limite es %d  y la suma es %d", limite, suma);
	}

}
