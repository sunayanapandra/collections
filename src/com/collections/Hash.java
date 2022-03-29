package com.collections;

import java.util.HashMap;
import java.util.Map;

public class Hash {
	public static void main(String[] args) {

		Map<String, Integer> departments = new HashMap<String, Integer>();

		departments.put("CSE", 40);
		departments.put("EEE", 50);

		System.out.println(departments.get("CSE"));

		for (String dept : departments.keySet()) {
			Integer count = departments.get(dept);
			System.out.println(dept + "-" + count);
		}

}
}
