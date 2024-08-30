package oo4_Test1;

import oo4.TestModifier;

public class Test1 extends TestModifier{
	public void printValue(){
		System.out.println(this.protectedValue);
		System.out.println(this.publicValue);
	  //System.out.println(this.defaultValue);
	}

}
