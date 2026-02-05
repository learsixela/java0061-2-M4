package com.alkemy.f20260205;

import java.util.Scanner;

public class Calculadora {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean continuar = true;
		while(continuar) {
			menu(); 
			
			System.out.println("Ingresa el número de tu opción");
			// Seleccion por parte del usuario
			if(sc.hasNextInt()) {//valida ingreso de un numero
				int opcionMenu = sc.nextInt();
				
				if (opcionMenu < 0 || opcionMenu >= 6){	
					System.err.println("Opción invalida");
				}else {// opciones del 1 al 5
					
					switch (opcionMenu) {
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
				
				continuar = deseaContinuar();//llamando y esperando un valor de retorno
				
				System.out.println("continuar: "+continuar);
				
			}else {
				System.err.println("Opción invalida");
				sc.next();//descarte
				continuar = deseaContinuar();
			}
		}
		System.out.println("Vuelve pronto...");
		sc.close();
	}
	public static boolean deseaContinuar() {
		System.out.println("Quieres continuar con otra operacion ...");
		System.out.printf("1)SI %n2)NO %n");
		int opcionContinuar = sc.nextInt();
		return (opcionContinuar == 1) ? true: false; 
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
		int suma_total = 0;
		System.out.println("Ingrese cantidad de números a sumar");
		int cantidad = sc.nextInt();
		
		for (int i = 1; i <= cantidad; i++) {
			System.out.printf("Ingresa el %d numero%n", i);
			int numero = sc.nextInt();
			suma_total = suma_total + numero;
		}
		return suma_total;		
	}
}
