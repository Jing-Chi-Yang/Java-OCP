package ch9_1_exception2;

//IOException為FileNotFoundException的父類別
import java.io.IOException;		//父
import java.io.FileNotFoundException;	//子
import java.util.InputMismatchException;

public class TestException2 {
	public void testIOException(boolean b1)throws IOException{
		if(b1) throw new IOException("testIOException");
	}
	
	public void testFileNotFoundException(boolean b2)throws FileNotFoundException{
		if(b2) throw new FileNotFoundException("testFileNotFoundException");
	}
	
	public void testInputMismatchException(boolean b3)throws InputMismatchException{
		if(b3) throw new InputMismatchException("testInputMismatchException");
	}
}
