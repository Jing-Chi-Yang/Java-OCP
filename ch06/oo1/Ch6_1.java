package oo1;

public class Ch6_1 {

	public static void main(String[] args) {
		Animal a1 = new Animal("Cat",3,2);
		a1.printInfo();
		Animal a2 = new Animal("Cat",3,2);
		a2.setName("Monkey");
		a2.setAge(5);
		a2.setWeight(20);
		a2.printInfo();
		Animal a3 = new Animal();
		a3.printInfo();
			    
		Dog d1 = new Dog();		//要把Dog的建構式拿掉才能run
		d1.setName("Dog");		//Dog的建構式------->Dog(String name, int age, float weight){}
								//Dog的預設建構式---->Dog(){}
		d1.setAge(5);
		d1.setWeight(30);
		d1.printInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
