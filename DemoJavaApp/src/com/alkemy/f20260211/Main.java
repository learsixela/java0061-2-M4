package com.alkemy.f20260211;

public class Main {

	public static void main(String[] args) {
		//crear objeto Sector() - instancia de la clase
		Sector sectorCero = new Sector();
		//asignar valores con Setter
		sectorCero.setId(10);
		
		Sector sectorUno = new Sector(5,"Sector Uno");
		
		//llamado al metodo toString(), representacion de los valores de los atributos
		System.out.println(sectorCero.toString());
		System.out.println(sectorUno.toString());
		
		Pais paisCero = new Pais();
		paisCero.setNombre("Chile");
		
		Pais paisUno = new Pais();
		System.out.println(paisCero.toString());
		System.out.println(paisUno.toString());
		
		sectorCero.setId(15);
		
		//obtener datos getters
		int identificador = sectorCero.getId();//capturar el dato
		System.out.println(identificador +5);
		System.out.println(sectorUno.getId());//imprimir el dato
		System.out.println(paisCero.getNombre());//Chile
		System.out.println();
		System.out.println(sectorCero.toString());
		System.out.println(sectorUno.toString());
		
		Canal canalCero = new Canal(0,"canal Cero");
		System.out.println(canalCero.nombre);
		System.out.println(canalCero.getNombre());
	}

}
