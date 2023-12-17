package variables_constr_Encaps;

public class Varaibles_Demo {
	static int a; // class/static variable
	int b = 9; // instance variable

	public static void display() {
		String str = "Hello"; // local variable
		System.out.println(str);
	}

	static {
		System.out.println("Static block"); // static block
	}

	Varaibles_Demo() {
		System.out.println("cons");
	}

	public static void main(String[] args) {

		Varaibles_Demo obj = new Varaibles_Demo();
		display();
		System.out.println(a);
		System.out.println(obj.b);

	}
}
