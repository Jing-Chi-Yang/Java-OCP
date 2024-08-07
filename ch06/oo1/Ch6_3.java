package oo1;

import java.util.Scanner;

public class Ch6_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		Animal a1 = null;
		switch(i) {
			case 1:
				a1 = new Dog("Kiki",10,15);
				break;
			case 2:	
				a1 = new Cat("Mimi",3,2);
				break;
				//假設未來有很多動物要加入即可用此種方式
		}
		a1.printInfo();

	}

}
