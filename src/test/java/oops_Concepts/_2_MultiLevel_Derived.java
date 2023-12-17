package oops_Concepts;

public class _2_MultiLevel_Derived extends _2_MultiLevel_Parent {
	int a = 9;

	public void class_3() {
		System.out.println("Child Class");
		System.out.println(super.str);
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		_2_MultiLevel_Derived obj = new _2_MultiLevel_Derived();
		obj.class_3();
		obj.class_2();
		obj.class_1();
	}
}
