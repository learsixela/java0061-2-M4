package com.alkemy.f20260204;

public class Main {
	//variable de clase
	static Integer variableClase;
	
	public static void main(String[] parametros) {
		// variable local
		int variableLocal = 0;
		variableClase = 1;
		
		System.out.println("*** main ***");
		System.out.println(variableLocal);//0
		variableLocal=6;
		
		System.out.println(variableClase);//1
		
		//llamado a la funcion
		imprimir();
		imprimir2(variableLocal);//imprimir2(6)
		
		System.out.println("*** main2 ***");
		System.out.println(variableLocal);
		
		imprimir2(5);
	}
	
	public static void imprimir() {
		System.out.println("*** imprimir ***");
		//System.out.println(variableLocal);//alcance
		System.out.println(variableClase);//1
		variableClase = 3;//modificar o reasignar un valor
	}
	
	public static void imprimir2(int varLocal) {
		int varLocalImprimir2 = 4;//variable local sin ser utilizada
		System.out.println("*** imprimir 2 ***");
		System.out.println(varLocal);//6;5
		System.out.println(variableClase);//3
		varLocal = 2;// modificacion que no causa ningun efecto
	
	}
}
