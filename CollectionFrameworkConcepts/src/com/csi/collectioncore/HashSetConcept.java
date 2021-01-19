package com.csi.collectioncore;

import java.util.HashSet;

public class HashSetConcept {
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		hs.add("IT");
		hs.add("COMPUTER");
		hs.add("CIVIL");
		hs.add("PETROLIUM");
		hs.add("MECHANICAL");
		hs.add("AUTOMOBILE");
		hs.add("IT");
		hs.add("E&TC");
		hs.add("CHEMICAL");
		hs.forEach(System.out::println);
	}
}
