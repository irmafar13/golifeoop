
public class Vehicle {
	
	private String vehicleName;
	private int totalWheel;
	private int totalPassenger;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	protected void setTotalWheel(int newTotalWheel) {
		totalWheel = newTotalWheel;
	}
	
	
	protected void setTotalPassenger(int newTotalPassenger) {
		totalPassenger = newTotalPassenger;
	}
	
	protected void setVehicleName(String newName) {
		vehicleName = newName;
	}
	
	protected String getName() {
		return vehicleName;
	}
	
	protected int getTotalWheel() {
		return totalWheel;
	}
	
	protected int getTotalPassenger(){
		return totalPassenger;
	}
	
	protected void showVehicleDetail(){
		System.out.println("Name:" + getName());
		System.out.println("Total Wheel:" + getTotalWheel());
		System.out.println("Total Passenger" + getTotalPassenger());
		System.out.println("_______");
	}

}
