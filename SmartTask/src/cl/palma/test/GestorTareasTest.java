/**
 * 
 */
package cl.palma.test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cl.palma.objetos.GestorTareas;
import cl.palma.objetos.Tarea;



/**
 * Los metodos a probar son: agregar tarea, modificar, mostrar
 * y eliminar
 */
class GestorTareasTest {
	//Instancia la clase
	private GestorTareas gestorTareas;
	
	@BeforeEach // estado limpio, se ejecuta antes de cada prueba
	void setUp() {
		gestorTareas = new GestorTareas(); 
	}
	
	@Test
	void agregarTareaTest() {
		gestorTareas.agregarTarea("Tarea1", "Descripcion  tarea1","bAjA");
		ArrayList<Tarea> listaTareas= gestorTareas.getTareas();
		//validar que la lista es distinta de cero o vacia
		assertEquals(1,listaTareas.size());
		//validamos los argumentos
		assertEquals("Tarea1", listaTareas.get(0).getNombre());
		assertEquals("BAJA", listaTareas.get(0).getPrioridad());
		//assertEquals(false,listaTareas.get(0).isCompletado());
		assertFalse(listaTareas.get(0).isCompletado());
		assertNotEquals(0, listaTareas.size());
		
	}
	
	/*@Test
	void mostrarTareasTest() {
		
	}
	
	@Test
	void modificarTareaTest() {
		
	}
	
	@Test
	void eliminarTareaTest() {
		
	}*/
	
	

}
