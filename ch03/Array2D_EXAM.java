package ch03;

public class Array2D_EXAM {

	public static void main(String[] args) {
		
		//左邊[]個數相加等於右邊[]個數就對了
		int[][] array1 = new int[2][3];
		int[] array2[] = new int[2][3];
		int array3[][] = new int[2][3];
		int[][] array4 = new int[2][3];
		int[][] array5 = new int[2][];
		int[][] array6 = {{1,2,3},{4,5},{6,7}};
		
		array6 = new int[][] {{1,2,3,4},{4,5},{6,7}};
		
		
		int[][] array2xN = new int [2][];
		array2xN[0] = new int[] {1,2,3};
		array2xN[1] = new int[] {4,5,6};
		
		for(int[] v1 : array2xN) {
			for(int v2 : v1) {
				System.out.print(v2+" ");
			}
			System.out.println();
		}
		
		
		//陣列預設值
	    //整數 byte short  int long 0
	    //浮點數 float double 0.0
	    //字元 空白字元(0)
	    //布林 false
	    //參考型態是null
		
		int[] i = new int[2]; 
		i[0]=2;i[1]=3;
		for(int x : i) System.out.print(x+" ");

		System.out.println();
		
		float[] f1 = new float[2];
		System.out.println(f1[0]);
		
		String[] s1 = new String[3];
		System.out.println(s1[0]);
	 // System.out.println(s1[0].equals(" "));   // java.lang.NullPointerException
		System.out.println(s1[0]==null);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
