 class AssignmentExample {
private void m1()
{
	
System.out.println("this is m1");

}

 class B extends AssignmentExample
{
private void m1()
{
	
System.out.println("this is m2");
}
}



 public class C extends B
{
	
public static void main(String[] args) {
	
	B b = new B();
	
	b.m1();
}


}



