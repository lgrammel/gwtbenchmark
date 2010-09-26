package de.larsgrammel.gwtbenchmark.client;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIteratorBenchmark implements Runnable {

	private List<String> collection;

	public ArrayListIteratorBenchmark(int size) {
		collection = new ArrayList<String>();
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
		return "ArrayList - iterator";
	}

}
