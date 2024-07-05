package ch02;

public class Align {

	public static void main(String[] args) {
		int i,j;
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				//System.out.print(i+"*"+j+"="+ i*j+"  ");
				System.out.printf("%-5d",i*j);      //用C語言方法對齊  -為向左對齊 +為向右對齊
			}
			System.out.println();
		}

	}

}
