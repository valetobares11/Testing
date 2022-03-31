package testing.parameterized.Ejercicio3;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import testing.parameterized.practico.ejercicio3.BoundedQueue;
import testing.parameterized.teoria.BoundedQueueString;

public class Ejercicio3Test {
	//Aclaracion por defecto la cola se crea con una capacidad minimo de 1 elemento mas los que se le pasa en el arreglo
	
	//Aca testeamos que el size es correcto
	@ParameterizedTest(name = "{index}: min {1} in {0} is in position {0}")
	@CsvSource({ 	
		"'[1]', 1",
		"'[1,2,3]', 3",
		"'[]', 0"
	})
	void testParametrizadoEjer3(@ConvertWith(BoundedQueueString.class)  BoundedQueue x, int expected) {
		assertTrue(expected == x.getSize());
	}
	
	//Aca testeamos que inserte bien
	@ParameterizedTest(name = "{index}: min {1} in {0} is in position {0}")
	@CsvSource({ 	
		"'[1]', 2",
		"'[1,2,3]', 4",
		"'[]', 1"
	})
	void testParametrizadoEjer3EnQueue(@ConvertWith(BoundedQueueString.class)  BoundedQueue x, int expected) {
		x.enQueue(1);
		assertTrue(expected == x.getSize());
	}
	
	
	
	//Aca testeamos que borra bien
	@ParameterizedTest(name = "{index}: min {1} in {0} is in position {0}")
	@CsvSource({ 	
		"'[1,2,3]', 2",
		"'[1,2,3,5,6]', 4",
		"'[1]', 0"
	})
	void testParametrizadoEjer3DeQueue(@ConvertWith(BoundedQueueString.class)  BoundedQueue x, int expected) {
		x.deQueue();
		assertTrue(expected == x.getSize());
	}
	
	//Aca testeamos que esta vacio
	@ParameterizedTest(name = "{index}: min {1} in {0} is in position {0}")
	@CsvSource({ 	
		"'[]', 0"
	})
	void testParametrizadoEjer3IsEmpty(@ConvertWith(BoundedQueueString.class)  BoundedQueue x, int expected) {
		assertTrue(x.isEmpty());
	}
	
	//Aca testeamos que esta vacio
	@ParameterizedTest(name = "{index}: min {1} in {0} is in position {0}")
	@CsvSource({ 	
		"'[1]', 1",
		"'[2]', 1",
		"'[3]', 1"
	})
	void testParametrizadoEjer3IsFull(@ConvertWith(BoundedQueueString.class)  BoundedQueue x, int expected) {
		x.enQueue(1);
		assertTrue(x.isFull());
	}
			
		
}
