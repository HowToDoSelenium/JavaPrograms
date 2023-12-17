package variables_constr_Encaps;

public class Super extends Super_2{
	public Super() {
		this("Constructor 2");
		System.out.println("Normal constructor 1");
	}

	public Super(String a) {
		this(20, 10);
		System.out.println(a);
	}

	public Super(int b, int c) {
		super();
		System.out.println(b + c);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Super data = new Super();

	}

}
