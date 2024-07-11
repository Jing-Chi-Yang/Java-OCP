package ch03;

public class Array2D {

	public static void main(String[] args) {
		                        
		int[][] array2x3 = new int[2][3];   
		array2x3[0][0] = 1;     //[i][j]
		array2x3[0][1] = 20;
		array2x3[0][2] = 3;
		array2x3[1][0] = 40;
		array2x3[1][1] = 5;
		array2x3[1][2] = 60;
		
		for(int i=0;i<array2x3.length;i++) {
			for(int j=0;j<array2x3[i].length;j++) {      //取得[j]之length
				System.out.printf("%-4d",array2x3[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("================");
		
		for(int[] k1 : array2x3) {
			for(int k2 : k1) {
				System.out.printf("%-4d",k2);	
			}
			System.out.println();
		}

	}

}
