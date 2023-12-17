package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List1 {
	public static void main(String[] args) {
		List<Integer> data1 = Arrays.asList(1, 2, 3, 4, 3, 5, 6, 7, 8, 0, 0);
		List<Integer> data2 = Arrays.asList(11, 22, 33, 44, 55, 66, 0, 0);
		List<Integer> data3 = new ArrayList<>(5);
		data3.add(12);
		data3.add(22);
		data3.add(32);
		data3.add(42);
		data3.add(52);
		data3.add(0);
		data3.add(0);
		System.out.println("Returns index value of an element: " + data1.indexOf(2));
		System.out.println("Returns last index value of an element:" + data1.lastIndexOf(3));
		System.out.println("Returns Element at that index:  " + data1.get(2));
		System.out.println("Element is present or not: " + data1.contains(2));
		System.out.println("List is empty? " + data1.isEmpty());
		System.out.println("Remove the element at that index: " + data3.remove(2));
		System.out.println("Create a sublist: " + data1.subList(0, 3));
		System.out.println("Compares List 1 and List 2: " + data1.containsAll(data2));
		System.out.println("Get size of data: " + data1.size());
		System.out.println("Maximum value: " + Collections.max(data1));
		System.out.println("Maximum value: " + Collections.min(data1));
		System.out.println("Add all elements to another list: " + data3.addAll(data2));
		System.out.println("Updated Data 3 list");
		for (Integer integer : data3) {
			System.out.println(integer);
		}
		System.out.println("Set value 899 at index 2 " + '\n' + "Updated List");
		data1.set(2, 899);
		for (Integer integer1 : data1) {
			System.out.println(integer1);
		}
		System.out.println('\n' + "Sorted the List");
		Collections.sort(data1);
		for (Integer integer1 : data1) {
			System.out.println(integer1);
		}
		System.out.println('\n' + "Reversed the List");
		Collections.reverse(data1);
		for (Integer integer1 : data1) {
			System.out.println(integer1);
		}
		System.out.println("Fill the list with given value");
		Collections.fill(data1, 99);
		for (Integer integer1 : data1) {
			System.out.println(integer1);
		}
		List<List<Integer>> singletonList = Collections.singletonList(data1);
		System.out.println("Immutable List: " + singletonList + '\n');
		System.out.println("Linked List");
		LinkedList<String> disp = new LinkedList<>();
		disp.add("A");
		disp.add("B");
		disp.add("C");
		disp.add("D");
		disp.addFirst("11111");
		disp.addLast("88");
		for (String integer : disp) {
			System.out.println(integer);
		}
		System.out.println(disp.removeFirst());
		System.out.println(disp.removeLast());
		for (String integer : disp) {
			System.out.println(integer);
		}
		System.out.println('\n' + "Vector List");
		List<Integer> disp1 = new Vector<>();
		disp1.add(1);
		disp1.add(11);
		disp1.add(111);
		disp1.add(1111);
		disp1.add(11111);
		disp1.add(1);
		disp1.add(1);
		for (Integer integer : disp1) {
			System.out.println(integer);
		}
	}
}
