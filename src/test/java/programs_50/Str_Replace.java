package programs_50;

import java.util.Arrays;

public class Str_Replace {
	public static void main(String[] args) {
//		String str = "Welcome";
//		String str1 = "java";
//		System.out.println(str + " " + str1);
//		System.out.println(str.replace(str, str1) + " " + str.replace(str1, str));
//		

		/* Driver Code */

		String text = new String("Hello, My name is Sachin");
		String[] sentences = text.split("\\.");
		System.out.println(Arrays.toString(sentences));
	}
}
