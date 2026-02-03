package com.alkemy.f20260203;

public class Funciones {

	public static void main(String[] args) {
		// llamar o invocar al metodo
		Integer valor_retorno = calculo_suma(70,54);

		System.out.println("El resultado de la suma es: "+ valor_retorno);
		
		calculo_suma2(70,70);
	}

	//definicion del metodo
	//accesador; tipo de retorno ; nombre_metodo; (tipo_dato nombre_parametro)
	
	public static Integer calculo_suma(Integer numero1, Integer numero2) {
		
		Integer suma = numero1 + numero2;
		
		return suma;
		//return numero1 + numero2;
	}
	
	public static void calculo_suma2(Integer numero1, Integer numero2) {
		
		Integer suma = numero1 + numero2;
		System.out.println("El resultado es: " + suma);
		
		
	}
	
}
