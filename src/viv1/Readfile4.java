package viv1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Readfile4 {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("C:\\Users\\Vivek K M\\Notepad\\Marks.txt");
		Scanner scan = new Scanner(file);

		while (scan.hasNextLine()) {
			String Ab = scan.nextLine();
			String str[] = Ab.split(",");

			for (String a : str) {
				System.out.println(a);
			}
		}
	}
}
