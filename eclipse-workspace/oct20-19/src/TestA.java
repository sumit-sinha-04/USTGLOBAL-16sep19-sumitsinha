
public class TestA {

public static void main(String[] args) {
	
	
Pen p = new Pen(); 	
	p.cost=100;
	p.color="blue";
	p.brand="parker";
	
System.out.println("cost is "+p.cost);
System.out.println("color is "+p.color);
System.out.println("brand is "+p.brand);
p.write();
System.out.println("\n");

System.out.println("****************************************************************************");

Van v =new Van();
v.cost=50000;
v.color="silver";

System.out.println("cost of van is"+v.cost);
System.out.println("cost of van is"+v.color);
v.move();
System.out.println("\n");
System.out.println("****************************************************************************");
Van v1 =new Van();
v1.cost=90000;
v1.color="grey";

System.out.println("cost of van is"+v1.cost);
System.out.println("cost of van is"+v1.color);
v1.move();
}


}
