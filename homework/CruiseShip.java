
public class CruiseShip extends Ship {
	private int maxPassengers;
	
	public CruiseShip(String n, String y, int maxP) {
		super(n,y);
		maxPassengers = maxP;
	}
	
	public int getPassengers() {
		return maxPassengers;
	}
	
	public void setPassengers(int p) {
		maxPassengers = p;
	}
	
	public String toString() {
		return  "Ship Name: " + getName() + ", Max Passengers: " + maxPassengers;
	}
}
