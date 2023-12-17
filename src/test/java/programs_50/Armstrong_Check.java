package programs_50;

public class Armstrong_Check {
	public static void main(String[] args) {
		int input = 151;
		double output = 0;
		int temp, temp2, rem;
		temp = input;
		temp2 = input;
		int count = 0;

		while (temp2 > 0) {
			temp2 = temp2 / 10;
			count++;
		}
		while (temp > 0) {
			rem = temp % 10;
			output = output + Math.pow(rem, count);
			temp = temp / 10;
		}
		if (output == input)
			System.out.println(input + " is an Armstrong number.");
		else
			System.out.println(input + " is not an Armstrong number.");
	}
}
