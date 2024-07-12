package ch04;

public class EXAM3 {
	
	static void test1(int i1, int i2) {
		System.out.println("Test Int Int!");
	}
	static void test1(float f1, float f2) {
		System.out.println("Test Float Float!");
	}
	
	static void test2(float f1, int i2) {
		System.out.println("Test Float Int!");
	}
	static void test2(int f1, float f2) {
		System.out.println("Test Int Float!");
	}
	
	static void test3(float f1, int i2) {
		System.out.println("Float Int!");
	}
	static void test3(Integer f1, float f2) {
		System.out.println("Integer Float!");
	}
	
	
	public static void main(String[] args) {
		
		test1(3,5);
		test1(3.3f,5);
		
		//test2(5,6);      //test2兩個都可以就會出錯，系統不知道要給誰
		test2(5f,6);	   //明確要給誰就ok
		
		test3(10,5);	   //有基本型態會先選基本型態	   
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
