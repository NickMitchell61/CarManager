package ua.com.foxminded.carmanager;

public abstract class Car implements Serviceable {
	
	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	private int distance = 0;
	protected int distanceOnService = 0;
	
	
	public Car(String name, int yearOfProduction, int price, int weight,  String color) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = Color.valueOf(color.toUpperCase().replaceAll("\\s", ""));
	}
	
	
	public void addDistance(int additionatDistance) {
		if (additionatDistance < 0) {
				
		} else {
			distance += additionatDistance;
			distanceOnService += additionatDistance;
		}
	}
	
	
	public void addDistance(double additionatDistance) {
		if (additionatDistance < 0) {
				
		} else {
			this.addDistance(Math.round(additionatDistance));
		}
	}
			
	
	public void service() {
		distanceOnService = 0;
	}
	
	
	public abstract boolean isReadyToService();
	
	
	public int getDistanceOnService() {
		return distanceOnService;
	}

	
	public int getDistance() {
		return distance;
	}

	
	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", distance=" + distance + ", distanceOnService=" + distanceOnService
				+ "]";
	}
	
	
}
