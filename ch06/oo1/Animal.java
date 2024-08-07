package oo1;

public class Animal {
	private String name;
	private int age;
	private float weight;
	
	public Animal(){
		//this()呼叫其他的建構式 
        //只能是建構式當中的第一筆數值
		this("未設定", -1, -1);
	}

	Animal(String name, int age, float weight){
		this.setName(name);
		this.setAge(age);
		this.setWeight(weight);
	}
	
	public void printInfo() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Weight:"+weight);
		System.out.println("====================");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;	//this. 表示當前物件
							//打出this.亦可用於查找現在有甚麼功能可以用
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
