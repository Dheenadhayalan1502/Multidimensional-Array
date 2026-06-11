class Matrix
{
	public static void main(String[]args)
	{
	    int a[][]={{1,2},{3,4}};
		int b[][]={{5,6},{7,8}};
		int c[][]=new int[2][2];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print("c["+i+"]"+"["+j+"]"+"="+c[i][j]);
			}
			System.out.println();
			
		}
		
	}
}