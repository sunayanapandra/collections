package com.collections;

import java.util.ArrayList;

public class Arraylist {
public static void main(String[]args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(20);
	al.add(90);
	System.out.println(al);
	System.out.println("using foreachloop");
	for(Integer mark: al) {
		System.out.println(mark);
	}
	
	
}
}
