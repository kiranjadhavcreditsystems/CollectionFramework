package com.csi.collectioncore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Customer implements Comparable<Customer> {

	int customerId;

	String customerName;

	int customerAge;

	public Customer(int customerId, String customerName, int customerAge) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
	}

	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ "]";
	}

	@Override
	public int compareTo(Customer c1) {
		// TODO Auto-generated method stub
		if (customerAge == c1.customerAge) {
			return 0;
		} else if (customerAge > c1.customerAge) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class ComparableConcept {
	public static void main(String[] args) {
		List<Customer> custList = new ArrayList<Customer>();
		custList.add(new Customer(121, "SWARA", 22));
		custList.add(new Customer(123, "RABEA", 19));
		custList.add(new Customer(111, "DAN", 45));
		custList.add(new Customer(125, "NING", 27));
		custList.add(new Customer(129, "APARNA", 20));

		Collections.sort(custList);
		custList.forEach(System.out::println);
	}
}
