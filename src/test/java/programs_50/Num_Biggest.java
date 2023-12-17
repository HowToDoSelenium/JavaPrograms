package programs_50;

public class Num_Biggest {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4 };
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(max);
	}
}
