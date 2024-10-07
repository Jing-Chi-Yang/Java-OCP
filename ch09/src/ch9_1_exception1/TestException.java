package ch9_1_exception1;

import java.io.IOException;

public class TestException {

	public void testException(boolean b1, String msg)throws IOException {
		if(b1) throw new IOException(msg);
	}
	
	public void testRuntimeException(boolean b1, String msg) {
		//RuntimeException可以不用寫throws Exception
		if(b1) throw new IllegalArgumentException(msg);
	}
	
}














