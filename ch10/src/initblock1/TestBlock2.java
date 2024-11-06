package initblock1;

public class TestBlock2 {
	
	private String[] names = new String[50];
	private int id;
	
	//因為大家都要用到此for loop------>使用初始化區塊
	{
		for(int i=0;i<names.length;i++) {
			names[i]="";
			names[0]="Charlie";
		}	
	}

	public TestBlock2() {
		
		
	}
	
	public TestBlock2(int id) {
		this();				
		this.id = id;				
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
