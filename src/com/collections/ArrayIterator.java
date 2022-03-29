package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {
	public static void main(String[] args) {
		ArrayList<String> departments = new ArrayList<String>();
		departments.add("CSE");
		departments.add("EEE");
		departments.add("ECE");
		departments.add("ECE"); //duplicates allowed in ArrayList
		
		System.out.println(departments);
		
		System.out.println("Using iterator ");
		Iterator<String> it = departments.iterator();
		while(it.hasNext()) {
			String dept = it.next();
			System.out.println(dept);
		}
		
	}

}
