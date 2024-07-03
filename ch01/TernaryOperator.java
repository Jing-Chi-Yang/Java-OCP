package ch01;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Score : ");
		int score = s.nextInt();
		
		
//		if(score>=60) System.out.println("Pass !!!!!! ");
//		
//		else System.out.println("Fail !!!!!! ");
		
		var result = score >= 60? "Pass !!!!!!" : "Fail !!!!!!";
		
		System.out.println(result);
		
	}
		
}