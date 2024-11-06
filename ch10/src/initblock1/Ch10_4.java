package initblock1;

import java.util.Random;

public class Ch10_4 {

	public static void main(String[] args) {
		
		TestBlock t1 = new TestBlock();
		System.out.println(t1.find("Charlie"));
		
		TestBlock t2 = new TestBlock(10);
		System.out.println(t2.find("Amy"));
		
		TestBlock2 t3 = new TestBlock2();
		System.out.println(t3.find("Charlie"));
		
		TestBlock2 t4 = new TestBlock2(10);
		System.out.println(t4.find("Amy"));
		

		Random r = new Random();
		
		int i=0;
		
		int[] num = new int[50];
		
		for(i=0;i<num.length;i++) num[i]=0;
		
		for(i=0;i<r.nextInt(num.length);i++) num[i]=i;
		
		for(int x : num) {
			System.out.print(x+" ");
		}
		
		
		
	}

}

