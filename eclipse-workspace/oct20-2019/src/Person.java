public class Person {
String name;
int age;

Person (String pname, int page)
{
name=pname;
age=page;


}

void printDetails() {
	
System.out.println("ename is"+name);
System.out.println("age is"+age);
	
}


public static void main(String[] args) {
	Person p = new Person("jalebibai", 20);
	p.printDetails();
	Person p1 = new Person("mia",60);
	p1.printDetails();
Person p2 = new Person("sunny",25);
p2.printDetails();
}
}

