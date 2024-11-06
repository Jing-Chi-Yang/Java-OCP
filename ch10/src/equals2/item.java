package equals2;

public class item {
	
	private String name;
	private int price;
	
	public item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return name+" : "+price;
	}
	
	public boolean equals(Object obj) {
		
		System.out.println(obj.getClass().getName());
		System.out.println(this.getClass().getName());
		
		//    1  			2
		if(obj==null || obj.getClass().getName().equals(this.getClass().getName())==false){
			return false;
		}
		item i = (item)obj;
		return this.price==i.price && this.name==i.name;
		
	}
	
}














