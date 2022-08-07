package viv1;

import java.util.Scanner;

public class Alphabeta {

	public static void main(String[] args) {
	
		System.out.println("Enter the string in uppercase: ");
		Scanner scan=new Scanner(System.in);
		
		String str=scan.next();
		String x ="";
		System.out.println("Original string: "+str);
		x+=str.replaceAll("A","Alpha").replaceAll("B", "Beta");
		System.out.print("Replaced string: "+x);
	}
}