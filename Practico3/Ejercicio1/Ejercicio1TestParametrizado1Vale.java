package testing.parameterized.Ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

//import testing.parameterized.*;
import testing.parameterized.practico.ejercicio1.Ejercicio1;
import testing.parameterized.teoria.ArrayFromString;
//import testing.parameterized.teoria.Calc;

public class Ejercicio1TestParametrizado1 {
	
		
	@ParameterizedTest(name = "{index}: last {1} in {0} is in position {2}")
	@CsvSource({ 
		"'[1,2,3]',	2,	1",
		"'[1,2,3]',	3,	2",
		"'[1,2,3]',	1,	0"
	})
	void testParametrizadoEjer1(@ConvertWith(ArrayFromString.class) int[] x, int y, int expected) {
		int res = Ejercicio1.findLast(x,y);
		assertEquals(expected, res, "findLast (x,y)");
	}
	
}
