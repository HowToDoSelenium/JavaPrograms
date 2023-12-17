package oops_Concepts;

public class _3_Heir_Child2 extends _3_Hier_Parent {
	public void child2() {
		System.out.println("Child Class 2");
		super.parent();
	}

	public static void main(String[] args) {
		_3_Heir_Child2 data = new _3_Heir_Child2();
		data.child2();
	}
}
