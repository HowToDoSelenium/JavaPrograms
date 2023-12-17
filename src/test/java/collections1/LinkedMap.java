package collections1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedMap {
	public static void main(String[] args) {
		Map<Integer, String> s1 = new LinkedHashMap<>();
		s1.put(1, "java");
		s1.put(3, "python");
		s1.put(4, "C++");
		s1.put(2, "Selenium");

		Set<Entry<Integer, String>> s2 = s1.entrySet();
		for (Entry<Integer, String> entry : s2) {
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
	}
}
