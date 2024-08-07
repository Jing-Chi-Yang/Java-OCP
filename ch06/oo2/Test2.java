package oo2;

public class Test2 extends Test1{
//在使用者沒有打預設建構式時,Test2會去呼叫父類別的預設建構式
//但是父類別若自己寫了一個建構式會讓子類別找不到東西繼承,因此出錯
//有兩個Solution:
	//1. 新增參數(較常使用,因為一般情況下都是拿不到Test1原始檔的,都經過編譯了!)
	public Test2() {
		super("aaa");
	}
	//2.在Test1加一個預設建構式
	
	
	
	//Test2的隱藏版預設建構式
	//	public Test2() {
	//		super();
	//}
}
