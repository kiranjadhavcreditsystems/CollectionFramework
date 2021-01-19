package com.csi.collectioncore;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();
		al.add("IT");
		al.add("COMPUTER");
		al.add("CIVIL");
		al.add("PETROLIUM");
		al.add("MECHANICAL");
		al.add("AUTOMOBILE");
		al.add("IT");
		al.add("E&TC");
		al.add("CHEMICAL");
		al.remove(3);
		// System.out.println(al);
		/*Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/

		//al.forEach(branchName->System.out.println(branchName));
		
		//al.forEach(System.out::println);
		
		for(String bName:al)
		{
			System.out.println(bName);
		}	
		
	}

}
