package programs_50;

public class Num_Sum_Odd_Even {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) { // For even Sum
			if (i % 2 == 1) {
				count = count + i;
			}
		}
		System.out.println(count);
	}
}
