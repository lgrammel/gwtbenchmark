package de.larsgrammel.gwtbenchmark.client;

import java.util.HashSet;
import java.util.Set;

public class HashSetIteratorBenchmark implements Runnable {

	private Set<String> collection;

	public HashSetIteratorBenchmark(int size) {
		collection = new HashSet<String>();
		for (int j = 0; j < size; j++) {
			collection.add(Integer.toString(j));
		}
	}
	
	@Override
	public void run() {
		for (String value : collection) {
			value.length();
		}
	}
	
	@Override
	public String toString() {
		return "HashSet - iterator";
	}

}
