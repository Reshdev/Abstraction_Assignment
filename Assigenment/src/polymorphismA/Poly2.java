package polymorphismA;

public class Poly2 extends Poly1{
	public void mul()
	{
		int d=25;
		int e=4;
		int f= d*e;
		super.mul();
		System.out.println("d*e= " +f);
	}

	public static void main(String[] args) {
		Poly2 ob=new Poly2();
		ob.mul();
		
		// TODO Auto-generated method stub

	}

}
