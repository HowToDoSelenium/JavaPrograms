package oops_Concepts;

public class _4_Poly_Overload {

	public void overload(String a) {
		System.out.println(a);
	}

	public void overload(int b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		_4_Poly_Overload obj = new _4_Poly_Overload();
		obj.overload("Overloads string parameter");
		obj.overload(1);
	}
}
