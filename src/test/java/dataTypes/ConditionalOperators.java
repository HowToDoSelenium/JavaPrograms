package dataTypes;

public class ConditionalOperators {
	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		System.out.println("Only satisfied condtion is executed at console");
		if (a == b) {
			System.out.println("a=b");
		}
		if (a != b) {
			System.out.println("a!=b");
		}
		if (a > b) {
			System.out.println("a>b");

		}
		if (a < b) {
			System.out.println("a<b");

		}
		if (a <= b) {
			System.out.println("a<=b");

		}
		System.out.println("AND OR operators");
		int c = 1;
		int d = 2;
		// use of && left hand expression is false, right hand expression is not evaluated
		// use of & left hand expression is false, right hand expression is also evaluated, irrespective of the output
		if ((c == 1) && (d == 2)) {
			System.out.println("c=d");
		}
		if ((c == 1) || (d == 1)) {
			System.out.println("c=d");
		}

	}
}
