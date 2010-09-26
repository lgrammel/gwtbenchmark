package de.larsgrammel.gwtbenchmark.client;

import java.util.HashSet;
import java.util.Set;

public class HashSetAddBenchmark implements Runnable {

	private final int size;

	public HashSetAddBenchmark(int size) {
		this.size = size;
	}

	@Override
	public void run() {
		Set<String> collection = new HashSet<String>();
		for (int j = 0; j < size; j++) {
			collection.add(Integer.toString(j));
		}
	}
	
	@Override
	public String toString() {
		return "HashSet - add";
	}

}
