package programs_50;

public class Str_Reverse_Method {
	public static void main(String[] args) {
		String str = "Geeks hi bye";
		StringBuilder str1 = new StringBuilder(str);
		StringBuilder reverse = str1.reverse();
		System.out.println(str);
		System.out.println(reverse);
	}
}