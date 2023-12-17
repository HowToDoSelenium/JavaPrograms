package programs_50;

public class Str_Count_Punct {
	public static void main(String[] args) {
		String str = "\"Welcome\" to Java programs'";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (charAt == '.' || charAt == ',' || charAt == ':' || charAt == ':' || charAt == '/' || charAt == '/'
					|| charAt == '?' || charAt == '!' || charAt == '\'' || charAt == '\"')
				count++;
		}
		System.out.println(str);
		System.out.println("Count of Punctuation in a string: " + count);
	}

}
