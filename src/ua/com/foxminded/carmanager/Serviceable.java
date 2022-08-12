package ua.com.foxminded.carmanager;

public interface Serviceable {
	
	public boolean isReadyToService();
	
	public void addDistance(int additionatDistance);

	public int getDistanceOnService();
	
	public void addDistance(double additionatDistance);
	
}
