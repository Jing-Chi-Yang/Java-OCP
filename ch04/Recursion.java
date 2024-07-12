package ch04;

public class Recursion {

	 static void test1(int n){
	        System.out.println("T:"+n);
	        if (n < 4){
	           test1(n+1); 
	        }
	        System.out.println("E:"+n);
	 }
	
	public static void main(String[] args) {
		
		test1(1);
		
	}
}
