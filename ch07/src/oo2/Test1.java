package oo2;

public class Test1 {
	Test1(){
		this(10);
		System.out.println("Test1()");
	}
	Test1(int value){
		this("msg",20);
		System.out.println("Test1(int value)");
	}
	Test1(String msg, int value1){
		System.out.println("Test1(String msg, int value1)");
	}

}
