package override3;

public class Test1 {
	//覆寫基本型態必須一樣
	public float testFloat() {
		return 2.5f;
	}
	
	public Test1 testObj() {
		System.out.println("要有static才能用");
		return new Test1();	
	}
	
	public void testMethod(int value){
        
    }
	
	public void testMethodObj(Test1 value){
        
    }	
}
