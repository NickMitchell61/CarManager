package ua.com.foxminded.carmanager;

public enum Color {
	
	BLACK ("Black"),
	ORANGE ("Orange"),
	WHITE ("White"),
	YELLOW ("Yellow"),
	BLUE ("Blue"),
	GREEN ("Green");

	
//	String nameOfColor;
//	
//	Color (String nameOfColor) {
//		this.nameOfColor = nameOfColor;
//		}
//	
//	public String getTypeOfColor() {
//		return nameOfColor;
//	}
	
	private final String name;   
	
	
	Color(String string) {
		name = string;
	}
	

	public String toString() {
	       return this.name;
	}
	    

}
