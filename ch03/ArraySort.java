package ch03;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int[] array1 = {7,6,5,8,4,9,1,3,2};
		Arrays.sort(array1);
		for(int i : array1) System.out.print(i+" ");
		
		System.out.println();
		
		int[] array2 = {31,7,36,15,23};
		Arrays.sort(array2);
		for(int j : array2) System.out.print(j+" ");
		
		System.out.println();
		
		int index1 = Arrays.binarySearch(array2, 31);
		System.out.println(index1);
		
		//找不到一定負數
        //小於所有-1
        int index2 = Arrays.binarySearch(array2, 6);
        System.out.println(index2);
        //大於所有 (長度+1)*-1
        int index3 = Arrays.binarySearch(array2, 72);
        System.out.println(index3);
        //在中間 右邊數值長度 *-1
        int index4 =  Arrays.binarySearch(array2, 26);
        System.out.println(index4);
		
		
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
