package exception1;

public class Student {
	
	private String name;
	private int age;
	
	//name 長度必須大於0 小於10 不可為null
    //錯誤訊息:名字格式錯誤!
	public void setName(String name) {
		this.name = name;
		//此方法錯誤發生之後扔會持續輸出,要改成Exception法----->此處採RuntimeException(比較不嚴謹)
//		if(name==null || name.isEmpty() || name.length()<0 || name.length()>10) {
//			System.out.println("名字格式錯誤!");
//		}
		
		if(name==null || name.isEmpty() || name.length()<0 || name.length()>10) {
			throw new RuntimeException("名字格式錯誤!");
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	//age 必須大於5 小於200
    //錯誤訊息:年齡格式錯誤!
	
	public void setAge(int age) throws Exception {
		this.age = age;
//		if(age<5 || age>200) {	
//			System.out.println("年齡格式錯誤!");
//		}
		
		//此處採Exception(比較嚴謹)
		//需在 setAge和主程式標頭加上throws Exception(throws記得加s)------>代表可拋出多筆資
		if(age<5 || age>200) {	
			throw new Exception("年齡格式錯誤!");
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	void printInfo() {
		System.out.println(name+" : "+age);
	}
	
}











