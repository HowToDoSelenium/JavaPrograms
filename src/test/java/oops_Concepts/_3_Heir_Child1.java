package oops_Concepts;

public class _3_Heir_Child1 extends _3_Hier_Parent {
	public void child_1() {
		System.out.println("Child Class 1");
		super.parent();
	}

	public static void main(String[] args) {
		_3_Heir_Child1 data = new _3_Heir_Child1();
		data.child_1();
	}

}
