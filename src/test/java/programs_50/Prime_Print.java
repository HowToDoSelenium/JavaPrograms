package programs_50;

import java.util.ArrayList;

public class Prime_Print {
//	public static void main(String[] args) {
//		for (int i = 2; i <= 100; i++) {
//			boolean isPrime = true;
//			for (int j = 2; j < i; j++) {
//				if (i % j == 0) {
//					isPrime = false;
//				}
//			}
//			if (isPrime) {
//				System.out.println(i);
//			}
//		}
//	}
	public static void main(String[] args) {
		
		ArrayList<String> one=new ArrayList<>();
		ArrayList<String> two=new ArrayList<>();
		one.add("1");one.add("11");one.add("12");one.add("9");
		two.add("1");two.add("11");two.add("o");two.add("5");
		one.retainAll(two);
		System.out.println(one);
		
	}
}
