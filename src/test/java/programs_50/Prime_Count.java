package programs_50;

public class Prime_Count {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 100; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				count++;
			}
		}
		System.out.println(count);
	}
}
