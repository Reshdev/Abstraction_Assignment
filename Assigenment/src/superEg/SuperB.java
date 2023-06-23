package superEg;

public class SuperB extends SuperA{
	public void display()
	{    // print();         // or  Super.print();
		System.out.println("SUPER JAVA");
		System.out.println(super.a);
		
	}

	public static void main(String[] args) {
		SuperB ob=new SuperB();
		ob.display();
		// TODO Auto-generated method stub

	}

}
