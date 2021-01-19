package com.csi.collectioncore;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<>();
		hm.put("ID", "121");
		hm.put("NAME", "SWARA");
		hm.put("SALARY", "436564.78");
		hm.put("ADDRESS", "PUNE");
		hm.put(null, "ABC");
		hm.put(null, "PQR");

		for (Map.Entry<String, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + ": " + m.getValue());
		}
	}
}
