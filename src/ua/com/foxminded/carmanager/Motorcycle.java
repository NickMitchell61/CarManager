package ua.com.foxminded.carmanager;

import java.util.Objects;

public abstract class Motorcycle implements Serviceable {
	
	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	String engineType;
	boolean isReadyToDrive;
	private int distance = 0;
	protected int distanceOnService = 0;
	
	public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String engineType, boolean isReadyToDrive) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = Color.valueOf(color.toUpperCase().replaceAll(" ", ""));
		this.engineType = engineType;
		this.isReadyToDrive = isReadyToDrive;
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
	
	public int getDistanceOnService() {
		return distanceOnService;
	}

	
	public abstract boolean isReadyToService();

	
	public boolean repair() {
		if (isReadyToDrive == false) {
			isReadyToDrive = true;
		}
		return isReadyToDrive;
	}
	
	
	public boolean destroyEngine () {
		if (distance >= 200000) {
			isReadyToDrive = false;
		}
		return isReadyToDrive;
	}
	
	
	public void colorMotorcycle(String colorMotorcycle) {
		color = Color.valueOf(colorMotorcycle.toUpperCase().replace(" ", ""));
	}
	
	
	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive
				+ ", distance=" + distance + ", distanceOnService=" + distanceOnService + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(color, distance, isReadyToDrive);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorcycle other = (Motorcycle) obj;
		return color == other.color && distance == other.distance && isReadyToDrive == other.isReadyToDrive;
	}
	
	
}
