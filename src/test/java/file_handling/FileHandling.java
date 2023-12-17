package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class FileHandling {
	public static void main(String[] args) throws IOException {
//		File data = new File("C:\\Users\\Praveen\\eclipse-workspace\\1.Summary\\test");
//		boolean mkdir = data.mkdir();
//		System.out.println("Single folder " + mkdir);
//		
//		long sizeOf = FileUtils.sizeOf(data);
//		System.out.println("Directory size: " + sizeOf);
//
//		File data1 = new File("C:\\Users\\Praveen\\eclipse-workspace\\1.Summary\\test\\1\\2");
//		boolean mkdirs = data1.mkdirs();
//		System.out.println("Double folder " + mkdirs);

		File data2 = new File("C:\\Users\\Praveen\\eclipse-workspace\\1.Summary\\test\\1\\2\\java.txt");
		data2.createNewFile();
//		long sizeOf1 = FileUtils.sizeOf(data2);
//		System.out.println("Txt Sixe: " + sizeOf1);
//
//		boolean exists = data2.exists();
//		if (exists) {
//			String read = FileUtils.readFileToString(data2, "UTF-8");
//			System.out.println("Using String: " + read);
//
//			List<String> read1 = FileUtils.readLines(data2, "UTF-8");
//			for (String string : read1) {
//				System.out.println("Using List: " + string);
//			}
//
//			String string1 = read1.get(1);
//			System.out.println("Get the values using index: " + string1 + '\n');
//
//			StringBuilder disp = new StringBuilder(read);
//			disp.append(11);
//			System.out.println(disp);
//
//		}
		FileInputStream d=new FileInputStream(data2);
		d.toString();
	}
}
