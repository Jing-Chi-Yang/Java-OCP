package oo1_EXAM;

public class Test1 {
	Test1(){
		this(20,"Hello");
		System.out.println("Test1()");
	}
	Test1(String msg){
		System.out.println("String msg");
	}
	Test1(int value1, String msg){
		this(msg);
		System.out.println("int value1, String msg");
	}
}


//利用Stack概念
//Test1 t1 = new Test1();
//Stack內部:
//1.	Test1()					print :
//
//2.	Test1(int, String)		print :
//		Test1()
//
//3.	Test1(int, String)		print : String msg
//		Test1()
//
//4.	Test1					print : String msg
//										int value1, String msg
//								
//5.							print : String msg
//										int value1, String msg
//										Test1()
	

//Test1 t2 = new Test1(30,"msg");
//Stack內部:
//1.	Test1(30,"msg")				print : String msg
//
//2.								print : String msg
//											int value1, String msg


















