package ch02;

import java.util.Scanner;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		array[0]=5;
		array[1]=4;

		array[3]=2;
		array[4]=1;
//		array[5]=0;
		
		for(int i=0;i<array.length;i++) {
			System.out.println(x+array[i]);
		}
		
		System.out.println("====================");
		
		for(int i=0;i<array.length;i++) {
			int v1 = array[i];
			System.out.print(v1+" ");		
		}
		
		System.out.println();
		
		//foreach寫法 用意為:把Array裡每個資料抓出來
		for(int v2 : array) {
			System.out.print(v2+" ");
		}
		
		System.out.println();
		System.out.println("====================");
		
		//Lampda語法 之後教
		
		Arrays.stream(array).forEach(System.out::println);
		
		
		
		
		
		
		

	}

}
