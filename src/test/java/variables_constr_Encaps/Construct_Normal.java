package variables_constr_Encaps;

public class Construct_Normal {
	int a;
	String b;

	Construct_Normal() {
		a = 10;
		b = "Hello";
		System.out.println("Constructor is invoked when an object reference is created.");
	}

	void normalmethod() {
		System.out.println("Normal method executes last");
	}

	public static void main(String[] args) {
		Construct_Normal data = new Construct_Normal();
		data.normalmethod();
		System.out.println(data.a);
		System.out.println(data.b);
	}
}
