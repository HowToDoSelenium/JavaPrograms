package oops_Concepts;

public class _4_Poly_Override_Child extends _4_Poly_Override_Parent {
	@Override
	void test1(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}
	@Override
	void test2(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}
	public static void main(String[] args) {
		_4_Poly_Override_Child obj = new _4_Poly_Override_Child();
		obj.test1("overridden");
		obj.test2(12);
	}
}
