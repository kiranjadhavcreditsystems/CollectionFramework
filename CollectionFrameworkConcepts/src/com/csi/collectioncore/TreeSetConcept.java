package com.csi.collectioncore;

import java.util.TreeSet;

public class TreeSetConcept {
	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<>();
		ts.add("IT");
		ts.add("COMPUTER");
		ts.add("456");
		ts.add("PETROLIUM");
		ts.add("MECHANICAL");
		ts.add("AUTOMOBILE");
		ts.add("IT");
		ts.add("123");
		ts.add("CHEMICAL");

		ts.forEach(branchName -> System.out.println(branchName));
	}
}
