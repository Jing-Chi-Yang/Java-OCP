package ch03;

public class Array2D_EXAM2 {

	public static void main(String[] args) {
		
		int[][] array2xN = new int[2][];
		array2xN[0] = new int[]{1,2,3};
		System.out.println(array2xN[0][1]);
	//	System.out.println(array2xN[0][3]);    //java.lang.ArrayIndexOutOfBoundsException
		
		int[][] array = new int[2][3];
		array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(array[1][2]);
		
		for(int v1[] : array) {
			for(int v2 : v1) {
				System.out.print(v2+" ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
