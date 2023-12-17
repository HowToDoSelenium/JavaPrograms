package dataTypes;

public class UnaryOperators {
	public static void main(String[] args) {
		int result = +1;
		System.out.println("Increments by 1 = " + result);
		result--;
		System.out.println("Deccrements by 1 = " + result);
		result++;
		System.out.println("Makes the result to Positive = " + result);
		result = -result;
		System.out.println("Makes the result to Negative = " + result);
		boolean sucesss = false;
		System.out.println(sucesss);
		System.out.println(!sucesss);

		System.out.println("");
		System.out.println("Pre Post Method");
		int i = 3;
		System.out.println("Value of i= " + i);
		i++; // post increment method asign first increment later
		System.out.println("Value of i is assigned first and incremented later by 1 = " + i);
		++i; // pre increment method increment first assign later
		System.out.println("value i is incremented first and assigned later by 1 = " + i);
		System.out.println(" result = " + i);
		System.out.println(" pre increment = " + ++i);
		System.out.println(" post increment = " + i++);
		System.out.println(" post increment = " + i++);
		System.out.println(" post increment = " + i++);

	}
}
