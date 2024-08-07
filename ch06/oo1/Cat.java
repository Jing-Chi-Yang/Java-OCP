package oo1;

public class Cat extends Animal{
	Cat(){
		//super();		//本身自己就會呼叫super();
	}
	
	Cat(String name, int age, float weight){
		super(name,age,weight);
		
	}
	
//	printInfo拼錯了,導致複寫錯誤---->在前面加上@Override可以提醒是否正確複寫
//	public void printInfoooo() {
//		System.out.println("Cat:");
//		super.printInfo();
//	}
	
	@Override
	public void printInfo() {
		System.out.println("Cat:");
		super.printInfo();
	}
	
	
	
	
	
	
	
	
	
}
