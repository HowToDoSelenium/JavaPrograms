package programs_50;

import java.util.Scanner;

public class Student_Grade {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner data = new Scanner(System.in);
		System.out.println("Enter Mark");
		int nextInt = data.nextInt();
		if (nextInt > 100) {
			System.out.println("Enter eligible mark");
		} else if (nextInt <= 100 && nextInt <= 90) {
			System.out.println("Grade A");
		} else if (nextInt < 90 && nextInt <= 80) {
			System.out.println("Grade B");
		} else if (nextInt < 80 && nextInt <= 70) {
			System.out.println("Grade C");
		} else if (nextInt < 70 && nextInt <= 60) {
			System.out.println("Grade D");
		} else if (nextInt <= 59) {
			System.out.println("Fail");
		}
	}
}