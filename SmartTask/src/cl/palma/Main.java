package cl.palma;

import java.util.ArrayList;
import java.util.Scanner;

import cl.palma.objetos.Tarea;

/**
 * Clase principal que ejecuta el menu
 * 
 * @author Israel
 * @version 1.0
 * @since 2026-02-09
 */
public class Main {

	static Scanner sc = new Scanner(System.in);
	static int id = 1;
	static ArrayList<Tarea> listaTareas = new ArrayList<Tarea>();
	
	public static void main(String[] args) {
		int opcion = 0;
		do {
			menu();
			try {
				
			System.out.println("Ingresa tu opción:");
			opcion = sc.nextInt();// del 0 al 4
			sc.nextLine();// limpiar el salto de linea
			
			switch (opcion) {
				case 1://agregar tarea
					agregarTarea();
					break;
				case 2:
					mostrarTareas();
					break;
				case 3:
					marcarTareaCompletada();
					break;
				case 4:
					eliminarTarea();
					break;
				case 0:
					System.out.println("Saliendo del sistema...");
					break;
				default:
					System.err.println("       Opción inválida");
					System.out.println("");
					break;
				}
			} catch (Exception e) {
				System.out.println("Error de ingreso");
			}
		} while(opcion != 0);
		
	}

	

	/**
	 * Mostrar el menú
	 * */
	public static void menu() {
		System.out.println("**** Gestión de Tareas ***");
		System.out.println("1.- Agregar tarea");
		System.out.println("2.- Mostrar tareas");
		System.out.println("3.- Marcar tarea completada");
		System.out.println("4.- Eliminar tarea");
		System.out.println("0.- Salir");
	}
	
	/**
	 * Permite agregar una tarea
	 */
	private static void agregarTarea() {
		
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
		
		System.out.println("");
		System.out.println(listaTareas);
		System.out.println("");
	}

	/**
	 * Permite listar todas las tareas
	 */
	public static void mostrarTareas() {
		if(listaTareas.isEmpty()) {
			System.out.println("No hay tareas");
			return;
		}
		System.out.println("");
		System.out.println("*** Lista de tareas ***");
		System.out.println("");
		System.out.println("ID   NOMBRE  PRIORIDAD  COMPLETADA");
		
		//listaTareas= {tarea1,tarea2, tarea3,...}
		for (Tarea tarea : listaTareas) {
			String completado = tarea.isCompletado() ? "Completada": "No completada";
			System.out.println(tarea.getId()+" - "+tarea.getNombre()+" - "+tarea.getPrioridad() +" - "+completado);
		}
		System.out.println("");
	}
	
	private static void marcarTareaCompletada() {
		if(listaTareas.isEmpty()) {
			System.out.println("No hay tareas");
			return;
		}
		
		System.out.println("Ingresa el ID de la tara a completar");
		int idBuscar = sc.nextInt();
		sc.nextLine();//limpiar el buffer;
		
		//listaTareas= {tarea1,tarea2, tarea3,...} ; tarea2={2,"tarea2", "desc2","Baja", false}
		for (Tarea tarea : listaTareas) {
			if(idBuscar == tarea.getId()) {
				if(tarea.isCompletado()) {
					System.out.println("Tarea ya en estado completado");
				}else {
					tarea.setCompletado(true);
					System.out.println("Tarea marcada como completado");
				}
				return;
				
			}
		}
		
		System.out.println("Tarea no encontrada con el ID: "+ idBuscar);
		
	}
	
	private static void eliminarTarea() {
		// validar si existen tareas en la lista
		if(listaTareas.isEmpty()) {
			System.out.println("No hay tareas para eliminar");
			return;
		}
		// solicitar el id a eliminar
		System.out.println("Ingresa el ID de la tarea a eliminar");
		int idEliminar = sc.nextInt();
		sc.nextLine();//limpiar el buffer;
		
		// recorrer la lista buscando el id (sin foreach)
		//listaTareas= {tarea2, tarea3,...}
		for (int i = 0; i < listaTareas.size(); i++) {
			// si encuentra el id
			Tarea tarea = listaTareas.get(i);
			if(idEliminar == tarea.getId()) {
				// eliminar tarea de la lista (lista.remove(indice))
				listaTareas.remove(i);
				System.out.println("Tarea Eliminada");
				return;
			}
		}
		
		System.out.println("Tarea no encontrada con el ID: "+ idEliminar);
		
	}


}
