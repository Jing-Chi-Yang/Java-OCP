package oo4_Test1;

import oo4.TestModifier;

public class ch07_04_Test {

	public static void main(String[] args) {
		//類別如果跨package,必須import
		TestModifier t1 = new TestModifier();
		System.out.println(t1.publicValue);
		//System.out.println(t1.protectedValue);
		
		System.out.println("=================");
		
		Test1 t2 = new Test1();
		t2.printValue();
	}

}
