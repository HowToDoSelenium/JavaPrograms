package loop_conditional;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner get = new Scanner(System.in);
		System.out.println("Enter the Mark: ");
		Double data = get.nextDouble();
		System.out.println("Your Mark: " + data);
		char grade = 0;
		if (data >= 101) {
			System.out.println("Enter valid Mark");
		} else {
			if ((data >= 90) & (data <= 100)) {
				grade = 'A';
			} else if ((data >= 70) && (data <= 80)) {
				grade = 'B';
			} else if ((data >= 60) & (data <= 70)) {
				grade = 'C';
			} else if ((data >= 50) & (data <= 60)) {
				grade = 'D';
			} else if ((data >= 40) & (data <= 50)) {
				grade = 'E';
			} else {
				grade = 'F';
			}
			System.out.println("Grade: " + grade);
		}
	}
}
