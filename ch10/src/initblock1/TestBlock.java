package initblock1;

import java.util.Random;

public class TestBlock {
	
	//當有一件事每個建構式都需要初始化的程式
    //很適合使用初始化區塊完成
	
	private String[] names = new String[50];
	private int id;
	
	//若沒有初始化則會發生------->java.lang.NullPointerException
	public TestBlock() {
		for(int i=0;i<names.length;i++) {
			names[i]="";	//每個人都先給空,才不會發生NullPointerException
			names[0]="Charlie";
		}		
	}
	
	public TestBlock(int id) {
		//1.有了初始化後又新增不一樣函式,害初始化被蓋掉,又NullPointerException
		//2.使用this()呼叫同一類別內的其他建構式
		this();				//2
		this.id = id;		//1			
	}
	
	public boolean find(String name) {
		for(String n : names) {
			if(n.equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	
}

 