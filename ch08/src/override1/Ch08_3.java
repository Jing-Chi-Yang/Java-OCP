package override1;

public class Ch08_3 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.testPublic();
		t1.testProtected();
		t1.testDefault();
		
		System.out.println("=================");
		
		Test1 t2 = new Test2();
		t2.testPublic();
		t2.testProtected();
		t2.testDefault();
		
	}

}
