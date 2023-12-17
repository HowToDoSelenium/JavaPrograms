package variables_constr_Encaps;


public class HiStatic {
	static int a; // class/static variable
	int b = 9; // instance variable
	
	

	public static void display() {
		String str = "Hello"; // local variable
		System.out.println(str);
	}
	public  void displaynonststic() {
		String str = "Hello"; // local variable
		System.out.println(str);
	}

	static {
		System.out.println("Static block"); // static block
	}

	HiStatic() {
		System.out.println("cons");
	}

	public static void main(String[] args) {

		HiStatic obj = new HiStatic();
		display();
		System.out.println(a);
		System.out.println(obj.b);

	}
}

