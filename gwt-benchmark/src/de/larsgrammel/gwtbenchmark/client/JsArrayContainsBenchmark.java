package de.larsgrammel.gwtbenchmark.client;


public class JsArrayContainsBenchmark implements Runnable {

	private JsArray collection;

	private int tests;

	public JsArrayContainsBenchmark(int size, int tests) {
		this.tests = tests;

		collection = JsArray.create(); 
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
		return "JsArray - contains";
	}

}
