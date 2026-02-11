package com.alkemy.f20260211;

public class Canal {
	//atributos
	int id;//default: permite...
	public String nombre;//public: acceden desde cualquier paquete
	/*private int codigo;//private: acceden solo los metodos de la misma clase

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}*/
	//constructores
	public Canal() {
	}
	public Canal(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	//metodos
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Canal [id=" + id + ", nombre=" + nombre + "]";
	}
}
