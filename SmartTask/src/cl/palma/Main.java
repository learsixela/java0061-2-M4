package cl.palma;

import java.util.Scanner;

import cl.palma.objetos.GestorTareas;

/**
 * Clase principal que ejecuta el menu
 * 
 * @author Israel
 * @version 1.0
 * @since 2026-02-09
 */
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion = 0;
		do {
			menu();
			try {
				
			System.out.println("Ingresa tu opción:");
			opcion = sc.nextInt();// del 0 al 4
			sc.nextLine();// limpiar el salto de linea
			GestorTareas gestorTareas = new GestorTareas();
			switch (opcion) {
				case 1://agregar tarea
					gestorTareas.capturarDatosAgregarTarea();
					break;
				case 2:
					gestorTareas.mostrarTareas();
					break;
				case 3:
					int id = gestorTareas.capturarId();
					gestorTareas.marcarTareaCompletada(id);
					break;
				case 4:
					//int id = gestorTareas.capturarId();
					gestorTareas.eliminarTarea(gestorTareas.capturarId());
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
	
}
