package com.collections;

import java.util.ArrayList;

public class Array {
public static void main(String[]args) {
	ArrayList<String> dep = new ArrayList<String>();
	dep.add("CSE");
	dep.add("EEE");
	dep.add("ECE");
	dep.add("ECE"); // duplicates allowed in ArrayList

	System.out.println(dep);

	System.out.println("Using Foreach loop");
	for (String dept : dep) {
		System.out.println(dept);
	}
dep.contains("EEE");
System.out.println(dep.contains("EEE"));
dep.isEmpty();
System.out.println(dep.isEmpty());

}

}
