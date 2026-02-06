package com.alkemy.f20260206;

import java.util.Arrays;

public class Matrices {

	public static void main(String[] args) {
		// Matrices -> array multidimensional
		int[][] numeros = new int[2][3];//2 filas y 3 columnas
		/*
		 [0x0],[0x1],[0x2] -> fila 0
		 [1x0],[1x1],[1x2] -> fila 1
		 
		  */
		numeros[0][0]= 10;
		numeros[1][2]= 60;
		
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(numeros[0]));
		System.out.println(Arrays.toString(numeros[1]));

		// Recorrer Matriz, todos los elementos
		
		for (int fila = 0; fila < 2; fila++) {
			//numeros[fila]
			for (int columna = 0; columna < 3; columna++) {
				System.out.println(numeros[fila][columna]);
			}
		}
		
		//forma generica
		int[][] matriz = new int[2][3];
		for (int fila = 0; fila < matriz.length; fila++) {
			//numeros[fila]
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				System.out.println(matriz[fila][columna]);
			}
		}
		//[0x0],[0x1],[0x2]
		//[1x0],[1x1],[2x2]
		for (int[] fila : matriz) {//[0x0],[0x1],[0x2]
			for (int valor : fila) {
				System.out.println("valor "+ valor);
			}
		}
		// ejercicio, calculo de promedio por alumno y del curso donde son 14 alumnos 
		// cada alumno tendra 7 notas
	}

}
