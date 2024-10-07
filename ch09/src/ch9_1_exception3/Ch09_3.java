package ch9_1_exception3;

public class Ch09_3 {

	public static void main(String[] args) {

		TestMyException t1 = new TestMyException();
		try {
			t1.testAgeException(true, "Age Error");
			t1.testNameException(true, "Name Error");
		}catch(AgeException ex){
			System.out.println("AgeException : "+ex);
		}
//		catch(NameException ex){
//			System.out.println("NameException : "+ex);
//		}
		catch(Exception ex){	//Exception包含所有的Exceptions,用來做最後檢查
			System.out.println("Exception : "+ex);
		}

	}

}
