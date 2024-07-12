package ch04;

public class EXAM {
	
	static void test1(short s1) {
		System.out.println("Test1 Short!");
	}
	static void test1(int i1) {
		System.out.println("Test1 Int!");
	}
	
	static void test2(short s1) {
		System.out.println("Test2 Short!");
	}
	
//	static void test2(long l1) {
//		System.out.println("Test2 Long!");
//	}
	
	static void test2(float f1) {
		System.out.println("Test2 Float!");
	}
	
	
	public static void main(String[] args) {
		
		test1(30);
		short s1 = 30;
		test1(s1);
		
		System.out.println("================");
		
		test2(6);		//short吃不下整數
		//嘗試把註解拿掉	//short:16bits, 整數:32bits
		
		System.out.println("================");
		
		//判斷Steps:
		//1 一模一樣類型 
	    //2 相同類可相容   ex.大吃小 (Long可吃Int)
	    //3 不同類型可相容  ex.(Float可吃Int)
	    //4 封箱類型
		
		//基本型態
        //整數
            //byte 8bit
            //short 16bit
            //int 32bit default
            //long 64bit
        //浮點數
            //float 32bit
            //double 64bit default
        //字元
            //char 32bit 沒有負數
        //布林
            //boolean 1bit
		
	}

}
