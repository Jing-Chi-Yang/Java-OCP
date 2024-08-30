package oo4;

public class TestModifier {
	
	//Default
	String defaultValue = "defaultValue";	//相同package才可讀寫
	
	public String publicValue = "publicValue";	//相同package,跨package可讀寫
	
	protected String protectedValue = "protectedValue";	 //相同package才可讀寫
														 //跨package需繼承才可讀寫
	private String privateValue = "privateValue";
	
	public String getPrivateValue() {
		return privateValue;
	}
	
	public void setPrivateValue(String privateValue) {
		this.privateValue = privateValue;
	}
	
	
	
	
	
	 
	
	
	
}
