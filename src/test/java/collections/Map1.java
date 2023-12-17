package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import collections1.Set;

public class Map1 {
	public static void main(String[] args) {
		Map<Integer, String> data = new HashMap<Integer, String>(); // no duplicates, random order
		data.put(10, "java");
		data.put(20, "sql");
		data.put(30, "oops");
		data.put(10, "selenium");
		data.put(null,null);
		data.put(null,null);
		data.put(null, "99");
		String string = data.get(10);
		System.out.println(string);
		
		Collection<String> string1 = data.values();
		System.out.println(string1);
		
		java.util.Set<Entry<Integer, String>> entrySet = data.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println();
		
//		LinkedHashMap<Integer, Integer> data1 = new LinkedHashMap<>();
//		data1.put(10, 10);
//		data1.put(20, 20);
//		data1.put(30, 30);
//		data1.put(10, 10);
//		data1.put(null, null);
//		data1.put(null, 99);
//		data1.put(null, 98);
//		java.util.Set<Entry<Integer, Integer>> entrySet1 = data1.entrySet();
//
//		for (Entry<Integer, Integer> entry1 : entrySet1) {
//			System.out.println(entry1.getKey() + " " + entry1.getValue());
//		}
	}
}
