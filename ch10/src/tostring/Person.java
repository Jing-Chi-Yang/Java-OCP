package tostring;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	} 
	public String toString() {
		return name+" : "+age;
	}
//Override了以下的原始碼	
//	public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
}
