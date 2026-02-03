package com.alkemy.f20260203;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu(); 
		
		System.out.println("Ingresa el número de tu opción");
		// Seleccion por parte del usuario
		if(sc.hasNextInt()) {//valida ingreso de un numero
			int opcion = sc.nextInt();
			
			if (opcion < 0 || opcion >= 6){	
				System.err.println("Opción invalida");
			}else {// opciones del 1 al 5
				
				switch (opcion) {
				case 0:
					System.out.println("Vuelve pronto...");
					break;
				case 1://sumar
					int suma = suma();
					System.out.println("El resultado es " + suma);
					//System.out.println("El resultado es " + (numero1+numero2));
					break;
				case 2://resta
					break;
				case 3://multiplicacion
					break;
				case 4://division
					break;
				case 5://modulo o resto numero1 % numero2=
					break;
					
				default:
					break;
				}
			}
			
			System.out.println("Quieres continuar con otra operacion ...");
			System.out.printf("1)SI %n 2)NO %n ");
			
		}else {
			System.err.println("Opción invalida");
		}
		
		//switch, variables, if, for y while
		sc.close();
	}

	public static void menu() {
		// Menu calculadora
		System.out.println("******************");
		System.out.println("*  Calculadora   *" );
		System.out.println("******************");
		System.out.println("* 0) Salir       *");
		System.out.println("* 1) Sumar       *");
		System.out.println("* 2) Restar      *");
		System.out.println("* 3) Multiplicar *");
		System.out.println("* 4) Dividir     *");
		System.out.println("* 5) Resto       *");
		System.out.println("******************");
	}
	
	public static int suma() {
		Scanner sc = new Scanner(System.in);
		int suma_total = 0;
		System.out.println("Ingrese cantidad de números a sumar");
		int cantidad = sc.nextInt();
		
		for (int i = 1; i <= cantidad; i++) {
			System.out.printf("Ingresa el %d numero%n", i);
			int numero = sc.nextInt();
			suma_total = suma_total + numero;
		}
		sc.close();
		return suma_total;		
	}
}
