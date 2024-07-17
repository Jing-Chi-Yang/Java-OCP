package oo3;

public class Car {
	private String color;
	private String company;
	private int door;
	
	Car(String color, String company, int door){  //為一個建構式 名子需和類別一樣
		this.color = color;
		this.company = company;
		this.door = door;
	}
	
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public void printInfo() {
		System.out.println(color+" : "+company+" : "+door);
	}
	
}
