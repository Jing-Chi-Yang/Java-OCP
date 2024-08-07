package oo1;

public class Ch6_2 {

	public static void main(String[] args) {
		Dog d1 = new Dog("Nini",3,2);  
		d1.printInfo();	
		Dog d2 = new Dog();  
		d2.printInfo();	
		
		Cat c1 = new Cat();
		c1.printInfo();
		
		Cat c2 = new Cat();
		c2.setName("Kitty");
		c2.setAge(5);
		c2.setWeight(5);
		c2.printInfo();
		
		Cat c3 = new Cat("Money",10,5);
		c3.printInfo();
		
		System.out.println(c3.getName());
	}

}


//繼承不會繼承建構式,但會有一個預設建構式,因此打Dog d1 = new Dog();	
//會成立,但一旦寫了新的建構式，預設即會失效，導致出錯

//繼承不會繼承private
//繼承不會繼承看不到的(有關讀取權限---->之後談)