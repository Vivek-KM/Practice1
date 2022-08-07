package viv1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mathtable {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file =  new File ("C:\\Users\\Vivek K M\\Notepad\\Mathtable.txt");
		Scanner scan= new Scanner(file);
		
	    int n1=scan.nextInt();
		int n2=scan.nextInt(); 
		
		int i;
		int j;
		int prod;
		for(i=n1;i<=n2;i++)
		{
			System.out.println();
			System.out.println("Table of"+" "+i+":");
			for(j=1;j<=10;j++)
			{
				prod= i*j;
				System.out.println(i+"*"+j+"="+prod);
			}
		}
	}
}
