package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestesOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29); // Autoboxing
		System.out.println(idadeRef.intValue()); // Unboxing

		Double dRef = Double.valueOf(3.2); // Autoboxing
		System.out.println(dRef.doubleValue()); // Unboxing

		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());

		Number refNumero = Float.valueOf(29.7f);

		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(30.1);
		lista.add(25.5f);
		System.out.println(lista);
	}
}
