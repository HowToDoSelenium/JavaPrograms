package collections1;

import java.util.TreeSet;

public class HasHset {
	public static void main(String[] args) {
		TreeSet<String> ref = new TreeSet<>();
		ref.add("hi");
		ref.add("selenium");
		ref.add("a");
		ref.add("z");
		for (String string : ref) {
			System.out.println(string);
		}
	}
}
