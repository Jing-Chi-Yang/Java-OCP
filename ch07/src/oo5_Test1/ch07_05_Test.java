package oo5_Test1;

import oo5.TestModifier;
import oo5.Test1;
import oo5.Test2;
import oo5.Test3;

public class ch07_05_Test {

	public static void main(String[] args) {
		
		TestModifier t1 = new TestModifier();
		t1.testPublic();
		
		System.out.println("===============");
		
		Test1_1 t2 = new Test1_1();
		t2.testPrint();
		
		Test1 t3 = new Test1();
		
	  //protected & default 無法跨package
	  //Test2 t3 = new Test2();
		
		MyClass t4 = new MyClass();
		
	  //Test3 t5 = new Test3();
		
		

	}

}
