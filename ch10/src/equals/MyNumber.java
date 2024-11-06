package equals;

public class MyNumber {
	
	private int number;
	
	public MyNumber(int number) {
		this.number = number;
	}
	
	public String toString() {	//要去override "toString()"
		return "MyNumber : "+this.number;
	}
	
	@Override
	public boolean equals(Object obj) {
		MyNumber tmp = (MyNumber) obj;
		return this.number == tmp.number;	
	}
	
}
