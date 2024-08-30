package oo3;

public class Test2 extends Test1{
	
	Test2(){
		super("哈哈哈");
		System.out.println("Test2()");
	}
	
	Test2(String msg){
		super(msg);
	}
	
//	@Override
//	public void printInfo() {
//		System.out.println("Override 測試!");
//		super.printInfo();
//	}
}
