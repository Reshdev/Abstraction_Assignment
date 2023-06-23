package exceptionAssign;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			int num=23/0;
		}
		catch (Exception e){
		System.out.println(e);
			
		}
		int a=34;
		int b=45;
		int m=a+b;
		System.out.println(m);
		// TODO Auto-generated method stub

	}

}
