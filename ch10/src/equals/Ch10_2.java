package equals;

public class Ch10_2 {

	public static void main(String[] args) {
		
		MyNumber n1 = new MyNumber(10);
		MyNumber n2 = new MyNumber(10);
		System.out.println(n1);
		//System.out.println(n1);預設為System.out.println(n1.toString());
		System.out.println(n1==n2);
		System.out.println(n1.equals(n2));
		
	}

}











