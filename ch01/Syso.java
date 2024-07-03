package ch01;

public class Syso {

	public static void main(String[] args) {
		
		
		//syso  alt+/   =     System.out.println(); 
		//for   alt+/   =     System.out.println(); 
		
		//var 為一static variable，是自動推斷類別的變數		
		int i=1;
		var x=2 + ++i + 3 + i++;
		System.out.println(x);
		System.out.println(i);
		
	}
}
