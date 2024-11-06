package initblock2;

public class Ch10_5 {

	public static void main(String[] args) {
		
		TestStaticBlock.init();
		System.out.println(TestStaticBlock.getString());
		System.out.println(TestStaticBlock.list);
		
		System.out.println("==================");
		
		//初始化寫法
		TestStaticBlock t1 = new TestStaticBlock();
		System.out.println(t1.getString());
		System.out.println(t1.list);
		
		
		
		
		
		
	}
}
