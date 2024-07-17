package oo3;

public class Ch5_3 {

	public static void main(String[] args) {
		
		Car c1 = new Car("Black","BMW",2);
		c1.printInfo();
		Car c2 = new Car("Black","BMW",2);
		c2.setColor("White");
		c2.setCompany("Benz");
		c2.setDoor(4);
		c2.printInfo();
		
		
		

	}

}
