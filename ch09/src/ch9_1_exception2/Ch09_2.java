package ch9_1_exception2;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class Ch09_2 {

	public static void main(String[] args) {
		
		TestException2 te2 = new TestException2();
		try {
			te2.testIOException(false);
			te2.testFileNotFoundException(false);
			te2.testInputMismatchException(true);
			
		//要記得越下越父 父類別要放越下面
//		}catch(IOException ex) {
//			System.out.println(ex);
//		}catch(FileNotFoundException ex) {
//			System.out.println(ex);
//		}
		
		//成功的越下越父
//		}catch(FileNotFoundException ex) {
//			System.out.println(ex);
//		}catch(IOException ex) {
//			System.out.println(ex);
//		}catch(InputMismatchException ex) {
//			System.out.println(ex);
//		}
			
		//不是父子關係的可以放一起共同偵測,or只需一條------> |
		}catch(FileNotFoundException ex) {
			System.out.println(ex);
		}catch(IOException | InputMismatchException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("close1");
		}
		
		try {
			System.out.println("Test Try");
		}finally {
			System.out.println("close2");
		}
		
	}

}
















