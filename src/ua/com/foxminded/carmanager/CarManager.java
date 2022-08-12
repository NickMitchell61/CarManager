package ua.com.foxminded.carmanager;

public class CarManager {

	public static void main(String[] args) {
		
		Car prius = new PassangerCar("Toyota Prius", 2008, 15000, 1200, "greEn ");
		
		Car renault = new Bus("Renault Laguna", 2000, 9700, 1600, " WHItE ");
		
		Motorcycle suzuki = new Superbike ("Suzuki GSX-R1000", 2021, 16000, 600, " black", "diesel", true);
		
		Motorcycle yamaha  = new Enduro ("Yamaha  FZ1", 2007, 9000, 700, "   oRangE ", "gas", false);
		

		prius.addDistance(8000);
		renault.addDistance(0);
		
//		prius.service();
//		renault.service();
		System.out.println(prius.isReadyToService());
		System.out.println(renault.isReadyToService());
		
		System.out.println(prius);
		System.out.println(renault);
		
		suzuki.addDistance(8000);
		System.out.println(suzuki.isReadyToService());
		System.out.println(suzuki);
		
		
	}

}
