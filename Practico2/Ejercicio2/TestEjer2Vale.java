package testing.junit.practico.ejercicio2;

//import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import testing.junit.practico.ejercicio1.Ejercicio1;

public class TestEjer2 {
	
	@Test
	 void testIsEmpty() {
		int capacity=5;
		BoundedQueue queue = new BoundedQueue(capacity); 
		assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testIsFull() {
		int capacity=5;
		BoundedQueue queue = new BoundedQueue(capacity); 
		assertFalse(queue.isFull());
	}
	
	@Test
	public void testEnQueue() {
		int capacity=5;
		BoundedQueue queue = new BoundedQueue(capacity); 
		int size_actual= queue.getSize();
		queue.enQueue(2);
		size_actual++;
		assertTrue(size_actual==queue.getSize());
	}
}
