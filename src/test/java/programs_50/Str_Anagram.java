package programs_50;

import java.util.Arrays;

public class Str_Anagram {
	public static void main(String[] args) {
		String a1 = "race";
		String a2 = "care";
		char[] charArray1 = a1.toCharArray();
		char[] charArray2 = a2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if (a1.length() == a2.length()) {
			boolean output = Arrays.equals(charArray1, charArray2);
			if (output) {
				System.out.println("Anagram");
			}
		} else {
			System.out.println("Not Anagaram");
		}
	}
}
