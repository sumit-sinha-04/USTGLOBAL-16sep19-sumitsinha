
public class TestA {
	
	public static int add(int a,int b)
	{
		System.out.println("a+b");
return a+b;
	}
	public static int add(int a,int b)
	{
		System.out.println(a+b);

return a+b;
	}
	
	public int multiply(int a,int b)
	{
		System.out.println("multiply method");
		 return a+b;
    }
	
	public int multiply(double a,int b)
	{
		System.out.println("multiply method");
		 return a+b;
    }
	public  static void main( int a)
	{
		
		System.out.println("value of a is "+a);
		
	}
	
	public static void main(String[] args) {
		
int	c=	add(10,12);
		double d =add(78,93);
	System.out.println(c);
	System.out.println(d);
		
	main(20);
	}

}
