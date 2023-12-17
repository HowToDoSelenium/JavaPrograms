package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Set1 {
	public static void main(String[] args) {
		Set<Integer> data = Set.of(1, 2, 3, 4, 5);
		Set<Integer> data1 = new HashSet<>();
		data1.add(1);
		data1.add(1);
		data1.add(2);
		data1.add(3);
		data1.add(55);
		data1.add(56);

		Set<Integer> disp = new LinkedHashSet<>();
		disp.addAll(data1);
		for (Object integer1 : disp) {
			System.out.println(integer1);
		}
	}
}
