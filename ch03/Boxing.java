package ch03;

public class Boxing {

	public static void main(String[] args) {
		
		//基本型態變物件 就是封箱類型
	     
        //整數   封箱
        //byte  Byte
        //short Short
        //int   Integer
        //long  Long
        
        //浮點數  封箱
        //float  Float
        //double Double
        
        //布林     封箱
        //boolean Boolean
		
		int value =15;
		Integer intObj = Integer.valueOf(value); //封箱
//		int i = Integer.valueOf(value);
//		System.out.println(i);
		System.out.println(intObj.getClass());
		System.out.println(intObj); //印出來是字串
		System.out.println(intObj.toString()+2);
		
		int myValue = intObj.intValue(); //解封箱(取intObj內的值)
		System.out.println(myValue);
		System.out.println(myValue+3);

		Integer intObj2 = 35;
		System.out.println(intObj2.toString()+2);
		int value2 = intObj2; //自動解封箱 java內部做了int value2 = intObj2.intValue();
		int value3 = intObj2 + 5; //自動解封箱
		String value4 = intObj2.toString()+5;
		System.out.println(intObj+":"+value2+":"+value3+":"+value4);
		
		Integer intObj3 = null;
	 // int value5 = intObj3 + 5;   //因為java內部做了自動解封箱 拿null取intValue結果就炸開了  *********EXAM
	 // System.out.println(value5); //java.lang.NullPointerException    *********EXAM		
		
		
		
		
		
		
		
		
		
		
		
	}

}
