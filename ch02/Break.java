package ch02;

public class Break {

	public static void main(String[] args) {
		int x=1;
		for(int i=1;i<=100;i++) {
			int ans=x;
			x*=i;
			//x=x*i;
			System.out.printf("%d*%d="+x,ans,i);
			System.out.println();
			if(x>=100) break;
			
		}
		System.out.println(x);

	}
}
