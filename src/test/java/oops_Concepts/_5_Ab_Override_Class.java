package oops_Concepts;

public class _5_Ab_Override_Class extends _5_Ab_Parent_Class {

	@Override
	void test1() {
		System.out.println("Method 1 in Ab class");
	}
	@Override
	void test2() {
		super.normal();
		System.out.println("Method 2 in Ab class");
	}
	
	public static void main(String[] args) {
		_5_Ab_Override_Class data = new _5_Ab_Override_Class();
		data.test1();
		data.test2();
	}
}
