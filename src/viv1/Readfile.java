package viv1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Readfile {

	public static void main(String[] args) throws IOException {
		
		File file= new File("C:\\Users\\Vivek K M\\Notepad\\Marks.txt");
	
	    //BufferedReader br= null;
	          //try
	    {
	   BufferedReader br= new BufferedReader( new FileReader(file));
	    		
	    String st;
	    while((st=br.readLine())!=null)

	    System.out.println(st);
	    }
	       /* catch(FileNotFoundException e)
	    {
	    	System.out.println(e);
	    }
	    catch(IOException e)
	    {
	    	System.out.println(e);
	    }*/

	}


}
