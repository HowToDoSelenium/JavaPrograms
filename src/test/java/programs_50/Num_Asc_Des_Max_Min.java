package programs_50;

public class Num_Asc_Des_Max_Min {
	public static void main(String[] args) {
		int[] numbers = { 1,99, 77, 4 };
		int temp;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {
//				if (numbers[i] < numbers[j]) {  //Descending 
				if (numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// finding Max and min number in array
		System.out.println();
		System.out.println(numbers[0]);
		System.out.println(numbers[numbers.length - 1]);
	}
}
