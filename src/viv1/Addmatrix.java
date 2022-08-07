package viv1;

public class Addmatrix {
	
	public static void main(String args[]) {
		
		int a[][]= {{4,2},{6,4},{3,7}};
		int b[][]= {{3,4},{2,5},{9,5}};
		int c[][]= new int[3][3];
		
		System.out.println("The sum of arrays is:");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				
				System.out.println("c["+i+"]["+j+"]="+c[i][j]);
				
			}
		
			
		}
	}

}
