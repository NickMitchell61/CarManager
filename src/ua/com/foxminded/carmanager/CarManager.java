package ua.com.foxminded.carmanager;

public class CarManager {

	public static void main(String[] args) {
		
		Car prius = new Car("Toyota Prius", 2008, 15000, 1200, "greEn ");
		
		Car renault = new Car("Renault Laguna", 2000, 9700, 1600, " WHItE ");
		
		
		Motorcycle suzuki = new Motorcycle ("Suzuki GSX-R1000", 2021, 16000, 600, " black", "diesel", true);
		
		Motorcycle yamaha  = new Motorcycle ("Yamaha  FZ1", 2007, 9000, 700, "   oRangE ", "gas", false);


		suzuki.addDistance(250000);
		yamaha.addDistance(250000);		
		suzuki.addDistance(11.5);
		yamaha.addDistance(-11.5);
		suzuki.destroyEngine();
		yamaha.destroyEngine();
		System.out.println(suzuki);
		System.out.println(yamaha);
		
		suzuki.repair();
		yamaha.repair();
		yamaha.colorMotorcycle(" blAck  ");
		System.out.println(suzuki);
		System.out.println(yamaha);
		
		System.out.println(suzuki.equals(yamaha));
	}

}
