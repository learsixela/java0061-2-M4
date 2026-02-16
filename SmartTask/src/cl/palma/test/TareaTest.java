/**
 * 
 */
package cl.palma.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cl.palma.objetos.GestorTareas;



/**
 * Los metodos a probar son: agregar tarea, modificar, mostrar
 * y eliminar
 */
class TareaTest {
	//Instancia la clase
	private GestorTareas gestorTareas;
	
	@BeforeEach // estado limpio, se ejecuta antes de cada prueba
	void setUp() {
		gestorTareas = new GestorTareas(); 
	}
	
	@Test 
	void test() {
		//Tarea tarea = new Tarea(); 
		
		fail("Not yet implemented");
	}
	
	@Test
	void agregarTareaTest() {
		
	}
	
	@Test
	void mostrarTareasTest() {
		
	}
	
	@Test
	void modificarTareaTest() {
		
	}
	
	@Test
	void eliminarTareaTest() {
		
	}
	
	

}
