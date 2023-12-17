package programs_50;

public class Num_Print_Odd_Even {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) { // For even Print
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}
