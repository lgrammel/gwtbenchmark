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
