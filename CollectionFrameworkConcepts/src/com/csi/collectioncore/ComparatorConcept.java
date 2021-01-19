package com.csi.collectioncore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	int empId;

	String empName;

	int empAge;

	public Employee(int empId, String empName, int empAge) {
		
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}

}

class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.empName.compareTo(e2.empName);
	}

}

class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if (e1.empAge == e2.empAge) {
			return 0;
		} else if (e1.empAge > e2.empAge) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class ComparatorConcept {
	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(121, "SWARA", 21));
		employeeList.add(new Employee(122, "APARNA", 44));
		employeeList.add(new Employee(222, "DAN", 18));
		employeeList.add(new Employee(111, "RABEA", 34));
		employeeList.add(new Employee(129, "SACHIN", 24));

		System.out.println("\n Name Comparator");

		Collections.sort(employeeList, new NameComparator());
		employeeList.forEach(System.out::println);

		System.out.println("\n Age Comparator");

		Collections.sort(employeeList, new AgeComparator());
		employeeList.forEach(System.out::println);
	}
}
