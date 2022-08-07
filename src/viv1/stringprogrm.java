package viv1;

public class stringprogrm {
	
	public static void main(String args[]) {
		
		String a= "   welcome ";
		String b= "JavaSelenium";
		String c= "WELCOME";
		String d="JAVASELENIUM";
		
		System.out.println(b.length());
		System.out.println(c.concat(b));
		System.out.println(a.trim());
		System.out.println(b.charAt(4));
		System.out.println(b.contains("java"));
		System.out.println(b.contains("Java"));
		System.out.println(a.equals(c));
		System.out.println(b.equalsIgnoreCase(d));
		System.out.println(c.replace('L','T'));
		System.out.println(b.replace("Java", "Python"));
		System.out.println(b.substring(4,9));
		System.out.println(b.toUpperCase());
		System.out.println(c.toLowerCase());
	}

}
