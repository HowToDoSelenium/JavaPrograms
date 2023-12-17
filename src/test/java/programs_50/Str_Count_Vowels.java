package programs_50;

public class Str_Count_Vowels {
	public static void main(String[] args) {
		String str = "aeiuoq";
		String vowels = "";
		String cons = "";
		int vowels_count = 0;
		int cons_count = 0;
		System.out.println("String " + str);
		
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'o' || charAt == 'u') {
				vowels_count++;
				String s = vowels + charAt;
				System.out.println("vowels in a string: " + s);
			} else {
				cons_count++;
				String s = cons + charAt;
				System.out.println("constants in a string: " + s);
			}
		}
		System.out.println("Count of vowels in a string: " + vowels_count);
		System.out.println("Count of constants in a string: " + cons_count);
	}
}
