package variables_constr_Encaps;

public class This {
	public This() {
		this("Constructor 2");
		System.out.println("Normal constructor 1");
	}

	public This(String a) {
		this(20, 10);
		System.out.println(a);
	}

	public This(int b, int c) {
		System.out.println(b + c);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		This data = new This();
	}

}
