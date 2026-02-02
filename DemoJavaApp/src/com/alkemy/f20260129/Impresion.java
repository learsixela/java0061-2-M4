package com.alkemy.f20260129;

public class Impresion {

	public static void main(String[] args) {
		// Print , no salta a la siguiente linea en consola
		System.out.print("Esto es un mensaje");
		System.out.print("nuevo mensaje");
		
		System.out.println("Hola");// realiza el salto de linea
		System.out.println("mi nombre es Israel");
		
		String nombre = "Mijail";
		System.out.println(nombre);//imprime el contenido de una variable
		
		double iva = 0.19;
		System.out.printf("impuesto %.2f %n",iva);//imprime con 2 decimales (%n, salto de linea)
		System.out.printf("impuesto %.1f %n",iva);//imprime 1 decimal, aproximado
		
		String apellido = "Palma";
		int edad = 3;
		System.out.printf(" Me llamo: %s %n %s, tengo %d años",nombre,apellido,edad);
		
	}

}
