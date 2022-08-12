package ua.com.foxminded.carmanager;

public class Enduro extends Motorcycle {

	public Enduro(String name, int yearOfProduction, int price, int weight, String color, String engineType,
			boolean isReadyToDrive) {
		super(name, yearOfProduction, price, weight, color, engineType, isReadyToDrive);
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
