package inheritance;

public class ChildA extends ParentA{
public void print()
{
	int a=10;
	int b=13;
	int c=a+b;
	System.out.println(c);
	
	}
	public static void main(String[] args) {
		ChildA obj=new ChildA();
		obj.display();
		obj.print();
		// TODO Auto-generated method stub

	}

}
