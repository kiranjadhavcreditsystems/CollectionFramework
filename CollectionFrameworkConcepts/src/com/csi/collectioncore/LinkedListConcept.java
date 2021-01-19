package com.csi.collectioncore;

import java.util.LinkedList;

public class LinkedListConcept {
	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
		ll.add("IT");
		ll.add("COMPUTER");
		ll.add("CIVIL");
		ll.add("PETROLIUM");
		ll.add("MECHANICAL");
		ll.add("AUTOMOBILE");
		ll.add("IT");
		ll.add("E&TC");
		ll.add("CHEMICAL");
		System.out.println("Linked List Size: "+ ll.size());
		ll.forEach(System.out::println);
	}
}
