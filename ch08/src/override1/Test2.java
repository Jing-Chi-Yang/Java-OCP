package override1;

public class Test2 extends Test1{
	
	//採用Override來檢查此函式是不是被覆寫了
	
	//只能是public
	@Override
	public void testPublic(){
		System.out.println("public Test2");
	}
	
	//可以用public protected         可以越來越廣
	@Override
	protected void testProtected(){
		System.out.println("protected Test2");
	}
	
	//可以用public protected default 可以越來越廣
	@Override
	void testDefault(){
		System.out.println("Default Test2"); 
	}
	
//	@Override
//	private void testPrivate(){
//		System.out.println("Private Test2"); 
//	}
	

}
