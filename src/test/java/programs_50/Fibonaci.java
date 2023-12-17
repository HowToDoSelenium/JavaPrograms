package programs_50;

public class Fibonaci {
	public static void main(String[] args) {
		int firstTerm = 0, secondTerm = 1, thirdTerm = 1;
		for (int i = 1; i <= 6; i++) {
			
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
			thirdTerm = firstTerm + secondTerm;
			System.out.print(thirdTerm + " ");
		}
	}
}
