package viv1;

public class Replace {
	
	public static void main(String args[])
	{
		String a="ABCD";
		char α;     //Alpha
		char β;     //Beta
		char δ;     //Delta
		
		System.out.println("Original string: "+a);
		 for (int i=0;i<a.length();i++)
        {
           a=a.replace('A', 'α');    
           a=a.replace('B', 'β');
           a=a.replace('D', 'δ'); 
        	 	
        }
		 System.out.println("Replaced string: "+a);
}
}



