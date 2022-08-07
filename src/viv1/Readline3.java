package viv1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Readline3 {

	public static void main(String[] args) throws IOException {
		
		File file = new File ("C:\\\\Users\\\\Vivek K M\\\\Notepad\\\\Marks.txt");
		BufferedReader buf= new BufferedReader(new FileReader(file));
		
		String Ab;
		while((Ab=buf.readLine())!=null)
		{
		String [] str = Ab.split(",");
		
		for(String a: str)
		
			System.out.println(a);
	}

}}
