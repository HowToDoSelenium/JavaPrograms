package file_handling;

import java.io.File;
import java.io.IOException;

public class _Files {
	public static void main(String[] args) throws IOException {
		File data = new File("C:\\Users\\Praveen\\eclipse-workspace\\1.Summary\\test\\1.ppt");
		
		data.createNewFile();
//		data.delete();
//		data.createNewFile();
//		boolean file = data.isFile();
//		System.out.println(file);
//		String[] listFiles = data.list();
//		for (String file2 : listFiles) {
//			System.out.println(file2);
//		}		
	}
}
