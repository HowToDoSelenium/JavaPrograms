package programs_50;

public class Armstrong_Print_100 {
	public static void main(String[] args) {
		for (int originalNum = 1; originalNum <= 1000; originalNum++) {
			int temp, remainder, result = 0;
			temp = originalNum;
			while (temp != 0) {
				remainder = temp % 10;
				result = result + (remainder * remainder * remainder);
				temp = temp / 10;
			}
			if (result == originalNum) {
				System.out.println(originalNum + " is Armstrong Number ");
			}
		}
	}
}
