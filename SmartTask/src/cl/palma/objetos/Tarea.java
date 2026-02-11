package cl.palma.objetos;

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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	public boolean isCompletado() {
		return completado;
	}
	public void setCompletado(boolean completado) {
		this.completado = completado;
	}
	@Override
	public String toString() {
		return "Detalle de Tarea [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", prioridad=" + prioridad
				+ ", completado=" + completado + "]";
	}
	
}
