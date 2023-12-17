package variables_constr_Encaps;

public class String_Buffer {
	public static void main(String[] args) {
		String str1 = "Welcome";
		StringBuffer obj = new StringBuffer(str1);
		System.out.println(obj.append(" java"));
		System.out.println(obj.insert(7, " Selenium"));
		System.out.println(obj.reverse());
		System.out.println(obj.lastIndexOf("e"));
	}
}
