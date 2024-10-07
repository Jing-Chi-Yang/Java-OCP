package ch9_1_exception1;

import java.io.IOException;

public class Ch09_1 {

	public static void main(String[] args) {
		
		TestException tex = new TestException();
		
//		try {
//			tex.testException(true, "MyException");
//		}catch(IOException ex) {
//			System.out.println(ex);
//		}
		
		try {
			tex.testException(false,"MyException");
			tex.testRuntimeException(true,"MyRuntimeException");
			
		}catch(IOException ex) {
			System.out.println(ex);
		}catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}finally {	//一定會執行
			System.out.println("額外的code");
		}
		
		
		
		
		
		
		
		
		

	}

}
















