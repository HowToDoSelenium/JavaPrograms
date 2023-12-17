package programs_50;

public class Palindrome_Print_100 {
	public static void main(String[] args) {
		
		for (int input = 1; input <= 100; input++) {
			int output = 0;
			int temp, rem;
			temp = input;
			while (temp > 0) {
				rem = temp % 10;
				output = (output * 10) + rem;
				temp = temp / 10;
			}
			if (input == output) {
				System.out.println(input + " is Palindrome Number");
			}
		}
	}
}
