package override3;

public class Ch08_5 {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		System.out.println(t1.testFloat());
		System.out.println(t1.testObj());
		
		System.out.println("================");
		
		Test1 t2 = new Test2();
		System.out.println(t2.testFloat());
		System.out.println(t2.testObj());
		
		System.out.println("================");
		
		//Test1 t3 = Test1.testObj();	//要有static才能用
	}

}
