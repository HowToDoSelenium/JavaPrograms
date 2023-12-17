package programs_50;

public class Palindrome_String {
	public static void main(String[] args) {
		String str = "madam";
		StringBuilder str1 = new StringBuilder(str);
		String reverse = str1.reverse().toString();
		if (str.equals(reverse)) {
			System.out.println(str + " is Palindrome");
		} else {
			System.out.println(str + " is not a Palindrome");
		}
	}

}
