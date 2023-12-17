package oops_Concepts;

public class _1_SI_DerivedClass extends _1_SI_Parent_Class {
	public void derived() {
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		_1_SI_DerivedClass obj = new _1_SI_DerivedClass();
		obj.derived();
		obj.parent();
	}
}
