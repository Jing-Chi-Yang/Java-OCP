package oo3;

public class ch07_3 {

	public static void main(String[] args) {
		Test1 t1 = new Test1("Hello 1");
		t1.printInfo(); 
		
		System.out.println("==================");
		
		Test2 t2 = new Test2();
		t2.printInfo();
		
		System.out.println("==================");
		
		Test2 t3 = new Test2("Hello 2");
		t3.printInfo();
		
		System.out.println("==================");
		
		Test1 t4 = new Test2("Hello 3"); //父 子  o 
		t4.printInfo();
		
	  //Test2 t5 = new Test1("Hello"); //子 父  x
	  //t5.printInfo();
	}

}
