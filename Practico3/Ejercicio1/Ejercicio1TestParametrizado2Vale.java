package testing.parameterized.Ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

//import testing.parameterized.*;
import testing.parameterized.practico.ejercicio1.Ejercicio1;
import testing.parameterized.teoria.ArrayFromString;
//import testing.parameterized.teoria.Calc;
import testing.parameterized.teoria.EjemplosArray;

public class Ejercicio1TestParametrizado2 {
	
		

	@ParameterizedTest(name = "{index}: last {1} in {0} is in position {2}")
	@MethodSource("findLastArgsProvider")
	void findLastParamTest(int [] arr, int elem, int expected) {
		int result = EjemplosArray.findLast(arr, elem);
		assertEquals(expected, result);
	}
	
	static Stream<Arguments> findLastArgsProvider() {
	    return Stream.of(
	    		Arguments.of(new int[] {1,2,3}, 3, 2),
	    		Arguments.of(new int[] {1,3,3}, 3, 2),
	    		Arguments.of(new int[] {1,2,3}, 0, -1)
	    );
	}
	@ParameterizedTest(name = "{index}: last {1} in {0} is in position {2}")
	@CsvSource({ 
		"'null',	2,java.lang.NullPointerException"//java.lang.IllegalArgumentException
	})
	void testParametrizadoEjer1(@ConvertWith(ArrayFromString.class) int[] x, int y, Class expected) {
		assertThrows(expected, ()-> Ejercicio1.findLast(x,y));
	}
}
