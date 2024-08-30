package oo2;

public class Test2 extends Test1{
	Test2(){
		//預設建構式
		//super(){
		//}
		//**********super()可呼叫父類別建構式
		//this("10");
		System.out.println("Test2()");
	}
	Test2(String msg){
		super(10);
		System.out.println("Test2(String msg)");
	}
	Test2(int value1, String msg){
		super(msg,value1);
		System.out.println("Test2(int value1, String msg)");
	}
}



//this(),super()只能放在建構式裡面,且只能放在第一行
//ex. (O)
	//super();
	//System.out.println("Test2()");

//ex. (X)
	//System.out.println("Test2()");
	//super();

//this()：存取 本身類別 的成員（資料成員、函數成員、建構元）
//super()：存取 父類別 的成員（資料成員、函數成員、建構元）
//super. ---------->呼叫父類別的方法,屬性














