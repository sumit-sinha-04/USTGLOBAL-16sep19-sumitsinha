package java8predicate;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
		
		
		Predicate<Employee> p = e->
		{
			
			
			if(e.salary>100000)
			System.out.println("he is maanger");
			else
				System.out.println("he is coder");
	
		};
		
		Employee e = new Employee(1, "suresh", 15000);
		
		
		
		
		
	}
}
