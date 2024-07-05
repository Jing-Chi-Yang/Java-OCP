package ch02;

import java.util.Scanner;

public class 練習 {
	
	public static void main(String[] args) {
		
		int[] a = new int[5];

		for(int i=0;i<a.length;i++) {
			a[i]+=i;		
		}
		
		for(int v1 : a) {
			System.out.println(a[v1]);
		}
	}

}