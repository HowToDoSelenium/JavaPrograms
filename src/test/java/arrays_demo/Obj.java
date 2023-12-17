package arrays_demo;

public class Obj {
	public static void main(String[] args) {
		Object a[] = new Object[5];
		a[0] = 'C';
		a[1] = 1;
		a[2] = "hi";
		a[3] = 3.555f;
		a[4] = 99.99999d;
		for (Object object : a) {
			System.out.println(object);
		}
	}
}
