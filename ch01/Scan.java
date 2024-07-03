package ch01;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入年齡:");
		int age = scanner.nextInt();
		String s1 = scanner.next();
		System.out.println(s1);
		if(age>=18) {
			System.out.println("Adult!");
		}else {
			System.out.println("Children!");
		}

	}

}
