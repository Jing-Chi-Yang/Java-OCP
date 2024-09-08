package oo2;

public class MySQLConnection {
	
	private static int count = 0;
	
	private MySQLConnection() {
		
	}
	
	public static MySQLConnection connection() {
		if(count>5) System.out.println("已額滿");
		count++;
		return new MySQLConnection();
	}
	
	public void close() {
		count--;
	}
	
	
	
	
	
	
	
	
	
}
