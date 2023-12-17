package programs_50;

public class Num_Sum {
	public static void main(String[] args) {
		int input = 147, temp;
		int output = 0;
		while (input > 0) {
			temp = input % 10;
			output = output + temp;
			input = input / 10;
		}
		System.out.println("Sum of Digits:" + output);
	}
}
