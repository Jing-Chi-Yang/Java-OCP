package override3;

public class Test2 extends Test1{

	public float testFloat() {
		return 10;
	}
	
	public Test2 testObj() {
		return new Test2();
	}
	
   //以下都是參數類型必須一樣才是複寫的測設
   //@Override
   public void testMethod(float value){
     
   }
   
   //@Override
   public void testMethodObj(Test2 value){
     
   }
}
