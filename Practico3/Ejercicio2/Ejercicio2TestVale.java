package testing.parameterized.Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import testing.parameterized.practico.ejercicio2.MinList;
import testing.parameterized.teoria.ArrayFromString;
import testing.parameterized.teoria.MinListFromString;

public class Ejercicio2Test {
	@ParameterizedTest(name = "{index}: min {1} in {0} is in position {0}")
	@CsvSource({ 	
		"'[cat, dog]',	cat"
	})
	void testParametrizadoEjer2(@ConvertWith(MinListFromString.class)  MinList x, String expected) {
		Object obj = x.min();
		assertTrue(obj.equals(obj));
	}
	@CsvSource({ 	
		"'[cat, dog]',java.lang.ClassCastException"
	})
	void testParametrizadoEjer2(@ConvertWith(MinListFromString.class)  MinList x, Class expected) {
		x.add(1);
		assertThrows(expected, ()->x.min());
	}
}
