package exception2;

public class Ch08_7 {

	public static void main(String[] args) throws Exception{
		
		TestException te = new TestException();
		
		try{
			te.testException(true);
			System.out.println("一起的code");		//若發生Exception則不會印出
		}
		catch(Exception ex) {		//會抓住try裡發生的Exception---->印出java.lang.Exception
			System.out.println(ex);
		}	
		
		System.out.println("額外的code");
		
	}

}
