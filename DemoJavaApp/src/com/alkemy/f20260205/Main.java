package com.alkemy.f20260205;

public class Main {

	public static void main(String[] args) {
		// Operadores
		int numero1= 10;
		int numero2= 20;
		//int suma = numero1+numero2;
		//System.out.println(suma);
		
		System.out.println(numero1 + numero2);//30
		System.out.println(numero1 - numero2);//-10
		System.out.println(numero1 * numero2);//200
		System.out.println(numero1 / numero2);// 10/20 = 0
		System.out.println(numero1 % numero2);// 10
		
		//casteo
		System.out.println((double) numero1 / numero2);// 10/20 = 0.5 
		System.out.println((long) numero1 / numero2);
		
		//ingremento / decremento
		System.out.println(++numero1);//11; primero incrementa, luego imprime
		System.out.println(numero1++);//11; primero imprime, luego incrementa
		System.out.println(numero1);//12
		
		System.out.println(--numero2);//19; primero resta 1, luego imprime
		System.out.println(numero2--);//19; primero imprime, luego resta 1
		System.out.println(numero2);//18

		for (int i = 100; i>0; i--) {
			if(i == 100) {
				System.out.printf("%d",--i);
			}else{
				System.out.printf(",%d",--i);
			}
		}
		System.out.printf("%n");//salto de linea
		
		// Comparacion
		System.out.println(numero1 == numero2);//false
		System.out.println(numero1 != numero2);//true
		System.out.println(numero1 < numero2);//true
		System.out.println(numero1 > numero2);//false
		System.out.println(numero1 <= numero2);//true
		System.out.println(numero1 >= numero2);//false
		
		//Logicos
		boolean tieneClave = true;
		Boolean esAdmin= false;
		System.out.println("--- Operadores Logicos ----");
		System.out.println(true && true);//true
		System.out.println(tieneClave && esAdmin);//false
		System.out.println(esAdmin && true && true);//false; corto circuito(solo evalua la primera variable)
		System.out.println();
		System.out.println(false || false);//false
		System.out.println(tieneClave || esAdmin);//true; corto circuito(solo evalua la primera variable)
		
		System.out.println(esAdmin == true);//false; esta demas
		if(!esAdmin) {
			System.out.println("Es administrador del sistema");
		}else {
			System.out.println("no es administrador del sistema");
		}
		
		// If ternario => Evaluacion ? resultado_verdad : resultado_falsedad
		String mensaje = (esAdmin) ? "Es admin":"No es admin";
		System.out.println(mensaje);

	}

}
