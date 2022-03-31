package testing.parameterized.teoria;

import java.util.ArrayList;

import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import testing.parameterized.practico.ejercicio2.MinList;

public class MinListFromString extends SimpleArgumentConverter{
	@Override
	protected Object convert(Object source, Class<?> targetType) {
		String strSource = ((String)source);
		strSource = strSource.substring(1, strSource.length()-1);
		String [] strArray = strSource.split(",");
		ArrayList<Comparable> array = new ArrayList<Comparable>();
		for (int i = 0; i < strArray.length; i++) {
			array.add((Comparable)strArray[i]);
		}
		MinList list = new MinList(array);
		return list;
	}
}
