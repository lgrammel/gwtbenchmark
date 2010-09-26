package de.larsgrammel.gwtbenchmark.client;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddBenchmark implements Runnable {

	private int size;

	public ArrayListAddBenchmark(int size) {
		this.size = size;
	}

	@Override
	public void run() {
		List<String> collection = new ArrayList<String>();
		for (int j = 0; j < size; j++) {
			collection.add(Integer.toString(j));
		}
	}
	
	@Override
	public String toString() {
		return "ArrayList - add";
	}

}
