package ch03;

public class Boxing2 {

	public static void main(String[] args) {
		
        String s = "24076";
        int i = Integer.parseInt(s);
        System.out.println(i + 5);

//        String s1 = "1 23";  //必須字串呈現整數才能轉             
//        int i2 = Integer.parseInt(s1);
//        System.out.println(i2);

        String s2 = "tRuE";
        System.out.println(Boolean.parseBoolean(s2));
        String s3 = "tR uE";
        System.out.println(Boolean.parseBoolean(s3));
        String s4 = "rrrrrr";
        System.out.println(Boolean.parseBoolean(s4)); //只要不是true就回傳false
        s2 = "dfwewefwef";
        System.out.println(s2);
	}

}
