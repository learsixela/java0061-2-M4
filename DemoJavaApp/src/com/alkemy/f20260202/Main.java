package com.alkemy.f20260202;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Mientras (while)
		/*
		 * Vamos a escribir un algoritmo en el cual se ingrese un valor límite positivo, 
		 * y a continuación solicite números al usuario hasta que 
		 * la suma de los números introducidos supere el límite inicial.
		 * */
		
		//Variables: límite, num, suma.
		//int limite = 0;
		int suma = 0;// variables acumuladoras
		
		//Pedir el límite, y luego colocarlo como condición del bucle Mientras
		System.out.println("Ingrese el limite");
		int limite = sc.nextInt();
		
		while(suma < limite) {// 0 > 1 F ; 0 < 1 V
			
			//Sumar cada número ingresado (reemplazando el valor de “num”)
			//hasta que supere el valor ingresado como límite.
			System.out.println("Ingresa un numero");
			int numero = sc.nextInt();
			
			suma = suma + numero;// suma = 0 + 1
			
		}
		
		System.out.printf("el limite es %d  y la suma es %d", limite, suma);


	}

}
