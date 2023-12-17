package programs_50;

public class Num_Reverse {
	public static void main(String[] args) {
		int originalNum = 1234;
		int output = 0, rem, temp;
		temp = originalNum;
		while (temp > 0) {
			rem = temp % 10;
			output = (output * 10) + rem;
			temp = temp / 10;
		}
		System.out.println(output);
		
	}
}
