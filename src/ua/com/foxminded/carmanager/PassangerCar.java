package ua.com.foxminded.carmanager;

public class PassangerCar extends Car {

	public PassangerCar(String name, int yearOfProduction, int price, int weight, String color) {
		super(name, yearOfProduction, price, weight, color);
	}

	@Override
	public boolean isReadyToService() {
		if(distanceOnService >= 10000) {
			return true;
		} else {
			return false;
		}
	}

}
