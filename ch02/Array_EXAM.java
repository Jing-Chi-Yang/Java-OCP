package ch02;

public class Array_EXAM {

	public static void main(String[] args) {

		int[] array1 = new int[5];
		int array2[] = new int[5];
		var array3 = new String[5];
		int array4[] = {1,2,3,4,5};
		int[] array5 = {1,2,3,4,5};
		int[] array6 = new int[]{1,2,3,4,5}; //已宣告還想改變陣列 切記:不可填上長度(考試常考)
		array6 = new int[] {2,3};
		
		int[] array7 = new int[10];
		array7 = new int[] {2,3,4};
		
		for(int v1 : array6) {
			System.out.print(v1+" ");
		}
		
		System.out.println();
		
		for(int v1 : array7) {
			System.out.print(v1+" ");
		}
		
	}

}