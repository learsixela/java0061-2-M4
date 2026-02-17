/**
 * 
 */
package cl.palma.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
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
	
	@BeforeEach //se ejecuta antes de cada prueba
	void setUp() {
		gestorTareas = new GestorTareas();// estado limpio 
		/*gestorTareas.agregarTarea("Tarea0", "Descripcion  tarea1","bAjA");
		gestorTareas.agregarTarea("Tarea1", "Descripcion  tarea1","bAjA");
		gestorTareas.agregarTarea("Tarea2", "Descripcion  tarea2","Alta");*/
	}
	@AfterEach
	void reset() {
		gestorTareas.eliminarTodasLasTarea();
		gestorTareas.resetId();
	}
	
	@Test
	void agregarTareaTest() {
		gestorTareas.agregarTarea("Tarea0", "Descripcion  tarea1","bAjA");
		ArrayList<Tarea> listaTareas= gestorTareas.getTareas();
		//validar que la lista es distinta de cero o vacia
		//assertEquals(1,listaTareas.size());
		assertNotEquals(0, listaTareas.size());
		//validamos los argumentos
		assertEquals("Tarea0", listaTareas.get(0).getNombre());
		assertEquals("BAJA", listaTareas.get(0).getPrioridad());
		//assertEquals(false,listaTareas.get(0).isCompletado());
		assertFalse(listaTareas.get(0).isCompletado());
	}
	
	@Test
	void listarTareasTest() {
		//agregar tareas
		gestorTareas.agregarTarea("Tarea1", "Descripcion  tarea1","bAjA");
		gestorTareas.agregarTarea("Tarea2", "Descripcion  tarea2","Alta");
		//necesitamos una lista de tareas
		ArrayList<Tarea> listaTareas= gestorTareas.getTareas();
		
		//validar que la lista es distinta de cero o vacia
		assertNotEquals(0, listaTareas.size());
		assertEquals(2,listaTareas.size());
		//consultar por datos internos en la lista
		assertEquals(1,listaTareas.get(0).getId());
		assertEquals(2,listaTareas.get(1).getId());
		
	}
	
	@Test
	void marcarTareaCompletadaTest() {
		gestorTareas.agregarTarea("Tarea a eliminar", "Descripcion  tarea a eliminar","Media");
		//ArrayList<Tarea> listaTareas= gestorTareas.getTareas();
		int id = gestorTareas.getTareas().get(0).getId();//1
		
		//marcar una tarea como completada
		assertTrue(gestorTareas.marcarTareaCompletada(id));
		//verificar si realizo el cambio
		assertTrue(gestorTareas.getTareas().get(0).isCompletado());
	}
	
	@Test
	void marcarTareaCompletadaErrorTest() {
		gestorTareas.agregarTarea("Tarea", "Descripcion  tarea a eliminar","Media");
		
		//no existe el id de la tarea
		assertFalse(gestorTareas.marcarTareaCompletada(2));
		//verificar NO se realizo el cambio
		assertFalse(gestorTareas.getTareas().get(0).isCompletado());
	}
	/*
	@Test
	void eliminarTareaTest() {
		
	}*/
	
	/*
	setUp()
	agregarTareaTest()
	reset()
	setup()
	listarTareasTest()
	reset()
	setup()
	marcarTareaCompletadaTest()
	reset()
	*/

}
