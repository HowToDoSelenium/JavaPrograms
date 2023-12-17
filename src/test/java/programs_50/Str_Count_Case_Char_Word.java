package programs_50;

public class Str_Count_Case_Char_Word {
	public static void main(String[] args) {
		String str = "Welcome Java 2021";
		String[] split = str.split(" ");
		int lc=0, uc = 0, digit = 0, space = 0;
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (Character.isUpperCase(charAt)) {
				uc++;
			} else if (Character.isLowerCase(charAt)) {
				lc++;
			} else if (Character.isDigit(charAt)) {
				digit++;
			} else {
				space++;
			}
		}
		System.out.println("Len " + split.length);
		System.out.println("Upper " + uc);
		System.out.println("Lowe " + lc);
		System.out.println("Digits " + digit);
		System.out.println("Space " + space);
	}
}
