package testing.parameterized.teoria;

import java.util.ArrayList;

import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import testing.parameterized.practico.ejercicio3.BoundedQueue;

public class BoundedQueueString extends SimpleArgumentConverter{
	@Override
	protected Object convert(Object source, Class<?> targetType) {
		String strSource = ((String)source);
		if (strSource.equals("[]")) return new BoundedQueue(1);
		strSource = strSource.substring(1, strSource.length()-1);
		String [] strArray = strSource.split(",");
		BoundedQueue cola = new BoundedQueue(strArray.length+1);
		for (int i = 0; i < strArray.length; i++) {
			cola.enQueue((Comparable)strArray[i]);
		}
		return cola;
	}
}

