package oo4;

public class ch07_04 {

	public static void main(String[] args) {
		
//		1. Modifier 只能越來越開放 不能越來越封閉
//		2. 回傳值如果是基本型態 必須一樣
//		3. 回傳值如果是參考型態 可一樣或子類
//		4. 方法名稱傳入參數必須一樣 
//		5. 拋出例外可選 拋出子類 或不拋
		
		TestModifier t1 = new TestModifier();
		System.out.println(t1.defaultValue);
		System.out.println(t1.publicValue);
		System.out.println(t1.protectedValue);
	  //System.out.println(t1.privateValue);
		System.out.println(t1.getPrivateValue());
		
		
		
		
		
		
		
		
	}

}
