package equals2;

public class Ch10_3 {

	public static void main(String[] args) {
		
		item i1 = new item("T-Shirt", 1080);
		item i2 = new item("Short", 1080);
		item i3 = new item("Watch", 9999);
		item i4 = new item("T-Shirt", 1080);
		String s1 = "Test";
		
		//System.out.println(i1);
		System.out.println(i1.equals(i2));
		System.out.println(i1.equals(i3));
		System.out.println(i1.equals(i4));
		
		//java.lang.NullPointerException------->寫一個if判斷式  1
		//System.out.println(i1.equals(null));	
		
		//java.lang.ClassCastException------>判斷A,B是不是同一型態的東東  2
		System.out.println(i1.equals("Test"));
	
	}

}










