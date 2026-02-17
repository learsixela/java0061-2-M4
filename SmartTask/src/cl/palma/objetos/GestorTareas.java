package cl.palma.objetos;

import java.util.ArrayList;
import java.util.Scanner;

import cl.palma.interfaces.TareaServicio;

public class GestorTareas implements TareaServicio{
	static Scanner sc = new Scanner(System.in);
	static int id = 1;
	static ArrayList<Tarea> listaTareas = new ArrayList<Tarea>();
	//private ArrayList<Tarea> listaTareas2 = new ArrayList<>();
	/**
	 * descripcion del metodo
	 */
	@Override
	public void agregarTarea(String nombreTarea, String descripcionTarea,String prioridadTarea) {
		
		
		//objeto
		Tarea tarea = new Tarea(id,nombreTarea,descripcionTarea,prioridadTarea,false);
		/*Tarea tarea = new Tarea();
		tarea.setNombre(nombreTarea);
		tarea.setId(id);
		tarea.setDescripcion(descripcionTarea);
		tarea.setPrioridad(prioridadTarea);
		tarea.setCompletado(false);
		*/
		
		//static ArrayList<Tarea> tasks = new ArrayList<Tarea>();
		listaTareas.add(tarea);//{tarea1,tarea2, tarea3,...}
		 
		id++;
		
		//System.out.println("");
		//System.out.println(listaTareas);
		//System.out.println("");
	}

	public void capturarDatosAgregarTarea() {
		System.out.println("Ingresa el nombre de la tarea:");
		String nombreTarea = sc.nextLine().trim();
		
		if(nombreTarea.isEmpty()) {
			System.out.println("Nombre no puede estar vacio");
			return;
		}
		
		System.out.println("Ingresa la descripcion");
		String descripcionTarea = sc.nextLine();
		if(descripcionTarea.isEmpty()) {
			System.out.println("Descripción no puede estar vacio");
			return;
		}
		
		System.out.println("Ingresa la prioridad");
		String prioridadTarea = sc.nextLine();
		if(prioridadTarea.isEmpty()) {
			System.out.println("prioridad no puede estar vacio");			
			return;
		}
		
		agregarTarea(nombreTarea,descripcionTarea,prioridadTarea);
	}
	
	@Override
	public void mostrarTareas() {
		ArrayList<Tarea> tareas = getTareas();
		if(tareas.isEmpty()) {
			System.out.println("No hay tareas");
			return;
		}
		System.out.println("");
		System.out.println("*** Lista de tareas ***");
		System.out.println("");
		System.out.println("ID   NOMBRE  PRIORIDAD  COMPLETADA");
		
		//listaTareas= {tarea1,tarea2, tarea3,...}
		for (Tarea tarea : tareas) {
			String completado = tarea.isCompletado() ? "Completada": "No completada";
			System.out.println(tarea.getId()+" - "+tarea.getNombre()+" - "+tarea.getPrioridad() +" - "+completado);
		}
		System.out.println("");
	}
	
	public int capturarId() {
		System.out.println("Ingresa el ID de la tara a completar");
		int idBuscar = sc.nextInt();
		sc.nextLine();//limpiar el buffer;
		//marcarTareaCompletada(idBuscar);
		return idBuscar;
	}
	
	@Override
	public void marcarTareaCompletada(int idBuscar) {
		ArrayList<Tarea> tareas = getTareas();
		if(tareas.isEmpty()) {
			System.out.println("No hay tareas");
			return;
		}
		
		//listaTareas= {tarea1,tarea2, tarea3,...} ; tarea2={2,"tarea2", "desc2","Baja", false}
		for (Tarea tarea : tareas) {
			if(idBuscar == tarea.getId()) {
				if(tarea.isCompletado()) {
					System.out.println("Tarea ya en estado completado");
				}else {
					//tarea.completado = true;
					tarea.setCompletado(true);
					//tarea. .setId(12);
					System.out.println("Tarea marcada como completado");
				}
				return;
			}
		}
		
		System.out.println("Tarea no encontrada con el ID: "+ idBuscar);
	}

	@Override
	public void eliminarTarea() {
		ArrayList<Tarea> tareas = getTareas();
		// validar si existen tareas en la lista
		if(tareas.isEmpty()) {
			System.out.println("No hay tareas para eliminar");
			return;
		}
		// solicitar el id a eliminar
		System.out.println("Ingresa el ID de la tarea a eliminar");
		int idEliminar = sc.nextInt();
		sc.nextLine();//limpiar el buffer;
		
		// recorrer la lista buscando el id (sin foreach)
		//listaTareas= {tarea2, tarea3,...}
		for (int i = 0; i < tareas.size(); i++) {
			// si encuentra el id
			Tarea tarea = tareas.get(i);
			if(idEliminar == tarea.getId()) {
				// eliminar tarea de la lista (lista.remove(indice))
				tareas.remove(i);
				System.out.println("Tarea Eliminada");
				return;
			}
		}
		
		System.out.println("Tarea no encontrada con el ID: "+ idEliminar);
		
	}

	@Override
	public ArrayList<Tarea> getTareas() {
		return listaTareas;
	}

	@Override
	public void eliminarTodasLasTarea() {
		listaTareas.clear();
	}
	
	public void resetId() {
		id = 1;
	}

}
