package com.alkemy.f20260206;

public class ClaseMath {

	public static void main(String[] args) {
		// Clase Math Math.metodo();
		//constantes
		System.out.println("Constante PI "+ Math.PI );
		System.out.println("Constante Euler "+Math.E);
		
		//Redondeo
		System.out.println("Math.ceil() "+ Math.ceil(4.1));//5.0 //redondeo hacia arriba 
		System.out.println("Math.ceil() "+ Math.ceil(Math.PI));//4.0
		System.out.println("Math.ceil() "+ Math.ceil(-4.1));//-4.0
		
		System.out.println("Math.floor() "+ Math.floor(4.1));//4.0 //redondeo hacia abajo 
		System.out.println("Math.floor() "+ Math.floor(Math.PI));//3.0
		System.out.println("Math.floor() "+ Math.floor(-4.1));//-5.0
		
		System.out.println("Math.round() "+ Math.round(6.1));//6
		System.out.println("Math.round() "+ Math.round(6.5));//7
		
		System.out.println("Math.round() "+ Math.round(-6.1));//-6
		System.out.println("Math.round() "+ Math.round(-6.5));//-6
		System.out.println("Math.round() "+ Math.round(-6.6));//-7
		
		/**Raices y potencias*/
		System.out.println("Math.pow() "+ Math.pow(0,0));//1.0
		System.out.println("Math.pow() "+ Math.pow(5,3));//125.0
		
		//System.out.println("Math.pow() "+Math.pow(125,(1/5)));
		
		System.out.println("Math.sqrt() "+Math.sqrt(25));//5.0
		System.out.println("Math.cbrt() "+Math.cbrt(125));//5.0
		
		// comparacion
		System.out.println("Math.max() "+Math.max(10,10.5));//10.5
		System.out.println("Math.min() "+Math.min(10,10.5));//10.0
		
		// valor absoluto; distincia hacia el cero
		System.out.println("Math.abs() "+Math.abs(4.5));//4.5
		System.out.println("Math.abs() "+Math.abs(-4.4));//4.4
		
		/* Número Aleatorio*/
		// retorna un double
		//retorna un numero double dentro del rango [0.0, 1.0)
		System.out.println("Math.random "+ Math.random());//0.04322411933572834
		
		//forma general
		//(int) (Math.random() * rango) + minimo
		
		System.out.println((int) (Math.random() * 10));//[0 , 9]
		System.out.println((int) (Math.random() * 10) + 1);//[1 , 10]
		System.out.println((int) (Math.random() * 11) + 5);//[5 , 15]
		System.out.println((int) (Math.random() * 21) - 10);//[-10 , 10]
		
		//ejercicio
		//el sistema generera un numero aleatorio dentro de un rango
		//el usuario trata de adivinarlo, el sistema entrega pistas de cercania
		//contar cuantos ingresos realizo.
		
		
	}

}
