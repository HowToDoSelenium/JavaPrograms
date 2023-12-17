package collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TreeMap {
	public static void main(String[] args) {
		Map<Integer, String> ref = new java.util.TreeMap<>();
		ref.put(1, "Hi");
		ref.put(3, "seleinum");
		ref.put(4, "America");
		ref.put(5, "java");
		ref.put(2, "Java");

		Set<Entry<Integer, String>> entrySet = ref.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
