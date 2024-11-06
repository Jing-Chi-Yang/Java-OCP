package initblock3;

public class TestBlockOrder {
	//呼叫順序:static---->non static---->建構式
	//****static總共只會呼叫一次, non static new幾次就呼叫幾次
	//在記憶體配置中static先呼叫,總共只會呼叫一次, non static 後呼叫,new幾次就呼叫幾次
	//Therefore,static不能使用non static的東西---->會出錯
	
    {
        System.out.println("Step 1");
    }
    
    public TestBlockOrder(){
        System.out.println("TestBlockOrder()");
    }
    
    static{
        System.out.println("static Step 1");         
    }
    
    {
        System.out.println("Step 2");
    }
      
      static{
        System.out.println("static Step 2"); 
    }
    
}