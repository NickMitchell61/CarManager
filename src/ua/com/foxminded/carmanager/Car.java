package ua.com.foxminded.carmanager;

public class Car {
	
	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	private int distance = 0;
	
	
	public Car(String name, int yearOfProduction, int price, int weight,  String color) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = Color.valueOf(color.toUpperCase().replaceAll("\\s", ""));
	}
	
	public void addDistance(int additionatDistance) {
		try {
			if (additionatDistance < 0) {
				
			} else {
				distance += additionatDistance;
			}
			
		} catch (Exception e) {
			System.out.println("Distance is only above than 0");
		}
	}
			
	
	public int getDistance() {
		return distance;
	}

	
	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", distance=" + distance + "]";
	}
	
	
}
