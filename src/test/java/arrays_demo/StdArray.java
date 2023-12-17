package arrays_demo;

import java.util.Arrays;

public class StdArray {
	public static void main(String[] args) {
		String str[] = new String[5];
		str[0] = "Hi";
		str[1] = "Hi1";
		str[2] = "Hi2";
		str[3] = "Hi3";
		str[4] = "Hi4";
		for (String string : str) {
			System.out.println(string);
		}
		java.util.List<String> disp = Arrays.asList(str);
		System.out.println(disp);
	}
}
