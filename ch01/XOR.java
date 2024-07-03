package ch01;

public class XOR {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1&&b2);
		System.out.println(b1||b2);
		System.out.println(!b2);
		System.out.println(b1^b2); //XOR
		System.out.println("================");
		
		//短路 表示會中斷
		int i=0;
		boolean a1 = true;
		boolean a2 = false;
		boolean x1 = a1 && ++i > 3;
		System.out.println(i);
		System.out.println(x1);
		System.out.println("================");
		
		i=0;
		boolean x2 = a2 && ++i > 3;  
		//因為在判斷&&運算子時，一旦判斷到false即跳出，因此沒有執行++i
		//&&運算短路只會出現在false，同理||運算短路只會出現在true
		System.out.println(i); //短路發生
		System.out.println(x2);
	
	}

}