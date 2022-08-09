package ua.com.foxminded.carmanager;

public class CarManager {

	public static void main(String[] args) {
		
		PassangerCar prius = new PassangerCar("Toyota Prius", 2008, 15000, 1200, "greEn ");
		
		Bus renault = new Bus("Renault Laguna", 2000, 9700, 1600, " WHItE ");
		
		
		Motorcycle suzuki = new Motorcycle ("Suzuki GSX-R1000", 2021, 16000, 600, " black", "diesel", true);
		
		Motorcycle yamaha  = new Motorcycle ("Yamaha  FZ1", 2007, 9000, 700, "   oRangE ", "gas", false);


		prius.addDistance(10000);
		renault.addDistance(50000);
		
//		prius.service();
//		renault.service();
		System.out.println(prius.isReadyToService());
		System.out.println(renault.isReadyToService());
		
		System.out.println(prius);
		System.out.println(renault);
		
	}

}
