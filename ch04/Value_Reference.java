package ch04;

public class Value_Reference {
	
	static void swap(int a, int b) {
		int c = a;
		a = b;
		b = c;
	}
	
	static void swap(int[] a) {
		int i = a[0];
		a[0] = a[1];
		a[1] = i;
	}
	
	static void test(String s) {
		s = "Charlieeeeeeeeeeeeeeeeeeee";
	}
	
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
//		int c = a;
//		a = b;
//		b = c;
		swap(a,b);		//call by value
		System.out.println(a+":"+b);
		
		System.out.println("====================");
		
		
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
//		int i = array[0];
//		array[0] = array[1];
//		array[1] = i;
//		System.out.println(array[0]+":"+array[1]);
		
		swap(array);	//call by reference
		System.out.println(array[0]+":"+array[1]);
		
		System.out.println("====================");
		
		String s1 = "ABCD";
		System.out.println(s1);
		s1.toLowerCase();
		System.out.println(s1);
		String s2 = s1.toLowerCase();
		System.out.println(s2);
		
		System.out.println("====================");
		
		String s3 = "Charlie";
		test(s3);
		System.out.println(s3);		//String只會被覆蓋，絕對不會被修改
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
