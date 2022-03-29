package com.collections;

import java.util.HashSet;

public class Hashset {
	public static void main(String[]args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("cse");
		hs.add("eee");
		hs.add("ece");
	
		System.out.println(hs);
		System.out.println("using for each");
		for(String dept: hs) {
			System.out.println(dept);
		}
	}

}
