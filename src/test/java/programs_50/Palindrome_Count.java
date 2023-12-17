package programs_50;

public class Palindrome_Count {
	public static void main(String[] args) {
		int count = 0;

		for (int input = 1; input <= 1000; input++) {
			int output = 0;
			int temp, rem;
			temp = input;
			while (temp > 0) {
				rem = temp % 10;
				output = (output * 10) + rem;
				temp = temp / 10;
			}
			if (input == output) {
				count++;
			}
		}
		System.out.println(count);
	}
}
