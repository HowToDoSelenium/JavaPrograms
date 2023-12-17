package dataTypes;

public class NonPrimitiveDataType {
	public static void main(String[] args) {
		// Two Ways of creating String data type
		String str = "String will reuse the object multiple times";
		System.out.println("Type 1 String: " + str);
		// Using new key word
		String str1 = new String("String will create new object everytime");
		System.out.println("Type 2 String using new keyword: " + str1);

		// In a single variable we can store multiple values-------Arrays
		// arrays store similar data types, fixed size, Memory wastage is high
		// To overcome these we go for collections

		int arr[];
		arr = new int[4]; // int[] arr=new int[4] another menthod to declare array
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		System.out.println(arr); // finds memory location
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		String arr1[];
		arr1 = new String[4];
		arr1[0] = "One";
		arr1[1] = "Two";
		arr1[2] = "Three";
		arr1[3] = "Four";
		arr1[1] = "TWO overrites Two";
		int len = arr1.length; // to find the length
		System.out.println(arr); // memory location
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println("Array lenth : " + len);

	}
}
