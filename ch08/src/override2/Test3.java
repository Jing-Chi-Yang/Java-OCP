package override2;

import override1.Test1;

public class Test3 extends Test1{
	
	@Override
	public void testPublic(){
        System.out.println("public Test3");
    }
	
	@Override
	protected void testProtected(){ 	//可用protected || public
        System.out.println("protected Test3");
    }
    
//	@Override
//    void testDefault(){			//相同package才可讀寫
//        System.out.println("Default Test3");
//    }
//    
//	@Override
//    private void testPrivate(){
//         System.out.println("Private Test3");
//    }

}
