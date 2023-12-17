package programs_50;

public class Num_Asc_Des_2_Arr {

	public static void main(String[] args) {
		int a[] = { 10, 100, 90, 20, 40 }, temp;
		int b[] = new int[a.length - 1];
		
		for (int i = 0; i < a.length - 1; i++) {
			b[i] = a[i] - a[i + 1];
			System.out.println(b[i]);
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] < b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " after");
		}
		System.out.println("Max no: " + b[0]);
		System.out.println("min no: " + b[b.length - 1]);
	}
}
