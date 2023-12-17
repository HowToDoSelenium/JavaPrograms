package programs_50;

public class Num_Count {
	public static void main(String[] args) {
		long count = 0, num = 67899;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Number of digits: " + count);
	}
}



