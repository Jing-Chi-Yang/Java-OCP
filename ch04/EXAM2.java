package ch04;

public class EXAM2 {
	
	static void test1(int i1) {
		System.out.println("Test Int!");
	}
	static void test1(float f1) {
		System.out.println("Test Float!");
	}
	
	
	static void test2(byte b1) {
		System.out.println("Test Byte!");
	}
//	static void test2(float f1) {
//		System.out.println("Test Float!");
//	}
	static void test2(Integer I1) {
		System.out.println("Test Integer!");
	}
	
	
	static void test3(byte b1) {
		System.out.println("Test Byte1!");
	}
	static void test3(Float f1) {			//為封箱之大寫Float
		System.out.println("Test Float1!");
	}
	
	
	
	public static void main(String[] args) {
		
		//test1(5.2);			//5.2為double，需加f，才變成float
		test1(5.2f);
		test2(30);				//經過Step1,2,3皆不成立(一模一樣類型,相同類可相容,不同類型可相容------->封箱類型)
		test3(10f);				//若打10會出錯,因為Float不支持integer,若打10f轉成float類型,Float封箱曾能接受float!
		byte x = 30;
		test3(x);
		test3((byte)30);


	}

}
