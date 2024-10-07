package override;

public class Test1 {
	public void testException(boolean b1)throws MyException {
		if(b1) throw new MyException();
	}
	
	
}
