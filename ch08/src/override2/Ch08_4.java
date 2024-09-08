package override2;

import override1.Test1;

public class Ch08_4 {

	public static void main(String[] args) {
		
		Test1 t3 = new Test3();	//用Test1宣告,只能呼叫public
		t3.testPublic();
			
		Test3 t4 = new Test3();	//用Test3宣告,可以呼叫public && protected
		t4.testPublic();
		t4.testProtected();
		
		Test3 obj = (Test3)t3;	//強制轉型
		obj.testPublic();
		obj.testProtected();    //可以呼叫protected了
		
		Test1 t7 = new Test1();
		t7.testPublic();
		
		
	}

}

