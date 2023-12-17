package programs_50;

public class Prime_Check {
	public static void main(String[] args) {
		int num = 7;
		boolean isPrime = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("is prime number");
		} else {
			System.out.println("Not a prime number");
		}
	}
}
