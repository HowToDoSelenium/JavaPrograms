package programs_50;

public class Factorial {
	public static void main(String[] args) {
		long count = 1;
		for (int i = 1; i <= 5; i++) {
			count = count * i;
		}
		System.out.println("Factorial of " + 5 + " is " + count);
	}
}
