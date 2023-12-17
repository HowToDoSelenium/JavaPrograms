package programs_50;

public class Palindrome_Check {
	public static void main(String[] args) {
		int input = 141;
		int output = 0, temp, rem;
		temp = input;
		while (temp > 0) {
			rem = temp % 10;
			output = (output * 10) + rem;
			temp = temp / 10;
		}
		
		if (input == output) {
			System.out.println(input + " is a Palindrome");
		} else {
			System.out.println(input + " is Not a Palindrome");
		}
	}
}
