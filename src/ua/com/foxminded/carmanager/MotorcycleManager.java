package ua.com.foxminded.carmanager;

public class MotorcycleManager extends Motorcycle {

	public MotorcycleManager(String name, int yearOfProduction, int price, int weight, String color, String engineType,
			boolean isReadyToDrive) {
		super(name, yearOfProduction, price, weight, color, engineType, isReadyToDrive);
	}

	@Override
	public boolean isReadyToService() {
		return false;
	}

	public static void main(String[] args) {		
		
		Motorcycle suzuki = new Superbike ("Suzuki GSX-R1000", 2021, 16000, 600, " black", "diesel", true);
		
		Motorcycle yamaha  = new Enduro ("Yamaha  FZ1", 2007, 9000, 700, "   oRangE ", "gas", false);


		suzuki.addDistance(8000);
		yamaha.addDistance(10000);
		
		suzuki.service();
		yamaha.service();
		System.out.println(suzuki.isReadyToService());
		System.out.println(yamaha.isReadyToService());
		
		System.out.println(suzuki);
		System.out.println(yamaha);

	}

}
