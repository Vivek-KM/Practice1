package viv1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class Readfile2 {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("C:\\Users\\Vivek K M\\Notepad\\Marks.txt");
		Scanner scan = new Scanner(file);
		String[] str = null;
		System.out.println("Name " + "\t" + "Gender " + "\t" + "Reg_Number " + "\t" + "English " + "\t" + "Maths     "
				+ "\t" + "Physics " + "\t" + "Chemistry" + "\t" + "Biology " + "\t" + "Result ");

		while (scan.hasNextLine()) {
			String Ab = scan.nextLine();
			str = Ab.split(","); 
			for (int j = 0; j < 1; j++) {
				System.out.println(str[j] + "\t" + str[j + 1] + "\t" + str[j + 2] + "\t" +
						str[j + 3] + "\t" + str[j + 4] + "\t" + str[j + 5] + "\t" + str[j + 6] + "\t" + str[j + 7]
						+ "\t" + str[j + 8]);
	}
 }			
}	
}