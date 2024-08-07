package oo1;

public class Dog extends Animal{
	
//預設建構式
	Dog(){
		this("xxx", -1, -1);
		//考試常考*** 建構式內沒有自行輸入this() or super()
		//預設會呼叫super()
	}
	
	Dog(String name, int age, float weight){
//		this.setName(name);
//		this.setAge(age);
//		this.setWeight(weight);
//一直打建構式太麻煩,使用super()可呼叫父類別建構式		
//***不可與this()同時出現 王不見王 為語法規則	
		super(name,age,weight);
	}
	
	//Override複寫------>原本要印的被Dog :  蓋過去了!
//	public void printInfo(){
//		System.out.println("Dog : ");
//	}
	
	//Override複寫,可以改良父類別的方法
	@Override
	public void printInfo(){
		System.out.println("Dog:");
		super.printInfo();
	}
	
	
}
