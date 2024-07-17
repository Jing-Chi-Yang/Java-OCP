package oo2;

public class Person {
	private String name = "未設定";
	String id;
	//封裝第一步
	//Private只能在Person內部使用
	private int age;
	private float weight;
	
//	public Person(String name,String id,int age,float weight) {
//		this.name = name;
//		this.id = id;
//		this.age = age;
//		this.weight = weight;
//	}
	
	void showInfo(){
		System.out.println(name+" : "+id+" : "+age+" : "+weight);
	}
	
	//存
	public void setAge(int inAge) {
		//把關
		if(inAge < 0 || inAge > 100) {
			System.out.println("錯誤的年齡");
			return;		//離開函數不繼續
		}
		age = inAge;
	}
	//提
	public int getAge() {
		//把關
		return age;
	}
	
	
	public void setName(String inName) {
		if(inName == null || inName.isEmpty() || inName.length() > 60) {		
			System.out.println("錯誤的姓名模式"); 
			return;
		}
		name = inName;
	}
	public String getName() {
		return name;
	}
	
	public void setWeight(float inWeight) {
		if(inWeight < 0 || inWeight > 500) {
			System.out.println("錯誤的體重");
			return;
		}
		weight = inWeight;
	}
	
	public float getWeight() {
		return weight;
	}
	
	
	
	
}

