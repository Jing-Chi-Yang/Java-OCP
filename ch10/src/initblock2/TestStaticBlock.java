package initblock2;

import java.util.ArrayList;
import java.util.Random;

public class TestStaticBlock {
	
	public static ArrayList<String> list = new ArrayList();
	public static Random ran;
	
	public static void init() {
		for(char c='A';c<='Z';c++) {
			list.add(c+"");
		}
		ran = new Random(); 
	}
	
	
	//初始化寫法
	{
		for(char c='A';c<='Z';c++) {
			list.add(c+"");
		}
		ran = new Random(); 
	}
	
	
	public static String getString() {
		
		String msg = "";			//0~25
		for(int i=0;i<=ran.nextInt(list.size());i++) {
			msg+=list.get(i);
		}
		
		return msg;
	}
	
}
