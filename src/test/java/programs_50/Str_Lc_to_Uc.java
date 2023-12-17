package programs_50;

public class Str_Lc_to_Uc {
	public static void main(String[] args) {
		String str = "Praveen Kumar";
		StringBuilder build = new StringBuilder(str);

		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (Character.isLowerCase(charAt)) {
				build.setCharAt(i, Character.toUpperCase(charAt));
			} else {
				build.setCharAt(i, Character.toLowerCase(charAt));
			}
		}
		System.out.println(build.toString());
	}
}
