package exceptionAssign;

public class ThrowAssign {
	public static void display(int mark){
		if(mark<40) 
		{
			throw new ArithmeticException("fail");
		}
		else 
		{
			System.out.println("pass");
		}
		
	}

	public static void main(String[] args) {
		display(34);
		// TODO Auto-generated method stub

	}

}
