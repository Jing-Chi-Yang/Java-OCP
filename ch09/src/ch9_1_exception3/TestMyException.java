package ch9_1_exception3;

import java.io.IOException;

public class TestMyException {
	public void testAgeException(boolean b1, String msg)throws AgeException{
		if(b1) throw new AgeException(msg);
	}

	public void testNameException(boolean b2, String msg)throws NameException{
		if(b2) throw new NameException(msg);
	}
	
}
