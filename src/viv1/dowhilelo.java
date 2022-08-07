package viv1;

import  java.util.Scanner;

public class dowhilelo {
	
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int i= sc.nextInt();
			
		do
		{
			System.out.println("Number is=" +i);
			i=i+2;
		} while(i<=10);
	}

}
