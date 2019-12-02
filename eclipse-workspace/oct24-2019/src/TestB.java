
public class TestB {

	static int b;
	int a;
	{
		a=10;
		b=20;
		System.out.println("non static block 1");


	}
	public static void main(String[] args) {

		System.out.println("main started");
		TestB  B= new TestB();
		TestB  A= new TestB();		
		System.out.println("main ended");


	}

	{
		int c =0; 
		System.out.println("non static block 2");
	}

}
