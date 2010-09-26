/*
 *   Copyright 2010 Lars Grammel
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *   
 */
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
