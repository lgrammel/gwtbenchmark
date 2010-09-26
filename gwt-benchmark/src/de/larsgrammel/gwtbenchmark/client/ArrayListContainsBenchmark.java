package de.larsgrammel.gwtbenchmark.client;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContainsBenchmark implements Runnable {

	private List<String> collection;

	private int tests;

	public ArrayListContainsBenchmark(int size, int tests) {
		this.tests = tests;

		collection = new ArrayList<String>();
		for (int j = 0; j < size; j++) {
			collection.add(Integer.toString(j));
		}
	}

	@Override
	public void run() {
		for (int j = 0; j < tests / 2; j++) {
			collection.contains(Integer.toString(j));
		}
		
		for (int j = 0; j < tests / 2; j++) {
			collection.contains(Integer.toString(j) + "not");
		}
	}

	@Override
	public String toString() {
		return "ArrayList - contains";
	}

}
