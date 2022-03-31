package testing.junit.practico.ejercicio1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import testing.junit.practico.ejercicio1.*;

public class Ejer1Test {
	
	
	//Ejercicio1
	//a)
	@Test
	public void test1() {
		int[] x = null;
		int y = 1;
	    assertThrows(NullPointerException.class, () -> Ejercicio1.findLast(x,y));
	}
	
	//b)
	@Test
	public void test2() {
		int[] x = {1,2,3};
		int y = 3;
		int result = Ejercicio1.findLast(x,y);
		assertTrue(2==result);
	}
	
	//c)
	@Test
	public void test3() {
		int[] x = {1,2,3};
		int y = 1;
		int result = Ejercicio1.findLast(x,y);
		assertTrue(0==result);
	}
	
	//d) Para que la falla pueda detectarse en terminos de RIPR primero se paso por la linea del defecto 
	//,despues ciclo hasta que hizo el return y retorno un resultado inesperado, es decir que se replico los estados de error;
	
}
