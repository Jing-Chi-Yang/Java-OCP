package oo1;

public class Ch5_1 {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.name = "Charlie";
		st1.age = 23;
		st1.height = 170;
		System.out.println(st1.name+" : "+st1.age+" : "+st1.height);
		
		Student st2 = new Student();
		st2.name = "Amy";
		st2.age = 23;
		st2.height = 156;
		System.out.println(st2.name+" : "+st2.age+" : "+st2.height);
		
		System.out.println("======================");
		
		st1.showInfo();
		st2.showInfo();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
