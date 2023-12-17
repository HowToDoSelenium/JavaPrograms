package dataTypes;

import java.util.Scanner;

public class TernaryOperators {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner get = new Scanner(System.in);
		System.out.println("Enter the value 1: ");
		int data = get.nextInt();
		System.out.println("Enter the value 2: ");
		int data1 = get.nextInt();
		System.out.println("Value 1:" + data);
		System.out.println("Value 2:" + data1);
		int result;
		result = data < data1 ? data : data1;
		System.out.println("Lesser Value is: " + result);
		if (data < data1) {
			result = data;

		} else {
			result = data1;
		}
		System.out.println("Lesser Value is: " + result);
	}
}
