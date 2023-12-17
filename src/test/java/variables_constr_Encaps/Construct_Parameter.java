package variables_constr_Encaps;

public class Construct_Parameter {
	String str = "Hi";

	Construct_Parameter(String a) {
		this.str = "Welcome";
		int i = 1;
		System.out.println(a);
		System.out.println(i);
	}

	Construct_Parameter() {
		System.out.println("Default Constructor");
	}

	Construct_Parameter(int b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		Construct_Parameter data1 = new Construct_Parameter();
		Construct_Parameter data2 = new Construct_Parameter("Java" + " String parameter Constructor");
		Construct_Parameter data3 = new Construct_Parameter(5 + " Int parameter Constructor");
		System.out.println(data3.str);
		System.out.println(data1.str + " Access instance variable");
		System.out.println(data2.str); // executes local variable first
	

	}
}
