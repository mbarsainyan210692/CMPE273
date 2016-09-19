package com.sjsu.shim.arrays;

public class Main {
	public static void main(String[] args) {
		Elements[] elements = { new Elements("Gold", 18), new Elements("Iron", 1), new Elements("Graphite", 3),
				new Elements("Silver", 16), new Elements("Platinum", 13), new Elements("Phosphorous", 3), new Elements("Cobalt", 14),
				new Elements("Aluminium", 17), new Elements("Sulphur", 1) };
		new CheckElements().printElements(elements);
	}
}
