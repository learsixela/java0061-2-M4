package cl.palma;

/**
 * clase(molde/plantilla) para crear objeto tipo tarea
 * @author Israel
 * 
 * @param id
 * @param nombre
 * @param descripcion
 * @param prioridad
 * @param completado
 */
public class Tarea {
	//atributos
	int id; 
	String nombre; 
	String descripcion; 
	String prioridad;
	boolean completado;
	//constructores
	public Tarea() {
	}
	public Tarea(int id, String nombre, String descripcion, String prioridad, boolean completado) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.prioridad = prioridad;
		this.completado = completado;
	}
	
	//métodos (comportamientos)
}
