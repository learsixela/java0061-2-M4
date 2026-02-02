package com.alkemy.f20260130;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		// validar la edad si es mayor, o menor de edad
		// indicar el segmento etareo
		
		/**mediante condicionales, como validamos?
		 * 0 -12  Niño
		 * 13- 17 Adolescente 
		 * 18- 29 Joven adulto
		 * 30- 59 Adulto
		 * 60 - ...Adulto mayor
		 * */
		// declarar scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese edad");
		
		if(sc.hasNextInt()) {//validamos si es un entero
			int edad = sc.nextInt();
			 // Validar rango y clasificar
	        if (edad < 0 || edad > 120) {
	            System.out.println("Edad no válida.");
	        } else if (edad <= 12) { //edad >= 0 && 
	            System.out.println("Es un niño.");
	        } else if (edad <= 17) {//edad >= 13 && 
	            System.out.println("Es un adolescente.");
	        } else if (edad <= 64) {//edad >= 18 && 
	            System.out.println("Es un adulto.");
	        } else {
	            System.out.println("Es un adulto mayor.");
	        }
			
		}else {
			System.out.println("edad invalida");
		}
		
		// 12< 12.5 < 13
		
		
		sc.close();
		
	}

}
