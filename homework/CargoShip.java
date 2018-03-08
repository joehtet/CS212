
public class CargoShip extends Ship{
	private int capacity; // Tons
	
	public CargoShip(String n, String y, int c) {
		super(n,y);
		capacity = c;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int c) {
		capacity = c;
	}
	
	public String toString() {
		return "Ship Name: " + getName() + ", Max Capacity: " + getCapacity() + " tons";
	}
}
