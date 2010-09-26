package de.larsgrammel.gwtbenchmark.client;

public class JsArrayAddBenchmark implements Runnable {

	private final int size;

	public JsArrayAddBenchmark(int size) {
		this.size = size;
	}

	@Override
	public void run() {
		JsArray collection = JsArray.create();
		for (int j = 0; j < size; j++) {
			collection.add(Integer.toString(j));
		}
	}

	@Override
	public String toString() {
		return "JsArray - add";
	}

}
