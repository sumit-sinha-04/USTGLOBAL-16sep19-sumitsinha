public class Employee1 {
	String ename;
	int eid;
	public  Employee1(String ename , int eid ) {
		this.ename=ename;
		this.eid=eid;
	}
	void printDetails() {

		System.out.println("ename is"+ename);
		System.out.println("age is"+eid);
		this.sayHello();
	}
	void sayHello() {

		System.out.println("hello"+ename+"welocome to ust global" );

	}
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("rashmika",143);
		e1.printDetails();
		Employee1 e2 = new Employee1("manasi",111);
		e2.printDetails();
		Employee1 e3 = new  Employee1("chacha",69);
		e3.printDetails();
	}

}
