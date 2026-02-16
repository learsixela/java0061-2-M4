package cl.palma.interfaces;

import java.util.ArrayList;

import cl.palma.objetos.Tarea;

public interface TareaServicio {

	void agregarTarea(String nombreTarea, String descripcionTarea,String prioridadTarea);
	void mostrarTareas();
	ArrayList<Tarea> getTareas();
	void marcarTareaCompletada();
	void eliminarTarea();
}
