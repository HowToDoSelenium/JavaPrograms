package programs_50;

public class Armstrong_Count {
	public static void main(String[] args) {
		int count = 0;
		for (int originalNum = 1; originalNum <= 1000; originalNum++) {
			int temp, remainder, result = 0;
			temp = originalNum;
			while (temp != 0) {
				remainder = temp % 10;
				result = result + (remainder * remainder * remainder);
				temp = temp / 10;
			}
			if (result == originalNum) {
				count++;
			}
		}
		System.out.println(count);
	}
}
