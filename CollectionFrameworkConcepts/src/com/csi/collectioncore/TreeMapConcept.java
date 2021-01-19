package com.csi.collectioncore;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {
	public static void main(String[] args) {
		TreeMap<String, String> tm = new TreeMap<>();

		tm.put("ID", "121");
		tm.put("NAME", "SWARA");
		tm.put("SALARY", "436564.78");
		tm.put("ADDRESS", "PUNE");
		
		tm.remove("ADDRESS");
		
		
		for (Map.Entry<String, String> m : tm.entrySet()) {
			System.out.println(m.getKey() + ": " + m.getValue());
		}

	}
}
