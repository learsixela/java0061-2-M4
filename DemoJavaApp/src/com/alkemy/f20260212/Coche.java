package com.alkemy.f20260212;
/**
 * Molde o plantilla Clase Padre
 */
public class Coche {
	//atributos
	protected String color;
	protected String marca;
	protected String modelo;
	protected String combustible;
	//constructores
	public Coche() {
	}
	public Coche(String color, String marca, String modelo, String combustible) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.combustible = combustible;
	}
	//metodos
	public void encender() {
		System.out.println("El coche ya esta encendio");
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	
	
	
}
