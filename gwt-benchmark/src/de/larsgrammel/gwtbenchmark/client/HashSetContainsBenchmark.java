package de.larsgrammel.gwtbenchmark.client;

import java.util.HashSet;
import java.util.Set;

public class HashSetContainsBenchmark implements Runnable {

	private Set<String> collection;

	private int tests;

	public HashSetContainsBenchmark(int size, int tests) {
		this.tests = tests;

		collection = new HashSet<String>();
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
		return "HashSet - contains";
	}

}
