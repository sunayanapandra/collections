package com.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<String> departments = new LinkedList<String>();
		departments.add("CSE");
		departments.add("EEE");
		departments.add("ECE");
		departments.add("ECE"); // duplicates allowed in List

		System.out.println(departments);

		System.out.println("Using Foreach loop");
		for (String dept : departments) {
			System.out.println(dept);
		}		
}
}
