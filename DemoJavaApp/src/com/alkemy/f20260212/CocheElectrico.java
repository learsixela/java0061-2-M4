package com.alkemy.f20260212;

/**
 * Clase hija de clase Coche
 */
public class CocheElectrico extends Coche{
	//todos los atributos
	/*protected String color;
	protected String marca;
	protected String modelo;
	protected String combustible;*/
	private int kmAutonomia;//500
	
	//todos los metodos
	/*public void encender() {
		System.out.println("El coche ya esta encendio");
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}*/
	public CocheElectrico() {
		super();//llamado al constructor de la clase Coche
	}

	public CocheElectrico(String color, String marca, String modelo, String combustible) {
		//constructor con parametros de la Super clase Coche
		super(color, marca, modelo, combustible);
	}

	public CocheElectrico(int kmAutonomia) {
		super();
		this.kmAutonomia = kmAutonomia;
	}

	public CocheElectrico(String color, String marca, String modelo, String combustible, int kmAutonomia) {
		super(color, marca, modelo, combustible);
		this.kmAutonomia = kmAutonomia;
	}

	public int getKmAutonomia() {
		return kmAutonomia;
	}

	public void setKmAutonomia(int kmAutonomia) {
		this.kmAutonomia = kmAutonomia;
	}
	
	
	
	
}
