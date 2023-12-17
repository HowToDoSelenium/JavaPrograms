package oops_Concepts;

public class ML_Child_Class implements ML_Interface1, ML_Interface2 {

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("Interface 1");
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("Interface 2");
	}

	public void child() {
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		ML_Child_Class data = new ML_Child_Class();
		data.interface1();
		data.interface2();
		data.child();
	}
}
