package oo1;

public class Test1 {
	
	private String msg;
	
	private Test1(String msg) {
		this.msg = msg;
	}
	
	public static Test1 newTest1(String msg) {
		return new Test1(msg);
	}
	
	public void printMsg() {
		System.out.println(msg);
	}
	
}
