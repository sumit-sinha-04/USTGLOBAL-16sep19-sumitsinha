package com.ustglobal.Arrays;

public class TestB {

	 static int[] getArray()
	 {
	 	int[] values = {10,20,30,40,50};

	 	return values;
	 }

public static void main(String[] args) {
	
	int[] nums= {10,20,30,40,50};
try {
	System.out.println(nums[10]);	
	}
	
 
catch (Exception e) {
	System.out.println("exception");
 
}
 int b[]= getArray();
 for (int i = 0; i < b.length; i++) {
	System.out.println(b[i]);
}
recieve(nums);


}
static void recieve(int [] numbers)
{
for (int i : numbers) {
	System.out.println(i);
}




}

}
 
	
	
	

	

