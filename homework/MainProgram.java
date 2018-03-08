
public class MainProgram {

	public static void main(String[] args) {
		
		
		Ship ship = new Ship("Boaty", "1969");
		CruiseShip cruiseShip = new CruiseShip("Cruise Ship #1", "2005", 333);
		CargoShip cargoShip = new CargoShip("Cargo Beast", "2018", 2000);
		
		System.out.println(ship);
		System.out.println(cruiseShip);
		System.out.println(cargoShip);
	}

}
