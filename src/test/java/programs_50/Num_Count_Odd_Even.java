package programs_50;

public class Num_Count_Odd_Even {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) { // For even Count
			if (i % 2 == 1) {
				count++;
			}
		}
		System.out.println("Count of Odd numbers "+ count);
	}
}
