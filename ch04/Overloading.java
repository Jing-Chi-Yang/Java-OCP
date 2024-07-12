package ch04;

public class Overloading {
			 //*多載 名稱一樣，參數的數量或類型不一樣
	
	static float test(float f1, float f2) {
		return f1*f2;
	}
	
	static int test(int v1, int v2) {
		return v1*v2;
	}
	
	static void Loop(int s,int len, int step) {
		for(int i=s;i<=len;i+=step) {
			System.out.print(i+" ");
		}
		System.out.println();	
	}
	
	static void Loop(int s,int len) {               //給預設值
		Loop(s,len,1);
	}
	
	
	
	public static void main(String[] args) {
        
		System.out.println(test(3.1f,2.9f)); 
		System.out.println(test(3,2));
		
		Loop(1,10,2);
		Loop(2,8,1);
		Loop(3,5);									//給預設值
			
	
		
	}
}



