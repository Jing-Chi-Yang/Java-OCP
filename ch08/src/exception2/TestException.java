package exception2;

public class TestException {
	
	public void testException(boolean b) throws Exception{
		
		if(b) throw new Exception("測試例外!");		//true--->Exception
		
	}
	
	public void testException2(boolean b){
		
		if(b) throw new RuntimeException("測試例外");		//true--->Exception
						//特定Exception不需要寫throws Exception
	}
	
}
