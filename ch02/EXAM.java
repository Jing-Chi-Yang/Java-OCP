package ch02;

public class EXAM {

		static int test1() {
			System.out.println("test1");
			return 1;
		}
		static boolean test2() {
			System.out.println("test2");
			return true;
		}
		static void test3() {
			System.out.println("test3");
		}
		
		public static void main(String[] args) {
	   //              1           2              3  
	        for(int i=test1();i<=3 && test2();i++,test3()) {         //輸出順序為124 324
	        	System.out.println("Body!!!"); // 4
	        	System.out.println("========================");
	        	
	        }	
	        
		
	        
	    }
	    
	}