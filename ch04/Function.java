package ch04;

public class Function {

	static void test1() {
		System.out.println("Good!!!");	
	}
	static int test2() {
		return 10;	
	}
	static int test3(int x, int y) {
		int a = x + y;
		return a;
	}
	static int test4(int ... v) {			 	//長整數用法
		int result = 0;
		for(int a : v) {
			result += a;
		}
		return result;
	}
	
	//長參數 只能放在 最後一個位置
    static void test1(int v1,int ... v2){		//長整數在最後一個位置
        
    }
//    static void test2(int ... v2,int v1){		//長整數不在最後一個位置
//        
//    }

	public static void main(String[] args) {
        
		test1();
		System.out.println(test2());
		int i = test2();
		System.out.println(i);
		
		System.out.println("==================");
		
		int ans = test3(5,3);
		System.out.println(ans);
		
		System.out.println("==================");
		
		int Ans = test4(1,2,3,4,5,6,7,8,9,10);
		System.out.println(Ans);
	
	}
}