package dataTypes;

public class DataTypeConversions {
	public static void main(String[] args) {
		// Implicit Data Type Conversion
		// smaller box fits into larger box
		// smaller range values stores into larger value data type
		System.out.println("Implicit Data Type Conversion");
		int a = 130;
		System.out.println("Int Representation: " + a);
		long l = a;
		System.out.println("Long Representation: " + l);
		float f = l;
		System.out.println("Float Representation: " + f);
		// Explicit Data Type Conversion
		// larger range values stores into smaller value data type
		System.out.println("Explicit Data Type Conversion");
		double d = 50.50;
		System.out.println("Double Representation: " + d);
		float f1 = (float) d;
		System.out.println("Double to Float Representation: " + f1);
		long l1 = (long) f1;
		System.out.println("Float to Long Representation: " + l1);
		int i1 = (int) (l1);
		System.out.println("Long to Int Representation: " + i1);

	}

}
