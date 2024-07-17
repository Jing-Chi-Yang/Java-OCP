package oo2;

public class Ch5_2 {

	public static void main(String[] args) {
		Person p1 = new Person();
		//not null,name>1字元,name<60字元
		//p1.name = "Amanda";
		p1.setName("");
		p1.id = "A12";
		//age應>=0,age<=200
		//p1.age = 2000000;
		p1.setAge(30);
		//大於0 小於500
		//p1.weight = 45;
		p1.setWeight(50);
		p1.showInfo();
		
//		Person p2 = new Person("Charlie","A01",23,85.4f);
//		p2.showInfo();
	}

}
