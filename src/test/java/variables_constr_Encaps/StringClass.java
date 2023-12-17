package variables_constr_Encaps;

public class StringClass {
	public static void main(String[] args) {
		String str1 = "Welcome";
		String str2 = "welcome";
		System.out.println("0th index vale is " + str1.charAt(0));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		String concat = str1.concat(str2);
		System.out.println(concat);
		System.out.println(str1.contains("come"));
		System.out.println(str1.contentEquals("welcome"));
		System.out.println(str2.length());
		System.out.println(str2.indexOf("w"));
		System.out.println(str2.replace("come", "hi"));
		System.out.println(str2.substring(3));
		System.out.println(str2.subSequence(0, 4));
		System.out.println(str2.lastIndexOf("e"));
	}
}
