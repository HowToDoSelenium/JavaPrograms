package programs_50;

public class Str_Seperate {
	public static void main(String[] args) {
//		String str = "welcome to 2022";
//		char[] charArray = str.toCharArray();
//		for (char string : charArray) {
//			System.out.println(string);
//		}

		String str = "Java@#123";
		String alpha = "";
		String number = "";
		String sp_character = "";

		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);

			if (Character.isAlphabetic(temp)) {
				alpha = alpha + temp;

			} else if (Character.isDigit(temp)) {
				number = number + temp;

			} else {
				sp_character = sp_character + temp;
			}
		}
		System.out.println("Character: " + alpha);
		System.out.println("Number: " + number);
		System.out.println("Special character: " + sp_character);
	}
}
