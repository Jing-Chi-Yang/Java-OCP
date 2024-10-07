package override;

public class Ch09_4 {

	public static void main(String[] args) {
		
		Test1 t1 = new Test2();
		try {
			t1.testException(true);
		}catch(MyException ex) {
			System.out.println(ex);
		}
		
//		Test2 t2 = new Test2();
//		try {
//			t2.testException(true);
//		}catch(MyException ex) {	//出錯了!因為在Test2裡面若為第三組testException	
//			System.out.println(ex); //裡面沒有東西需要拋出,因此不需要catch!
//		}
		
		Test2 t2 = new Test2();
		t2.testException(true);
		
		
		
		

	}

}
