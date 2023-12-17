package collections1;

import java.util.LinkedHashSet;

public class Set {
	public static void main(String[] args) {
		LinkedHashSet<String> ref = new LinkedHashSet<String>();
		ref.add("z");
		ref.add("java");
		ref.add("selenium");
		ref.add("a");
		for (Object object : ref) {
			System.out.println(object);
		}
		System.out.println("Using stream");
		ref.stream().forEach(System.out::println);
	}
}
