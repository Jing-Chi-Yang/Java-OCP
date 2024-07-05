package ch02;

public class Equals {

	public static void main(String[] args) {
		
		String a ="Charlie";                //字串池中 位址: 0000
		 
		String b ="Anna";                   //字串池中 位址: 0004
		
		String c ="Charlie";                //字串池中 位址: 0000       
		
		String d = new String("Charlie");  //字串池中 位址: 0008 
		
		
		 
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);          //明明印出來一樣，但比較卻不一樣，因為"等於"比較的是記憶體位址，應使用equals去比
		System.out.println(a);
		System.out.println(d);
		System.out.println("===========================");
		
		
		System.out.println(a.equals(c));   //equals為字元逐一比較之方法
		
		System.out.println("===========================");
	
		String e = null;
	  //System.out.println(e.equals(a));     //java.lang.NullPointerException
		
		
		
		
		
		
		
		
		

	}

}