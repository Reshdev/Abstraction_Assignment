package uncheckedException;

public class Array {
	
	public static void main(String[] args) {
		float a[][]=new float [2][2];
		  a[0][0]=2.6f;
		  a[0][1]=3.2f;
	      a[1][0]=5.9f;
		  a[1][1]=7.8f;
		  a[2][0]=2.4f;
		  for(int i=0;i<2;i++)
		  {
			  for(int j=0;j<2;j++)
			  {
				  System.out.print(a[i][j] +" ");
			  }
			  System.out.println();
		  }// TODO Auto-generated method stub

	}

}
