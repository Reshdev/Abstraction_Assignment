package exceptionAssign;

public class TryFinally {
	public void print()
	{
		try {
			int g=25/0;// without handled arithmetic error
	        }
		finally {System.out.println("finally block is executed");}
		
	}

	public static void main(String[] args) {
		TryFinally ob=new TryFinally();
		ob.print();
		// TODO Auto-generated method stub

	}

}
