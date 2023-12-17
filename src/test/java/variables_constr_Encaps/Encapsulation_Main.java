package variables_constr_Encaps;

public class Encapsulation_Main extends Encapsulation_sub {
	public static void main(String[] args) {
		Encapsulation_Main data = new Encapsulation_Main();
		data.setEmpName("Praveen");
		data.setBloodgroup("Positive");
		data.setDob(16121990);
		data.setPhoneNum(9962727182l);
		System.out.println(data.getEmpName());
		System.out.println(data.getBloodgroup());
		System.out.println(data.getDob());
		System.out.println(data.getPhoneNum());
	}

}
