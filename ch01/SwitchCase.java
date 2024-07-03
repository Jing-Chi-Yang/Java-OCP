package ch01;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入分數:");
		int score = scanner.nextInt();

		final int KEY_1 = 100; //把final拿掉會出錯
		final int KEY_2 = 90;
		
		switch(score) {
		 	case KEY_1 :  //變數必須是常數
		 		System.out.println("A");
		 		break;
		 	case KEY_2 :
		 		System.out.println("B");
		 		break;
		 	
		 	case 80 :
		 		System.out.println("C");
		 		break;
		
		 	case 70 :
		 		System.out.println("D");
		 		break;
		
		 	default:
		 		System.out.println("Error!!!");
		 		break;
		
//		 		final：
//
//		 		可以用來宣告一個類別、函數、或者變數。
//
//		 		類別：當宣告在類別上時，該類別就無法被繼承！
//
//		 		函數：當一個函數被宣告為final時，則繼承他的子類別無法覆寫
//
//		 		變數：當一個變數被宣告為final時，意思是他是一個常數，是無法被修改的。
		
		}

	}

}
